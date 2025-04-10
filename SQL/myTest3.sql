CREATE DATABASE sach;
USE sach;

CREATE TABLE tac_gia(
	id INT IDENTITY NOT NULL PRIMARY KEY,
	ma_tac_gia NVARCHAR(50),
	ten_tac_gia NVARCHAR(100),
	ngay_sinh DATE,
	quoc_tich NVARCHAR(50),
	mo_ta NVARCHAR(100)
);

CREATE TABLE sach(
	id INT IDENTITY NOT NULL PRIMARY KEY,
	ma_sach NVARCHAR(50),
	ten_sach NVARCHAR(100),
	the_loai NVARCHAR(50),
	ngay_xuat_ban DATE,
	gia INT NOT NULL,
	id_tac_gia INT,
	FOREIGN KEY (id_tac_gia) REFERENCES tac_gia(id)
);

SET IDENTITY_INSERT tac_gia ON;
INSERT INTO tac_gia (id, ma_tac_gia, ten_tac_gia, ngay_sinh, quoc_tich, mo_ta)
VALUES 
    (1, 'TG001', 'J.K. Rowling', '1965-07-31', 'Anh', N'Tác giả của Harry Potter'),
    (2, 'TG002', 'George Orwell', '1903-06-25', 'Anh', N'Tác giả của 1984 và Animal Farm'),
    (3, 'TG003', 'Haruki Murakami', '1949-01-12', N'Nhật Bản', N'Tác giả nổi tiếng của Nhật Bản'),
    (4, 'TG004', 'Paulo Coelho', '1947-08-24', 'Brazil', N'Tác giả của Nhà Giả Kim'),
    (5, 'TG005', 'Stephen King', '1947-09-21', N'Mỹ', N'Bậc thầy truyện kinh dị'),
    (6, 'TG006', 'Agatha Christie', '1890-09-15', 'Anh', N'Nữ hoàng truyện trinh thám'),
    (7, 'TG007', 'Dan Brown', '1964-06-22', N'Mỹ', N'Tác giả của Mật Mã Da Vinci'),
    (8, 'TG008', 'F. Scott Fitzgerald', '1896-09-24', N'Mỹ', N'Tác giả của Gatsby Vĩ Đại'),
    (9, 'TG009', 'Victor Hugo', '1802-02-26', N'Pháp', N'Tác giả của Những Người Khốn Khổ'),
    (10, 'TG010', N'Nguyễn Nhật Ánh', '1955-07-07', N'Việt Nam', N'Nhà văn nổi tiếng với tác phẩm tuổi thơ');
SET IDENTITY_INSERT tac_gia OFF;

SET IDENTITY_INSERT sach ON;
INSERT INTO sach (id, ma_sach, ten_sach, the_loai, ngay_xuat_ban, gia, id_tac_gia)
VALUES 
    (1, 'S001', 'Harry Potter', 'Fantasy', '1997-06-26', 250000, 1),
    (2, 'S002', '1984', 'Dystopia', '1949-06-08', 180000, 2),
    (3, 'S003', N'Rừng Na Uy', N'Văn học Nhật', '1987-01-01', 200000, 3),
    (4, 'S004', N'Nhà Giả Kim', N'Tâm lý', '1988-04-15', 220000, 4),
    (5, 'S005', 'IT', N'Kinh dị', '1986-09-15', 300000, 5),
    (6, 'S006', N'Án Mạng Trên Sông Nile', N'Trinh thám', '1937-01-01', 190000, 6),
    (7, 'S007', N'Mật Mã Da Vinci', N'Trinh thám', '2003-03-18', 280000, 7),
    (8, 'S008', N'Gatsby Vĩ Đại', N'Văn học cổ điển', '1925-04-10', 210000, 8),
    (9, 'S009', N'Những Người Khốn Khổ', N'Văn học Pháp', '1862-01-01', 350000, 9),
    (10, 'S010', N'Tôi Thấy Hoa Vàng Trên Cỏ Xanh', N'Văn học thiếu nhi', '2010-03-20', 150000, 10);
SET IDENTITY_INSERT sach OFF;

-- Bài tập
-- 1
SELECT
	ten_tac_gia,
	ten_sach
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
GROUP BY
	ten_tac_gia,
	ten_sach

-- 2
SELECT
	ten_tac_gia,
	ten_sach,
	gia
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
WHERE
	gia > 250000

-- 3 
SELECT TOP 1
	id_tac_gia,
	ten_tac_gia
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
GROUP BY
	id_tac_gia,
	ten_tac_gia

-- 4
SELECT
	ten_tac_gia,
	ten_sach
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
WHERE
	d.the_loai LIKE '%Trinh thám%'

-- 5
SELECT TOP 1
	ten_tac_gia,
	ten_sach,
	gia
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
ORDER BY gia DESC

-- 6
SELECT
	ten_tac_gia,
	quoc_tich
FROM tac_gia
WHERE quoc_tich LIKE N'%Mỹ%'

-- 7
SELECT
	SUM (gia) AS tong
FROM sach

-- 8
SELECT
	ten_sach,
	YEAR (ngay_xuat_ban) AS namXB
FROM sach
WHERE YEAR (ngay_xuat_ban) > 2000

-- 9
SELECT
	ten_tac_gia,
	ten_sach
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
ORDER BY
	ten_sach

-- 10
SELECT
	ten_tac_gia,
	ten_sach,
	mo_ta
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
WHERE mo_ta LIKE N'%Tác giả%'

-- 11
SELECT
	the_loai,
	COUNT (*) so_luong
FROM sach
GROUP BY
	the_loai

-- 12
SELECT
	ten_tac_gia,
	ten_sach,
	mo_ta
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
WHERE ten_sach LIKE N'%H%'

-- 13
SELECT
	id_tac_gia,
	ten_tac_gia,
	COUNT (*) so_luong
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
GROUP BY
	id_tac_gia,
	ten_tac_gia

-- 14
SELECT
	*
FROM sach
WHERE
	gia > (SELECT AVG(gia) FROM sach)

-- 15
SELECT
	ten_sach,
	YEAR (ngay_xuat_ban) AS namXB
FROM sach AS p
LEFT JOIN tac_gia d ON p.id_tac_gia = d.id
WHERE
	YEAR (ngay_xuat_ban) BETWEEN 1980 AND 2000

-- 16
SELECT
	ten_tac_gia,
	MONTH (ngay_sinh) AS thang_sinh
FROM tac_gia
WHERE MONTH (ngay_sinh) LIKE 9

-- 17
SELECT TOP 5
	ten_tac_gia,
	ten_sach
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia

-- 18
SELECT
	*
FROM sach
WHERE
	gia > (SELECT AVG(gia) FROM sach)

-- 19
SELECT
	id_tac_gia,
	ten_tac_gia,
	COUNT (*) so_luong
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
GROUP BY
	id_tac_gia,
	ten_tac_gia
HAVING
	COUNT (*) > 2

-- 20
SELECT
	ten_tac_gia,
	ten_sach,
	mo_ta
FROM tac_gia p
LEFT JOIN sach d ON p.id = d.id_tac_gia
WHERE ten_sach LIKE N'%Văn học%'