package com.house.pojo;

import java.io.Serializable;

/**
 * role
 * @author DinGYun
 */
public class Role implements Serializable {
    private Integer rId;

    private String rDesc;

    private String rName;

    private static final long serialVersionUID = 1L;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrDesc() {
        return rDesc;
    }

    public void setrDesc(String rDesc) {
        this.rDesc = rDesc;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
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
        Role other = (Role) that;
        return (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()))
            && (this.getrDesc() == null ? other.getrDesc() == null : this.getrDesc().equals(other.getrDesc()))
            && (this.getrName() == null ? other.getrName() == null : this.getrName().equals(other.getrName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        result = prime * result + ((getrDesc() == null) ? 0 : getrDesc().hashCode());
        result = prime * result + ((getrName() == null) ? 0 : getrName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", rDesc=").append(rDesc);
        sb.append(", rName=").append(rName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}