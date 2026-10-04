# Write your MySQL query statement below
SELECT d.name AS Department , e.name as employee , e.salary FROM
Employee e JOIN department d
ON e.departmentId = d.id
WHERE (e.departmentid , e.salary) IN (SELECT departmentid , MAX(salary) FROM employee
GROUP BY departmentid);