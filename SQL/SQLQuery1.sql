CREATE DATABASE test
USE test;

CREATE TABLE Categories (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE Products (
    id INT PRIMARY KEY,
    name VARCHAR(255),
	Image VARCHAR(50),
    price FLOAT,
    createDate DATE,
    available BIT,
    category_id VARCHAR(50),
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);

CREATE TABLE Customers (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(255),
    fullname VARCHAR(255),
    email VARCHAR(255),
    photo VARCHAR(255),
    activated BIT,
    admin BIT
);

CREATE TABLE Orders (
    id BIGINT PRIMARY KEY,
    customerID VARCHAR(50),
	CreateDate DATE,
    address VARCHAR(255),
    status INT,
    FOREIGN KEY (customerID) REFERENCES Customers(username)
);

CREATE TABLE OrderDetails (
    id BIGINT PRIMARY KEY,
    price FLOAT,
    quantity INT,
    product_id INT,
    order_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES Products(id),
    FOREIGN KEY (order_id) REFERENCES Orders(id)
);

-- BTVN: Lưu số điện thoại người dùng (1 người dùng có thể có nhiều SĐT)