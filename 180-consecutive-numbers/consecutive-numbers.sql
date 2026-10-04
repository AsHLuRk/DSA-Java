# Write your MySQL query statement below
SELECT DISTINCT num as ConsecutiveNums 
FROM (SELECT num,
     LAG(num,1) OVER(ORDER BY id) as prev1,
     LAG(num,2) OVER(ORDER BY id) as prev2
     FROM Logs) t
WHERE t.num=prev1 AND t.num = prev2;

