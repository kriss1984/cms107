package com.kriss.cms.mybatis.dto;

import java.util.Date;

public class CrmRegiste {
    private String uuid;

    private String regName;

    private String regPhone;

    private String jiancai;

    private String jiadian;

    private String zhuangxiugs;

    private Boolean jiaquanjc;

    private Date regTime;

    private String regSource;


    public CrmRegiste(){}

    public CrmRegiste(String regName, String regPhone) {
        this.regName = regName;
        this.regPhone = regPhone;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName == null ? null : regName.trim();
    }

    public String getRegPhone() {
        return regPhone;
    }

    public void setRegPhone(String regPhone) {
        this.regPhone = regPhone == null ? null : regPhone.trim();
    }

    public String getJiancai() {
        return jiancai;
    }

    public void setJiancai(String jiancai) {
        this.jiancai = jiancai == null ? null : jiancai.trim();
    }

    public String getJiadian() {
        return jiadian;
    }

    public void setJiadian(String jiadian) {
        this.jiadian = jiadian == null ? null : jiadian.trim();
    }

    public String getZhuangxiugs() {
        return zhuangxiugs;
    }

    public void setZhuangxiugs(String zhuangxiugs) {
        this.zhuangxiugs = zhuangxiugs == null ? null : zhuangxiugs.trim();
    }

    public Boolean getJiaquanjc() {
        return jiaquanjc;
    }

    public void setJiaquanjc(Boolean jiaquanjc) {
        this.jiaquanjc = jiaquanjc;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegSource() {
        return regSource;
    }

    public void setRegSource(String regSource) {
        this.regSource = regSource == null ? null : regSource.trim();
    }
}