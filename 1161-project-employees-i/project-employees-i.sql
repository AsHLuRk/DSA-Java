# Write your MySQL query statement below
SELECT project_id , ROUND((SUM(experience_years)*1.0)/COUNT(project_id),2) AS average_years
FROM Project a LEFT JOIN Employee b ON a.employee_id = b.employee_id
GROUP BY a.project_Id;
