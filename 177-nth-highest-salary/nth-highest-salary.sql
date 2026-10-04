CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
READS sql data
BEGIN
  DECLARE Paas INT;
  set Paas = N-1;
  RETURN (
  SELECT ( SELECT DISTINCT salary FROM 
  employee 
  ORDER BY salary DESC
  LIMIT Paas,1
  ) AS ans);
END 
