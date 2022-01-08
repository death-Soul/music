/*
Navicat MySQL Data Transfer

Source Server         : A
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : music

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2022-01-07 19:26:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('1', 'https://music.163.com/song/media/outer/url?id=485347040', '听到请回答');
INSERT INTO `song` VALUES ('2', 'https://music.163.com/song/media/outer/url?id=1444193524', '老人与海');
INSERT INTO `song` VALUES ('3', 'https://music.163.com/song/media/outer/url?id=1818318740', '若能再次遇见');
INSERT INTO `song` VALUES ('4', 'https://music.163.com/song/media/outer/url?id=1804057877', '多年后再见你');
INSERT INTO `song` VALUES ('5', 'https://music.163.com/song/media/outer/url?id=431791474', '多辛运');
INSERT INTO `song` VALUES ('6', 'https://music.163.com/song/media/outer/url?id=1813864802', '你的轮廓');
INSERT INTO `song` VALUES ('7', 'https://music.163.com/song/media/outer/url?id=1832110581', '沈园外');
INSERT INTO `song` VALUES ('8', '', '小丑说');
INSERT INTO `song` VALUES ('9', 'https://music.163.com/song/media/outer/url?id=1394394309', '荼蘼');
INSERT INTO `song` VALUES ('10', 'https://music.163.com/song/media/outer/url?id=1813006289', '醒');
INSERT INTO `song` VALUES ('11', 'https://music.163.com/song/media/outer/url?id=1441758494', '晚风');
INSERT INTO `song` VALUES ('12', 'https://music.163.com/song/media/outer/url?id=33668486', '我的心在海对面');
INSERT INTO `song` VALUES ('13', 'https://music.163.com/song/media/outer/url?id=5238992', '偏爱');
INSERT INTO `song` VALUES ('14', 'https://music.163.com/song/media/outer/url?id=1483710323', '毒药');
INSERT INTO `song` VALUES ('15', 'https://music.163.com/song/media/outer/url?id=28009540', '逆态度');
INSERT INTO `song` VALUES ('16', 'https://music.163.com/song/media/outer/url?id=1492053672', '我以为');
INSERT INTO `song` VALUES ('17', 'https://music.163.com/song/media/outer/url?id=426852063', '一笑倾城');
INSERT INTO `song` VALUES ('18', 'https://music.163.com/song/media/outer/url?id=26609877', '七秒钟的记忆');
INSERT INTO `song` VALUES ('19', 'https://music.163.com/song/media/outer/url?id=1345820742', '单向箭头');
INSERT INTO `song` VALUES ('20', 'https://music.163.com/song/media/outer/url?id=1483710323', '毒药');
INSERT INTO `song` VALUES ('21', 'https://music.163.com/song/media/outer/url?id=5254811', '今天你要嫁给我');
INSERT INTO `song` VALUES ('22', 'https://music.163.com/song/media/outer/url?id=28996036', '逆战');
INSERT INTO `song` VALUES ('23', 'https://music.163.com/song/media/outer/url?id=1429641613', '卡布奇诺');
INSERT INTO `song` VALUES ('24', 'https://music.163.com/song/media/outer/url?id=1456026535', '删掉');
INSERT INTO `song` VALUES ('25', 'https://music.163.com/song/media/outer/url?id=1477833047', '撒拉嘿');
INSERT INTO `song` VALUES ('26', 'https://music.163.com/song/media/outer/url?id=1857630559', 'New Boy');
INSERT INTO `song` VALUES ('27', 'https://music.163.com/song/media/outer/url?id=1858811054', '曾经');
INSERT INTO `song` VALUES ('28', 'https://music.163.com/song/media/outer/url?id=209643', '日不落');
INSERT INTO `song` VALUES ('29', 'https://music.163.com/song/media/outer/url?id=556201010', '着迷');
INSERT INTO `song` VALUES ('30', 'https://music.163.com/song/media/outer/url?id=1403318151', '把回忆拼好给你');
INSERT INTO `song` VALUES ('31', 'https://music.163.com/song/media/outer/url?id=1392174097', '那家花店');
INSERT INTO `song` VALUES ('32', 'https://music.163.com/song/media/outer/url?id=1414849990', '穷极一生到不了的天堂');
INSERT INTO `song` VALUES ('33', 'https://music.163.com/song/media/outer/url?id=1815402356', '你走后');
INSERT INTO `song` VALUES ('34', 'https://music.163.com/song/media/outer/url?id=1847975477', '目及皆是你');
INSERT INTO `song` VALUES ('35', 'https://music.163.com/song/media/outer/url?id=431534894', '原来如此');
INSERT INTO `song` VALUES ('36', 'https://music.163.com/song/media/outer/url?id=479216513', '习惯');
INSERT INTO `song` VALUES ('37', 'https://music.163.com/song/media/outer/url?id=562597357', '友情多于暧昧未够');
INSERT INTO `song` VALUES ('38', 'https://music.163.com/song/media/outer/url?id=108673', '美人鱼');
INSERT INTO `song` VALUES ('39', 'https://music.163.com/song/media/outer/url?id=1453776107', '一梦南柯');
INSERT INTO `song` VALUES ('40', 'https://music.163.com/song/media/outer/url?id=1428444306', '恋爱告急');
INSERT INTO `song` VALUES ('41', 'https://music.163.com/song/media/outer/url?id=1489064589', '秋天不回来');
INSERT INTO `song` VALUES ('42', 'https://music.163.com/song/media/outer/url?id=1875447903', '三国恋');
INSERT INTO `song` VALUES ('43', 'https://music.163.com/song/media/outer/url?id=1453984725', '东风误');
INSERT INTO `song` VALUES ('44', 'https://music.163.com/song/media/outer/url?id=477826203', '楚地无歌');
INSERT INTO `song` VALUES ('45', 'https://music.163.com/song/media/outer/url?id=1500204087', '青灯晚');
INSERT INTO `song` VALUES ('46', 'https://music.163.com/song/media/outer/url?id=1460918479', '回不去从前');
INSERT INTO `song` VALUES ('47', 'https://music.163.com/song/media/outer/url?id=1323301768', '告白时间');
INSERT INTO `song` VALUES ('48', 'https://music.163.com/song/media/outer/url?id=307780', '七月七日晴');
INSERT INTO `song` VALUES ('49', 'https://music.163.com/song/media/outer/url?id=307761', '威尼斯迷路');
INSERT INTO `song` VALUES ('50', 'https://music.163.com/song/media/outer/url?id=1490185850', '汽车之间(Remix)');
INSERT INTO `song` VALUES ('51', 'https://music.163.com/song/media/outer/url?id=1841260209', '反向冒险');
INSERT INTO `song` VALUES ('52', 'https://music.163.com/song/media/outer/url?id=406737327', '兰花指');
INSERT INTO `song` VALUES ('53', 'https://music.163.com/song/media/outer/url?id=1394101408', '京城旧事');
INSERT INTO `song` VALUES ('54', 'https://music.163.com/song/media/outer/url?id=27678655', '李白');
INSERT INTO `song` VALUES ('55', 'https://music.163.com/song/media/outer/url?id=1472276403', '戏人妾');
