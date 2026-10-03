# Write your MySQL query statement be
SELECT firstName , lastName , city , state FROM
Person p1 LEFT JOIN Address a1
ON p1.personId = a1.personId;