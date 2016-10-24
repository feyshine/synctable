package com.yeecare.slave.pojo;

import java.util.Date;

public class UserDevice {
    private String cId;

    private String cUid;

    private String cDid;

    private Integer cIsdelete;

    private Date cBindtime;

    private String cCreator;

    private Date cCreatetime;

    private String cChanger;

    private Date cChangetime;

    private String cRemark;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcUid() {
        return cUid;
    }

    public void setcUid(String cUid) {
        this.cUid = cUid == null ? null : cUid.trim();
    }

    public String getcDid() {
        return cDid;
    }

    public void setcDid(String cDid) {
        this.cDid = cDid == null ? null : cDid.trim();
    }

    public Integer getcIsdelete() {
        return cIsdelete;
    }

    public void setcIsdelete(Integer cIsdelete) {
        this.cIsdelete = cIsdelete;
    }

    public Date getcBindtime() {
        return cBindtime;
    }

    public void setcBindtime(Date cBindtime) {
        this.cBindtime = cBindtime;
    }

    public String getcCreator() {
        return cCreator;
    }

    public void setcCreator(String cCreator) {
        this.cCreator = cCreator == null ? null : cCreator.trim();
    }

    public Date getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(Date cCreatetime) {
        this.cCreatetime = cCreatetime;
    }

    public String getcChanger() {
        return cChanger;
    }

    public void setcChanger(String cChanger) {
        this.cChanger = cChanger == null ? null : cChanger.trim();
    }

    public Date getcChangetime() {
        return cChangetime;
    }

    public void setcChangetime(Date cChangetime) {
        this.cChangetime = cChangetime;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }
}