package com.house.pojo;

import java.io.Serializable;

/**
 * user
 * @author
 */
public class User implements Serializable {
    private Integer uId;

    private String uStatus;

    private String uTel;

    private String uName;

    private String uPassword;

    private Integer uUsername;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuStatus() {
        return uStatus;
    }

    public void setuStatus(String uStatus) {
        this.uStatus = uStatus;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuUsername() {
        return uUsername;
    }

    public void setuUsername(Integer uUsername) {
        this.uUsername = uUsername;
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
        User other = (User) that;
        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getuStatus() == null ? other.getuStatus() == null : this.getuStatus().equals(other.getuStatus()))
            && (this.getuTel() == null ? other.getuTel() == null : this.getuTel().equals(other.getuTel()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()))
            && (this.getuUsername() == null ? other.getuUsername() == null : this.getuUsername().equals(other.getuUsername()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getuStatus() == null) ? 0 : getuStatus().hashCode());
        result = prime * result + ((getuTel() == null) ? 0 : getuTel().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        result = prime * result + ((getuUsername() == null) ? 0 : getuUsername().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uStatus=").append(uStatus);
        sb.append(", uTel=").append(uTel);
        sb.append(", uName=").append(uName);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uUsername=").append(uUsername);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}