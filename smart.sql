CREATE DATABASE  IF NOT EXISTS `smart` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `smart`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: smart
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbclass`
--

DROP TABLE IF EXISTS `tbclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbclass` (
  `classid` int NOT NULL,
  `classname` text,
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbclass`
--

LOCK TABLES `tbclass` WRITE;
/*!40000 ALTER TABLE `tbclass` DISABLE KEYS */;
INSERT INTO `tbclass` VALUES (28,'gr'),(55,' bb'),(696,'gfd'),(4525,'vii'),(78666,'IX77'),(178556,'VIIIafddf'),(789456,'X');
/*!40000 ALTER TABLE `tbclass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbfees`
--

DROP TABLE IF EXISTS `tbfees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbfees` (
  `name` varchar(50) DEFAULT NULL,
  `fees` int DEFAULT NULL,
  `balance` int DEFAULT NULL,
  `classnum` varchar(50) DEFAULT NULL,
  `sid` varchar(50) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbfees`
--

LOCK TABLES `tbfees` WRITE;
/*!40000 ALTER TABLE `tbfees` DISABLE KEYS */;
INSERT INTO `tbfees` VALUES ('Sammy',8000,4000,'VIII','170321'),('Sammy',500,70,'V','45'),('Rahul',1000,500,'IX','88');
/*!40000 ALTER TABLE `tbfees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblogin`
--

DROP TABLE IF EXISTS `tblogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblogin`
--

LOCK TABLES `tblogin` WRITE;
/*!40000 ALTER TABLE `tblogin` DISABLE KEYS */;
INSERT INTO `tblogin` VALUES ('amit','amit'),('sakshat','Sakshat11@'),('Sam','1234');
/*!40000 ALTER TABLE `tblogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbparent`
--

DROP TABLE IF EXISTS `tbparent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbparent` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `mobilenumber` varchar(50) DEFAULT NULL,
  `wardname` text,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=548485 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbparent`
--

LOCK TABLES `tbparent` WRITE;
/*!40000 ALTER TABLE `tbparent` DISABLE KEYS */;
INSERT INTO `tbparent` VALUES (177,'Vishu','Male','Gurdaspur','Barnala','8529637410','Pam'),(1706,'Sammy','Male','Firozpur','Hoshiarpur','7418529630','Sam'),(1777,'ff','ss',NULL,'Faridkot','sfs','11718'),(456123,'Manu','Female','Bathinda','Shahpur','451236987','Munna');
/*!40000 ALTER TABLE `tbparent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbstudent`
--

DROP TABLE IF EXISTS `tbstudent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbstudent` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `rollnumber` int DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `fathername` varchar(20) DEFAULT NULL,
  `mothername` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `classroom` varchar(20) DEFAULT NULL,
  `mb` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=742 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbstudent`
--

LOCK TABLES `tbstudent` WRITE;
/*!40000 ALTER TABLE `tbstudent` DISABLE KEYS */;
INSERT INTO `tbstudent` VALUES (741,45,'Sammy','fewf','efwe','few',NULL,'Fazilka','V','45445');
/*!40000 ALTER TABLE `tbstudent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbteacher`
--

DROP TABLE IF EXISTS `tbteacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbteacher` (
  `incharge` varchar(50) DEFAULT NULL,
  `teacherid` int NOT NULL,
  `teachername` varchar(50) DEFAULT NULL,
  `fathersname` varchar(50) DEFAULT NULL,
  `mothersname` varchar(50) DEFAULT NULL,
  `gender` text,
  `city` text,
  `address` text,
  `mobilenumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`teacherid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbteacher`
--

LOCK TABLES `tbteacher` WRITE;
/*!40000 ALTER TABLE `tbteacher` DISABLE KEYS */;
INSERT INTO `tbteacher` VALUES ('VIII',741852,'Sonakshi','Somnath','Santosh','Male','Amritsar','vpo karoli pathankot','4948');
/*!40000 ALTER TABLE `tbteacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-11 11:33:36
