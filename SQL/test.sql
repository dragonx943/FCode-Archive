CREATE DATABASE FINAL_COM2012_1_PH61418;

USE FINAL_COM2012_2_PH61418;

CREATE TABLE SanPham(
	MaSanPham INT PRIMARY KEY,
	TenSanPham NVARCHAR(100),
	DanhMuc NVARCHAR(50),
	ThuongHieu NVARCHAR(50)
)

CREATE TABLE BienThe(
	MaSanPham INT FOREIGN KEY REFERENCES SanPham(MaSanPham),
	KichCo VARCHAR(50),
	MauSac NVARCHAR(50),
	GiaBan INT,
	SoLuong INT
)

INSERT INTO SanPham (MaSanPham, TenSanPham, DanhMuc, ThuongHieu) VALUES
(1, N'Áo Thun Nam', N'Quần Áo', N'Nike'),
(2, N'Áo Sơ Mi Nữ', N'Quần Áo', N'Zara'),
(3, N'Quần Jeans', N'Quần Áo', N'Levi"s');

INSERT INTO BienThe (MaSanPham, KichCo, MauSac, GiaBan, SoLuong) VALUES
(1, 'M', N'Đen', 250000, 100),
(1, 'M', N'Trắng', 250000, 120),
                (1, 'L', N'Đen', 270000, 80),
                (1, 'L', N'Trắng', 270000, 90),
                (1, 'XL', N'Đen', 300000, 50),
                (1, 'XL', N'Trắng', 300000, 60),
                (2, 'S', N'Hồng', 350000, 70),
                (2, 'M', N'Hồng', 350000, 90),
                (2, 'L', N'Hồng', 380000, 60),
                (2, 'S', N'Trắng', 350000, 50),
                (2, 'M', N'Trắng', 350000, 80),
                (2, 'L', N'Trắng', 380000, 40),
				(3, '30', N'Xanh', 600000, 100),
                (3, '32', N'Xanh', 620000, 80),
                (3, '34', N'Xanh', 650000, 50),
                (3, '30', N'Đen', 600000, 70),
                (3, '32', N'Đen', 620000, 60),
                (3, '34', N'Đen', 650000, 40);

-- 1
SELECT TenSanPham, KichCo, MauSac, SoLuong
FROM SanPham AS d
LEFT JOIN BienThe p ON d.MaSanPham = p.MaSanPham

-- 2
SELECT p.MaSanPham, TenSanPham, ThuongHieu, COUNT (*) AS num
FROM SanPham AS d
LEFT JOIN BienThe p ON d.MaSanPham = p.MaSanPham
GROUP BY p.MaSanPham, TenSanPham, ThuongHieu

-- 3
SELECT TOP 1 p.MaSanPham, TenSanPham, ThuongHieu, COUNT (*) AS num, GiaBan
FROM SanPham AS d
LEFT JOIN BienThe p ON d.MaSanPham = p.MaSanPham
GROUP BY p.MaSanPham, TenSanPham, ThuongHieu, GiaBan
ORDER BY GiaBan ASC
SELECT TOP 1 p.MaSanPham, TenSanPham, ThuongHieu, COUNT (*) AS num, GiaBan
FROM SanPham AS d
LEFT JOIN BienThe p ON d.MaSanPham = p.MaSanPham
GROUP BY p.MaSanPham, TenSanPham, ThuongHieu, GiaBan
ORDER BY GiaBan DESC

CREATE DATABASE FINAL_COM2012_2_PH61418;
USE FINAL_COM2012_2_PH61418;

CREATE TABLE DanhSach(
	MaGiay VARCHAR(50),
	TenGiay NVARCHAR(100),
	BienThe NVARCHAR(100),
	DonGia INT,
	SoLuong INT,
	ThuongHieu VARCHAR(50),
	ChatLieu NVARCHAR(100),
	GioiTinh NVARCHAR(50),
	LoaiDeGiay NVARCHAR(50),
	PhongCach NVARCHAR(100)
)

