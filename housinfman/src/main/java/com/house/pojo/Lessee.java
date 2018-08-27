package com.house.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * lessee
 * @author DinGYun
 */
public class Lessee implements Serializable {
    private Integer lId;

    private String lName;

    private String lTel;

    private String lSex;

    private String lNativeplace;

    private String lIdcard;

    private Date lAddtime;

    private static final long serialVersionUID = 1L;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlTel() {
        return lTel;
    }

    public void setlTel(String lTel) {
        this.lTel = lTel;
    }

    public String getlSex() {
        return lSex;
    }

    public void setlSex(String lSex) {
        this.lSex = lSex;
    }

    public String getlNativeplace() {
        return lNativeplace;
    }

    public void setlNativeplace(String lNativeplace) {
        this.lNativeplace = lNativeplace;
    }

    public String getlIdcard() {
        return lIdcard;
    }

    public void setlIdcard(String lIdcard) {
        this.lIdcard = lIdcard;
    }

    public Date getlAddtime() {
        return lAddtime;
    }

    public void setlAddtime(Date lAddtime) {
        this.lAddtime = lAddtime;
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
        Lessee other = (Lessee) that;
        return (this.getlId() == null ? other.getlId() == null : this.getlId().equals(other.getlId()))
            && (this.getlName() == null ? other.getlName() == null : this.getlName().equals(other.getlName()))
            && (this.getlTel() == null ? other.getlTel() == null : this.getlTel().equals(other.getlTel()))
            && (this.getlSex() == null ? other.getlSex() == null : this.getlSex().equals(other.getlSex()))
            && (this.getlNativeplace() == null ? other.getlNativeplace() == null : this.getlNativeplace().equals(other.getlNativeplace()))
            && (this.getlIdcard() == null ? other.getlIdcard() == null : this.getlIdcard().equals(other.getlIdcard()))
            && (this.getlAddtime() == null ? other.getlAddtime() == null : this.getlAddtime().equals(other.getlAddtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getlId() == null) ? 0 : getlId().hashCode());
        result = prime * result + ((getlName() == null) ? 0 : getlName().hashCode());
        result = prime * result + ((getlTel() == null) ? 0 : getlTel().hashCode());
        result = prime * result + ((getlSex() == null) ? 0 : getlSex().hashCode());
        result = prime * result + ((getlNativeplace() == null) ? 0 : getlNativeplace().hashCode());
        result = prime * result + ((getlIdcard() == null) ? 0 : getlIdcard().hashCode());
        result = prime * result + ((getlAddtime() == null) ? 0 : getlAddtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lId=").append(lId);
        sb.append(", lName=").append(lName);
        sb.append(", lTel=").append(lTel);
        sb.append(", lSex=").append(lSex);
        sb.append(", lNativeplace=").append(lNativeplace);
        sb.append(", lIdcard=").append(lIdcard);
        sb.append(", lAddtime=").append(lAddtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}