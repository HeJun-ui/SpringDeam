-- 测试用户
-- username:111111
-- password:111111
-- ----------------------------
-- Table structure for mgt_user
-- ----------------------------
DROP TABLE IF EXISTS `mgt_user`;
CREATE TABLE `mgt_user`
(
    `uid`        int                                                         NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `username`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `password`   varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '用户密码',
    `createTime` datetime NULL DEFAULT NULL,
    `updateTime` datetime NULL DEFAULT NULL,
    `role`       varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci     NOT NULL COMMENT '用户权限',
    PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mgt_user
-- ----------------------------
INSERT INTO `mgt_user` VALUES (1,'111111', 'f19d73111c3f267f89b6f0c9c624c1f5', '2022-09-08 21:26:33', '2022-09-08 21:26:33', 'ROLE_USER');