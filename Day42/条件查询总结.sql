-- 条件查询 `where 筛选条件`

-- 1. 简单条件运算符筛选 "> < = <> != >= <"

-- 2. 按逻辑表达式筛选 "and or not" 用于连接简单条件运算符
SELECT
	`employee_id`, `salary`
FROM
	`employees`
WHERE
	salary > 10000 AND salary < 20000;


SELECT
	*
FROM
	`employees`
WHERE
	`department_id` < 90 OR `department_id` > 110 OR salary > 15000;

-- 3.模糊查询

/*
like和通配符搭配
- % 任意多个字符，包含0个字符
- _ 任意一个字符
- \ 转义字符 ESCAPE关键字也可以指定转义字符
*/

SELECT
	*
FROM
	`employees`
WHERE
	`last_name` LIKE '%a%';

SELECT
	`last_name`, `salary`
FROM
	`employees`
WHERE
	`last_name` LIKE '__n_l%';

-- \ 转义字符 ESCAPE关键字也可以指定转义字符
SELECT
	`last_name`, `salary`
FROM
	`employees`
WHERE
	`last_name` LIKE '_(_%' ESCAPE '(';

/*
between and  指定取值范围
*/

SELECT
	*
FROM
	`employees`
WHERE
	`employee_id` BETWEEN 100 AND 120;

/*
in 判断某字段的值是否属于in列表中的一项
*/
SELECT
	*
FROM
	`employees`
WHERE
	`job_id` IN('IT_PROT', 'AD_VP');

/*
is null / is not null 用于判断null
<=> 安全等于可用于判断null值
*/
