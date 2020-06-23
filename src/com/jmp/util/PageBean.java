package com.jmp.util;

/**
 * 分页工具类
 * @author JYH
 * @version 1.0
 * @date 2020/6/23 11:42
 */

public class PageBean {

    private int page;// 页码

    private int rows;// 页大小

    private int total;// 总记录数

    private boolean pagination = true;// 是否分页

    public PageBean() {
        super();
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTotal(String total) {
        this.total = Integer.parseInt(total);
    }

    public boolean isPagination() {
        return pagination;
    }

    public void setPagination(boolean pagination) {
        this.pagination = pagination;
    }

    /**
     * 获得起始记录的下标
     *
     * @return
     */
    public int getStartIndex() {
        return (this.page - 1) * this.rows;
    }

    @Override
    public String toString() {
        return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
    }

}