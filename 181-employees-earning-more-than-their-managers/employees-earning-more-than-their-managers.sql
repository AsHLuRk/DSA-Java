# Write your MySQL query statement below
SELECT name AS employee FROM employee e1
WHERE e1.salary>( SELECT salary FROM employee e2
                  WHERE e2.id = e1.managerId);