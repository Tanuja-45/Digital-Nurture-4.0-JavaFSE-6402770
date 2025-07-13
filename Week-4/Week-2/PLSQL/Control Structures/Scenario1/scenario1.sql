BEGIN
    UPDATE Loans L
    SET L.InterestRate = L.InterestRate - 1
    WHERE EXISTS (
        SELECT 1 FROM Customers C WHERE C.CustomerID = L.CustomerID 
          AND MONTHS_BETWEEN(SYSDATE, C.DOB)/12 > 60
    );
    DBMS_OUTPUT.PUT_LINE('Interest rate updated for the customers who are above 60.');
END;