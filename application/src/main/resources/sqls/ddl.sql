CREATE TABLE `message`(
   `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键',
   `msg_id` BIGINT UNSIGNED NOT NULL COMMENT '消息Id',
   `sender_id` BIGINT UNSIGNED NOT NULL COMMENT '消息Id',
   `group_type` INT UNSIGNED NOT NULL COMMENT '群组类型',
   `group_id` BIGINT UNSIGNED NOT NULL COMMENT '群组Id',
   `msg_data` TEXT DEFAULT NULL COMMENT '消息内容',
   `valid` INT UNSIGNED NOT NULL COMMENT '是否有效：1=有效',
   `ctime` INT UNSIGNED NOT NULL COMMENT '创建时间',
   `utime` INT UNSIGNED NOT NULL COMMENT '更新时间',
   PRIMARY KEY (`id`),
   UNIQUE KEY `idx_msg_id` (`msg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='消息表';