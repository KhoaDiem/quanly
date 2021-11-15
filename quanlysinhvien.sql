-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 15, 2021 lúc 10:53 AM
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
-- Cơ sở dữ liệu: `quanlynhanvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `account`
--

CREATE TABLE `account` (
  `userID` int(50) NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `acVerify` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `account`
--

INSERT INTO `account` (`userID`, `username`, `password`, `acVerify`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'admin', '12345', 'admin'),
(3, 'root', 'root', 'admin'),
(4, 'username', 'password', 'user');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category`
--

CREATE TABLE `category` (
  `categoryID` int(50) NOT NULL,
  `categoryName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `category`
--

INSERT INTO `category` (`categoryID`, `categoryName`, `description`) VALUES
(1, 'BHAF190119', 'Xem Thêm');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `category_course`
--

CREATE TABLE `category_course` (
  `courseID` int(50) NOT NULL,
  `categoryID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `course`
--

CREATE TABLE `course` (
  `courseID` int(50) NOT NULL,
  `courseName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `course`
--

INSERT INTO `course` (`courseID`, `courseName`, `description`) VALUES
(1, 'BHAF-190119', 'Xem Thêm');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `course_topic`
--

CREATE TABLE `course_topic` (
  `courseID` int(50) NOT NULL,
  `topicID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `course_trainer`
--

CREATE TABLE `course_trainer` (
  `trainerID` int(11) NOT NULL,
  `courseID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `topic`
--

CREATE TABLE `topic` (
  `topicID` int(50) NOT NULL,
  `topicName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `description` varchar(225) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `topic`
--

INSERT INTO `topic` (`topicID`, `topicName`, `description`) VALUES
(1, 'CNTT', 'Xem Thêm');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trainee`
--

CREATE TABLE `trainee` (
  `traineeID` int(50) NOT NULL,
  `traineeName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dob` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `education` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `programingLanguage` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `toeicScore` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `expericenDetail` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `department` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `location` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `trainee`
--

INSERT INTO `trainee` (`traineeID`, `traineeName`, `dob`, `education`, `programingLanguage`, `toeicScore`, `expericenDetail`, `department`, `location`) VALUES
(1, 'Nguyễn Văn A', '3-6-2001', 'BTEC FPT', 'Java', '7.5', 'Xem Thêm', '5', 'Sinh viên'),
(2, 'Nguyễn Văn B', '1-1-2001', 'BTEC FPT', 'Java', '7.5', 'xem thêm', '5', 'Sinh viên'),
(3, 'Nguyễn Văn C', '1-2-2001', 'BTEC FPT', 'Java', '7.5', 'Xem Thêm', '5', 'Sinh viên'),
(4, 'Nguyễn Văn D', '1-3-2001', 'BTEC FPT', 'Java', '7.5', 'Xem Thêm', '5', 'Sinh viên'),
(5, 'Nguyễn Văn E', '1-4-2001', 'BTEC FPT', 'Java', '7.5', 'Xem Thêm', '5', 'Sinh viên'),
(6, 'Nguyễn Văn F', '1-5-2001', 'BTEC FPT', 'Java', '7.5', 'Xem Thêm', '5', 'Sinh viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trainee_course`
--

CREATE TABLE `trainee_course` (
  `courseID` int(50) NOT NULL,
  `traineeID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trainer`
--

CREATE TABLE `trainer` (
  `trainerID` int(50) NOT NULL,
  `trainerName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `education` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `typework` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `workingplace` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telephone` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `trainer`
--

INSERT INTO `trainer` (`trainerID`, `trainerName`, `education`, `typework`, `workingplace`, `telephone`, `email`) VALUES
(1, 'Nguyen Khoa Diem', 'BTEC FPT', 'Part Time', 'Hà Nội', '0123456789', 'Diem01@gmail.com'),
(2, 'Nguyen Van An', 'TMU', 'Part Time', 'Hà Nội', '0123456789', 'ABC01@gmail.com'),
(3, 'Nguyễn Văn B', 'BTEC FPT', 'Full Time', 'Hà Nội', '123456789', 'A01@gmail.com'),
(4, 'Nguyễn Văn C', 'Bách Khoa', 'Full Time', 'Hà Nội', '0123456789', 'ABC01@gmail.com'),
(5, 'Nguyễn Văn D', 'BTEC FPT', 'Part Time', 'Hà Nội', '0123456789', 'ABC01@gmail.com'),
(6, 'Nguyen Van E', 'BTEC FPT', 'Part Time', 'Hà Nội', '0123456789', 'ABC01@gmail.com');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`userID`);

--
-- Chỉ mục cho bảng `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`categoryID`);

--
-- Chỉ mục cho bảng `category_course`
--
ALTER TABLE `category_course`
  ADD PRIMARY KEY (`courseID`,`categoryID`);

--
-- Chỉ mục cho bảng `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseID`);

--
-- Chỉ mục cho bảng `course_topic`
--
ALTER TABLE `course_topic`
  ADD PRIMARY KEY (`courseID`,`topicID`);

--
-- Chỉ mục cho bảng `course_trainer`
--
ALTER TABLE `course_trainer`
  ADD PRIMARY KEY (`trainerID`,`courseID`);

--
-- Chỉ mục cho bảng `topic`
--
ALTER TABLE `topic`
  ADD PRIMARY KEY (`topicID`);

--
-- Chỉ mục cho bảng `trainee`
--
ALTER TABLE `trainee`
  ADD PRIMARY KEY (`traineeID`);

--
-- Chỉ mục cho bảng `trainee_course`
--
ALTER TABLE `trainee_course`
  ADD PRIMARY KEY (`courseID`,`traineeID`);

--
-- Chỉ mục cho bảng `trainer`
--
ALTER TABLE `trainer`
  ADD PRIMARY KEY (`trainerID`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `account`
--
ALTER TABLE `account`
  MODIFY `userID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT cho bảng `category`
--
ALTER TABLE `category`
  MODIFY `categoryID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `category_course`
--
ALTER TABLE `category_course`
  MODIFY `courseID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `course`
--
ALTER TABLE `course`
  MODIFY `courseID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `course_topic`
--
ALTER TABLE `course_topic`
  MODIFY `courseID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `course_trainer`
--
ALTER TABLE `course_trainer`
  MODIFY `trainerID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `topic`
--
ALTER TABLE `topic`
  MODIFY `topicID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `trainee`
--
ALTER TABLE `trainee`
  MODIFY `traineeID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `trainee_course`
--
ALTER TABLE `trainee_course`
  MODIFY `courseID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `trainer`
--
ALTER TABLE `trainer`
  MODIFY `trainerID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
