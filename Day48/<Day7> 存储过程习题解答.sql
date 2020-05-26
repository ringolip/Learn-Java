-- 1、创建存储过程或函数实现传入用户名和密码，插入到 admin 表中
CREATE PROCEDURE insert_admin(IN userName VARCHAR(20), IN `passWord` VARCHAR(20))
BEGIN
	INSERT INTO admin (username, `password`) VALUES(userName, `passWord`);
END $



-- 2、创建存储过程或函数实现传入女神编号，返回女神名称和女神电话
CREATE PROCEDURE beautyInfo(IN `id` INT, OUT beautyName VARCHAR(20), OUT beautyPhone VARCHAR(11))
BEGIN
	SELECT `name`, `phone` INTO beautyName, beautyPhone
	FROM beauty
	WHERE beauty.id = id;
END $

-- 3、创建存储存储过程或函数实现传入两个女神生日，返回大小
CREATE PROCEDURE beautyCompare(IN `birth1` DATETIME, IN `birth2` DATETIME, OUT result INT)
BEGIN
	SELECT DATEDIFF(birth1, birth2) INTO result;
END $

-- 4、创建存储过程或函数实现传入一个日期，格式化成 xx 年 xx 月 xx 日并返回
CREATE PROCEDURE formatDate(IN `date` DATETIME, OUT `dateString` VARCHAR(20))
BEGIN
	SELECT DATE_FORMAT(`date`, '%y年%m月%d日') INTO dateString;
END $
