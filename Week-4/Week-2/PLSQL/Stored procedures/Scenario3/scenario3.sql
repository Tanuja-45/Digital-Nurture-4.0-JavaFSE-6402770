DELIMITER @@

CREATE PROCEDURE TransferFunds( IN from_id INT, IN to_id INT, IN amt DECIMAL(10,2) )
BEGIN
    DECLARE bal DECIMAL(10,2);

    SELECT Balance INTO bal
    FROM Accounts
    WHERE AccountID = from_id
    FOR UPDATE;
    IF bal < amt THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance in source account';
    ELSE
        UPDATE Accounts
        SET Balance = Balance - amt,
            LastModified = NOW()
        WHERE AccountID = from_id;

        UPDATE Accounts
        SET Balance = Balance + amt,
            LastModified = NOW()
        WHERE AccountID = to_id;
    END IF;
END;
@@
DELIMITER;
