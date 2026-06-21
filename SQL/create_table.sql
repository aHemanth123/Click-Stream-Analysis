CREATE TABLE clickstream_events (
    user_id VARCHAR(50),
    session_id VARCHAR(100),
    url VARCHAR(100),
    page_load_time INT,
    transaction INT,
    error_code VARCHAR(20)
);
