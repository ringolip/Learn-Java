-- 1. 查询工资最低的员工信息: last_name, salary
SELECT `last_name`, salary
FROM `employees`
WHERE salary = (
	SELECT min(salary) FROM employees
);


-- 2. 查询平均工资最低的部门信息
SELECT d.*
FROM departments AS d
WHERE department_id = (
	SELECT department_id FROM employees
	GROUP BY `department_id`
	ORDER BY AVG(salary) ASC
	LIMIT 0, 1
)


SELECT * FROM departments WHERE department_id = (
	SELECT department_id
	FROM `employees`
	GROUP BY `department_id`
	HAVING AVG(salary) = (
		SELECT min(avg_sal)
		FROM (
			SELECT AVG(salary) AS avg_sal, `department_id`
			FROM employees
			GROUP BY `department_id`
		)AS avg_tbl
	)
)

-- 3. 查询平均工资最低的部门信息和该部门的平均工资
SELECT d.*, inn.avg_sal
FROM departments AS d
INNER JOIN (
	SELECT AVG(salary) AS avg_sal, department_id
	FROM employees
	GROUP BY department_id
	ORDER BY AVG(salary)
	LIMIT 1) AS inn
ON d.`department_id` = inn.`department_id`;


-- 4. 查询平均工资最高的 job 信息
SELECT * FROM jobs
WHERE `job_id` = (
	SELECT job_id
	FROM `employees`
	GROUP BY `job_id`
	ORDER BY AVG(salary) DESC
	LIMIT 1
);


-- 5. 查询平均工资高于公司平均工资的部门有哪些?
SELECT AVG(salary) AS avg_sal, `department_id` FROM employees
GROUP BY department_id
HAVING avg_sal > (
SELECT AVG(salary) FROM employees
)

-- 6. 查询出公司中所有 manager 的详细信息.

SELECT * FROM employees AS e
WHERE e.`employee_id` IN (
	SELECT DISTINCT(`manager_id`) FROM employees
	WHERE `manager_id` IS NOT NULL
)


-- 7. 各个部门中 最高工资中最低的那个部门的 最低工资是多少
SELECT min(salary) FROM employees
WHERE department_id = (
	SELECT department_id FROM employees
	GROUP BY department_id
	ORDER BY max(salary)
	LIMIT 1
);


-- 8. 查询平均工资最高的部门的 manager 的详细信息: last_name, department_id, email, salary
SELECT last_name, department_id, email, salary
FROM employees
WHERE `employee_id` = (
SELECT DISTINCT `manager_id` FROM employees AS e
	WHERE e.department_id = (
	SELECT department_id FROM employees
	GROUP BY department_id
	ORDER BY AVG(salary) DESC
	LIMIT 1
	)
AND `manager_id` IS NOT NULL
)
