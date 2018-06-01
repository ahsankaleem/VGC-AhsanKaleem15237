-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: vgcportal
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL,
  `AdminName` varchar(25) DEFAULT NULL,
  `Pass` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`AdminID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'AhsanK','AK');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `CourseID` int(11) NOT NULL,
  `CName` varchar(20) DEFAULT NULL,
  `Fees` int(11) DEFAULT NULL,
  `Sub1` varchar(20) DEFAULT NULL,
  `Sub2` varchar(20) DEFAULT NULL,
  `Sub3` varchar(20) DEFAULT NULL,
  `Sub4` varchar(20) DEFAULT NULL,
  `TeacherID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CourseID`),
  KEY `TeacherID` (`TeacherID`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`TeacherID`) REFERENCES `teacher` (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (15237,'BSC1',100,'JAVA','IS','VComms','Maths',1),(15238,'BBC',5000,'Commerce','eCommerce','Cultural Commerce','Bio Commerce',2),(15239,'Health n Safety',500,'Nebosh','IOSH','OSHA','Safe Pass',2),(15240,'Medical',6000,'Bio','Chemistry','Science','Physics',2);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scattendance`
--

DROP TABLE IF EXISTS `scattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scattendance` (
  `SID` int(11) NOT NULL,
  `Sub1` varchar(20) DEFAULT NULL,
  `Sub2` varchar(20) DEFAULT NULL,
  `Sub3` varchar(20) DEFAULT NULL,
  `Sub4` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scattendance`
--

LOCK TABLES `scattendance` WRITE;
/*!40000 ALTER TABLE `scattendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `scattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentattendance`
--

DROP TABLE IF EXISTS `studentattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentattendance` (
  `SID` int(11) NOT NULL,
  `sub1` varchar(20) DEFAULT NULL,
  `sub2` varchar(20) DEFAULT NULL,
  `sub3` varchar(20) DEFAULT NULL,
  `sub4` varchar(20) DEFAULT NULL,
  `CourseID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  KEY `CourseID` (`CourseID`),
  CONSTRAINT `studentattendance_ibfk_1` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentattendance`
--

LOCK TABLES `studentattendance` WRITE;
/*!40000 ALTER TABLE `studentattendance` DISABLE KEYS */;
INSERT INTO `studentattendance` VALUES (0,' 15',' 20',' 85',' 98',15237),(1,' 55',' 66',' 44',' 22',15237),(5,' 155',' 333',' 155',' 333',15237);
/*!40000 ALTER TABLE `studentattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentlogin`
--

DROP TABLE IF EXISTS `studentlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentlogin` (
  `SID` int(11) NOT NULL,
  `Pass` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentlogin`
--

LOCK TABLES `studentlogin` WRITE;
/*!40000 ALTER TABLE `studentlogin` DISABLE KEYS */;
INSERT INTO `studentlogin` VALUES (1,'aki');
/*!40000 ALTER TABLE `studentlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentresult`
--

DROP TABLE IF EXISTS `studentresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentresult` (
  `SID` int(11) NOT NULL,
  `sub1` varchar(20) DEFAULT NULL,
  `sub2` varchar(20) DEFAULT NULL,
  `sub3` varchar(20) DEFAULT NULL,
  `sub4` varchar(20) DEFAULT NULL,
  `CourseID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  KEY `CourseID` (`CourseID`),
  CONSTRAINT `studentresult_ibfk_1` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentresult`
--

LOCK TABLES `studentresult` WRITE;
/*!40000 ALTER TABLE `studentresult` DISABLE KEYS */;
/*!40000 ALTER TABLE `studentresult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentresults`
--

DROP TABLE IF EXISTS `studentresults`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentresults` (
  `ResultID` int(11) NOT NULL AUTO_INCREMENT,
  `ResultDesc` varchar(25) DEFAULT NULL,
  `Assignment1` int(11) DEFAULT NULL,
  `Assignment2` int(11) DEFAULT NULL,
  `Assignment3` int(11) DEFAULT NULL,
  `Exam` int(11) DEFAULT NULL,
  `SubjectID` int(11) DEFAULT NULL,
  `SID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ResultID`),
  KEY `SubjectID` (`SubjectID`),
  KEY `SID` (`SID`),
  CONSTRAINT `studentresults_ibfk_1` FOREIGN KEY (`SubjectID`) REFERENCES `subject` (`SubjectID`),
  CONSTRAINT `studentresults_ibfk_2` FOREIGN KEY (`SID`) REFERENCES `students` (`SID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentresults`
--

LOCK TABLES `studentresults` WRITE;
/*!40000 ALTER TABLE `studentresults` DISABLE KEYS */;
INSERT INTO `studentresults` VALUES (1,'General',55,15,65,22,1,1),(2,'General',88,99,55,61,2,1),(3,'General',91,98,87,23,3,1),(4,'General',13,51,65,25,4,1),(5,'General',44,44,11,56,1,5),(6,'General',65,2,71,12,2,5),(7,'General',97,25,13,88,3,5),(8,'General',28,31,92,43,4,5);
/*!40000 ALTER TABLE `studentresults` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `SID` int(11) NOT NULL,
  `SName` varchar(20) DEFAULT NULL,
  `SDOB` int(11) DEFAULT NULL,
  `SGender` varchar(10) DEFAULT NULL,
  `SPhone` int(11) DEFAULT NULL,
  `SEmail` varchar(50) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  `CourseID` int(11) DEFAULT NULL,
  `Pass` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  KEY `CourseID` (`CourseID`),
  CONSTRAINT `students_ibfk_2` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Ahsan',25,'Male',16516565,'asdafssf',2,15237,'kami'),(2,'Ahsan',1561,'Male',51651,'asdfaf',1,15237,''),(3,'Kaleem',35,'Male',869875833,'lhr_king@hotmail.com',1,15238,'kaleem'),(4,'Umer Sharif',1958,'Male',165465465,'Umer.@gmail.com',2,15237,'um'),(5,'Ahsan',16516,'Gendaar',16516,'adsfafd',1,15237,'aadfa'),(6,'Ahsaan',1561,'male',165165,'asdff',1,15237,'asdf'),(7,'Ahsan',156,'Male',65165,'asadf',1,15237,'5ad'),(8,'asdfafd',51651,'adfaf',516,'afafa',1,15237,'adsfa'),(9,'akaleem',4564,'male',516516,'adsfadsf',1,15237,'asdaf'),(10,'Akaleem',1989,'male',165165,'asdfa',2,15237,'aki'),(11,'Aftab',25,'Male',89984984,'adsfa',2,15239,'af');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `SubjectID` int(11) NOT NULL,
  `SubjectName` varchar(24) DEFAULT NULL,
  `CourseID` int(11) DEFAULT NULL,
  PRIMARY KEY (`SubjectID`),
  KEY `CourseID` (`CourseID`),
  CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`CourseID`) REFERENCES `course` (`CourseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'Java',15237),(2,'VComms',15237),(3,'IS',15237),(4,'Maths',15237),(5,'Commerce',15238),(6,'Info System',15238),(7,'eCommerce',15238),(8,'Counting',15238);
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `TeacherID` int(11) NOT NULL,
  `TName` varchar(20) DEFAULT NULL,
  `HEducation` varchar(25) DEFAULT NULL,
  `Department` varchar(25) DEFAULT NULL,
  `Gender` varchar(9) DEFAULT NULL,
  `DOB` int(11) DEFAULT NULL,
  `Phone` int(11) DEFAULT NULL,
  `Email` varchar(25) DEFAULT NULL,
  `pass` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Akaleem','MSC','I.T','Male',32,899875833,'lhr_king@hotmail.com','pass'),(2,'kaleem','MSC','Computer','Male',2,89875833,'Lhr_king@hotmail.com','ahsan'),(3,'Ahsan Kaleem','MSC','Science','Male',1988,899875833,'aadfasd.com','ateacher'),(4,'Mughal','BSC','Science','Male',35,898984984,'asdfasd','abc');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-01  2:02:51
