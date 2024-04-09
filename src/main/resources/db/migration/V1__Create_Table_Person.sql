CREATE TABLE IF NOT EXISTS `person`
(
    `id`         bigint                                                        NOT NULL AUTO_INCREMENT,
    `first_name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL,
    `last_name`  varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL,
    `address`    varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
    `gender`     varchar(6)                                                    NOT NULL,
    PRIMARY KEY (`id`)
);




