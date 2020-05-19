-- 分组函数 用作统计使用 分组函数作用于一组数据，并对一组数据返回一个值。
-- select 分组函数，分组后的字段 from 表

-- 分组查询 select 分组函数,列 from...where 分组前筛选条件 group by 分组列表 having 分组后筛选条件 order by

-- 分组前筛选 数据源：原始表
-- 分组后筛选 数据源：分组后的结果集


/* max 最大值
min 最小值
sum 和
avg 平均值
count 计算个数 */

SELECT job_id, max(salary) AS 最高工资
FROM employees
WHERE commission_pct IS NOT NULL
GROUP BY `job_id`
HAVING  最高工资 > 2000;


SELECT min(salary), `manager_id`
FROM employees
WHERE manager_id > 102
GROUP BY `manager_id`
HAVING min(salary) > 5000;

SELECT AVG(salary), `department_id`, `job_id`
FROM employees
GROUP BY `department_id`, `job_id`;




-- 1. 查询各 job_id 的员工工资的最大值，最小值，平均值，总和，并按 job_id 升序
SELECT 
	max(salary) AS 最高工资, min(salary) AS 最低工资, round(AVG(salary), 2) AS 平均工资, sum(salary) AS 总工资, 
	`job_id`
FROM
	`employees`
GROUP BY `job_id`
ORDER BY `job_id` ASC;

-- 2. 查询员工最高工资和最低工资的差距（DIFFERENCE）
SELECT max(salary) - min(salary) AS "DIFFERENCE" FROM employees;

-- 3. 查询各个管理者手下员工的最低工资，其中最低工资不能低于 6000，没有管理者的员工不计算在内
SELECT min(salary) AS min_salary, `manager_id`
FROM employees
WHERE `manager_id` IS NOT NULL
GROUP BY `manager_id`
HAVING `min_salary` > 60;


-- 4. 查询所有部门的编号，员工数量和工资平均值,并按平均工资降序
SELECT `department_id`, count(*) AS count, round(AVG(salary), 2) AS avg_salary
FROM employees
GROUP BY `department_id`
ORDER BY avg_salary;



--  5. 选择具有各个 job_id 的员工人数
SELECT job_id, count(*) AS 员工人数
FROM employees
GROUP BY `job_id`;











