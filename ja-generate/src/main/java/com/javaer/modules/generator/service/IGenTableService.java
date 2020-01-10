package com.javaer.modules.generator.service;

import com.javaer.modules.generator.entity.GenTableColumn;
import com.javaer.modules.generator.entity.GenTable;

import java.util.List;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 22:17
 */
public interface IGenTableService {

	/**
	 * 查询数据库下面的表
	 * @return
	 */
	public List<GenTable> getTables();
	/**
	 * 查询数据库表下面的列属性
	 * @return
	 */
	public List<GenTableColumn> genTableColumns(String tableName);
	/**
	 * 创建表
	 * @param genTable
	 */
	public void creatTable(GenTable genTable);

	/**
	 * 修改表名
	 * @param tableName
	 * @param newTableName
	 */
	public void updateTable(String tableName, String newTableName);

	/**
	 * 删除表
	 * @param tableName
	 */
	public void deleteTable(String tableName);


}
