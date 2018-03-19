package com.kriss.cms.mybatis.dto;

import java.util.Date;

public class CarRegist {
    private Integer id;

    private String username;

    private String phone;

    private String cartype;

    private String zone;

    private Date registtime;

    private String registip;

    public CarRegist(){}

    public CarRegist(String username, String phone, String cartype, String zone, Date registtime, String registip) {
        this.username = username;
        this.phone = phone;
        this.cartype = cartype;
        this.zone = zone;
        this.registtime = registtime;
        this.registip = registip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public String getRegistip() {
        return registip;
    }

    public void setRegistip(String registip) {
        this.registip = registip == null ? null : registip.trim();
    }
}