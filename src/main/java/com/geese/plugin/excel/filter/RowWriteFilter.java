package com.geese.plugin.excel.filter;

import com.geese.plugin.excel.config.Table;
import org.apache.poi.ss.usermodel.Row;

/**
 * 在写入一行之前进行过滤
 *
 * @author zhangguangyong <a href="#">1243610991@qq.com</a>
 * @date 2016/11/16 16:25
 * @sine 0.0.1
 */
public interface RowWriteFilter extends RowFilter<Row, Table> {
}
