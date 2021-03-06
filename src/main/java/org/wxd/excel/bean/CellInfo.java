package org.wxd.excel.bean;


import org.wxd.excel.annotation.ExcelCellStyle;

import java.util.Arrays;

/**
 * @Description: 存放单元格的信息
 * @Author : wangxd
 * @Date: 2016-3-3
 * @Version 1.0
 */
public class CellInfo {
    private Object value;/*单元格值*/
    private Object fieldType;/*单元格类型*/
    private Integer order;/*序号*/
    private ExcelCellStyle[] styles;/*样式*/


    CellInfo(Builder builder) {
        this.value = builder.value;
        this.order = builder.order;
        this.fieldType = builder.fieldType;
        this.styles = builder.styles;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public static class Builder{
        Object value;/*单元格值*/
        Object fieldType;/*单元格类型*/
        Integer order;/*序号*/
        ExcelCellStyle[] styles;/*样式*/

        public CellInfo build(){
            return new CellInfo(this);
        }

        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public Builder order(Integer order) {
            this.order = order;
            return this;
        }

        public Builder styles(ExcelCellStyle[] styles) {
            this.styles = styles;
            return this;
        }

        public Builder fieldType(Object fieldType) {
            this.fieldType = fieldType;
            return this;
        }
    }

    public Object value() {
        return value;
    }

    public Integer order() {
        return order;
    }

    public ExcelCellStyle[] styles() {
        return styles;
    }
    public Object fieldType() {
        return fieldType;
    }


    @Override
    public String toString() {
        return "CellInfo{" +
                "value=" + value +
                ", fieldType=" + fieldType +
                ", order=" + order +
                ", styles=" + Arrays.toString(styles) +
                '}';
    }
}
