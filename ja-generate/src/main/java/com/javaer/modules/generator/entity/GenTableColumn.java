package com.javaer.modules.generator.entity;

import lombok.Data;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 22:17
 */
@Data
public class GenTableColumn {

    /** 列名称 */
    private String columnName;
    /**  */
    private Integer ordinalPosition;
    /**  */
    private String isNullable;
    /** 类型 */
    private String columnType;
    /** 备注 */
    private String columnComment;
}
