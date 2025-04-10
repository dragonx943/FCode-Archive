-- 1. Tạo Database mới
CREATE DATABASE com2012_SD20305;

-- 2. Chọn Database đã có sẵn
USE com2012_SD20305;

-- 3. Tạo bảng
CREATE TABLE students(
	-- Tên trường + kiểu dữ liệu (chữ hoa hoặc thường) (BỔ SUNG: + primary key = khoá chính)
	id INT primary key,
	-- Có varchar (chỉ UTF-8) và Nvarchar (Đủ các bộ mã hoá)
	fullName Nvarchar(50),
);

-- 4. Drop / Xoá bảng
DROP TABLE students;

-- 5. Thêm giá trị / trường vào bảng
-- Chọn bảng
ALTER TABLE students
-- Thêm trường + Điều kiện không null
ADD email Nvarchar(50) not null;

ALTER TABLE students
ADD phoneNum Varchar(10) not null;

-- 6. Sửa tên của bảng
-- Từ students -> sinhViens
EXEC sp_rename students, sinhViens;
EXEC sp_rename sinhViens, students;

-- 7. Thêm dữ liệu vào bảng -> trường
-- Thêm 1 dữ liệu duy nhất (Single row)
INSERT INTO students(id, fullName, email, phoneNum)
VALUES(1, 'Draken', '123@gmail.com', '0123456789');

-- Thêm nhiều dữ liệu (Multiple row)
INSERT INTO students(id, fullName, email, phoneNum)
VALUES
	(2, 'Draken2', '124@gmail.com', '0123456781'),
	(3, 'Draken3', '125@gmail.com', '0123456782'),
	(4, 'Draken4', '126@gmail.com', '0123456783');

-- Tạo tương tự: Bảng "products"
CREATE TABLE products(
	-- Bao gồm các giá trị / trường: id - Mã SP, tenSP - Tên SP, giaSP - Giá SP, soLuong - Số lượng SP
	id int PRIMARY KEY,
	tenSP Nvarchar(50) not null,
	giaSP Nvarchar(50) not null,
	soLuong int,
);

INSERT INTO products(id, tenSP, giaSP, soLuong)
VALUES
	(1, 'Paradol', '20.000', 12),
	(2, 'abc', '10.000', 10),
	(3, 'xyz', '12.000', 30);

------------------------ Data Manipulation ---------------------

-- 1. SELECT (Top 10), AS -> Đặt tên cho trường của bảng
SELECT TOP 10
	first_name AS ten,
	last_name AS ho,
	email
FROM sales.customers;

-- 1.1 WHERE (Lọc Database với điều kiện)
SELECT
	*
FROM sales.customers
WHERE
	state = 'CA';

-- Lọc phải có SĐT + city là San Diego (không có SĐT => bỏ NOT)
SELECT
	*
FROM sales.customers
WHERE
	state = 'CA' AND phone IS NOT NULL AND city = 'San Diego';

-- ORDER BY (Sắp xếp)
SELECT
	*
FROM sales.customers
WHERE
	state = 'CA'

SELECT
	*
FROM sales.customers
WHERE
	state = 'CA' AND phone IS NOT NULL AND city = 'San Diego'
-- ORDER theo chiều A->Z = ASC (mặc định, không cần thêm ASC)
ORDER BY first_name ASC; -- Ngược lại: Sử dụng DESC thay vì ASC

-- TOP
SELECT TOP 1 PERCENT -- Lấy ra Top 1%
	product_name,
	list_price
FROM production.products

SELECT TOP 3 -- Sx Top 3 ngược
	product_name,
	list_price
FROM production.products
ORDER BY list_price DESC;

SELECT TOP 3 WITH TIES -- In TOP 3 + Các SP cùng giá
	product_name,
	list_price
FROM production.products
ORDER BY list_price DESC;

-- Lệnh OFFSET - Bỏ qua
SELECT
	product_name,
	list_price
FROM
	production.products
ORDER BY
	list_price,
	product_name
OFFSET 10 ROWS -- Bỏ qua 10 dòng đầu tiên
FETCH NEXT 5 ROWS ONLY; -- Lấy tiếp 5 dòng tiếp theo: Lệnh FETCH

SELECT
	product_name,
	list_price
FROM
	production.products
ORDER BY
	list_price,
	product_name
OFFSET 10 ROWS
FETCH NEXT 10 ROWS ONLY;

SELECT
	product_name,
	list_price
FROM production.products
ORDER BY
	list_price DESC,
	product_name
OFFSET 5 ROWS
FETCH NEXT 5 ROWS ONLY;

-- Lệnh DISTINCT: Tránh trùng lặp các giá trị trong trường
SELECT
	DISTINCT city
FROM sales.customers
ORDER BY city;

-- WHERE
-- 6.1 Normal
SELECT
	product_id,
	product_name,
	category_id,
	model_year,
	list_price
