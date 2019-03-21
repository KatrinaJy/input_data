package com.springboot.gradu.data.vo;

import java.util.List;

/**
 * Created by 28643 on 2018/12/1.
 */
/*���ڷ�ҳ�����ģ��*/
public class TableModel<T> {
    private long total;
    private List<T> rows;

    public TableModel() {
    }

    public TableModel(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
