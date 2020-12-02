-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2020 at 04:15 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schooladmin`
--

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `classId` int(11) NOT NULL,
  `className` varchar(50) NOT NULL,
  `sectionName` varchar(50) DEFAULT NULL,
  `totalNumberOfStudents` int(3) DEFAULT NULL,
  `roomNo` varchar(50) DEFAULT NULL,
  `classTeacherName` varchar(50) DEFAULT NULL,
  `createdBy` varchar(30) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(30) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`classId`, `className`, `sectionName`, `totalNumberOfStudents`, `roomNo`, `classTeacherName`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(2, '6th Standard', 'A', 50, 'A201', 'Dharanidharan P', 'ADMIN', '2020-11-19 12:37:16', 'ADMIN', '2020-11-19 12:37:16'),
(3, '1st Standard', 'Alpha', 20, 'A101', 'Dharanidharan P', 'ADMIN', '2020-11-19 13:49:51', 'ADMIN', '2020-11-19 13:49:51'),
(4, '10th Standard', 'Beta', 20, 'B203', 'Ramasamy R', 'ADMIN', '2020-11-23 14:40:30', 'ADMIN', '2020-12-01 12:49:06'),
(5, '5th Standard', 'Ganga', 50, '501', 'Rajesh K', 'ADMIN', '2020-12-01 18:13:37', 'ADMIN', '2020-12-01 18:13:37');

-- --------------------------------------------------------

--
-- Table structure for table `classes_subjects_mapping`
--

CREATE TABLE `classes_subjects_mapping` (
  `classesSubjectsMappingId` int(11) NOT NULL,
  `classId` int(11) NOT NULL,
  `className` varchar(50) NOT NULL,
  `subjectId` int(11) NOT NULL,
  `subjectName` varchar(50) NOT NULL,
  `createdBy` varchar(50) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(50) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes_subjects_mapping`
--

