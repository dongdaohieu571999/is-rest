-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: is_agency_db
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `acc_infor_changed_history`
--

DROP TABLE IF EXISTS `acc_infor_changed_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acc_infor_changed_history` (
  `id` int NOT NULL,
  `id_customer` int DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `id_attachment` int DEFAULT NULL,
  `id_request` int DEFAULT NULL,
  `approval_status` varchar(45) DEFAULT NULL,
  `old_information` varchar(45) DEFAULT NULL,
  `new_information` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_customer_aich_fk_idx` (`id_customer`),
  KEY `id_attachment_aich_fk_idx` (`id_attachment`),
  KEY `id_request_aich_fk_idx` (`id_request`),
  CONSTRAINT `id_attachment_aich_fk` FOREIGN KEY (`id_attachment`) REFERENCES `attachment` (`id`),
  CONSTRAINT `id_customer_aich_fk` FOREIGN KEY (`id_customer`) REFERENCES `customer_info` (`id`),
  CONSTRAINT `id_request_aich_fk` FOREIGN KEY (`id_request`) REFERENCES `request` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acc_infor_changed_history`
--

LOCK TABLES `acc_infor_changed_history` WRITE;
/*!40000 ALTER TABLE `acc_infor_changed_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `acc_infor_changed_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attachment`
--

DROP TABLE IF EXISTS `attachment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attachment` (
  `id` int NOT NULL,
  `url` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attachment`
--

LOCK TABLES `attachment` WRITE;
/*!40000 ALTER TABLE `attachment` DISABLE KEYS */;
/*!40000 ALTER TABLE `attachment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `certificate`
--

DROP TABLE IF EXISTS `certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `certificate` (
  `id` int NOT NULL,
  `certificate_link` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_address`
--

DROP TABLE IF EXISTS `contact_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact_address` (
  `id` int NOT NULL,
  `no_street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `wards` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_address`
--

LOCK TABLES `contact_address` WRITE;
/*!40000 ALTER TABLE `contact_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract`
--

DROP TABLE IF EXISTS `contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contract` (
  `id` int NOT NULL,
  `id_customer` int DEFAULT NULL,
  `name_contract_owner` varchar(45) DEFAULT NULL,
  `payment_period` varchar(45) DEFAULT NULL,
  `insurance_type` varchar(45) DEFAULT NULL,
  `id_main_interest` int DEFAULT NULL,
  `id_illustration` int DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `date_next_payment` datetime DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `approval_status` varchar(45) DEFAULT NULL,
  `contract_total_value` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_customer_c_fk_idx` (`id_customer`),
  KEY `id_main_interest_c_fk_idx` (`id_main_interest`),
  KEY `id_illustration_c_fk_idx` (`id_illustration`),
  CONSTRAINT `id_customer_c_fk` FOREIGN KEY (`id_customer`) REFERENCES `customer_info` (`id`),
  CONSTRAINT `id_illustration_c_fk` FOREIGN KEY (`id_illustration`) REFERENCES `illustration` (`id`),
  CONSTRAINT `id_main_interest_c_fk` FOREIGN KEY (`id_main_interest`) REFERENCES `main_interest_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract`
--

LOCK TABLES `contract` WRITE;
/*!40000 ALTER TABLE `contract` DISABLE KEYS */;
/*!40000 ALTER TABLE `contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract_change_history`
--

DROP TABLE IF EXISTS `contract_change_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contract_change_history` (
  `id` int NOT NULL,
  `id_contract` int DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `id_attachment` int DEFAULT NULL,
  `id_request` int DEFAULT NULL,
  `approval_status` varchar(45) DEFAULT NULL,
  `old_information` varchar(45) DEFAULT NULL,
  `new_information` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_contract_cch_fk_idx` (`id_contract`),
  KEY `id_attachment_idx` (`id_attachment`),
  KEY `id_request_cch_fk_idx` (`id_request`),
  CONSTRAINT `id_attachment` FOREIGN KEY (`id_attachment`) REFERENCES `attachment` (`id`),
  CONSTRAINT `id_contract_cch_fk` FOREIGN KEY (`id_contract`) REFERENCES `contract` (`id`),
  CONSTRAINT `id_request_cch_fk` FOREIGN KEY (`id_request`) REFERENCES `request` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract_change_history`
--

LOCK TABLES `contract_change_history` WRITE;
/*!40000 ALTER TABLE `contract_change_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `contract_change_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `current_address`
--

DROP TABLE IF EXISTS `current_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `current_address` (
  `id` int NOT NULL,
  `no_street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `wards` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `current_address`
--

LOCK TABLES `current_address` WRITE;
/*!40000 ALTER TABLE `current_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `current_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_acc`
--

DROP TABLE IF EXISTS `customer_acc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_acc` (
  `id` int NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_acc`
--

LOCK TABLES `customer_acc` WRITE;
/*!40000 ALTER TABLE `customer_acc` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_acc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_info`
--

DROP TABLE IF EXISTS `customer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_info` (
  `id` int NOT NULL,
  `birth_date` datetime DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `birth_address` varchar(45) DEFAULT NULL,
  `types_identification` varchar(45) DEFAULT NULL,
  `ID_card` varchar(45) DEFAULT NULL,
  `nationality_1` varchar(45) DEFAULT NULL,
  `nationality_2` varchar(45) DEFAULT NULL,
  `nation` varchar(45) DEFAULT NULL,
  `job` varchar(45) DEFAULT NULL,
  `career` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `occupation_group` varchar(45) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `main_business` varchar(45) DEFAULT NULL,
  `specific_work` varchar(45) DEFAULT NULL,
  `monthly_income` varchar(45) DEFAULT NULL,
  `id_current_address` int DEFAULT NULL,
  `id_permanent_address` int DEFAULT NULL,
  `id_contact_address` int DEFAULT NULL,
  `id_workplace_address` int DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone_1` varchar(45) DEFAULT NULL,
  `phone_2` varchar(45) DEFAULT NULL,
  `id_account` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_current_address_ci_fk_idx` (`id_current_address`),
  KEY `id_permanent_address_ci_fk_idx` (`id_permanent_address`),
  KEY `id_contact_address_ci_fk_idx` (`id_contact_address`),
  KEY `id_workplace_address_ci_fk_idx` (`id_workplace_address`),
  KEY `id_customer_acc_idx` (`id_account`),
  CONSTRAINT `id_contact_address_ci_fk` FOREIGN KEY (`id_contact_address`) REFERENCES `contact_address` (`id`),
  CONSTRAINT `id_current_address_ci_fk` FOREIGN KEY (`id_current_address`) REFERENCES `current_address` (`id`),
  CONSTRAINT `id_customer_acc` FOREIGN KEY (`id_account`) REFERENCES `customer_acc` (`id`),
  CONSTRAINT `id_permanent_address_ci_fk` FOREIGN KEY (`id_permanent_address`) REFERENCES `permanent_address` (`id`),
  CONSTRAINT `id_workplace_address_ci_fk` FOREIGN KEY (`id_workplace_address`) REFERENCES `workplace_address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info`
--

LOCK TABLES `customer_info` WRITE;
/*!40000 ALTER TABLE `customer_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_own_illustration`
--

DROP TABLE IF EXISTS `customer_own_illustration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_own_illustration` (
  `id` int NOT NULL,
  `id_customer` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_customer_coi_fk_idx` (`id_customer`),
  KEY `id_customer_custoi_fk_idx` (`id_customer`),
  CONSTRAINT `id_customer_custoi_fk` FOREIGN KEY (`id_customer`) REFERENCES `customer_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_own_illustration`
--

LOCK TABLES `customer_own_illustration` WRITE;
/*!40000 ALTER TABLE `customer_own_illustration` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_own_illustration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` int NOT NULL,
  `id_leader` int DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `in_dept` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_leader_d_fk_idx` (`id_leader`),
  CONSTRAINT `id_leader_d_fk` FOREIGN KEY (`id_leader`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_commission`
--

DROP TABLE IF EXISTS `detail_commission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_commission` (
  `id` int NOT NULL,
  `id_detail_payment_period` int DEFAULT NULL,
  `id_detail_price_insurance` int DEFAULT NULL,
  `commission` float DEFAULT NULL,
  KEY `id_dpp_dc_fk_idx` (`id_detail_payment_period`),
  KEY `id_dcv_dc_fk_idx` (`id_detail_price_insurance`),
  CONSTRAINT `id_dcv_dc_fk` FOREIGN KEY (`id_detail_price_insurance`) REFERENCES `detail_contract_value` (`id`),
  CONSTRAINT `id_dpp_dc_fk` FOREIGN KEY (`id_detail_payment_period`) REFERENCES `detail_payment_period` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_commission`
--

LOCK TABLES `detail_commission` WRITE;
/*!40000 ALTER TABLE `detail_commission` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_commission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_contract_interest`
--

DROP TABLE IF EXISTS `detail_contract_interest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_contract_interest` (
  `id` int NOT NULL,
  `id_sub_interest_contract` int DEFAULT NULL,
  `id_contract` int DEFAULT NULL,
  `remain_amount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_contract_dci_fk_idx` (`id_contract`),
  KEY `id_sub_interest_fk_idx` (`id_sub_interest_contract`),
  CONSTRAINT `id_contract_dci_fk` FOREIGN KEY (`id_contract`) REFERENCES `contract` (`id`),
  CONSTRAINT `id_sub_interest_fk` FOREIGN KEY (`id_sub_interest_contract`) REFERENCES `sub_interest_contract` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_contract_interest`
--

LOCK TABLES `detail_contract_interest` WRITE;
/*!40000 ALTER TABLE `detail_contract_interest` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_contract_interest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_contract_value`
--

DROP TABLE IF EXISTS `detail_contract_value`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_contract_value` (
  `id` int NOT NULL,
  `min_val` varchar(45) DEFAULT NULL,
  `max_val` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_contract_value`
--

LOCK TABLES `detail_contract_value` WRITE;
/*!40000 ALTER TABLE `detail_contract_value` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_contract_value` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_illustration`
--

DROP TABLE IF EXISTS `detail_illustration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_illustration` (
  `id` int NOT NULL,
  `id_illustration` int DEFAULT NULL,
  `id_detail_main_interest` int DEFAULT NULL,
  `id_detail_sub_interest` int DEFAULT NULL,
  `id_beneficiary` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_illustration_di_fk_idx` (`id_illustration`),
  KEY `id_detail_main_interest_val_di_fk_idx` (`id_detail_main_interest`),
  KEY `id_detail_sub_interest_di_fk_idx` (`id_detail_sub_interest`),
  KEY `id_beneficiary_di_fk_idx` (`id_beneficiary`),
  CONSTRAINT `id_beneficiary_di_fk` FOREIGN KEY (`id_beneficiary`) REFERENCES `related_person` (`id`),
  CONSTRAINT `id_detail_main_interest_val_di_fk` FOREIGN KEY (`id_detail_main_interest`) REFERENCES `detail_main_interest_val` (`id`),
  CONSTRAINT `id_detail_sub_interest_di_fk` FOREIGN KEY (`id_detail_sub_interest`) REFERENCES `detail_sub_interest_val` (`id`),
  CONSTRAINT `id_illustration_di_fk` FOREIGN KEY (`id_illustration`) REFERENCES `illustration` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_illustration`
--

LOCK TABLES `detail_illustration` WRITE;
/*!40000 ALTER TABLE `detail_illustration` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_illustration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_main_interest_val`
--

DROP TABLE IF EXISTS `detail_main_interest_val`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_main_interest_val` (
  `id` int NOT NULL,
  `level` varchar(45) DEFAULT NULL,
  `period` varchar(45) DEFAULT NULL,
  `payment_amount` varchar(45) DEFAULT NULL,
  `fee` varchar(45) DEFAULT NULL,
  `id_main_interest` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_main_interest_val`
--

LOCK TABLES `detail_main_interest_val` WRITE;
/*!40000 ALTER TABLE `detail_main_interest_val` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_main_interest_val` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_payment_period`
--

DROP TABLE IF EXISTS `detail_payment_period`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_payment_period` (
  `id` int NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_payment_period`
--

LOCK TABLES `detail_payment_period` WRITE;
/*!40000 ALTER TABLE `detail_payment_period` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_payment_period` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_sub_interest_val`
--

DROP TABLE IF EXISTS `detail_sub_interest_val`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_sub_interest_val` (
  `id` int NOT NULL,
  `id_sub_interest` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_sub_interest_val`
--

LOCK TABLES `detail_sub_interest_val` WRITE;
/*!40000 ALTER TABLE `detail_sub_interest_val` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_sub_interest_val` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document`
--

DROP TABLE IF EXISTS `document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `link_doc` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;
/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_acc`
--

DROP TABLE IF EXISTS `employee_acc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_acc` (
  `id` int NOT NULL,
  `code` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `status` tinyint DEFAULT NULL,
  `id_role` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_role_ea_fk_idx` (`id_role`),
  CONSTRAINT `id_role_ea_fk` FOREIGN KEY (`id_role`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_acc`
--

LOCK TABLES `employee_acc` WRITE;
/*!40000 ALTER TABLE `employee_acc` DISABLE KEYS */;
INSERT INTO `employee_acc` VALUES (1,'admin','password',0,1),(2,'ahihi','kjabsck',1,NULL),(1234,'hieu','daohieu571999',1,NULL);
/*!40000 ALTER TABLE `employee_acc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_info`
--

DROP TABLE IF EXISTS `employee_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_info` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `date_of_birth` datetime DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `ID_card` varchar(45) DEFAULT NULL,
  `id_certificate` int DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `sex` tinyint DEFAULT NULL,
  `dept_id` int DEFAULT NULL,
  `id_acc` int DEFAULT NULL,
  `id_labour_contract` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_acc_ei_fk_idx` (`id_acc`),
  KEY `id_dept_ei_fk_idx` (`dept_id`),
  KEY `id_certi_ei_fk_idx` (`id_certificate`),
  CONSTRAINT `id_acc_ei_fk` FOREIGN KEY (`id_acc`) REFERENCES `employee_acc` (`id`),
  CONSTRAINT `id_certi_ei_fk` FOREIGN KEY (`id_certificate`) REFERENCES `certificate` (`id`),
  CONSTRAINT `id_dept_ei_fk` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_info`
--

LOCK TABLES `employee_info` WRITE;
/*!40000 ALTER TABLE `employee_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fee_payment_history`
--

DROP TABLE IF EXISTS `fee_payment_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fee_payment_history` (
  `id` int NOT NULL,
  `id_contract` int DEFAULT NULL,
  `id_invoice` int DEFAULT NULL,
  `payment_amount` varchar(45) DEFAULT NULL,
  `payment_method` varchar(45) DEFAULT NULL,
  `id_collecter` int DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_contract_rh_fk_idx` (`id_contract`),
  KEY `id_collecter_rh_fk_idx` (`id_collecter`),
  CONSTRAINT `id_collecter_rh_fk` FOREIGN KEY (`id_collecter`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_contract_rh_fk` FOREIGN KEY (`id_contract`) REFERENCES `contract` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee_payment_history`
--

LOCK TABLES `fee_payment_history` WRITE;
/*!40000 ALTER TABLE `fee_payment_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `fee_payment_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history_consultation`
--

DROP TABLE IF EXISTS `history_consultation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `history_consultation` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `name_customer` varchar(45) DEFAULT NULL,
  `start_time` varchar(45) DEFAULT NULL,
  `end_time` varchar(45) DEFAULT NULL,
  `phone_customer` varchar(45) DEFAULT NULL,
  `id_main_interest` int DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_employee_hc_fk_idx` (`id_employee`),
  KEY `id_main_interest_hc_fk_idx` (`id_main_interest`),
  CONSTRAINT `id_employee_hc_fk` FOREIGN KEY (`id_employee`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_main_interest_hc_fk` FOREIGN KEY (`id_main_interest`) REFERENCES `main_interest_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history_consultation`
--

LOCK TABLES `history_consultation` WRITE;
/*!40000 ALTER TABLE `history_consultation` DISABLE KEYS */;
/*!40000 ALTER TABLE `history_consultation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `illustration`
--

DROP TABLE IF EXISTS `illustration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `illustration` (
  `id` int NOT NULL,
  `id_customer` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_customer_i_fk_idx` (`id_customer`),
  CONSTRAINT `id_customer_i_fk` FOREIGN KEY (`id_customer`) REFERENCES `customer_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `illustration`
--

LOCK TABLES `illustration` WRITE;
/*!40000 ALTER TABLE `illustration` DISABLE KEYS */;
/*!40000 ALTER TABLE `illustration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `income` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `time_receive_cash` varchar(45) DEFAULT NULL,
  `id_revenue` varchar(45) DEFAULT NULL,
  `income_val` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_employee_i_fk_idx` (`id_employee`),
  CONSTRAINT `id_employee_i_fk` FOREIGN KEY (`id_employee`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `income`
--

LOCK TABLES `income` WRITE;
/*!40000 ALTER TABLE `income` DISABLE KEYS */;
/*!40000 ALTER TABLE `income` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interset_payment_history`
--

DROP TABLE IF EXISTS `interset_payment_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `interset_payment_history` (
  `id` int NOT NULL,
  `id_contract` int DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `payment_amount` varchar(45) DEFAULT NULL,
  `id_main_interest` int DEFAULT NULL,
  `id_bill_issuer` int DEFAULT NULL,
  `id_attachment` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_contract` (`id_contract`) /*!80000 INVISIBLE */,
  KEY `id_main_interest` (`id_main_interest`),
  KEY `id_employee` (`id_bill_issuer`),
  KEY `id_attachment_iph_fk_idx` (`id_attachment`),
  CONSTRAINT `id_attachment_iph_fk` FOREIGN KEY (`id_attachment`) REFERENCES `attachment` (`id`),
  CONSTRAINT `id_contract_fk` FOREIGN KEY (`id_contract`) REFERENCES `contract` (`id`),
  CONSTRAINT `id_employee_fk` FOREIGN KEY (`id_bill_issuer`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_main_interest_fk` FOREIGN KEY (`id_main_interest`) REFERENCES `main_interest_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interset_payment_history`
--

LOCK TABLES `interset_payment_history` WRITE;
/*!40000 ALTER TABLE `interset_payment_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `interset_payment_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `labour_contract`
--

DROP TABLE IF EXISTS `labour_contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `labour_contract` (
  `id` int NOT NULL,
  `url_labour_contract` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `id_lc_fk` FOREIGN KEY (`id`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `labour_contract`
--

LOCK TABLES `labour_contract` WRITE;
/*!40000 ALTER TABLE `labour_contract` DISABLE KEYS */;
/*!40000 ALTER TABLE `labour_contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mail`
--

DROP TABLE IF EXISTS `mail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mail` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `sender_id` int DEFAULT NULL,
  `receiver_id` int DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `priority` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_reciver_fk_idx` (`sender_id`,`receiver_id`),
  KEY `id_reciever_fk_idx` (`receiver_id`),
  CONSTRAINT `id_reciever_fk` FOREIGN KEY (`receiver_id`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_sender_fk` FOREIGN KEY (`sender_id`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mail`
--

LOCK TABLES `mail` WRITE;
/*!40000 ALTER TABLE `mail` DISABLE KEYS */;
/*!40000 ALTER TABLE `mail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `main_interest_info`
--

DROP TABLE IF EXISTS `main_interest_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `main_interest_info` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `id_sub_fk` FOREIGN KEY (`id`) REFERENCES `sub_interest_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main_interest_info`
--

LOCK TABLES `main_interest_info` WRITE;
/*!40000 ALTER TABLE `main_interest_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `main_interest_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notification` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permanent_address`
--

DROP TABLE IF EXISTS `permanent_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permanent_address` (
  `id` int NOT NULL,
  `no_street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `wards` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permanent_address`
--

LOCK TABLES `permanent_address` WRITE;
/*!40000 ALTER TABLE `permanent_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `permanent_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `related_person`
--

DROP TABLE IF EXISTS `related_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `related_person` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `ID_card` varchar(45) DEFAULT NULL,
  `career_group` varchar(45) DEFAULT NULL,
  `related_personcol` varchar(45) DEFAULT NULL,
  `job` varchar(45) DEFAULT NULL,
  `id_illustration` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_illustration_fk_idx` (`id_illustration`),
  CONSTRAINT `id_illustration_fk` FOREIGN KEY (`id_illustration`) REFERENCES `illustration` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `related_person`
--

LOCK TABLES `related_person` WRITE;
/*!40000 ALTER TABLE `related_person` DISABLE KEYS */;
/*!40000 ALTER TABLE `related_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `request` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `id_type` int DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `requestcol` varchar(45) DEFAULT NULL,
  `id_sender` int DEFAULT NULL,
  `id_reciever` int DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `priority` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_sender_r_fk_idx` (`id_sender`),
  KEY `id_reciever_r_fk_idx` (`id_reciever`),
  KEY `id_type_tr_fk_idx` (`id_type`),
  CONSTRAINT `id_reciever_r_fk` FOREIGN KEY (`id_reciever`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_sender_r_fk` FOREIGN KEY (`id_sender`) REFERENCES `employee_info` (`id`),
  CONSTRAINT `id_type_tr_fk` FOREIGN KEY (`id_type`) REFERENCES `type_request` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `revenue`
--

DROP TABLE IF EXISTS `revenue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `revenue` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `id_contract` int DEFAULT NULL,
  `total_fee_val_contract` varchar(45) DEFAULT NULL,
  `revenue_val` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_employee_r_fk_idx` (`id_employee`),
  KEY `id_contract_r_fk_idx` (`id_contract`),
  CONSTRAINT `id_contract_r_fk` FOREIGN KEY (`id_contract`) REFERENCES `contract` (`id`),
  CONSTRAINT `id_employee_r_fk` FOREIGN KEY (`id_employee`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revenue`
--

LOCK TABLES `revenue` WRITE;
/*!40000 ALTER TABLE `revenue` DISABLE KEYS */;
/*!40000 ALTER TABLE `revenue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'saler'),(3,'appraiser'),(4,'contracmanager');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_interest_contract`
--

DROP TABLE IF EXISTS `sub_interest_contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_interest_contract` (
  `id` int NOT NULL,
  `id_sub_interest` int DEFAULT NULL,
  `id_contract` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_sub_interest_fk_idx` (`id_sub_interest`),
  CONSTRAINT `id_sub_in_fk` FOREIGN KEY (`id_sub_interest`) REFERENCES `sub_interest_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_interest_contract`
--

LOCK TABLES `sub_interest_contract` WRITE;
/*!40000 ALTER TABLE `sub_interest_contract` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_interest_contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_interest_info`
--

DROP TABLE IF EXISTS `sub_interest_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_interest_info` (
  `id` int NOT NULL,
  `name` int DEFAULT NULL,
  `description` int DEFAULT NULL,
  `id_main_interest` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_interest_info`
--

LOCK TABLES `sub_interest_info` WRITE;
/*!40000 ALTER TABLE `sub_interest_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_interest_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_request`
--

DROP TABLE IF EXISTS `type_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `type_request` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_request`
--

LOCK TABLES `type_request` WRITE;
/*!40000 ALTER TABLE `type_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `week_consultation`
--

DROP TABLE IF EXISTS `week_consultation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `week_consultation` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `total_consul_week` varchar(45) DEFAULT NULL,
  `group` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_employee_wc_fk_idx` (`id_employee`),
  CONSTRAINT `id_employee_wc_fk` FOREIGN KEY (`id_employee`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `week_consultation`
--

LOCK TABLES `week_consultation` WRITE;
/*!40000 ALTER TABLE `week_consultation` DISABLE KEYS */;
/*!40000 ALTER TABLE `week_consultation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workplace_address`
--

DROP TABLE IF EXISTS `workplace_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workplace_address` (
  `id` int NOT NULL,
  `no_street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `wards` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workplace_address`
--

LOCK TABLES `workplace_address` WRITE;
/*!40000 ALTER TABLE `workplace_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `workplace_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `year_consultation`
--

DROP TABLE IF EXISTS `year_consultation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `year_consultation` (
  `id` int NOT NULL,
  `id_employee` int DEFAULT NULL,
  `total_consul_year` varchar(45) DEFAULT NULL,
  `year_consulationcol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_employee_yc_fk_idx` (`id_employee`),
  CONSTRAINT `id_employee_yc_fk` FOREIGN KEY (`id_employee`) REFERENCES `employee_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `year_consultation`
--

LOCK TABLES `year_consultation` WRITE;
/*!40000 ALTER TABLE `year_consultation` DISABLE KEYS */;
/*!40000 ALTER TABLE `year_consultation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'is_agency_db'
--

--
-- Dumping routines for database 'is_agency_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-20  1:45:10
