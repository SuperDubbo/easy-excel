package com.geese.plugin.excel.core;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * ExcelMapping 操作接口
 *
 * @author zhangguangyong <a href="#">1243610991@qq.com</a>
 * @date 2016/11/16 16:17
 * @sine 0.0.1
 */
public interface ExcelOperation {
    /**
     * excel读取
     *
     * @param workbook
     * @param config
     * @return
     */
    Object readExcel(Workbook workbook, ExcelMapping config);

    /**
     * excel写入
     *
     * @param workbook
     * @param config
     */
    void writeExcel(Workbook workbook, ExcelMapping config);

    /**
     * sheet读取
     *
     * @param sheet
     * @param config
     * @return
     */
    Object readSheet(Sheet sheet, SheetMapping config);

    /**
     * sheet写入
     *
     * @param sheet
     * @param config
     */
    void writeSheet(Sheet sheet, SheetMapping config);

    /**
     * row读取
     *
     * @param row
     * @param table
     * @return
     */
    Object readRow(Row row, Table table);

    /**
     * row写入
     *
     * @param row
     * @param value
     * @param table
     */
    void writeRow(Row row, Object value, Table table);

    /**
     * cell读取
     *
     * @param cell
     * @param point
     * @return
     */
    Object readCell(Cell cell, Point point);

    /**
     * cell写入
     *
     * @param cell
     * @param value
     * @param point
     */
    void writeCell(Cell cell, Object value, Point point);
}