INSERT INTO DanhSach(MaGiay, TenGiay, BienThe, DonGia, SoLuong, ThuongHieu, ChatLieu, GioiTinh, LoaiDeGiay, PhongCach) VALUES
	('G001', N'Giày thể thao Air', N'Màu đen - Size 40', 1200000, 50, 'Nike', N'Da thật', N'Nam', N'Cao su', N'Thể thao, Chạy bộ'),
    ('G001', N'Giày thể thao Air', N'Màu trắng - Size 41', 1200000, 30, 'Nike', N'Da thật', N'Nam', N'Cao su', N'Thể thao, Chạy bộ'),
    ('G001', N'Giày thể thao Air', N'Màu xám - Size 42', 1250000, 40, 'Nike', N'Da thật', N'Nam', N'Cao su', N'Thể thao, Đi bộ'),
    ('G002', N'Giày thể thao Ultra', N'Màu xanh lá - Size 42', 1300000, 20, 'Adidas', N'Vải', N'Nam', N'Cao su', N'Thể thao, Training'),
    ('G002', N'Giày thể thao Ultra', N'Màu đen - Size 40', 1300000, 25, 'Adidas', N'Vải', N'Nam', N'Cao su', N'Thể thao, Training'),
    ('G003', N'Giày cao gót Classic', N'Màu đỏ - Size 38', 850000, 15, 'Gucci', N'Da bò', N'Nữ', N'Da thật', N'Cao gót, Dạ hội'),
    ('G003', N'Giày cao gót Classic', N'Màu đen - Size 39', 850000, 10, 'Gucci', N'Da bò', N'Nữ', N'Da thật', N'Cao gót, Dạ hội'),
    ('G004', N'Giày lười Casual', N'Màu nâu - Size 43', 950000, 40, 'Clarks', N'Da thật', N'Nam', N'Cao su', N'Lười, Công sở'),
    ('G004', N'Giày lười Casual', N'Màu đen - Size 42', 950000, 30, 'Clarks', N'Da thật', N'Nam', N'Cao su', N'Lười, Công sở'),
    ('G005', N'Giày búp bê Fashion', N'Màu hồng - Size 36', 450000, 100, 'Zara', N'Vải', N'Nữ', N'Cao su', N'Búp bê, Hè'),
    ('G005', N'Giày búp bê Fashion', N'Màu trắng - Size 37', 450000, 80, 'Zara', N'Vải', N'Nữ', N'Cao su', N'Búp bê, Hè'),
    ('G006', N'Giày thể thao Sport', N'Màu xanh dương - Size 39', 1100000, 60, 'Puma', N'Vải', N'Nam', N'Cao su', N'Thể thao, Training'),
    ('G007', N'Giày búp bê Elegance', N'Màu đen - Size 37', 500000, 80, 'Mango', N'Da bò', N'Nữ', N'Da thật', N'Búp bê, Công sở'),
    ('G007', N'Giày búp bê Elegance', N'Màu nude - Size 38', 500000, 70, 'Mango', N'Da bò', N'Nữ', N'Da thật', N'Búp bê, Công sở');

-- 1	
SELECT TenGiay, BienThe, DonGia, SoLuong
FROM DanhSach

-- 2
SELECT *
FROM DanhSach
WHERE GioiTinh LIKE '%Nam%'

-- 3
SELECT MaGiay, ThuongHieu, AVG (DonGia) AS tong
FROM DanhSach
GROUP BY MaGiay, ThuongHieu

-- 4
SELECT TOP 1 MaGiay, TenGiay, DonGia, BienThe
FROM DanhSach
WHERE BienThe LIKE N'%den%'
ORDER BY DonGia ASC

-- Phần 3 cũ
-- 1
UPDATE DanhSach
SET [BienThe] = REPLACE(BienThe, N'Màu den', 'Black')
WHERE BienThe LIKE N'%den%'

-- 2
SELECT
	*,
    SUBSTRING(BienThe, CHARINDEX('Size', BienThe) + 5, LEN(BienThe)) AS Size --	Tham khảo từ Google
FROM 
    DanhSach
WHERE
	SUBSTRING(BienThe, CHARINDEX('Size', BienThe) + 5, LEN(BienThe)) > 40

-- Phần 3 làm lại
CREATE TABLE MauSac(
	IDMauSac INT NOT NULL PRIMARY KEY,
	TenMau NVARCHAR(100)
);

CREATE TABLE PhongCach(
	IDPhongCach INT NOT NULL PRIMARY KEY,
	TenPhongCách NVARCHAR(100)
);

