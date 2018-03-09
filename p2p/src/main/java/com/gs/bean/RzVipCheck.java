package com.gs.bean;

import java.util.Date;

//认证审核表
public class RzVipCheck {
    private Long rcid;

    private Long uid;//用户id

    private Long huid;//审核id

    private Byte isok;//审核是否通过，0通过，1未通过

    private String excute;//理由

    private Date date;//审核时间

    public RzVipCheck(Long rcid, Long uid, Long huid, Byte isok, String excute, Date date) {
        this.rcid = rcid;
        this.uid = uid;
        this.huid = huid;
        this.isok = isok;
        this.excute = excute;
        this.date = date;
    }

    public RzVipCheck() {
        super();
    }

    public Long getRcid() {
        return rcid;
    }

    public void setRcid(Long rcid) {
        this.rcid = rcid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getHuid() {
        return huid;
    }

    public void setHuid(Long huid) {
        this.huid = huid;
    }

    public Byte getIsok() {
        return isok;
    }

    public void setIsok(Byte isok) {
        this.isok = isok;
    }

    public String getExcute() {
        return excute;
    }

    public void setExcute(String excute) {
        this.excute = excute == null ? null : excute.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}