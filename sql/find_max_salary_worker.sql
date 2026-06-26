SELECT
    name AS name,
    salary AS salary
FROM worker
WHERE salary = (
    SELECT MAX(salary)
    FROM worker
);