CREATE TABLE DanhSach2(
	MaGiay VARCHAR(50),
	TenGiay NVARCHAR(100),
	IDMauSac INT FOREIGN KEY REFERENCES MauSac(IDMauSac),
	Size INT,
	DonGia INT,
	SoLuong INT,
	ThuongHieu VARCHAR(50),
	ChatLieu NVARCHAR(100),
	GioiTinh NVARCHAR(50),
	LoaiDeGiay NVARCHAR(50),
	PhongCach NVARCHAR(100)
);

INSERT INTO MauSac (IDMauSac, TenMau) VALUES 
	(1, N'Màu đen'),
	(2, N'Màu trắng'),
	(3, N'Màu xám'),
	(4, N'Màu xanh lá'),
	(5, N'Màu đỏ'),
	(6, N'Màu nâu'),
	(7, N'Màu hồng'),
	(8, N'Màu xanh dương'),
	(9, N'Màu nude');

INSERT INTO DanhSach2(MaGiay, TenGiay, IDMauSac, Size, DonGia, SoLuong, ThuongHieu, ChatLieu, GioiTinh, LoaiDeGiay, PhongCach) VALUES
	('G001', 'Giày thể thao Air', 1, 40, 1200000, 50, 'Nike', 'Da thật', 'Nam', 'Cao su', 'Thể thao, Chạy bộ'),
    ('G001', 'Giày thể thao Air', 2, 41, 1200000, 30, 'Nike', 'Da thật', 'Nam', 'Cao su', 'Thể thao, Chạy bộ'),
    ('G001', 'Giày thể thao Air', 3, 42, 1250000, 40, 'Nike', 'Da thật', 'Nam', 'Cao su', 'Thể thao, Đi bộ'),
    ('G002', 'Giày thể thao Ultra', 4, 42, 1300000, 20, 'Adidas', 'Vải', 'Nam', 'Cao su', 'Thể thao, Training'),
    ('G002', 'Giày thể thao Ultra', 1, 40, 1300000, 25, 'Adidas', 'Vải', 'Nam', 'Cao su', 'Thể thao, Training'),
    ('G003', 'Giày cao gót Classic', 5, 38, 850000, 15, 'Gucci', 'Da bò', 'Nữ', 'Da thật', 'Cao gót, Dạ hội'),
    ('G003', 'Giày cao gót Classic', 1, 39, 850000, 10, 'Gucci', 'Da bò', 'Nữ', 'Da thật', 'Cao gót, Dạ hội'),
    ('G004', 'Giày lười Casual', 6, 43, 950000, 40, 'Clarks', 'Da thật', 'Nam', 'Cao su', 'Lười, Công sở'),
    ('G004', 'Giày lười Casual', 1, 42, 950000, 30, 'Clarks', 'Da thật', 'Nam', 'Cao su', 'Lười, Công sở'),
    ('G005', 'Giày búp bê Fashion', 7, 36, 450000, 100, 'Zara', 'Vải', 'Nữ', 'Cao su', 'Búp bê, Hè'),
    ('G005', 'Giày búp bê Fashion', 2, 37, 450000, 80, 'Zara', 'Vải', 'Nữ', 'Cao su', 'Búp bê, Hè'),
    ('G006', 'Giày thể thao Sport', 8, 39, 1100000, 60, 'Puma', 'Vải', 'Nam', 'Cao su', 'Thể thao, Training'),
    ('G007', 'Giày búp bê Elegance', 1, 37, 500000, 80, 'Mango', 'Da bò', 'Nữ', 'Da thật', 'Búp bê, Công sở'),
    ('G007', 'Giày búp bê Elegance', 9, 38, 500000, 70, 'Mango', 'Da bò', 'Nữ', 'Da thật', 'Búp bê, Công sở');

-- 1
UPDATE MauSac
SET [TenMau] = 'Black'
WHERE TenMau LIKE N'%Màu đen'

SELECT *
FROM DanhSach2 AS d
LEFT JOIN MauSac p ON d.IDMauSac = p.IDMauSac
WHERE TenMau LIKE N'%Black%'

-- 2
SELECT TenGiay, Size, SoLuong
FROM DanhSach2 AS d
LEFT JOIN MauSac p ON d.IDMauSac = p.IDMauSac
WHERE Size > 40

-- 3
