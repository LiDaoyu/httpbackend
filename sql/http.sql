-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: http
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dict`
--

DROP TABLE IF EXISTS `dict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dict` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '字典id',
  `code` varchar(100) NOT NULL COMMENT '字典编码',
  `value` varchar(100) DEFAULT NULL COMMENT '字典值',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dict_pk` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='字典表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dict`
--

LOCK TABLES `dict` WRITE;
/*!40000 ALTER TABLE `dict` DISABLE KEYS */;
INSERT INTO `dict` VALUES (1,'user.education.1','研究生'),(2,'user.education.2','本科'),(3,'user.education.3','大专'),(4,'user.education.4','高中'),(5,'user.education.5','其他'),(6,'user.frequency.1','每周几次'),(7,'user.frequency.2','每月几次'),(8,'user.frequency.3','很少发言'),(9,'user.frequency.4','只看不说'),(10,'user.ipAttitude.1','非常支持'),(11,'user.ipAttitude.2','比较支持'),(12,'user.ipAttitude.3','无所谓'),(13,'user.ipAttitude.4','不太支持'),(14,'user.ipAttitude.5','非常反对'),(15,'user.ipArgument.1','是，多次'),(16,'user.ipArgument.2','是，偶尔'),(17,'user.ipArgument.3','否，从未有过'),(18,'user.ipArgument.4','不确定'),(19,'user.platform.1','微博'),(20,'user.platform.2','知乎'),(21,'user.platform.3','抖音'),(22,'user.platform.4','小红书'),(23,'user.platform.5','豆瓣'),(24,'user.platform.6','微信朋友圈'),(25,'user.platform.7','B站'),(26,'user.platform.8','其他'),(27,'user.onlineTime.1','1-3小时'),(28,'user.onlineTime.2','4-6小时'),(29,'user.onlineTime.3','7-9小时'),(30,'user.onlineTime.4','10小时以上'),(38,'user.topic.1','社会热点'),(39,'user.topic.2','文化娱乐'),(40,'user.topic.3','教育'),(41,'user.topic.4','时政'),(42,'user.topic.5','科技'),(43,'user.topic.6','生活方式'),(44,'user.topic.7','其他'),(45,'user.hometown.110000','北京市'),(46,'user.hometown.120000','天津市'),(47,'user.hometown.130000','河北省'),(48,'user.hometown.140000','山西省'),(49,'user.hometown.150000','内蒙古自治区'),(50,'user.hometown.210000','辽宁省'),(51,'user.hometown.220000','吉林省'),(52,'user.hometown.230000','黑龙江省'),(53,'user.hometown.310000','上海市'),(54,'user.hometown.320000','江苏省'),(55,'user.hometown.330000','浙江省'),(56,'user.hometown.340000','安徽省'),(57,'user.hometown.350000','福建省'),(58,'user.hometown.360000','江西省'),(59,'user.hometown.370000','山东省'),(60,'user.hometown.410000','河南省'),(61,'user.hometown.420000','湖北省'),(62,'user.hometown.430000','湖南省'),(63,'user.hometown.440000','广东省'),(64,'user.hometown.450000','广西壮族自治区'),(65,'user.hometown.460000','海南省'),(66,'user.hometown.500000','重庆市'),(67,'user.hometown.510000','四川省'),(68,'user.hometown.520000','贵州省'),(69,'user.hometown.530000','云南省'),(70,'user.hometown.540000','西藏自治区'),(71,'user.hometown.610000','陕西省'),(72,'user.hometown.620000','甘肃省'),(73,'user.hometown.630000','青海省'),(74,'user.hometown.640000','宁夏回族自治区'),(75,'user.hometown.650000','新疆维吾尔自治区'),(76,'user.hometown.710000','台湾省'),(77,'user.hometown.810000','香港特别行政区'),(78,'user.hometown.820000','澳门特别行政区');
/*!40000 ALTER TABLE `dict` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `age` int DEFAULT NULL COMMENT '年龄',
  `hometown` int DEFAULT NULL COMMENT '籍贯',
  `current_residence` int DEFAULT NULL COMMENT '现居',
  `education` int DEFAULT NULL COMMENT '教育背景',
  `frequency` int DEFAULT NULL COMMENT '网上发言频率',
  `ip_attitude` int DEFAULT NULL COMMENT '显示IP的态度',
  `ip_argument` int DEFAULT NULL COMMENT 'IP属地引发争议',
  `platform` varchar(100) DEFAULT NULL COMMENT '常用社交媒体平台',
  `online_time` int DEFAULT NULL COMMENT '每日上网时间',
  `topic` varchar(100) DEFAULT NULL COMMENT '关注话题领域',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'','',0,0,0,0,0,0,0,'0',0,'0'),(2,'','',0,1,450000,1,1,1,1,'[]',1,'[]'),(3,'123','13123',131,210000,500000,4,1,4,3,'[6, 4, 2]',2,'[3, 1, 5]');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-13 21:32:54
