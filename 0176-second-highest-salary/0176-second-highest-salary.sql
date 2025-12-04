# Write your MySQL query statement below
Select MAX(salary) as SecondHighestSalary
FROM Employee 
Where salary <(Select MAX(salary) FROM Employee);

