CREATE DATABASE  IF NOT EXISTS `hei_tp06`;
USE `hei_tp06`;

DROP TABLE IF EXISTS `evenement`;

CREATE TABLE `evenement` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `start` datetime DEFAULT NULL,
  `end` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;


LOCK TABLES `evenement` WRITE;

INSERT INTO `evenement` VALUES 
(1 ,'2017-01-30 03:00:00','2017-01-30 04:00:00','Evenement 1', '#FF0000','Description Test 1'),
(2 ,'2017-02-01 04:00:00','2017-02-01 05:00:00','Evenement 2', '#00FF00','Description Test 2'),
(3 ,'2017-02-03 05:00:00','2017-02-03 06:00:00','Evenement 3', '#0000FF','Description Test 3'),
(4 ,'2017-02-05 06:00:00','2017-02-05 07:00:00','Evenement 4', '#FFFF00','Description Test 4'),
(5 ,'2017-02-07 07:00:00','2017-02-07 08:00:00','Evenement 5', '#FF00FF','Description Test 5'),
(6 ,'2017-02-09 08:00:00','2017-02-09 09:00:00','Evenement 6', '#00FFFF','Description Test 6'),
(7 ,'2017-02-11 09:00:00','2017-02-11 10:00:00','Evenement 7', '#CCCCCC','Description Test 7'),
(8 ,'2017-02-13 10:00:00','2017-02-13 11:00:00','Evenement 8', '#FF0000','Description Test 8'),
(9 ,'2017-02-15 11:00:00','2017-02-15 12:00:00','Evenement 9', '#00FF00','Description Test 9'),
(10,'2017-02-17 12:00:00','2017-02-17 13:00:00','Evenement 10','#0000FF','Description Test 10'),
(11,'2017-02-19 13:00:00','2017-02-19 14:00:00','Evenement 11','#FFFF00','Description Test 11'),
(12,'2017-02-21 14:00:00','2017-02-21 15:00:00','Evenement 12','#FF00FF','Description Test 12'),
(13,'2017-02-23 15:00:00','2017-02-23 16:00:00','Evenement 13','#00FFFF','Description Test 13'),
(14,'2017-02-25 16:00:00','2017-02-25 17:00:00','Evenement 14','#CCCCCC','Description Test 14'),
(15,'2017-02-27 17:00:00','2017-02-27 18:00:00','Evenement 15','#FF0000','Description Test 15'),
(16,'2017-03-01 18:00:00','2017-03-01 19:00:00','Evenement 16','#00FF00','Description Test 16'),
(17,'2017-03-03 19:00:00','2017-03-03 20:00:00','Evenement 17','#0000FF','Description Test 17'),
(18,'2017-03-05 20:00:00','2017-03-05 21:00:00','Evenement 18','#FFFF00','Description Test 18');


UNLOCK TABLES;

