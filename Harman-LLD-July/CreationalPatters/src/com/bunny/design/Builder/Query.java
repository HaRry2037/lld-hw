package com.bunny.design.Builder;

public class Query {
    private String select;
    private String where;
    private String tabeleName;
    private String groupby;
    private String orderby;
    private String query;

    public String getQuery(){
        return this.query;
    }
    public void SetQuery(String query){
        this.query=query;

    }



    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getTabeleName() {
        return tabeleName;
    }

    public void setTabeleName(String tabeleName) {
        this.tabeleName = tabeleName;
    }

    public String getGroupby() {
        return groupby;
    }

    public void setGroupby(String groupby) {
        this.groupby = groupby;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }




}
