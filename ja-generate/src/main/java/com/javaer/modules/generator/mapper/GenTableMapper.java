package com.javaer.modules.generator.mapper;

import com.javaer.modules.generator.entity.GenTable;
import com.javaer.modules.generator.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 22:17
 */
@Mapper
public interface GenTableMapper {

	/**
	 * 查询数据库下面的表
	 * @return
	 */
	List<GenTable> getTables();

	/**
	 * 查询数据库表下面的列属性
	 * @return
	 */
	List<GenTableColumn> getColumns(@Param("tableName") String tableName);

	/**
	 * 创建表
	 * @param genTable
	 */
	void createTable(GenTable genTable);

	/**
	 * 修改表名
	 * alter table rename to/as new_tablename
	 * @param tableName
	 * @param newTableName
	 */
	void updateTable(@Param("tableName") String tableName, @Param("newTableName") String newTableName);


	/**
	 * 删除表
	 * drop table 表名
	 * @param tableName
	 */
	void deleteTable(@Param("tableName") String tableName);


}
