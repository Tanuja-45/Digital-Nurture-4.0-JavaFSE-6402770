BEGIN
    UPDATE Customers set IsVIP = 'TRUE' WHERE Balance > 10000;

    DBMS_OUTPUT.PUT_LINE('VIP status updated for eligible customers.');
END;