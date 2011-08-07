-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.41-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema dbjstl
--

CREATE DATABASE IF NOT EXISTS dbjstl;
USE dbjstl;

--
-- Definition of table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
CREATE TABLE `alunos` (
  `RM` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) NOT NULL,
  `Curso` varchar(45) NOT NULL,
  PRIMARY KEY (`RM`)
) ENGINE=InnoDB AUTO_INCREMENT=67891 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alunos`
--

/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
INSERT INTO `alunos` (`RM`,`Nome`,`Curso`) VALUES 
 (11111,'Maria da Silva','Engenharia'),
 (12345,'Jose da Silva','Turismo'),
 (16273,'Pedro','Engenharia'),
 (22222,'Claudia','Arquitetura'),
 (27384,'Julia','Turismo'),
 (33333,'Claudio','Educação Fisica'),
 (44444,'Joao','Ciências da Computação'),
 (54321,'Carlos','Ciências da Computação'),
 (61828,'Vinicius','SI'),
 (67890,'Cristina','Nutrição');
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