FROM production.products
WHERE
	category_id = 1
ORDER BY
	list_price DESC;

-- 6.2 với lệnh AND
SELECT
	product_id,
	product_name,
	category_id,
	model_year,
	list_price
FROM production.products
WHERE
	category_id = 1 AND model_year = 2018 AND list_price > 300 AND list_price < 400
ORDER BY
	list_price DESC;

-- 6.3 với lệnh BETWEEN
SELECT
	product_id,
	product_name,
	category_id,
	model_year,
	list_price
FROM production.products
WHERE
	list_price BETWEEN 1900 AND 2000
ORDER BY
	list_price DESC;

-- 6.4 với lệnh IN
SELECT
	product_id,
	product_name,
	category_id,
	model_year,
	list_price
FROM production.products
WHERE
	list_price IN (299.99, 369.99, 489.99)
ORDER BY
	list_price DESC;

-- Lệnh LIKE
SELECT
	product_id,
	product_name,
	category_id,
	model_year,
	list_price
FROM production.products
WHERE
	product_name LIKE '%Cruise%'
ORDER BY
	list_price DESC;

SELECT
	first_name
FROM sales.customers
WHERE
	first_name LIKE '%a%'
ORDER BY first_name;

SELECT
	*
FROM sales.customers
WHERE
	first_name LIKE '%a%' OR last_name LIKE '%a%'
ORDER BY first_name;

--------------------

SELECT
	order_id,
	order_date,
	customer_id,
	YEAR (order_date) AS order_year
FROM
	sales.orders
WHERE
	customer_id IN (1,2)
ORDER BY
	customer_id;

SELECT
	customer_id,
	YEAR (order_date) AS order_year
FROM
	sales.orders
WHERE
	customer_id IN (1,2)
GROUP BY
	customer_id,
	YEAR (order_date)
ORDER BY
	customer_id;

-- Lệnh COUNT
SELECT
	customer_id,
	YEAR (order_date) AS order_year,
	COUNT (*) AS order_placed,
	COUNT (customer_id) AS order_placed
FROM
	sales.orders
WHERE
	customer_id IN (1,2)
GROUP BY
	customer_id,
	YEAR (order_date)
ORDER BY
	customer_id;

-- DEMO
SELECT
	city,
	COUNT (*) AS people
FROM
	sales.customers
GROUP BY
	city
ORDER BY
	city;

-- DEMO 2
SELECT
	city,
	state,
	COUNT (*) AS people
FROM
	sales.customers
GROUP BY
	city,
	state
ORDER BY
	city;

-- Lệnh SUM
SELECT
	order_id,
	SUM (quantity * list_price * (1 - discount)) AS total
FROM sales.order_items
GROUP BY
	order_id

-- Lệnh HAVING
-- Original
SELECT
	customer_id,
	YEAR (order_date) AS order_year,
	COUNT (order_id) AS order_count
FROM sales.orders
GROUP BY
	customer_id,
	YEAR (order_date)
HAVING
	COUNT (order_id) >= 2
ORDER BY
	customer_id

-- DEMO
-- 1. Hiện ra giá trị tổng hoá đơn
-- 2. Tìm những đơn tổng giá lớn hơn 20000
SELECT
	order_id,
	SUM (quantity * list_price * (1 - discount)) AS total
FROM sales.order_items
GROUP BY
 	order_id
HAVING
	SUM (quantity * list_price * (1 - discount)) > 20000
ORDER BY
	order_id

-- Lệnh INNER JOIN - ghép nhập
SELECT
	product_name,
	category_name,
	list_price
FROM production.products AS p
INNER JOIN
	production.categories AS c
	-- dựa trên điều kiện gì
	ON c.category_id = p.category_id

SELECT
	product_name,
	brand_name,
	list_price
FROM production.products AS p
INNER JOIN
	production.brands AS c
	-- dựa trên điều kiện gì
	ON c.brand_id = p.brand_id

SELECT 
	product_name,
	category_name,
	brand_name,
	list_price
FROM production.products AS p
INNER JOIN -- co the viet JOIN
	production.categories AS c
	ON p.category_id = c.category_id
INNER JOIN -- co the viet JOIN
	production.brands AS b
	ON p.brand_id = b.brand_id
ORDER BY
    product_name;

-- Tính giá trung bình bởi brand cho tất cả sản phẩm với model từ năm 2018
-- lấy từ bảng product + brand
SELECT
	brand_name,
	AVG (list_price) AS avg
FROM production.products AS p
INNER JOIN
	production.brands AS c
	ON p.brand_id = c.brand_id
WHERE
	model_year IN (2018)
GROUP BY
	brand_name

-- EX: tính sản phẩm đó được mua bao nhiêu lần + tổng số tiền
SELECT
	p.product_id,
	model_year,
	COUNT (*) AS count,
	SUM (quantity * p.list_price * (1 - discount)) AS sum
