/*
Navicat MySQL Data Transfer

Source Server         : people
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-08 13:14:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(20) DEFAULT NULL,
  `admin_pwd` varchar(20) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', '管理员');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int(10) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(10) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  `teacher_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  KEY `teacher_name` (`teacher_name`),
  KEY `teacher_id-c` (`teacher_id`),
  KEY `course_name` (`course_name`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '数据结构与算法', '1', '张三');
INSERT INTO `course` VALUES ('2', '计算机组成原理', '2', '李四');

-- ----------------------------
-- Table structure for `exam_dati`
-- ----------------------------
DROP TABLE IF EXISTS `exam_dati`;
CREATE TABLE `exam_dati` (
  `exam_id` int(10) NOT NULL AUTO_INCREMENT,
  `exam_name` varchar(100) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  `teacher_name` varchar(10) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`exam_id`),
  KEY `teacher_id` (`teacher_id`),
  KEY `teacher_name_e` (`teacher_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_dati
-- ----------------------------
INSERT INTO `exam_dati` VALUES ('1', '第一个大题', '1', '张三', '答案', '数据结构与算法');
INSERT INTO `exam_dati` VALUES ('2', '第二个大题', '2', '张三', '答案', '数据结构与算法');
INSERT INTO `exam_dati` VALUES ('3', '第三个大题', '3', '张三', '答案', '数据结构与算法');
INSERT INTO `exam_dati` VALUES ('4', '第四个大题', '4', '张三', '答案', '数据结构与算法');
INSERT INTO `exam_dati` VALUES ('5', '第五个大题', '5', '张三', '答案', '数据结构与算法');
INSERT INTO `exam_dati` VALUES ('6', '第六个大题', '6', '李四', '答案', '计算机组成原理');
INSERT INTO `exam_dati` VALUES ('7', '第七个大题', '7', '李四', '答案', '计算机组成原理');
INSERT INTO `exam_dati` VALUES ('8', '第八个大题', '8', '李四', '答案', '计算机组成原理');
INSERT INTO `exam_dati` VALUES ('9', '第九个大题', '9', '李四', '答案', '计算机组成原理');
INSERT INTO `exam_dati` VALUES ('10', '第十个大题', '10', '李四', '答案', '计算机组成原理');

-- ----------------------------
-- Table structure for `exam_test`
-- ----------------------------
DROP TABLE IF EXISTS `exam_test`;
CREATE TABLE `exam_test` (
  `stu_id` int(10) DEFAULT '0',
  `stu_name` varchar(10) DEFAULT NULL,
  `stu_score` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_test
-- ----------------------------

-- ----------------------------
-- Table structure for `exam_test_a`
-- ----------------------------
DROP TABLE IF EXISTS `exam_test_a`;
CREATE TABLE `exam_test_a` (
  `stu_id` int(10) DEFAULT NULL,
  `stu_name` varchar(10) DEFAULT NULL,
  `exam_id` int(10) NOT NULL AUTO_INCREMENT,
  `exam_name` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `nanswer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_test_a
-- ----------------------------

-- ----------------------------
-- Table structure for `exam_xuanze`
-- ----------------------------
DROP TABLE IF EXISTS `exam_xuanze`;
CREATE TABLE `exam_xuanze` (
  `exam_id` int(10) NOT NULL AUTO_INCREMENT,
  `exam_name` varchar(100) DEFAULT NULL,
  `answer_A` varchar(50) DEFAULT NULL,
  `answer_B` varchar(50) DEFAULT NULL,
  `answer_C` varchar(50) DEFAULT NULL,
  `answer_D` varchar(50) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  `teacher_name` varchar(10) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`exam_id`),
  KEY `teacher_id_q` (`teacher_id`),
  KEY `teacher_name_w` (`teacher_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_xuanze
-- ----------------------------
INSERT INTO `exam_xuanze` VALUES ('1', '第一个选择', '啊', '啊1', '啊2', '啊3', '1', '张三', '啊', '数据结构与算法');
INSERT INTO `exam_xuanze` VALUES ('2', '第二个选择', '啊4', '啊5', '啊6', '啊7', '1', '张三', '啊6', '数据数据结构与算法');
INSERT INTO `exam_xuanze` VALUES ('3', '第三个选择', '啊2', '啊3', '撒', '是', '1', '张三', '是', '数据结构与算法');
INSERT INTO `exam_xuanze` VALUES ('4', '第四个选择', '啊', '撒旦', '撒', '阿三', '1', '张三', '撒', '数据结构与算法');
INSERT INTO `exam_xuanze` VALUES ('5', '第五个选择', '线下', '的', '多少', '是', '1', '张三', '是', '数据结构与算法');
INSERT INTO `exam_xuanze` VALUES ('6', '6', '撒旦', '撒旦', '是', '去', '2', '李四', '去', '计算机组成原理');
INSERT INTO `exam_xuanze` VALUES ('7', '第七个选择', '他', '我', '阿', '给', '2', '李四', '他', '计算机组成原理');
INSERT INTO `exam_xuanze` VALUES ('8', '8', '分数', '撒旦', '我去', '公告', '2', '李四', '公告', '计算机组成原理');
INSERT INTO `exam_xuanze` VALUES ('9', '9', '多少', '嗯嗯', '撒旦', '郭德纲', '2', '李四', '撒旦', '计算机组成原理');
INSERT INTO `exam_xuanze` VALUES ('10', '10', '存储', 'vv', 'vVS', '收端', '2', '李四', '收端', '计算机组成原理');

-- ----------------------------
-- Table structure for `lianxi_dati`
-- ----------------------------
DROP TABLE IF EXISTS `lianxi_dati`;
CREATE TABLE `lianxi_dati` (
  `lianxi_id` int(10) NOT NULL AUTO_INCREMENT,
  `lianxi_name` varchar(10) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  `teacher` varchar(10) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`lianxi_id`),
  KEY `teacher_id_a` (`teacher_id`),
  KEY `teacher_name_a` (`teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lianxi_dati
-- ----------------------------
INSERT INTO `lianxi_dati` VALUES ('0', '撒打撒打呃呃呃', '1', '张三', '1', '数据结构与算法');
INSERT INTO `lianxi_dati` VALUES ('1', '撒打撒打撒', '1', '张三', '2', '数据结构与算法');
INSERT INTO `lianxi_dati` VALUES ('2', '趣味无穷', '1', '张三', '3', '数据结构与算法');
INSERT INTO `lianxi_dati` VALUES ('3', '我去饿我去日期', '1', '张三', '4', '数据结构与算法');
INSERT INTO `lianxi_dati` VALUES ('4', '所在中学', '1', '张三', '5', '数据结构与算法');
INSERT INTO `lianxi_dati` VALUES ('5', '打撒打撒', '2', '李四', '6', '计算机组成原理');
INSERT INTO `lianxi_dati` VALUES ('6', '维尔', '2', '李四', '7', '计算机组成原理');
INSERT INTO `lianxi_dati` VALUES ('7', '呃呃呃12', '2', '李四', '8', '计算机组成原理');
INSERT INTO `lianxi_dati` VALUES ('8', '呃呃呃', '2', '李四', '9', '计算机组成原理');
INSERT INTO `lianxi_dati` VALUES ('9', '厄尔', '2', '李四', '10', '计算机组成原理');

-- ----------------------------
-- Table structure for `lianxi_test`
-- ----------------------------
DROP TABLE IF EXISTS `lianxi_test`;
CREATE TABLE `lianxi_test` (
  `stu_id` int(10) DEFAULT '0',
  `stu_name` varchar(10) DEFAULT NULL,
  `stu_score` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lianxi_test
-- ----------------------------

-- ----------------------------
-- Table structure for `lianxi_test_a`
-- ----------------------------
DROP TABLE IF EXISTS `lianxi_test_a`;
CREATE TABLE `lianxi_test_a` (
  `stu_id` int(10) DEFAULT NULL,
  `stu_name` varchar(10) DEFAULT NULL,
  `exam_id` int(10) NOT NULL AUTO_INCREMENT,
  `exam_name` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  `nanswer` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lianxi_test_a
-- ----------------------------

-- ----------------------------
-- Table structure for `lianxi_xuanze`
-- ----------------------------
DROP TABLE IF EXISTS `lianxi_xuanze`;
CREATE TABLE `lianxi_xuanze` (
  `lianxi_id` int(10) NOT NULL AUTO_INCREMENT,
  `lianxi_name` varchar(50) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  `teacher_name` varchar(10) DEFAULT NULL,
  `answer_A` varchar(50) DEFAULT NULL,
  `answer_B` varchar(50) DEFAULT NULL,
  `answer_C` varchar(50) DEFAULT NULL,
  `answer_D` varchar(50) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`lianxi_id`),
  KEY `teacher_id_b` (`teacher_id`),
  KEY `teacher_name_b` (`teacher_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lianxi_xuanze
-- ----------------------------
INSERT INTO `lianxi_xuanze` VALUES ('0', '撒打撒打撒', '1', '张三', '撒', '阿三', '阿三', '阿三', '呃呃呃', '数据结构与算法');
INSERT INTO `lianxi_xuanze` VALUES ('1', '自增长', '1', '张三', '收端', '收端', '收端', '是', '收端', '数据结构与算法');
INSERT INTO `lianxi_xuanze` VALUES ('2', '存储', '1', '张三', '地方', '收端', 's撒旦', '撒', '地方', '数据结构与算法');
INSERT INTO `lianxi_xuanze` VALUES ('3', '烦烦烦发撒旦撒旦', '1', '张三', '的撒', '的撒', '的撒', '电视上的', '手动', '数据结构与算法');
INSERT INTO `lianxi_xuanze` VALUES ('4', '发生的事的气味', '1', '张三', '的撒旦', '撒旦', '撒旦', '撒旦', '阿斯顿', '数据结构与算法');
INSERT INTO `lianxi_xuanze` VALUES ('5', '撒旦撒', '2', '李四', '是', 'd撒旦', '撒旦', 'a撒旦', '是', '计算机组成原理');
INSERT INTO `lianxi_xuanze` VALUES ('7', '打撒打撒', '2', '李四', '撒旦', '撒旦', '撒旦', '撒旦', '的撒旦', '计算机组成原理');
INSERT INTO `lianxi_xuanze` VALUES ('8', '强强强强', '2', '李四', '嗡嗡嗡', '撒旦撒旦', '七千万', '额嗡嗡', '信息', '计算机组成原理');
INSERT INTO `lianxi_xuanze` VALUES ('9', '现在正在', '2', '李四', '撒旦撒旦', '说的是地区', '地区的我', '为微软为其', '撒旦撒旦', '计算机组成原理');
INSERT INTO `lianxi_xuanze` VALUES ('10', '超线程相处', '2', '李四', '探讨问题', '探讨', '台湾问题', '土台图', '饿饿通天塔', '计算机组成原理');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(10) NOT NULL,
  `student_name` varchar(10) DEFAULT NULL,
  `student_pwd` varchar(20) DEFAULT NULL,
  `student_role` varchar(10) DEFAULT NULL,
  `zhuanye` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'zs', '3', '学生', '电子与信息');
INSERT INTO `student` VALUES ('2', '正则', '123', '学生', '电子与信息');
INSERT INTO `student` VALUES ('132657', '正则', '123', '学生', '电子与信息');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(10) NOT NULL,
  `teacher_name` varchar(20) DEFAULT NULL,
  `teacher_pwd` varchar(20) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  `teach_course` varchar(20) DEFAULT NULL,
  `teach_id` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`teacher_id`),
  KEY `teacher_name` (`teacher_name`),
  KEY `a` (`teach_id`),
  KEY `b` (`teach_course`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '找', '1', '教师', 'aa', '10');
INSERT INTO `teacher` VALUES ('2', '找', '1', '教师', 'aa', '2');
INSERT INTO `teacher` VALUES ('3', '找', '2', '教师', 'aa', '8');
INSERT INTO `teacher` VALUES ('110', '正则', '123', '老师', '电子与信息', '9');
