DELIMITER **
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance +(Balance * 0.01),
        LastModified= NOW()
    WHERE AccountType = 'Savings';
END;
**
DELIMITER;