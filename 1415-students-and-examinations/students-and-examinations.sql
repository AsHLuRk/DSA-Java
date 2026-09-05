# Write your MySQL query statement below
SELECT a.student_id,a.student_name, b.subject_name, COUNT(c.student_id) AS attended_exams FROM
Students a CROSS JOIN Subjects b LEFT JOIN Examinations c
ON a.student_id = c.student_id AND b.subject_name=c.subject_name
GROUP BY student_id , subject_name
ORDER BY student_id, subject_name;