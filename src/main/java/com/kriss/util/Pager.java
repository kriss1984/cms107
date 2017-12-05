package com.kriss.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kriss on 2017/6/22.
 * <p>
 * 分页封装
 */
public class Pager {

    Map conditions = new HashMap();
    private int page = 1;//当前页
    private int total; //总页数
    private int records;//总记录数
    private List rows;//实际数据

    private String sidx;//排序字段
    private String sord;//  排序规则   asc   desc


    private int pageSize = 15;//每页显示数
    private int start;//mysql 中从何位置开始查
    private long timeUsed; //查询用时


    private int pageDvideNum = 5;

    public int getStart() {
        return (page - 1) * pageSize;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPage() {

        if (page > total)
            return total;
        else
            return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
        this.total = (records + pageSize - 1) / pageSize;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public Map getConditions() {
        return conditions;
    }

    public void setConditions(Map conditions) {
        this.conditions = conditions;
    }

    public long getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(long timeUsed) {
        this.timeUsed = timeUsed;
    }

    public String getBootstrapPager() {
        String pageStr = "";
        if (records != 0) {
            pageStr = "<div class=\"btn-group\">\n" +
                    "    <button type=\"button\" class=\"btn btn-white\" onclick='prePage()'><i class=\"fa fa-chevron-left\"></i>\n" +
                    "    </button>\n";
            int divides = (total + pageDvideNum) / pageDvideNum;
            int currentDivide = (page + pageDvideNum) / pageDvideNum;
            int start = (currentDivide - 1) * pageDvideNum + 1;
            int end = start + pageDvideNum;
            if (total < pageDvideNum)
                end = total;
            else
                end = end - 1;
            for (int i = start; i <= end; i++) {
                if (i == page)
                    pageStr += "<button class=\"btn btn-white active\" onclick='goPage(" + i + ")'>" + i + "</button>\n";
                else
                    pageStr += "<button class=\"btn btn-white \" onclick='goPage(" + i + ")'>" + i + "</button>\n";
            }
            pageStr += "<button type=\"button\" class=\"btn btn-white\" onclick='nextPage()'><i class=\"fa fa-chevron-right\"></i></button><div>共" + total + "页" + records + "条记录</div></div>";
           // pageStr += "<div>共" + total + "页" + records + "条记录</div>";
        } else
            pageStr = "未查到数据";
        return pageStr;
    }


}
