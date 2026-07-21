CREATE TABLE IF NOT EXISTS BOARDS (
                                      id         BIGINT AUTO_INCREMENT PRIMARY KEY,
                                      title      VARCHAR(200)  NOT NULL,
    content    VARCHAR(2000) NOT NULL,
    writer     VARCHAR(50)   NOT NULL,
    created_at DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP
    );