-- 1.创建一个表，里面有 id 为主键，stuname 唯一键，seat 座位号，要求将 id 设置成自增
CREATE TABLE stuinfo (
id INT PRIMARY KEY auto_increment,
stuname VARCHAR ( 20 ) UNIQUE,
seat INT UNIQUE 
) CHARACTER SET = utf8;

-- 2.要求用事务的方式插入 3 行数据
-- 开启事务
set autocommit=0;
start TRANSACTION;
-- 编写事务的SQL语句
insert into stuinfo set stuname='lilneng', seat=2;
insert into stuinfo set stuname='zhaosi', seat=4;
insert into stuinfo set stuname='guangkun', seat=5;

-- 结束事务
commit;

-- 3.要求用事务的方式删除数据，并回滚
set autocommit=0;
start TRANSACTION;

delete from stuinfo where stuname='lilneng';
delete from stuinfo where stuname='zhaosi';
delete from stuinfo where stuname='guangkun';

rollback;

