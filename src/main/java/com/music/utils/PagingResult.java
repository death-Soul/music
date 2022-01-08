package com.music.utils;

/**
 * 本类作者是：贾伟杰
 * 创建于2021/8/31
 * 此类的作用是：xxxx
 */
public class PagingResult {

    private Object data;


    private int maxPage;


    private long total;


    public Object getData() {

        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "PagingResult{" +
                "data=" + data +
                ", maxPage=" + maxPage +
                ", total=" + total +
                '}';
    }
}
