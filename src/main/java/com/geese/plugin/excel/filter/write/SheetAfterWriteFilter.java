package com.geese.plugin.excel.filter.write;

import com.geese.plugin.excel.filter.SheetFilter;
import com.geese.plugin.excel.filter.WriteFilter;
import com.geese.plugin.excel.mapping.SheetMapping;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * <p> 写入sheet后过滤 <br>
 *
 * @author zhangguangyong <a href="#">1243610991@qq.com</a>
 * @date 2016/11/21 22:17
 * @sine 0.0.2
 */
public interface SheetAfterWriteFilter extends SheetFilter<Sheet, SheetMapping>, WriteFilter<Sheet, SheetMapping> {
}
