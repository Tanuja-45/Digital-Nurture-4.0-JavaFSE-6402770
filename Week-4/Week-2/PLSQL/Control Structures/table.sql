CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
); 



ALTER TABLE Customers ADD BankName VARCHAR2(50);
ALTER TABLE Employees ADD BankName VARCHAR2(50);
-- Insert into Customers
INSERT INTO Customers VALUES (1, 'Amit Kumar', DATE '1960-05-12', 15000, SYSDATE, 'State Bank of India');
INSERT INTO Customers VALUES (2, 'Sneha Reddy', DATE '1990-03-20', 8000, SYSDATE, 'HDFC Bank');
INSERT INTO Customers VALUES (3, 'Ravi Sharma', DATE '1955-12-01', 12000, SYSDATE, 'ICICI Bank');
INSERT INTO Customers VALUES (4, 'Meena Iyer', DATE '1985-07-18', 7000, SYSDATE, 'Axis Bank');
INSERT INTO Customers VALUES (5, 'Lakshmi Nair', DATE '1975-01-10', 20000, SYSDATE, 'Canara Bank');
INSERT INTO Customers VALUES (6, 'Deepak Joshi', DATE '1963-11-03', 9500, SYSDATE, 'State Bank of India');
INSERT INTO Customers VALUES (7, 'Priya Desai', DATE '1988-06-25', 11000, SYSDATE, 'HDFC Bank');

-- Insert into Accounts
INSERT INTO Accounts VALUES (101, 1, 'Savings', 15000, SYSDATE);
INSERT INTO Accounts VALUES (102, 2, 'Current', 8000, SYSDATE);
INSERT INTO Accounts VALUES (103, 3, 'Savings', 12000, SYSDATE);
INSERT INTO Accounts VALUES (104, 4, 'Current', 7000, SYSDATE);
INSERT INTO Accounts VALUES (105, 5, 'Savings', 20000, SYSDATE);
INSERT INTO Accounts VALUES (106, 6, 'Savings', 9500, SYSDATE);
INSERT INTO Accounts VALUES (107, 7, 'Current', 11000, SYSDATE);

--Transactions
INSERT INTO Transactions VALUES (201, 101, SYSDATE - 5, 500, 'Credit');
INSERT INTO Transactions VALUES (202, 102, SYSDATE - 10, 1000, 'Debit');
INSERT INTO Transactions VALUES (203, 103, SYSDATE - 15, 200, 'Credit');
INSERT INTO Transactions VALUES (204, 104, SYSDATE - 2, 300, 'Debit');
INSERT INTO Transactions VALUES (205, 105, SYSDATE - 1, 700, 'Credit');
INSERT INTO Transactions VALUES (206, 106, SYSDATE - 3, 400, 'Credit');
INSERT INTO Transactions VALUES (207, 107, SYSDATE - 7, 600, 'Debit');

--Loans
INSERT INTO Loans VALUES (301, 1, 10000, 8.5, SYSDATE - 200, SYSDATE + 20);
INSERT INTO Loans VALUES (302, 2, 15000, 9.0, SYSDATE - 300, SYSDATE + 90);
INSERT INTO Loans VALUES (303, 3, 8000, 7.5, SYSDATE - 100, SYSDATE + 15);
INSERT INTO Loans VALUES (304, 5, 20000, 10.0, SYSDATE - 500, SYSDATE + 5);
INSERT INTO Loans VALUES (305, 6, 12000, 8.0, SYSDATE - 150, SYSDATE + 10);
INSERT INTO Loans VALUES (306, 4, 9000, 7.8, SYSDATE - 250, SYSDATE + 25);
INSERT INTO Loans VALUES (307, 7, 11000, 8.2, SYSDATE - 180, SYSDATE + 12);
--Employeess
INSERT INTO Employees VALUES (1, 'Ramesh Babu', 'Manager', 70000, 'Finance', SYSDATE - 800, 'State Bank of India');
INSERT INTO Employees VALUES (2, 'Snigdha p', 'Clerk', 30000, 'Loans', SYSDATE - 600, 'HDFC Bank');
INSERT INTO Employees VALUES (3, 'Sai kumar', 'Officer', 50000, 'Accounts', SYSDATE - 400, 'ICICI Bank');
INSERT INTO Employees VALUES (4, 'Divya sri', 'Clerk', 32000, 'Finance', SYSDATE - 200, 'Axis Bank');
INSERT INTO Employees VALUES (5, 'Vikram Das', 'Analyst', 45000, 'Loans', SYSDATE - 300, 'Canara Bank');
INSERT INTO Employees VALUES (6, 'Kavita Rao', 'Clerk', 28000, 'Accounts', SYSDATE - 250, 'HDFC Bank');
INSERT INTO Employees VALUES (7, 'Arjun kumar', 'Manager', 72000, 'Finance', SYSDATE - 900, 'ICICI Bank');
