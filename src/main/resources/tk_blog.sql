/*
Navicat MySQL Data Transfer

Source Server         : G
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : tk_blog

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-11-12 18:46:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) DEFAULT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `content` text,
  `first_picture` varchar(200) DEFAULT NULL,
  `flag` varchar(100) DEFAULT NULL,
  `views` int(11) DEFAULT NULL,
  `appreciation` int(11) DEFAULT NULL,
  `share_statement` int(11) DEFAULT NULL,
  `commentabled` int(11) DEFAULT NULL,
  `published` int(11) DEFAULT NULL,
  `recommend` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `typeid` int(11) DEFAULT NULL,
  `tagid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `deleted` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '11', '12', '12', '123', '31', '2019-11-06 17:22:14', '2019-11-22 17:22:17', '1');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `deleted` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '2', '34', '4', '2019-11-08 17:39:03', '2019-11-29 17:39:07', '1');
INSERT INTO `category` VALUES ('2', null, '1111', '1', null, null, '0');
INSERT INTO `category` VALUES ('3', null, '222', '3', '2019-11-09 16:14:11', '2019-11-09 16:14:11', '0');
INSERT INTO `category` VALUES ('4', null, '3333', '3', '2019-11-09 16:52:07', '2019-11-09 16:52:07', '0');
INSERT INTO `category` VALUES ('5', null, '3333', '3', '2019-11-09 16:53:31', '2019-11-09 16:53:31', '0');
INSERT INTO `category` VALUES ('6', null, '3333', '3', '2019-11-09 16:54:13', '2019-11-09 16:54:13', '0');
INSERT INTO `category` VALUES ('7', null, '3333', '3', '2019-11-09 16:55:25', '2019-11-09 16:55:25', '0');
INSERT INTO `category` VALUES ('8', null, '3333', '3', '2019-11-09 16:58:48', '2019-11-09 16:58:48', '0');
INSERT INTO `category` VALUES ('9', null, '3333', '3', '2019-11-09 17:00:15', '2019-11-09 17:00:15', '0');

-- ----------------------------
-- Table structure for logs
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs` (
  `id` int(11) DEFAULT NULL,
  `log_key` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `content` varchar(1023) DEFAULT NULL,
  `ip_address` varchar(127) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `deleted` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of logs
-- ----------------------------
