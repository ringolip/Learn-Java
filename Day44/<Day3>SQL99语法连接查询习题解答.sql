-- 一、查询编号>3 的女神的男朋友信息，如果有则列出详细，如果没有，用 null 填充
SELECT b.id, b.`name`, y.*
FROM `beauty` AS b
LEFT OUTER JOIN boys AS y ON b.`boyfriend_id` = y.id
WHERE b.id > 3;

-- 二、查询哪个城市没有部门
SELECT city, `department_name`
FROM `locations` AS l
LEFT OUTER JOIN `departments` AS d ON d.`location_id` = l.`location_id`
WHERE d.`department_id` IS NULL;

-- 三、查询部门名为 SAL 或 IT 的员工信息
SELECT department_name, e.`last_name`, e.`department_id`
FROM departments AS d
LEFT OUTER JOIN `employees` AS e ON e.`department_id` = d.`department_id`
WHERE d.`department_name` IN("SAL", "IT");
