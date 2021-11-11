-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 11, 2021 lúc 11:46 AM
-- Phiên bản máy phục vụ: 10.4.18-MariaDB
-- Phiên bản PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysinhvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `username` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Admin1', '123456'),
('Admin2', '654321');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `professor`
--

CREATE TABLE `professor` (
  `ID` int(50) NOT NULL,
  `Name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Dob` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Gender` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `PhoneNumber` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Salary` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `professor`
--

INSERT INTO `professor` (`ID`, `Name`, `Dob`, `Gender`, `Address`, `PhoneNumber`, `Salary`) VALUES
(1, 'Nguyen Khoa Diem', '2001', 'Nam', 'Ha Noi', '0353379200', '100.000.000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `ID` int(50) NOT NULL,
  `Name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Dob` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Gender` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `GPA` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`ID`, `Name`, `Dob`, `Gender`, `Address`, `Phone`, `GPA`) VALUES
(1, 'Nguyen Thuy Trang', '2001', 'Nu', 'Yen Bai', '0123456789', '9.0');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `student`
--
ALTER TABLE `student`
  MODIFY `ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