FROM production.products AS p
INNER JOIN
	sales.order_items AS s
	ON p.product_id = s.product_id
GROUP BY
	p.product_id,
	model_year
ORDER BY
	p.product_id

-- LEFT JOIN
SELECT
	p.product_id,
	o.product_id,
	product_name,
	order_id
	--
	-- p.product_id AS 'In Products',
	-- p.order_id AS 'In Orders',
FROM
	production.products p
LEFT JOIN sales.order_items o ON o.product_id = p.product_id
WHERE
	order_id IS NULL
ORDER BY
	order_id

---------------------------------------------
-- 16. PRIMARY KEY
-- TH1: Khoá chính là 1 cột
CREATE TABLE table_name (
	pk_column data_type PRIMARY KEY,
	...
);

-- Hoặc:
CREATE TABLE table_name (
	pk_column data_type,
	...,
	PRIMARY KEY (pk_column)
);

-- TH2: Khoá chính là 2 cột
CREATE TABLE table_name (
	pk_column_1 data_type,
	pk_column_2 data_type,
	...
	PRIMARY KEY (pk_column_1, pk_column_2)
);

-- TH3: Sử dụng Alter với Primary Key
CREATE TABLE sales.events(
	event_id INT NOT NULL,
	event_name VARCHAR(255),
	start_date DATE NOT NULL,
	duration DEC(5,2)
);

ALTER TABLE sales.events
ADD PRIMARY KEY (event_id);

------------------------------------------------------
-- 17. FOREIGN KEY
-- 17.1 Foreign Key CONSTRAIN
-- Step 1
CREATE SCHEMA procurement;

CREATE TABLE procurement.vendor_groups (
	group_id INT IDENTITY PRIMARY KEY,
	group_name VARCHAR (100) NOT NULL
);

CREATE TABLE procurement.vendors (
	vendor_id INT IDENTITY PRIMARY KEY,
	vendor_name VARCHAR(100) NOT NULL,
	group_id INT NOT NULL,
	-- Lệnh điều kiện ràng buộc: CONSTRATNT + tên / tự đặt nếu k có + khoá phụ FOREIGN KEY + trường làm khoá phụ
	CONSTRAINT fk_group FOREIGN KEY (group_id)
	-- Khoá phụ chiếu lên khoá chính ở đâu ?
	-- REFERENCES + gọi bảng + (tên trường khoá chính)
	REFERENCES procurement.vendor_groups(group_id)
);

INSERT INTO procurement.vendor_groups(group_name)
VALUES('Third-Party Vendors'),
	  ('Interco Vendors'),
	  ('One-time Vendors');

-- ví dụ oki
INSERT INTO procurement.vendors(vendor_name, group_id)
VALUES('ABC Corp', 1)
-- ví dụ lỗi
INSERT INTO procurement.vendors(vendor_name, group_id)
VALUES('XYZ Corp', 4)

-----------------------------------------
-- Ôn tập
CREATE SCHEMA on_tap;

CREATE TABLE on_tap.san_pham (
	ma_san_pham VARCHAR(100) PRIMARY KEY,
    ten_san_pham VARCHAR(100) NOT NULL,
    gia INT NOT NULL,
    so_luong_ton INT NOT NULL,
);

CREATE TABLE on_tap.hoa_don (
	ma_hoa_don VARCHAR(100) PRIMARY KEY,
    ngay_lap DATE NOT NULL,
    so_dien_thoai VARCHAR(100) NOT NULL,
);

CREATE TABLE on_tap.hoa_don_chi_tiet(
    ma_san_pham VARCHAR(100),
    ma_hoa_don VARCHAR(100),
    so_luong_mua INT NOT NULL,
    gia INT NOT NULL
	PRIMARY KEY (ma_hoa_don, ma_san_pham)
	CONSTRAINT fk_ma_san_pham FOREIGN KEY (ma_san_pham)
	REFERENCES on_tap.san_pham(ma_san_pham),
	CONSTRAINT fk_ma_hoa_don FOREIGN KEY (ma_hoa_don)
	REFERENCES on_tap.hoa_don(ma_hoa_don)
) 

-- INSERT San Pham, Hoa Don 
INSERT INTO on_tap.san_pham
VALUES
    ('SP1', N'Dien thoai',3, 2),
    ('SP2',N'Quat',1,4),
    ('SP3',N'May anh',5,2)
INSERT INTO on_tap.hoa_don
VALUES 
    ('HD1','2024/7/22','0987234761'),
    ('HD2','2024/7/22','0987231241'),
    ('HD3','2024/7/22','0987234521')

INSERT INTO on_tap.hoa_don_chi_tiet
VALUES 
    ('SP1','HD1',10,10),
    ('SP2','HD1',21,14)
SELECT * FROM on_tap.san_pham
SELECT * FROM on_tap.hoa_don
SELECT * FROM on_tap.hoa_don_chi_tiet

