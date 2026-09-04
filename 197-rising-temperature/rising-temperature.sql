# Write your MySQL query statement below
SELECT e1.id FROM
Weather e1 INNER JOIN Weather e2
ON DATEDIFF(e1.recordDate, e2.recordDate) = 1
WHERE e1.temperature>e2.temperature;