# Write your MySQL query statement be
SELECT a.name FROM 
employee a JOIN employee b
ON b.managerId = a.id
GROUP by a.Id , a.name
HAVING COUNT(b.managerId)>=5;


