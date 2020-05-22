-- 1. 创建表 dept1
/* NAME NULL? TYPE
id INT(7)
NAME VARCHAR(25) */
CREATE TABLE  IF NOT EXISTS dept1(
	id INT(7),
	`name` VARCHAR(25)
);


-- 2. 将表 departments 中的数据插入新表 dept2 中
CREATE TABLE IF NOT EXISTS dept2
SELECT * FROM departments;


/* 3. 创建表 emp5
NAME NULL? TYPE
id INT(7)
First_name VARCHAR (25)
Last_name VARCHAR(25)
Dept_id INT(7) */
CREATE TABLE IF NOT EXISTS emp5(
	id INT(7),
	First_name VARCHAR (25),
	Last_name VARCHAR(25),
	Dept_id INT(7)
) CHARACTER SET utf8;

-- 4. 将列 Last_name 的长度增加到 50
ALTER TABLE emp5 MODIFY COLUMN `Last_name` VARCHAR(50);

-- 5. 根据表 employees 创建 employees2
CREATE TABLE employees2 LIKE employees;

-- 6. 删除表 emp5
DROP TABLE emp5;

-- 7. 将表 employees2 重命名为 emp5
ALTER TABLE employees2 RENAME TO emp5;

-- 8. 在表 dept 和 emp5 中添加新列 test_column，并检查所作的操作
ALTER TABLE dept1 ADD COLUMN test_column VARCHAR(10);
DESC dept1;

-- 9.直接删除表 emp5 中的列 dept_id
ALTER TABLE dept1 DROP COLUMN test_column;
