package com.javaer.modules.generator.entity;

import lombok.Data;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 21:54
 */
@Data
public class GenTable {

    /** 表名称 */
    private String tableName;

    /** 创建日期 */
    private String createTime;

    /** 数据库引擎 */
    private String engine;

    /** 编码集 */
    private String coding;

    /** 备注 */
    private String tableComment;
}
