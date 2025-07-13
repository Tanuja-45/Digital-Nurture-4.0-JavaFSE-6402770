DELIMITER **
CREATE PROCEDURE UpdateEmployeeBonus( IN p_department VARCHAR(50), IN p_bonus_percent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary +(Salary * p_bonus_percent / 100)
    WHERE Department =p_department;
END;
**
DELIMITER;