/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.38 : Database - music
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`music` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `music`;

/*Table structure for table `image` */

DROP TABLE IF EXISTS `image`;

CREATE TABLE `image` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(500) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8;

/*Data for the table `image` */

insert  into `image`(`id`,`url`,`title`,`type`,`state`) values (1,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4512500.png?max_age=2592000','banner','banner','1'),(2,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4513027.jpg?max_age=2592000','banner','banner','1'),(3,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4513051.jpg?max_age=2592000','banner','banner','1'),(4,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4514884.jpg?max_age=2592000','banner','banner','1'),(5,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4515086.jpg?max_age=2592000','banner','banner','1'),(6,'https://y.qq.com/music/common/upload/MUSIC_FOCUS/4513980.jpg?max_age=2592000','banner','banner','1'),(10,'http://p1.music.126.net/TdqG8yFWSZgQqH2K235MgA==/109951163434990771.jpg?param=130y130','song','song','1'),(11,'http://p2.music.126.net/KqISQAZmCavlZM-jzym6Ow==/109951167013698133.jpg?param=130y130','song','song','1'),(12,'http://p1.music.126.net/VvMVPFgdOaymGiCaFhkoeQ==/109951167013685779.jpg?param=130y130\r\n','song','song','1'),(13,'http://p2.music.126.net/x3EwBol8H0rVRAcq67IogA==/17824182998040041.jpg?param=130y130\r\n','song','song','1'),(14,'http://p2.music.126.net/koFCmZ3NJF5PhZHc84IiZQ==/109951167038497337.jpg?param=130y130\r\n','song','song','1'),(15,'http://p1.music.126.net/hx-ysOfUd3ByS1bstRv0wg==/109951166960938219.jpg?param=130y130\r\n','song','song','1'),(62,'recommend.png','recommend','nav','1'),(63,'newsong.png','newsong','nav','1'),(64,'newdisk.png','newdisk','nav','1'),(65,'rank.png','rank','nav','1'),(66,'play.png','preplay','play','1'),(67,'search.png','search','search','1'),(68,'hot1.png','recommend','recommend','1'),(69,'hot2.png','recommend','recommend','1'),(70,'hot3.png','recommend','recommend','1'),(71,'hot4.png','recommend','recommend','1'),(72,'hot5.png','recommend','recommend','1'),(73,'hot6.png','recommend','recommend','1'),(74,'more.png','more','more','1'),(75,'new1.jpg','newsong','newsong','1'),(76,'new2.jpg','newsong','newsong','1'),(77,'new3.jpg','newsong','newsong','1'),(78,'new4.jpg','newsong','newsong','1'),(79,'new5.jpg','newsong','newsong','1'),(80,'new6.jpg','newsong','newsong','1'),(81,'1.webp','banner','diskbanner','1'),(82,'2.webp','banner','diskbanner','1'),(83,'3.webp','banner','diskbanner','1'),(84,'4.webp','banner','diskbanner','1'),(85,'5.webp','banner','diskbanner','1'),(86,'6.webp','banner','diskbanner','1'),(87,'https://y.qq.com/music/photo_new/T002R300x300M000000MYG8k02dEKy.jpg?max_age=2592000','disk','disk','1'),(88,'https://y.qq.com/music/photo_new/T002R300x300M000003op2ji0BboZA.jpg?max_age=2592000','disk','disk','1'),(89,'https://y.qq.com/music/photo_new/T002R300x300M000002ra4kf248BJo.jpg?max_age=2592000','disk','disk','1'),(90,'https://y.qq.com/music/photo_new/T002R300x300M000003UQFtb1h3Htd.jpg?max_age=2592000','disk','disk','1'),(91,'https://y.qq.com/music/photo_new/T002R300x300M000004EJDSk1iydvL.jpg?max_age=2592000','disk','disk','1'),(92,'https://y.qq.com/music/photo_new/T002R300x300M000004JEGBt2NQ6l5.jpg?max_age=2592000','disk','disk','1'),(101,'http://p2.music.126.net/j0FGZA-gQWE5XYcZBPFOJA==/109951166738055029.jpg?param=130y130','song','song','1'),(102,'http://p2.music.126.net/gTOKLOnzfhp70lEwSXvScg==/109951163381510102.jpg?param=130y130','song','song','1'),(103,'http://p1.music.126.net/MrRlw3a1NXX1RmucHGSr_Q==/109951168231744462.jpg?param=130y130','song','song','1'),(104,'http://p1.music.126.net/ap7-LShvjYmzPJ6xR3XG5Q==/3231464674386227.jpg?param=130y130\r\n','song','song','1'),(105,'http://p1.music.126.net/7VUInJXlYWrHoBSAxMA-cg==/109951166076438853.jpg?param=130y130\r\n','song','song','1'),(106,'http://p1.music.126.net/cuHEhr8EsnW0S0dC3JVMPg==/109951166468694910.jpg?param=130y130\r\n','song','song','1'),(107,'http://p1.music.126.net/2h8YbPKnkIKSTgJgM5WTzQ==/109951168154382170.jpg?param=130y130\r\n','song','song','1'),(108,'http://p2.music.126.net/PMmiexqBKwBB8LTEwluARA==/109951163924175725.jpg?param=130y130\r\n','song','song','1'),(109,'http://p1.music.126.net/7OeHQz2Nh9qxVkquUpdu0Q==/7768049651381644.jpg?param=130y130\r\n','song','song','1'),(110,'http://p1.music.126.net/u_1EudmF8Swgow6vfgYe1g==/8896148580676276.jpg?param=130y130\r\n','song','song','1'),(111,'http://p2.music.126.net/1Cg_SfvPnVLJm5_6JDdbzg==/18633423557738147.jpg?param=130y130\r\n','song','song','1'),(112,'http://p2.music.126.net/BTR1oTVQ4vyYbauftQzZIg==/109951167176760587.jpg?param=130y130\r\n','song','song','1'),(113,'http://p2.music.126.net/AYNBdRxJ8EdZo4xFjp7b4Q==/109951163191178425.jpg?param=130y130\r\n','song','song','1'),(114,'http://p1.music.126.net/lnOnBbP_H-052Hv5ls-QjA==/109951162964628408.jpg?param=130y130\r\n','song','song','1'),(115,'http://p1.music.126.net/CBx2K_jEN3SNWwYztagPPw==/109951164485969446.jpg?param=130y130\r\n','song','song','1'),(116,'http://p2.music.126.net/SRSzJNkVegFlCJVc49VvxQ==/109951163069324876.jpg?param=130y130\r\n','song','song','1'),(117,'http://p2.music.126.net/xrWSChs7pIOWFjOz5eQIzw==/109951164855840145.jpg?param=130y130\r\n','song','song','1'),(118,'http://p2.music.126.net/d9d0ys74aC9tCfHtp6jcuA==/109951163975730949.jpg?param=130y130\r\n','song','song','1'),(119,'http://p2.music.126.net/s3mKaXDECHZlxi43d7bkCA==/109951164905500417.jpg?param=130y130\r\n','song','song','1'),(120,'http://p2.music.126.net/8gAbFDUrd0Q8V8bDXT_RfQ==/109951168291209486.jpg?param=130y130\r\n','song','song','1'),(121,'http://p1.music.126.net/kxdJ8uEcA3adr7yOyzr-wQ==/109951168761319599.jpg?param=130y130\r\n','song','song','1'),(122,'http://p1.music.126.net/q5FOrbhzTJ9nbAEIVnnnSA==/109951168761454544.jpg?param=130y130\r\n','song','song','1'),(123,'http://p2.music.126.net/H-sMtOLz4vaUkxdFlXgbag==/109951168761540721.jpg?param=130y130\r\n','song','song','1'),(124,'http://p2.music.126.net/oHr3eRcWEPIs6fIbO_jwww==/109951168759205693.jpg?param=130y130\r\n','song','song','1'),(125,'http://p2.music.126.net/tdhkT5boROedEqVwv6prgA==/109951166371425760.jpg?param=130y130\r\n','song','song','1'),(126,'http://p1.music.126.net/69MfQfl-rA0IwEuRSCEyNw==/109951168307420773.jpg?param=130y130\r\n','song','song','1'),(127,'http://p2.music.126.net/M877M2-VhWZiLPVFORf9iQ==/109951163401482434.jpg?param=130y130\r\n','song','song','1'),(128,'http://p2.music.126.net/FCWD6ibS2JK2B3QAnXuzwQ==/109951167805892385.jpg?param=130y130\r\n','song','song','1'),(129,'http://p2.music.126.net/cGTKkFl5qcXIDYPo7PrmDA==/109951168431655039.jpg?param=130y130\r\n','song','song','1'),(130,'http://p2.music.126.net/yN1ke1xYMJ718FiHaDWtYQ==/109951165076380471.jpg?param=130y130\r\n','song','song','1'),(131,'http://p1.music.126.net/VjXYNoGC3lXajZDs0r35XQ==/109951167852652412.jpg?param=130y130\r\n','song','song','1'),(132,'http://p1.music.126.net/XpZcJVwGwna3blFNyp4Xlg==/109951168721257922.jpg?param=130y130\r\n','song','song','1'),(133,'http://p2.music.126.net/QzqdDWX7IFWGqTUaQTJOEw==/109951168722216453.jpg?param=130y130\r\n','song','song','1'),(134,'http://p1.music.126.net/x8yRPTFQl6sXcQLeI6zecQ==/109951168706099545.jpg?param=130y130\r\n','song','song','1'),(135,'http://p2.music.126.net/3z_w3vfEbTAap3AXVVmPHQ==/109951168636982036.jpg?param=130y130\r\n','song','song','1'),(136,'http://p1.music.126.net/TmOHxaGnFNlwNX8aPz66oA==/109951168638913915.jpg?param=130y130\r\n','song','song','1'),(137,'http://p2.music.126.net/gfLR-3TEncp1cOog8oUaFA==/109951168567036973.jpg?param=130y130\r\n','song','song','1'),(138,'http://p2.music.126.net/8ZpCzo4gEeCAQyXAGYXKUQ==/109951167854450663.jpg?param=130y130\r\n','song','song','1'),(139,'http://p2.music.126.net/hsIpIgKpGlUlaHPF-qIKcQ==/109951168735465189.jpg?param=130y130\r\n','song','song','1'),(140,'http://p2.music.126.net/XsTsiy7w_IAtqLIc6kMRAg==/109951168690739808.jpg?param=130y130\r\n','song','song','1'),(141,'rank1.jpg','rank','rank','1'),(142,'rank2.jpg','rank','rank','1'),(143,'rank3.jpg','rank','rank','1'),(144,'rank4.jpg','rank','rank','1'),(145,'rank5.jpg','rank','rank','1'),(146,'rank6.jpg','rank','rank','1'),(147,'rankimg1.webp','rank','rankimg','1'),(148,'rankimg2.webp','rank','rankimg','1'),(149,'rankimg3.webp','rank','rankimg','1'),(150,'rankimg4.webp','rank','rankimg','1'),(151,'rankimg5.webp','rank','rankimg','1'),(152,'last.png','playmusic','playmusic','1'),(153,'next.png','playmusic','playmusic','1'),(154,'play_m.png','playmusic','playmusic','1'),(155,'pause.png','playmusic','playmusic','1'),(156,'co_disk.jpg','coimg','coimg','1');

/*Table structure for table `newdisk` */

DROP TABLE IF EXISTS `newdisk`;

CREATE TABLE `newdisk` (
  `diskid` bigint(100) NOT NULL AUTO_INCREMENT,
  `diskname` varchar(200) DEFAULT NULL,
  `diskimgid` varchar(100) DEFAULT NULL,
  `diskprice` varchar(100) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`diskid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `newdisk` */

insert  into `newdisk`(`diskid`,`diskname`,`diskimgid`,`diskprice`,`state`) values (1,'Indigo','87','¥28','1'),(2,'On and On','88','¥16','1'),(3,'MidNights','89','¥35','1'),(4,'西','90','¥15','1'),(5,'和自己对话','91','¥18','1'),(6,'正在消失','92','¥18','1');

/*Table structure for table `newsong` */

DROP TABLE IF EXISTS `newsong`;

CREATE TABLE `newsong` (
  `typeid` bigint(100) NOT NULL AUTO_INCREMENT,
  `typename` varchar(200) DEFAULT NULL,
  `typeimgid` varchar(100) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `newsong` */

insert  into `newsong`(`typeid`,`typename`,`typeimgid`,`state`) values (1,NULL,'75','1'),(2,NULL,'76','1'),(3,NULL,'77','1'),(4,NULL,'78','1'),(5,NULL,'79','1'),(6,NULL,'80','1');

/*Table structure for table `rank` */

DROP TABLE IF EXISTS `rank`;

CREATE TABLE `rank` (
  `rankid` bigint(100) NOT NULL AUTO_INCREMENT,
  `rankname` varchar(200) DEFAULT NULL,
  `rankimgid` varchar(100) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  `rankcontid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rankid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `rank` */

insert  into `rank`(`rankid`,`rankname`,`rankimgid`,`state`,`rankcontid`) values (1,NULL,'141','1',''),(2,NULL,'142','1',NULL),(3,NULL,'143','1',NULL),(4,NULL,'144','1',NULL),(5,NULL,'145','1',NULL),(6,NULL,'146','1',NULL),(7,'新歌榜','147','1','1'),(8,'热歌榜','148','1','2'),(9,'飙升榜','149','1','3'),(10,'流行指数榜','150','1','4'),(11,'说唱榜','151','1','5');

/*Table structure for table `rank_content` */

DROP TABLE IF EXISTS `rank_content`;

CREATE TABLE `rank_content` (
  `rankid` bigint(100) NOT NULL AUTO_INCREMENT,
  `content1` varchar(200) DEFAULT NULL,
  `content2` varchar(200) DEFAULT NULL,
  `content3` varchar(200) DEFAULT NULL,
  `rankcontid` varchar(20) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`rankid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `rank_content` */

insert  into `rank_content`(`rankid`,`content1`,`content2`,`content3`,`rankcontid`,`state`) values (1,'We Are Never Ever Getting Back Together','Welcome To New York','Wildest Dreams (Taylor\'s Version)','1','1'),(2,'喜欢你','在你的身边','把回忆拼好给你','2','1'),(3,'Where Did U Go','Empty Love','Slow Down','3','1'),(4,'So Far Away (Acoustic)','云朵上的风筝','姑娘在远方','4','1'),(7,'爱的回归线 (Live版)','我想念 (Live版)','是你 (Live版)','5','1');

/*Table structure for table `song` */

DROP TABLE IF EXISTS `song`;

CREATE TABLE `song` (
  `songid` int(200) NOT NULL AUTO_INCREMENT,
  `songurl` varchar(500) DEFAULT NULL,
  `singer` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `imageid` bigint(100) DEFAULT NULL,
  `songlisttype` bigint(20) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`songid`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8;

/*Data for the table `song` */

insert  into `song`(`songid`,`songurl`,`singer`,`name`,`imageid`,`songlisttype`,`state`) values (1,'https://m704.music.126.net/20230804152836/61d02626342d8acb1d01bcb31f329044/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/28481682237/fc65/864f/5e08/3d2add18557f1f36224b4393aa93f8a2.m4a?authSecret=00000189bf5be0c006730aa46836fb65','李常超 (Lao乾妈)','盗墓笔记·十年人间',10,0,'1'),(2,'https://m804.music.126.net/20230804145231/d010ee76b91ed8411e68f92102aa9b44/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/19448422720/83fd/5a59/01d0/8673b73690f8ab4011645c9b30ed0a1f.m4a?authSecret=00000189bf3ad6f810e90aa468452360','Taylor Swift','Love Story',11,0,'1'),(3,NULL,'Taylor Swift','We Are Never Ever Getting Back Together',12,0,'1'),(4,NULL,'Lapsley','Hurt Me',13,0,'1'),(5,NULL,'Colbie Caillat','Try',14,0,'1'),(6,NULL,'Maroon 5','Sugar',15,0,'1'),(101,NULL,'Taylor Swift','You Belong With Me',101,1,'1'),(102,NULL,'Taylor Swift','Welcome To New York',102,1,'1'),(103,NULL,'Taylor Swift','Lover',103,1,'1'),(104,NULL,'Taylor Swift','Blank Space\r\n',104,1,'1'),(105,NULL,'Taylor Swift','Shake It Off\r\n',105,1,'1'),(106,NULL,'Taylor Swift','Wildest Dreams (Taylor\'s Version)\r\n',106,1,'1'),(107,NULL,'Taylor Swift','Safe & Sound (from The Hunger Games Soundtrack)\r\n',107,1,'1'),(108,NULL,'Taylor Swift','Sparks Fly\r\n',108,2,'1'),(109,NULL,'Lost Frequencies\r\n','Are You With Me\r\n',109,2,'1'),(110,NULL,'G.E.M.邓紫棋\r\n','喜欢你',110,2,'1'),(111,NULL,'Taylor Swift\r\n','Closer\r\n',111,2,'1'),(112,NULL,'Taylor Swift\r\n','Love Me Like You Do\r\n',112,2,'1'),(113,NULL,'盛哲\r\n','在你的身边',113,2,'1'),(114,NULL,'队长\r\n','哪里都是你\r\n',114,2,'1'),(115,NULL,'王贰浪\r\n','把回忆拼好给你\r\n',115,3,'1'),(116,NULL,'G.E.M.邓紫棋\r\n','Where Did U Go\r\n',116,3,'1'),(117,NULL,'Lulleaux / Kid Princess\r\n','Empty Love\r\n',117,3,'1'),(118,NULL,'Madnap / Pauline Herr\r\n','Slow Down\r\n',118,3,'1'),(119,NULL,'TYSM\r\n','Normal No More\r\n',119,3,'1'),(120,NULL,'Adam Christopher\r\n','So Far Away (Acoustic)\r\n',120,3,'1'),(121,NULL,'卢卢快闭嘴 / 刘思达LOFTHESTAR\r\n','猜不透（说唱版）\r\n',121,3,'1'),(122,NULL,'Mikey-18 / Lil Puff / 哨孟定\r\n','不再等你\r\n',122,4,'1'),(123,NULL,'AFMC黑子 / 果妹\r\n','云朵上的风筝\r\n',123,4,'1'),(124,NULL,'MISTERK\r\n','猜疑\r\n',124,4,'1'),(125,NULL,'凤凰传奇\r\n','奢香夫人 (Live)\r\n',125,4,'1'),(126,NULL,'柯柯柯啊\r\n','姑娘在远方\r\n',126,4,'1'),(127,NULL,'Kirsty刘瑾睿\r\n','若把你\r\n',127,4,'1'),(128,NULL,'赵雷\r\n','我记得\r\n',128,4,'1'),(129,NULL,'Capper / 罗言\r\n','雪 Distance\r\n',129,5,'1'),(130,NULL,'梨冻紧 / Wiz_H张子豪\r\n','罗生门（Follow）\r\n',130,5,'1'),(131,NULL,'Starling8 / MoreLearn 27 / FIVESTAR\r\n','\"\n苦茶子\"\r\n',131,5,'1'),(132,NULL,'单依纯\r\n','爱的回归线 (Live版)\r\n',132,5,'1'),(133,NULL,'法老 / 邓典果DDG / KnowKnow\r\n','C级浪漫\r\n',133,5,'1'),(134,NULL,'汪苏泷 / 王赫野\r\n','我想念 (Live版)',134,5,'1'),(135,NULL,'王赫野 / 张靓颖\r\n','是你 (Live版)\r\n',135,5,'1'),(136,NULL,'小霞 / 海洋Bo\r\n','向云端\r\n',136,6,'1'),(137,NULL,'海洋Bo / 费米Frieme / Zy\r\n','\"\n风驶过的声音是\"',137,6,'1'),(138,NULL,'海洋Bo / 高睿','我的美丽feat.海洋Bo\r\n',138,6,'1'),(139,NULL,'刀郎\r\n','罗刹海市\r\n',139,6,'1'),(140,NULL,'张碧晨\r\n','笼\r\n',140,6,'1');

/*Table structure for table `songlist` */

DROP TABLE IF EXISTS `songlist`;

CREATE TABLE `songlist` (
  `listid` bigint(20) NOT NULL AUTO_INCREMENT,
  `listname` varchar(200) DEFAULT NULL,
  `listexplain` varchar(200) DEFAULT NULL,
  `listimgid` varchar(200) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`listid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `songlist` */

insert  into `songlist`(`listid`,`listname`,`listexplain`,`listimgid`,`state`) values (1,'热门歌单','一起遨游在流行乐的浪漫中','68','1'),(2,'流行歌单','【必备热歌】欢迎来到人气up站','69','1'),(3,'民谣歌单','华语民谣|和弦声起，化诗为歌','70','1'),(4,'网红歌单','【热】距离网红只差这一个歌单了','71','1'),(5,'老歌歌单','擎天精选，经典再现','72','1'),(6,'说唱歌单','华语说唱~综艺上那些脍炙人口的嘻哈','73','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
