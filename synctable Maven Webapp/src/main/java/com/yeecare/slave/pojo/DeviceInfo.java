package com.yeecare.slave.pojo;

import java.util.Date;

public class DeviceInfo {
    private String cId;

    private String cName;

    private String cCode;

    private String cType;

    private String cNumber;

    private String cFactory;

    private String cIeme;

    private String cOthercode;

    private Integer cIsdelete;

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber == null ? null : cNumber.trim();
    }

    public String getcFactory() {
        return cFactory;
    }

    public void setcFactory(String cFactory) {
        this.cFactory = cFactory == null ? null : cFactory.trim();
    }

    public String getcIeme() {
        return cIeme;
    }

    public void setcIeme(String cIeme) {
        this.cIeme = cIeme == null ? null : cIeme.trim();
    }

    public String getcOthercode() {
        return cOthercode;
    }

    public void setcOthercode(String cOthercode) {
        this.cOthercode = cOthercode == null ? null : cOthercode.trim();
    }

    public Integer getcIsdelete() {
        return cIsdelete;
    }

    public void setcIsdelete(Integer cIsdelete) {
        this.cIsdelete = cIsdelete;
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