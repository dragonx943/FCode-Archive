-- Bảng hãng điện thoại
CREATE TABLE hang_dien_thoai (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_hang_dien_thoai NVARCHAR(20) UNIQUE NOT NULL,
    ten_hang_dien_thoai NVARCHAR(255) NOT NULL
);

-- Bảng điện thoại
CREATE TABLE dien_thoai (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_dien_thoai NVARCHAR(20) UNIQUE NOT NULL,
    ten_dien_thoai NVARCHAR(255) NOT NULL,
    hang_san_xuat NVARCHAR(20) NOT NULL,
    gia DECIMAL(18,2) NOT NULL,
	giam_gia DECIMAL,
    ngay_phat_hanh DATE,
    mo_ta NVARCHAR(255),
    FOREIGN KEY (hang_san_xuat) REFERENCES hang_dien_thoai(ma_hang_dien_thoai) ON DELETE CASCADE,
	CONSTRAINT gia_duong CHECK (gia > 0),
	CONSTRAINT giam_gia CHECK (giam_gia < 100)
);

-- CHECK
-- NULL, NOT NULL
-- UNIQUE

INSERT INTO hang_dien_thoai (ma_hang_dien_thoai, ten_hang_dien_thoai)
VALUES 
    (N'APL', N'Apple'),
    (N'SMS', N'Samsung'),
    (N'XIA', N'Xiaomi'),
    (N'OPP', N'Oppo'),
    (N'VIV', N'Vivo');

INSERT INTO dien_thoai (ma_dien_thoai, ten_dien_thoai, hang_san_xuat, gia, ngay_phat_hanh, mo_ta)
VALUES 
    (N'IP14', N'iPhone 14', N'APL', 22000000, '2022-09-16', N'Màn hình OLED 6.1 inch'),
    (N'IP14P', N'iPhone 14 Pro', N'APL', 30000000, '2022-09-16', N'Chip A16 Bionic, màn hình ProMotion'),
    (N'IP15P', N'iPhone 15 Pro', N'APL', 34000000, '2023-09-22', N'Titanium, chip A17 Pro'),
    (N'S23', N'Samsung Galaxy S23', N'SMS', 20000000, '2023-02-01', N'Màn hình AMOLED 6.1 inch'),
    (N'S23U', N'Samsung Galaxy S23 Ultra', N'SMS', 32000000, '2023-02-01', N'Camera 200MP, bút S-Pen'),
    (N'ZFL4', N'Samsung Galaxy Z Flip 4', N'SMS', 26000000, '2022-08-10', N'Màn hình gập, Snapdragon 8+ Gen 1'),
    (N'X12', N'Xiaomi 12', N'XIA', 18000000, '2022-01-01', N'Màn hình AMOLED 120Hz'),
    (N'X12P', N'Xiaomi 12 Pro', N'XIA', 25000000, '2022-01-01', N'Chip Snapdragon 8 Gen 1'),
    (N'OPR', N'Oppo Reno8', N'OPP', 12000000, '2022-07-18', N'Camera 50MP, sạc nhanh 80W'),
    (N'VVX80', N'Vivo X80', N'VIV', 19000000, '2022-04-29', N'Chip Dimensity 9000, camera Zeiss');

-- 1
SELECT *
FROM dien_thoai

-- 2
SELECT *
FROM dien_thoai
WHERE gia > 20000000

-- 3
SELECT *
FROM dien_thoai
WHERE ten_dien_thoai LIKE '%Pro%'

-- 4
SELECT *
FROM dien_thoai
ORDER BY
	gia DESC

-- 5
SELECT
	hang_san_xuat,
	COUNT (*) AS so_luong
FROM hang_dien_thoai AS p
INNER JOIN
	dien_thoai AS d
	ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat

-- 6
SELECT
	hang_san_xuat,
	AVG (gia) AS gia_tb
FROM hang_dien_thoai AS p
INNER JOIN
	dien_thoai AS d
	ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat

-- 7
SELECT
	hang_san_xuat,
	ten_dien_thoai,
	gia,
	ngay_phat_hanh,
	mo_ta
FROM hang_dien_thoai AS p
INNER JOIN
	dien_thoai AS d
	ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat,
	ten_dien_thoai,
	gia,
	ngay_phat_hanh,
	mo_ta

-- 8
SELECT
	hang_san_xuat,
	AVG (gia) AS gia_tb
FROM hang_dien_thoai AS p
INNER JOIN
	dien_thoai AS d
	ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat
HAVING
	AVG (gia) > 25000000

-- 9
SELECT TOP 1
	ten_dien_thoai,
	gia
FROM dien_thoai
ORDER BY
	gia ASC

SELECT TOP 1
	ten_dien_thoai,
	gia
FROM dien_thoai
ORDER BY
	gia DESC

-- 10
SELECT
	ten_dien_thoai,
	SUM (gia) * 1000 AS gia_gia_dinh
FROM dien_thoai
GROUP BY
	ten_dien_thoai

-- 11
SELECT
	ten_dien_thoai,
	gia,
	ten_hang_dien_thoai
FROM hang_dien_thoai AS p
INNER JOIN
	dien_thoai AS d
	ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	ten_dien_thoai,
	gia,
	ten_hang_dien_thoai

-- 12
SELECT
	hang_san_xuat,
	COUNT (*) AS so_luong
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat

-- 13
SELECT TOP 1 WITH TIES
	hang_san_xuat,
	COUNT (*) AS so_luong
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat
ORDER BY
	so_luong DESC

-- 14
SELECT
	hang_san_xuat,
	AVG (gia) AS gia_tb
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat

-- 15
SELECT TOP 1
	hang_san_xuat,
	AVG (gia) AS gia_tb
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat
ORDER BY
	AVG (gia) DESC

-- 16
SELECT TOP 1
	ma_hang_dien_thoai,
	gia
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
ORDER BY
	gia DESC

SELECT TOP 1
	ma_hang_dien_thoai,
	gia
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
ORDER BY
	gia ASC

-- 17
SELECT
	hang_san_xuat,
	SUM (gia) AS tong
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat
HAVING
	SUM (gia) > 50000000

-- 18
SELECT 
    ma_hang_dien_thoai AS hang_dt,
    MAX(YEAR(d.ngay_phat_hanh)) AS nam_sx
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	ma_hang_dien_thoai
ORDER BY
	nam_sx DESC

-- 19
SELECT
	hang_san_xuat,
	COUNT (*) AS so_luong
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
GROUP BY
	hang_san_xuat
ORDER BY
	COUNT (*) DESC

-- 20
SELECT
	ten_hang_dien_thoai,
	COUNT (*) AS so_luong
FROM hang_dien_thoai AS p
LEFT JOIN dien_thoai AS d ON p.ma_hang_dien_thoai = d.hang_san_xuat
WHERE
	gia > 25000000
GROUP BY
	ten_hang_dien_thoai