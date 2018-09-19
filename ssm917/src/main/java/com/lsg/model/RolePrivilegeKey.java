package com.lsg.model;
 import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * role_privilege
 * @author
 */
@Repository
 public class RolePrivilegeKey implements Serializable {
    private Integer pId;

    private Integer rId;

    private static final long serialVersionUID = 1L;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
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
        RolePrivilegeKey other = (RolePrivilegeKey) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", rId=").append(rId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}