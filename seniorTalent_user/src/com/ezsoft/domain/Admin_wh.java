package com.ezsoft.domain;

public class Admin_wh {
    private Short keytype;

    private Short keycode;

    private String keyword;

    private String descr;

    private Short keyorder;

    private Short keydel;

    private Short keymanid;

    private String ysd_valueStr;

    public Short getKeytype() {
        return keytype;
    }

    public void setKeytype(Short keytype) {
        this.keytype = keytype;
    }

    public Short getKeycode() {
        return keycode;
    }

    public void setKeycode(Short keycode) {
        this.keycode = keycode;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public Short getKeyorder() {
        return keyorder;
    }

    public void setKeyorder(Short keyorder) {
        this.keyorder = keyorder;
    }

    public Short getKeydel() {
        return keydel;
    }

    public void setKeydel(Short keydel) {
        this.keydel = keydel;
    }

    public Short getKeymanid() {
        return keymanid;
    }

    public void setKeymanid(Short keymanid) {
        this.keymanid = keymanid;
    }

    public String getYsd_valueStr() {
        return ysd_valueStr;
    }

    public void setYsd_valueStr(String ysd_valueStr) {
        this.ysd_valueStr = ysd_valueStr == null ? null : ysd_valueStr.trim();
    }
}