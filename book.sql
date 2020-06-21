# 数据库名称：book

# 数据表 book 结构如下
CREATE TABLE `book`  (
  `BOOK_ID` int(50) NOT NULL AUTO_INCREMENT,
  `BOOK_NAME` varchar(100)  NOT NULL,
  `ISBN` varchar(100),
  `CATEGORY` varchar(100),
  PRIMARY KEY (`BOOK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


