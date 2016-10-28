/*
Navicat MySQL Data Transfer

Source Server         : Conn
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : hotelreservationsystem

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-10-28 20:00:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `available_room`
-- ----------------------------
DROP TABLE IF EXISTS `available_room`;
CREATE TABLE `available_room` (
  `hotel_id` int(11) NOT NULL,
  `room_type` enum('Executive','Business','Deluxe','Standard','KingSize','Double','Single') NOT NULL,
  `available_room` int(11) NOT NULL DEFAULT '0',
  `room_date` datetime NOT NULL,
  PRIMARY KEY (`hotel_id`,`room_type`,`room_date`),
  CONSTRAINT `available_room_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of available_room
-- ----------------------------
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-03 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-04 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-05 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-06 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-08 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '7', '2016-10-09 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-21 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-22 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-23 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-24 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-25 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '8', '2016-10-26 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '5', '2016-10-27 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '5', '2016-10-28 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '5', '2016-10-29 00:00:00');
INSERT INTO `available_room` VALUES ('1', 'Single', '5', '2016-10-30 00:00:00');
INSERT INTO `available_room` VALUES ('5', 'Standard', '18', '2016-10-29 00:00:00');
INSERT INTO `available_room` VALUES ('5', 'Standard', '18', '2016-10-30 00:00:00');

-- ----------------------------
-- Table structure for `commercial_circle`
-- ----------------------------
DROP TABLE IF EXISTS `commercial_circle`;
CREATE TABLE `commercial_circle` (
  `loc_id` int(11) NOT NULL,
  `circle_id` int(11) NOT NULL,
  `circle_name` varchar(50) NOT NULL,
  PRIMARY KEY (`loc_id`,`circle_id`),
  KEY `circle_id` (`circle_id`),
  KEY `circle_id_2` (`circle_id`,`loc_id`),
  CONSTRAINT `FK6iqw3bettef6l47xkxwq603gb` FOREIGN KEY (`loc_id`) REFERENCES `location` (`loc_id`),
  CONSTRAINT `commercial_circle_ibfk_1` FOREIGN KEY (`loc_id`) REFERENCES `location` (`loc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commercial_circle
-- ----------------------------
INSERT INTO `commercial_circle` VALUES ('1', '1', '仙林');

-- ----------------------------
-- Table structure for `credit_record`
-- ----------------------------
DROP TABLE IF EXISTS `credit_record`;
CREATE TABLE `credit_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `record_user` varchar(20) NOT NULL,
  `record_type` enum('Execute','Overtime','Recharge') NOT NULL,
  `record_variation` int(11) NOT NULL,
  `record_curr_credit` int(11) NOT NULL,
  `record_order` int(11) NOT NULL,
  PRIMARY KEY (`record_id`),
  KEY `record_user` (`record_user`),
  KEY `record_order` (`record_order`),
  CONSTRAINT `record_order` FOREIGN KEY (`record_order`) REFERENCES `hotel_order` (`order_id`),
  CONSTRAINT `record_user` FOREIGN KEY (`record_user`) REFERENCES `user` (`user_username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of credit_record
-- ----------------------------

-- ----------------------------
-- Table structure for `enterprise`
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise` (
  `enterprise_id` int(11) NOT NULL AUTO_INCREMENT,
  `enterprise_name` varchar(50) NOT NULL,
  PRIMARY KEY (`enterprise_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enterprise
-- ----------------------------
INSERT INTO `enterprise` VALUES ('1', '21');
INSERT INTO `enterprise` VALUES ('2', 'NJU');
INSERT INTO `enterprise` VALUES ('3', 'NJU');

-- ----------------------------
-- Table structure for `hotel`
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel` (
  `hotel_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(20) NOT NULL,
  `hotel_star` int(11) NOT NULL DEFAULT '1',
  `hotel_score` double NOT NULL DEFAULT '0',
  `hotel_loc` int(11) DEFAULT NULL,
  `hotel_circle` int(11) DEFAULT NULL,
  `hotel_profile` varchar(200) DEFAULT NULL,
  `hotel_service` varchar(200) DEFAULT NULL,
  `hotel_street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`),
  KEY `hotel_loc` (`hotel_loc`,`hotel_circle`),
  KEY `hotel_ibfk_1` (`hotel_circle`,`hotel_loc`),
  CONSTRAINT `hotel_ibfk_1` FOREIGN KEY (`hotel_circle`, `hotel_loc`) REFERENCES `commercial_circle` (`circle_id`, `loc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel
-- ----------------------------
INSERT INTO `hotel` VALUES ('1', '和园酒店', '3', '4', null, null, null, null, null);
INSERT INTO `hotel` VALUES ('4', '仙林大酒店', '2', '3.3', '1', '1', 'good', 'nice', null);
INSERT INTO `hotel` VALUES ('5', '仙林大酒店', '2', '3.3', '1', '1', 'good', 'nice', null);
INSERT INTO `hotel` VALUES ('6', '仙林大酒店', '2', '3.3', '1', '1', 'good', 'nice', null);

-- ----------------------------
-- Table structure for `hotel_discount`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_discount`;
CREATE TABLE `hotel_discount` (
  `discount_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_hotel` int(11) NOT NULL,
  `discount_disc` double NOT NULL,
  `discount_type` enum('Birthday','LargeQty','Enterprise','SpecialPeriod') NOT NULL,
  `discount_min_qty` int(11) DEFAULT NULL,
  `discount_enterprise` int(11) DEFAULT NULL,
  `discount_begin_time` datetime DEFAULT NULL,
  `discount_end_time` datetime DEFAULT NULL,
  PRIMARY KEY (`discount_id`),
  KEY `discount_hotel` (`discount_hotel`),
  KEY `discount_enterprise` (`discount_enterprise`),
  CONSTRAINT `hotel_discount_ibfk_1` FOREIGN KEY (`discount_hotel`) REFERENCES `hotel` (`hotel_id`),
  CONSTRAINT `hotel_discount_ibfk_2` FOREIGN KEY (`discount_enterprise`) REFERENCES `enterprise` (`enterprise_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_discount
-- ----------------------------

-- ----------------------------
-- Table structure for `hotel_order`
-- ----------------------------
DROP TABLE IF EXISTS `hotel_order`;
CREATE TABLE `hotel_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_place_time` datetime NOT NULL,
  `order_exec_time` datetime NOT NULL,
  `order_checkin_time` datetime DEFAULT NULL,
  `order_expected_checkout_time` datetime NOT NULL,
  `order_checkout_time` datetime DEFAULT NULL,
  `order_revoke_time` datetime DEFAULT NULL,
  `order_status` enum('Unexecuted','Executed','RevokedFullValue','RevokedHalfValue','UserRevoked','Abnormal') NOT NULL DEFAULT 'Unexecuted',
  `order_hotel` int(11) NOT NULL,
  `order_value` double NOT NULL,
  `order_room_type` enum('Executive','Business','Deluxe','Standard','KingSize','Double','Single') NOT NULL,
  `order_room_num` int(11) DEFAULT '1',
  `order_has_child` tinyint(1) NOT NULL DEFAULT '0',
  `order_tenant` int(11) NOT NULL,
  `order_score` int(11) DEFAULT NULL,
  `order_evaluation` varchar(200) DEFAULT NULL,
  `order_people_num` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`order_id`),
  KEY `order_tenant` (`order_tenant`),
  KEY `order_hotel` (`order_hotel`),
  KEY `order_room_type` (`order_room_type`),
  CONSTRAINT `FK5ppffvlfmotb4nac4torh8ahj` FOREIGN KEY (`order_tenant`) REFERENCES `user` (`user_id`),
  CONSTRAINT `hotel_order_ibfk_1` FOREIGN KEY (`order_tenant`) REFERENCES `user` (`user_id`),
  CONSTRAINT `hotel_order_ibfk_2` FOREIGN KEY (`order_hotel`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotel_order
-- ----------------------------
INSERT INTO `hotel_order` VALUES ('10', '2016-10-20 20:24:09', '2016-10-20 20:24:09', null, '2016-10-20 20:24:09', null, null, 'Unexecuted', '1', '400', 'Single', '1', '0', '8', '0', null, '1');
INSERT INTO `hotel_order` VALUES ('15', '2016-10-28 08:15:59', '2016-10-29 08:16:02', null, '2016-10-31 08:16:08', null, null, 'Unexecuted', '5', '1000', 'Standard', '2', '1', '5', '2', '1', '2');
INSERT INTO `hotel_order` VALUES ('16', '2016-10-01 08:18:12', '2016-10-08 08:18:16', '2016-10-08 08:18:20', '2016-10-10 08:18:24', '2016-10-10 08:18:29', null, 'Executed', '1', '600', 'Single', '1', '0', '8', '3', '呵呵哒', '1');
INSERT INTO `hotel_order` VALUES ('17', '2016-10-02 08:19:39', '2016-10-03 08:19:44', null, '2016-10-07 08:19:53', null, '2016-10-04 08:19:59', 'UserRevoked', '1', '200', 'Single', '1', '0', '2', null, null, '1');

-- ----------------------------
-- Table structure for `location`
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `loc_id` int(11) NOT NULL AUTO_INCREMENT,
  `loc_name` varchar(50) NOT NULL,
  PRIMARY KEY (`loc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES ('1', '南京');
INSERT INTO `location` VALUES ('2', '北京');
INSERT INTO `location` VALUES ('3', '上海');

-- ----------------------------
-- Table structure for `offline_record`
-- ----------------------------
DROP TABLE IF EXISTS `offline_record`;
CREATE TABLE `offline_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_id` int(11) NOT NULL,
  `record_checkin_time` datetime NOT NULL,
  `record_expected_checkout_time` datetime NOT NULL,
  `record_checkout_time` datetime DEFAULT NULL,
  `room_type` enum('Executive','Business','Deluxe','Standard','KingSize','Double','Single') NOT NULL,
  `room_num` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`record_id`),
  KEY `room_type` (`room_type`),
  KEY `offline_record_ibfk_2` (`hotel_id`),
  CONSTRAINT `offline_record_ibfk_2` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offline_record
-- ----------------------------
INSERT INTO `offline_record` VALUES ('5', '1', '2016-10-27 19:36:54', '2016-10-31 19:36:58', null, 'Single', '3');

-- ----------------------------
-- Table structure for `room`
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `hotel_id` int(11) NOT NULL,
  `room_type` enum('Executive','Business','Deluxe','Standard','KingSize','Double','Single') NOT NULL,
  `room_num` int(11) NOT NULL,
  `room_value` double NOT NULL,
  PRIMARY KEY (`hotel_id`,`room_type`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', 'Single', '8', '300');
INSERT INTO `room` VALUES ('5', 'Standard', '20', '200');

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staff_username` varchar(20) NOT NULL,
  `staff_password` varchar(20) NOT NULL,
  `staff_type` enum('HotelStaff','WebsiteAdminister','WebsiteMarketer') NOT NULL,
  `staff_hotel` int(11) DEFAULT NULL,
  `staff_name` varchar(20) NOT NULL,
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`staff_id`),
  UNIQUE KEY `staff_uk_1` (`staff_username`),
  KEY `staff_hotel` (`staff_hotel`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`staff_hotel`) REFERENCES `hotel` (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('admin3', 'admin3', 'HotelStaff', '4', '呵呵', '1');
INSERT INTO `staff` VALUES ('admin4', 'admin3', 'HotelStaff', '5', '呵呵', '2');
INSERT INTO `staff` VALUES ('admin5', 'admin5', 'HotelStaff', '6', '呵呵', '3');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_username` varchar(20) NOT NULL,
  `user_pwd` varchar(20) NOT NULL,
  `user_phone` varchar(20) NOT NULL,
  `user_credit` int(11) NOT NULL DEFAULT '0',
  `user_name` varchar(10) NOT NULL,
  `user_birthdate` date DEFAULT NULL,
  `user_enterprise` varchar(50) DEFAULT NULL,
  `user_level` smallint(6) NOT NULL DEFAULT '1',
  `user_type` varchar(10) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_username` (`user_username`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '15062278865', '2300', 'NewSong', '1996-12-26', 'null', '1', 'Enterprise');
INSERT INTO `user` VALUES ('2', 'admin2', 'admin2', '231231', '230', 'NewSong', '2016-10-18', 'NJU', '1', 'Normal');
INSERT INTO `user` VALUES ('5', 'admin3', 'admin3', '231231231', '230', '呵呵', null, null, '1', 'Normal');
INSERT INTO `user` VALUES ('8', 'admin4', 'admin4', '231231231', '230', '呵呵', null, null, '1', 'Normal');
INSERT INTO `user` VALUES ('9', 'admin7', 'admin7', '23123', '300', '呵呵哒', null, null, '2', 'Enterprise');

-- ----------------------------
-- Table structure for `website_discount`
-- ----------------------------
DROP TABLE IF EXISTS `website_discount`;
CREATE TABLE `website_discount` (
  `discount_id` int(11) NOT NULL AUTO_INCREMENT,
  `discount_type` enum('SpecialPeriod','SpecialCommercialCircle','VIP') NOT NULL,
  `discount_disc` double NOT NULL,
  `discount_begin_time` datetime DEFAULT NULL,
  `discount_end_time` datetime DEFAULT NULL,
  `discount_commercial_circle` int(11) DEFAULT NULL,
  `discount_VIPlevel` int(11) DEFAULT NULL,
  `discount_location` int(11) DEFAULT NULL,
  PRIMARY KEY (`discount_id`),
  KEY `website_discount_FK_1` (`discount_location`,`discount_commercial_circle`),
  CONSTRAINT `website_discount_FK_1` FOREIGN KEY (`discount_location`, `discount_commercial_circle`) REFERENCES `commercial_circle` (`loc_id`, `circle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of website_discount
-- ----------------------------
DROP TRIGGER IF EXISTS `tri_order_insert_available_room`;
DELIMITER ;;
CREATE TRIGGER `tri_order_insert_available_room` AFTER INSERT ON `hotel_order` FOR EACH ROW begin
	set @roomNum = (select room_num from room where hotel_id = new.order_hotel and room_type = new.order_room_type);
	set @myDate = date(new.order_exec_time);
	
	while @myDate < date(new.order_expected_checkout_time) do
		if(select count(*) from available_room where new.order_hotel = available_room.hotel_id and new.order_room_type = room_type and @myDate = room_date) = 0 then  
			insert into available_room(hotel_id,room_type,available_room,room_date) values(new.order_hotel,new.order_room_type,@roomNum,@myDate);
		end if;
		set @myDate = date_add(@myDate,interval 1 day);
	end while;

	update available_room set available_room = available_room-new.order_room_num where new.order_hotel = available_room.hotel_id and new.order_room_type = room_type and room_date >= date(new.order_exec_time) and room_date < date(new.order_expected_checkout_time);
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_order_update_available_room`;
DELIMITER ;;
CREATE TRIGGER `tri_order_update_available_room` AFTER UPDATE ON `hotel_order` FOR EACH ROW begin
	if(new.order_status = 'UserRevoked' or new.order_status = 'Abnormal') then
		update available_room set available_room = available_room+new.order_room_num where new.order_hotel = available_room.hotel_id and  room_date > date_sub(new.order_exec_time,interval 1 day) and room_date < date_sub(new.order_expected_checkout_time,interval 1 day);
	end if;
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `tri_offline_record_insert_available_room`;
DELIMITER ;;
CREATE TRIGGER `tri_offline_record_insert_available_room` AFTER INSERT ON `offline_record` FOR EACH ROW begin
		set @roomNum = (select room_num from room where hotel_id = new.hotel_id and room_type = new.room_type);
		set @myDate = date(new.record_checkin_time);
		
		while @myDate < date(new.record_expected_checkout_time) do
			if (select count(*) from available_room where new.hotel_id = available_room.hotel_id and new.room_type = room_type and @myDate = room_date) = 0 then
				insert into available_room(hotel_id,room_type,available_room,room_date) values(new.hotel_id,new.room_type,@roomNum,@myDate);
			end if;
		set @myDate = date_add(@myDate,interval 1 day);
		end while;
		update available_room set available_room = available_room-new.room_num where new.hotel_id = available_room.hotel_id and new.room_type = room_type and room_date >= date(new.record_checkin_time) and room_date < date(new.record_expected_checkout_time);
end
;;
DELIMITER ;
