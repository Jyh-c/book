# 数据库名称：book
create database book;
use book;

# 数据表 book 结构如下
CREATE TABLE `book`  (
  `BOOK_ID` int(50) NOT NULL AUTO_INCREMENT,
  `BOOK_NAME` varchar(100)  NOT NULL,
  `ISBN` varchar(100),
  `CATEGORY` varchar(100),
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 数据表 user 结构如下
CREATE TABLE `user` (
  `USER_NAME` varchar(100),
  `PASSWORD` varchar(100)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# 向user表中插入数据，用于登录
insert into user values ('admin','123456');
