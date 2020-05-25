-- 1.查询邮箱中包含a字符的员工名、部门名和工种信息
CREATE VIEW my_view1
AS
SELECT e.last_name, d.department_name, j.`job_title`
FROM `employees` AS e
INNER JOIN departments AS d
ON e.`department_id` = d.`department_id`
INNER JOIN jobs AS j
ON e.`job_id` = j.`job_id`;

SELECT * FROM `my_view1` WHERE `last_name` LIKE '%a%';


-- 2.查询各部门的平均工资级别
CREATE VIEW my_view2
AS
SELECT AVG(`salary`) AS avg_sal, e.`department_id`
FROM employees AS e
GROUP BY e.`department_id`;

SELECT v.`avg_sal`, g.`grade_level`
FROM `my_view2` AS v
INNER JOIN `job_grades` AS g
ON v.`avg_sal` BETWEEN g.`lowest_sal` AND g.`highest_sal`;

-- 3.查询平均工资最低的部门信息
CREATE VIEW my_view3
AS
SELECT * FROM `my_view2`
ORDER BY `avg_sal`
LIMIT 1;


-- 4.查询平均工资最低的部门名和工资
SELECT d.*, v.`avg_sal`
FROM `my_view3` AS v
INNER JOIN departments AS d
ON v.`department_id`=d.`department_id`;



DESC `my_view1`;

DROP


-- 一、创建视图 emp_v1,要求查询电话号码以‘011’开头的员工姓名和工资、邮箱
CREATE VIEW emp_v1
AS
SELECT last_name, salary, `email`
FROM employees
WHERE `phone_number` LIKE '01%';

DESC `emp_v1`;

-- 二、要求将视图 emp_v1 修改为查询电话号码以‘011’开头的并且邮箱中包含 e 字符的员工姓名和邮箱、电话号码
ALTER VIEW emp_v1
AS
SELECT last_name, email, `phone_number`
FROM employees
WHERE `phone_number` LIKE '01%';

-- 三、向 emp_v1 插入一条记录，是否可以？
SELECT * FROM emp_v1;
INSERT INTO emp_v1 VALUES('Lilneng', 'LILNENGG', '011.99.1644.429267');
-- 四、修改刚才记录中的电话号码为‘0119’
UPDATE `emp_v1` SET `phone_number`='0119' WHERE `last_name`='Lilneng';
-- 五、删除刚才记录
DELETE FROM emp_v1 WHERE `last_name`='Lilneng';

-- 六、创建视图 emp_v2，要求查询部门的最高工资高于 12000 的部门信息
CREATE VIEW emp_v2
AS
SELECT max(salary) AS max_sal, d.*
FROM employees AS e
INNER JOIN departments AS d ON e.`department_id` = d.`department_id`
GROUP BY department_id
HAVING max_sal > 12000;

SELECT * FROM emp_v2;

-- 八、删除刚才的 emp_v2 和 emp_v1
DROP VIEW `emp_v1`, `emp_v2`;
