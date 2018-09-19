package com.lsg.model;
 import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * privilege
 * @author
 */
@Repository
 public class Privilege implements Serializable {
    private Integer pId;

    private String pSourceurl;

    private String pSourcename;

    private String pName;

    private static final long serialVersionUID = 1L;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpSourceurl() {
        return pSourceurl;
    }

    public void setpSourceurl(String pSourceurl) {
        this.pSourceurl = pSourceurl;
    }

    public String getpSourcename() {
        return pSourcename;
    }

    public void setpSourcename(String pSourcename) {
        this.pSourcename = pSourcename;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
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
        Privilege other = (Privilege) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getpSourceurl() == null ? other.getpSourceurl() == null : this.getpSourceurl().equals(other.getpSourceurl()))
            && (this.getpSourcename() == null ? other.getpSourcename() == null : this.getpSourcename().equals(other.getpSourcename()))
            && (this.getpName() == null ? other.getpName() == null : this.getpName().equals(other.getpName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getpSourceurl() == null) ? 0 : getpSourceurl().hashCode());
        result = prime * result + ((getpSourcename() == null) ? 0 : getpSourcename().hashCode());
        result = prime * result + ((getpName() == null) ? 0 : getpName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pSourceurl=").append(pSourceurl);
        sb.append(", pSourcename=").append(pSourcename);
        sb.append(", pName=").append(pName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}