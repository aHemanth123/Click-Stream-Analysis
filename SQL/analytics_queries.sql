SELECT url, COUNT(*) AS visits
FROM clickstream_events
GROUP BY url;

SELECT error_code, COUNT(*) AS total
FROM clickstream_events
GROUP BY error_code;

SELECT
    SUM(transaction) AS transactions,
    COUNT(*) AS total_events
FROM clickstream_events;

SELECT
    AVG(page_load_time) AS avg_load_time
FROM clickstream_events;
