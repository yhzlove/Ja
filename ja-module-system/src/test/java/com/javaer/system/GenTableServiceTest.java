package com.javaer.system;

import com.javaer.modules.generator.entity.GenTable;
import com.javaer.modules.generator.entity.GenTableColumn;
import com.javaer.modules.generator.service.IGenTableService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Auther: yanhaizhen
 * @Date: 2020-01-05 13:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class GenTableServiceTest {

    @Resource
    private IGenTableService genTableService;


    @BeforeEach
    void setUp() {
        log.error("单元测试。。");
    }

    @Test
    void getTables() {
        List<GenTable> tables = genTableService.getTables();
        for (GenTable table : tables){
            log.error("Table表名：{},名称：{}", table.getTableName(), table.getTableComment());
            List<GenTableColumn> genTableColumns = genTableService.genTableColumns(table.getTableName());
            for (GenTableColumn column : genTableColumns){
                log.error("列名：{},{},{}", column.getColumnName(), column.getColumnComment(), column.getColumnType());
            }
        }
    }



    @Test
    void creatTable() {
        GenTable genTable = new GenTable();
        genTable.setTableName("gen_table_1");
        genTable.setTableComment("代码生成表001");
        genTableService.creatTable(genTable);
    }

    @Test
    void updateTable() {
        genTableService.updateTable("gen_table_1","gen_table_22");
    }


    @Test
    void deleteTable() {
        genTableService.deleteTable("gen_table_22");
    }
}
