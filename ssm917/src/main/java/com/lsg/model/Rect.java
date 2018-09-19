package com.lsg.model;
 import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * rect
 * @author
 */
@Repository
 public class Rect implements Serializable {
    private Integer rId;

    private Integer hId;

    private Integer lId;

    private Double rMoney;

    private Date rTime;

    private String rRemark;

    private static final long serialVersionUID = 1L;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Double getrMoney() {
        return rMoney;
    }

    public void setrMoney(Double rMoney) {
        this.rMoney = rMoney;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public String getrRemark() {
        return rRemark;
    }

    public void setrRemark(String rRemark) {
        this.rRemark = rRemark;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Rect other = (Rect) that;
        return (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()))
            && (this.gethId() == null ? other.gethId() == null : this.gethId().equals(other.gethId()))
            && (this.getlId() == null ? other.getlId() == null : this.getlId().equals(other.getlId()))
            && (this.getrMoney() == null ? other.getrMoney() == null : this.getrMoney().equals(other.getrMoney()))
            && (this.getrTime() == null ? other.getrTime() == null : this.getrTime().equals(other.getrTime()))
            && (this.getrRemark() == null ? other.getrRemark() == null : this.getrRemark().equals(other.getrRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        result = prime * result + ((gethId() == null) ? 0 : gethId().hashCode());
        result = prime * result + ((getlId() == null) ? 0 : getlId().hashCode());
        result = prime * result + ((getrMoney() == null) ? 0 : getrMoney().hashCode());
        result = prime * result + ((getrTime() == null) ? 0 : getrTime().hashCode());
        result = prime * result + ((getrRemark() == null) ? 0 : getrRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", hId=").append(hId);
        sb.append(", lId=").append(lId);
        sb.append(", rMoney=").append(rMoney);
        sb.append(", rTime=").append(rTime);
        sb.append(", rRemark=").append(rRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}