INSERT INTO `classes_subjects_mapping` (`classesSubjectsMappingId`, `classId`, `className`, `subjectId`, `subjectName`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(8, 3, '1st Standard', 4, 'Science', 'ADMIN', '2020-11-19 17:54:35', 'ADMIN', '2020-11-19 17:54:35'),
(9, 2, '6th Standard', 4, 'Science', 'ADMIN', '2020-11-19 18:14:11', 'ADMIN', '2020-11-19 18:14:11'),
(11, 4, '10th Standard', 5, 'Social Science', 'ADMIN', '2020-11-23 14:40:53', 'ADMIN', '2020-11-23 14:40:53'),
(12, 4, '10th Standard', 2, 'Tamil', 'ADMIN', '2020-12-02 13:55:46', 'ADMIN', '2020-12-02 13:55:46');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `studentId` int(11) NOT NULL,
  `studentName` varchar(30) NOT NULL,
  `fathersName` varchar(30) DEFAULT NULL,
  `mothersName` varchar(35) DEFAULT NULL,
  `emergencyContactNumber` varchar(15) NOT NULL,
  `bloodGroup` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `classId` int(11) NOT NULL,
  `className` varchar(30) NOT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `createdBy` varchar(30) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(30) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`studentId`, `studentName`, `fathersName`, `mothersName`, `emergencyContactNumber`, `bloodGroup`, `gender`, `age`, `classId`, `className`, `address`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(2, 'Sakthi', NULL, NULL, '9998887771', 'O+ve', 'female', 12, 3, '1st Standard', 'Kailas', 'ADMIN', '2020-11-23 15:15:34', 'ADMIN', '2020-12-02 07:38:20'),
(3, 'Shivan', NULL, NULL, '9998887771', 'O+ve', 'male', 14, 3, '1st Standard', 'Kailas', 'ADMIN', '2020-11-30 11:59:38', 'ADMIN', '2020-12-02 07:37:32'),
(4, 'Ramcharan', 'Teja', NULL, '99988878784', 'B-ve', 'male', 16, 3, '1st Standard', NULL, 'ADMIN', '2020-12-02 13:11:15', 'ADMIN', '2020-12-02 13:11:15');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `subjectId` int(11) NOT NULL,
  `subjectName` varchar(50) NOT NULL,
  `subjectDescription` varchar(500) DEFAULT NULL,
  `createdBy` varchar(30) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(30) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`subjectId`, `subjectName`, `subjectDescription`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(2, 'Tamil', 'Language', 'ADMIN', '2020-11-18 21:57:55', 'ADMIN', '2020-11-18 21:57:55'),
(4, 'Science', 'Studies about Biology, Zoology, Physics and Chemistry', 'ADMIN', '2020-11-19 16:50:04', 'ADMIN', '2020-11-19 16:50:04'),
(5, 'Social Science', 'Study about History, Geography and Civics', 'ADMIN', '2020-11-23 14:38:36', 'ADMIN', '2020-11-23 14:38:36'),
(10, 'Hindi', 'Optional Language', 'ADMIN', '2020-12-01 17:02:37', 'ADMIN', '2020-12-01 11:58:16');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `teacherId` int(11) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `contactNumber` varchar(15) NOT NULL,
  `emailId` varchar(100) NOT NULL,
  `qualification` varchar(100) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `martialStatus` varchar(30) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `createdBy` varchar(30) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(30) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`teacherId`, `firstName`, `lastName`, `contactNumber`, `emailId`, `qualification`, `gender`, `age`, `martialStatus`, `address`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(9, 'Dharanidharan', 'P', '9092900277', 'dd141096@gmail.com', 'Bsc IS', 'male', 24, 'Married', 'EWSB 2341 Gandhimaanagar Peelamedu Coimbatore-641004', 'ADMIN', '2020-11-18 16:45:16', 'ADMIN', '2020-12-01 12:32:50'),
(12, 'RajKumar', 'L', '7639911222', 'raj@vitalmed.com', 'MCA', 'male', 30, 'Married', 'Test Address', 'ADMIN', '2020-11-18 20:03:14', 'ADMIN', '2020-11-18 14:33:32'),
(13, 'Sarath Kumar', 'L', '7639911222', 'raj@vitalmed.com', 'Bsc IS', 'Enter Gender', 0, 'Enter Martial Status', NULL, 'ADMIN', '2020-11-18 21:54:35', 'ADMIN', '2020-11-18 21:54:35'),
(14, 'Murugan', 'S', '9876543210', 'murugappan@kailash.com', 'Phd in Tamil', 'male', 25, 'Married', 'Kailash', 'ADMIN', '2020-11-19 16:51:44', 'ADMIN', '2020-11-19 16:51:44'),
(15, 'Ramasamy', 'R', '9876543011', 'ramasamyr@xmail.com', 'Msc Political Science', 'male', 55, 'Married', NULL, 'ADMIN', '2020-11-23 14:39:48', 'ADMIN', '2020-11-23 14:39:48');

-- --------------------------------------------------------

--
-- Table structure for table `teachers_classes_subjects_mapping`
--

CREATE TABLE `teachers_classes_subjects_mapping` (
  `teachersClassesSubjectsMappingId` int(11) NOT NULL,
  `teacherId` int(11) NOT NULL,
  `teacherName` varchar(50) NOT NULL,
  `classId` int(11) NOT NULL,
  `className` varchar(50) NOT NULL,
  `subjectId` int(11) NOT NULL,
  `subjectName` varchar(50) NOT NULL,
  `createdBy` varchar(50) NOT NULL,
  `createdDt` timestamp NOT NULL DEFAULT current_timestamp(),
  `updatedBy` varchar(50) NOT NULL,
  `updatedDt` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teachers_classes_subjects_mapping`
--

INSERT INTO `teachers_classes_subjects_mapping` (`teachersClassesSubjectsMappingId`, `teacherId`, `teacherName`, `classId`, `className`, `subjectId`, `subjectName`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(1, 14, 'Murugan', 2, '6th Standard', 4, 'Science', 'ADMIN', '2020-11-19 20:29:13', 'ADMIN', '2020-11-19 20:29:13'),
(2, 12, 'RajKumar', 2, '6th Standard', 4, 'Science', 'ADMIN', '2020-11-19 20:30:00', 'ADMIN', '2020-11-19 20:30:00'),
(3, 15, 'Ramasamy', 4, '10th Standard', 5, 'Social Science', 'ADMIN', '2020-11-23 14:41:16', 'ADMIN', '2020-11-23 14:41:16'),
(5, 12, 'RajKumar', 3, '1st Standard', 4, 'Science', 'ADMIN', '2020-12-02 14:02:20', 'ADMIN', '2020-12-02 14:02:20');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `userId` int(11) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL,
  `userType` varchar(10) NOT NULL COMMENT 'U - User, A - Admin',
  `createdBy` varchar(30) NOT NULL,
  `createdDt` timestamp(6) NULL DEFAULT current_timestamp(6),
  `updatedBy` varchar(30) NOT NULL,
  `updatedDt` timestamp(6) NULL DEFAULT current_timestamp(6)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`userId`, `userName`, `password`, `userType`, `createdBy`, `createdDt`, `updatedBy`, `updatedDt`) VALUES
(1, 'ADMIN', 'ADMIN', 'A', 'ADMIN', '2020-11-13 09:14:51.000000', 'ADMIN', '2020-11-13 09:14:51.000000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`classId`),
  ADD UNIQUE KEY `className` (`className`);

--
-- Indexes for table `classes_subjects_mapping`
--
ALTER TABLE `classes_subjects_mapping`
  ADD PRIMARY KEY (`classesSubjectsMappingId`),
  ADD UNIQUE KEY `classId` (`classId`,`subjectId`),
  ADD KEY `subjectId` (`subjectId`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`studentId`),
  ADD UNIQUE KEY `studentName` (`studentName`,`emergencyContactNumber`),
  ADD KEY `students_ibfk_1` (`classId`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`subjectId`),
  ADD UNIQUE KEY `subjectName` (`subjectName`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`teacherId`),
  ADD UNIQUE KEY `firstName` (`firstName`,`contactNumber`,`emailId`);

--
-- Indexes for table `teachers_classes_subjects_mapping`
--
ALTER TABLE `teachers_classes_subjects_mapping`
  ADD PRIMARY KEY (`teachersClassesSubjectsMappingId`),
  ADD UNIQUE KEY `teacherId` (`teacherId`,`classId`,`subjectId`),
  ADD KEY `teachers_classes_subjects_mapping_ibfk_1` (`classId`),
  ADD KEY `teachers_classes_subjects_mapping_ibfk_2` (`subjectId`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `classId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `classes_subjects_mapping`
--
ALTER TABLE `classes_subjects_mapping`
  MODIFY `classesSubjectsMappingId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `studentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `subjectId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `teacherId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `teachers_classes_subjects_mapping`
--
ALTER TABLE `teachers_classes_subjects_mapping`
  MODIFY `teachersClassesSubjectsMappingId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `userdetails`
--
ALTER TABLE `userdetails`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `classes_subjects_mapping`
--
ALTER TABLE `classes_subjects_mapping`
  ADD CONSTRAINT `classes_subjects_mapping_ibfk_1` FOREIGN KEY (`classId`) REFERENCES `classes` (`classId`),
  ADD CONSTRAINT `classes_subjects_mapping_ibfk_2` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`subjectId`);

--
-- Constraints for table `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `students_ibfk_1` FOREIGN KEY (`classId`) REFERENCES `classes` (`classId`);

--
-- Constraints for table `teachers_classes_subjects_mapping`
--
ALTER TABLE `teachers_classes_subjects_mapping`
  ADD CONSTRAINT `teachers_classes_subjects_mapping_ibfk_1` FOREIGN KEY (`classId`) REFERENCES `classes` (`classId`),
  ADD CONSTRAINT `teachers_classes_subjects_mapping_ibfk_2` FOREIGN KEY (`subjectId`) REFERENCES `subjects` (`subjectId`),
  ADD CONSTRAINT `teachers_classes_subjects_mapping_ibfk_3` FOREIGN KEY (`teacherId`) REFERENCES `teachers` (`teacherId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
