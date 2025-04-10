CREATE DATABASE test2;
USE test2;

CREATE TABLE Users (
	UserID INT IDENTITY PRIMARY KEY,
	Username NVARCHAR(100) NOT NULL,
	Email NVARCHAR(100) UNIQUE,
	CreatedAt DATE DEFAULT GETDATE()
);

CREATE TABLE Roles (
	RoleID INT IDENTITY PRIMARY KEY,
	RoleName VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE User_Role (
	UserRoleID INT IDENTITY PRIMARY KEY,
	UserID INT FOREIGN KEY REFERENCES Users(UserID),
	RoleID INT FOREIGN KEY REFERENCES Roles(RoleID),
	AssignedAt DATE DEFAULT GETDATE()
);

INSERT INTO Users (Username, Email) VALUES
('alice', 'alice@example.com'),
('bob', 'bob@example.com'),
('charlie', 'charlie@example.com'),
('david', 'david@example.com'),
('eve', 'eve@example.com');

-- Roles
INSERT INTO Roles (RoleName) VALUES
('Admin'),
('Editor'),
('Viewer');

-- User_Role
INSERT INTO User_Role (UserID, RoleID) VALUES
(1, 1), (1, 2), (2, 2), (2, 3), (3, 1), (3, 3), (4, 2), (4, 3), (5, 1), (5, 2),
(1, 3), (2, 1), (3, 2), (4, 1), (5, 3), (1, 1), (2, 2), (3, 3), (4, 1), (5, 2);

-- 1
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE RoleName LIKE '%Admin%'

-- 2
SELECT
	p.UserID,
	COUNT (*) AS Role_count
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
GROUP BY
	p.UserID

-- 3
SELECT
	p.UserID,
	COUNT (*) AS Role_count
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
GROUP BY
	p.UserID
HAVING
	COUNT (*) > 1

-- 4
SELECT
	p.RoleID,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE
	p.RoleID IS NULL

-- 5
SELECT TOP 1 *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
ORDER BY AssignedAt

-- 6
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE c.Email LIKE N'%example.com'

-- 7
SELECT
	p.RoleID,
	p.UserID,
	c.Username,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
GROUP BY
	p.RoleID,
	p.UserID,
	c.Username,
	d.RoleName
ORDER BY
	c.Username,
	d.RoleName

-- 8
SELECT
	c.Username,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE c.Username LIKE N'%alice%'
GROUP BY
	c.Username,
	d.RoleName

-- 9
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE DAY(CreatedAt) LIKE DAY(GETDATE())

-- 10
SELECT
	d.RoleID,
	COUNT (*) AS role_count
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
GROUP BY
	d.RoleID

-- 11
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE
	d.RoleName LIKE '%Admin%' OR d.RoleName LIKE '%Editor%'

-- 12
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE MONTH(CreatedAt) LIKE MONTH(GETDATE())

-- 13
SELECT
	p.UserID,
	p.RoleID,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE p.UserID = 1

-- 14
SELECT TOP 1 *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE DAY(CreatedAt) LIKE DAY(GETDATE())

-- 15
SELECT
	p.UserID,
	COUNT (*) AS Role_count
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
GROUP BY
	p.UserID
ORDER BY
	COUNT (*) DESC

-- 16
SELECT
	c.Username,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE c.Username LIKE N'%bob%' OR c.Username LIKE N'%charlie%'
GROUP BY
	c.Username,
	d.RoleName

-- 17
SELECT *
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE YEAR(AssignedAt) = 2023

-- 18
SELECT
	d.RoleID,
	RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE p.RoleID = d.RoleID AND p.UserID = c.UserID
GROUP BY
	d.RoleID,
	RoleName

-- 19
SELECT
	c.UserID,
	c.Username
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE
	p.RoleID IS NULL

-- 20
SELECT
	c.Username,
	d.RoleName
FROM
	User_Role AS p
LEFT JOIN Roles d ON p.RoleID = d.RoleID
LEFT JOIN Users c ON p.UserID = c.UserID
WHERE d.RoleName LIKE N'%Viewer%' OR d.RoleName LIKE N'%Editor%'
GROUP BY
	c.Username,
	d.RoleName