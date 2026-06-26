SELECT
    id AS project_id,
    DATEDIFF('DAY', start_date, finish_date) AS month_count
FROM project
ORDER BY month_count DESC;