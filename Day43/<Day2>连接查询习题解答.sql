-- 1. 显示所有员工的姓名，部门号和部门名称。
SELECT e.last_name, d.department_id, d.`department_name`
FROM `employees` AS e, departments AS d
WHERE e.`department_id` = d.`department_id`;


-- 2. 查询 90 号部门员工的 job_id 和 90 号部门的 location_id
SELECT e.`job_id`, d.location_id, d.`department_id`
FROM employees AS e, departments AS d
WHERE e.`department_id` = d.`department_id`
AND d.`department_id` = 90;


-- 3. 选择所有有奖金的员工的
-- last_name , department_name , location_id , city
SELECT last_name , department_name , d.location_id , city, `commission_pct`
FROM employees AS e, departments AS d, locations AS l
WHERE e.`department_id` = d.`department_id`
AND d.`location_id` = l.`location_id`
AND `commission_pct` IS NOT NULL;



-- 4. 选择city在Toronto工作的员工的
-- last_name , job_id , department_id , department_name
SELECT `last_name`, job_id, d.department_id, department_name, city
FROM employees AS e, departments AS d, locations AS l
WHERE e.`department_id` = d.`department_id`
AND d.`location_id` = l.`location_id`
AND city = "Toronto";


-- 5.查询每个工种、每个部门的部门名、工种名和最低工资
SELECT department_name, `job_title`, min(salary)
FROM employees AS e, departments AS d, jobs AS j
WHERE d.`department_id` = e.`department_id`
AND e.`job_id` = j.`job_id`
GROUP BY department_name, `job_title`;


-- 6.查询每个国家下的部门个数大于 2 的国家编号
SELECT `country_id`, COUNT(*)
FROM departments AS d, locations AS l
WHERE d.`location_id` = l.location_id
GROUP BY `country_id`
HAVING count(*) > 2;



-- 7、选择指定员工的姓名，员工号，以及他的管理者的姓名和员工号，结果类似于下面的格
-- 式
-- employees Emp# manager Mgr#
-- kochhar 101 king 100

SELECT a.last_name, a.employee_id AS "Emp#", b.last_name, b.`employee_id` AS "Mgr#"
FROM employees AS a, employees AS b
WHERE a.`manager_id` = b.`employee_id`;

-- 显示员工表的最大工资，工资平均值
SELECT max(salary), round(AVG(salary), 2)
FROM `employees`;

-- 查询员工表，按department_id降序，salary升序
SELECT `employee_id`, `job_id`, `last_name`,department_id, salary
FROM `employees`
ORDER BY department_id DESC, salary ASC;


-- 查询员工表的job_id中包含，a和e的，并且a在e前面
SELECT DISTINCT(job_id)
FROM `employees`
WHERE job_id LIKE "%a%e%";
