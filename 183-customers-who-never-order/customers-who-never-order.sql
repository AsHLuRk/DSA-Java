# Write your MySQL query statement below
SELECT c.name AS customers from Customers c
LEFT JOIN Orders o 
ON c.id = o.customerId
WHERE o.Id IS null;