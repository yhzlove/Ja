package com.javaer.modules.generator.service.impl;

import com.javaer.modules.generator.entity.GenTable;
import com.javaer.modules.generator.entity.GenTableColumn;
import com.javaer.modules.generator.mapper.GenTableMapper;
import com.javaer.modules.generator.service.IGenTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-07 22:17
 */
@Service
public class GenTableServiceImpl implements IGenTableService {

	@Autowired
	private GenTableMapper genTableMapper;

	public List<GenTable> getTables() {
		return genTableMapper.getTables();
	}

	public List<GenTableColumn> genTableColumns(String tableName) {
		return genTableMapper.getColumns(tableName);
	}


	@Transactional
	public void creatTable(GenTable genTable) {
		genTableMapper.createTable(genTable);
	}


	@Transactional
	public void updateTable(String tableName, String newTableName) {
		genTableMapper.updateTable(tableName, newTableName);
	}

	@Transactional
	public void deleteTable(String tableName) {
		genTableMapper.deleteTable(tableName);
	}

}
