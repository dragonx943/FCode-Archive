CREATE DATABASE QLGV
GO
USE QLGV
GO
CREATE TABLE giang_vien(
	ma VARCHAR(50) PRIMARY KEY,
	ten NVARCHAR(150),
	loai NVARCHAR(150),
	tuoi INT,
	bac INT,
	gioi_tinh BIT
)
GO
INSERT INTO giang_vien
(ma, ten, loai, tuoi, bac, gioi_tinh)
VALUES(N'HangNT169', N'Nguyen THuy Hang', N'Loai 1', 10, 1, 0);
INSERT INTO giang_vien
(ma, ten, loai, tuoi, bac, gioi_tinh)
VALUES(N'PhongTT35', N'Tran Tuan Phong', N'Loai 2', 11, 1, 1);
INSERT INTO giang_vien
(ma, ten, loai, tuoi, bac, gioi_tinh)
VALUES(N'NguyenVV4', N'Vu Van Nguyen', N'Loai 1', 11, 2, 1);