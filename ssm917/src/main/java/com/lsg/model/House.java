package com.lsg.model;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * house
 * @author
 */
@Repository
 public class House implements Serializable {
    private Integer hId;

    private String hArea;

    private String hEstate;

    private String hUnitnumber;

    private Integer hFloor;

    private String hRoomno;

    private String hAcreage;

    private String hDirection;

    private String hFitment;

    private Boolean hIsdoubleair;

    private Integer hLimit;

    private String hFacility;

    private Double hPrice;

    private Integer hStatus;

    private String hImg;

    private String hAddress;

    private Date hAddtime;

    private Date hUpdatetime;

    private static final long serialVersionUID = 1L;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethArea() {
        return hArea;
    }

    public void sethArea(String hArea) {
        this.hArea = hArea;
    }

    public String gethEstate() {
        return hEstate;
    }

    public void sethEstate(String hEstate) {
        this.hEstate = hEstate;
    }

    public String gethUnitnumber() {
        return hUnitnumber;
    }

    public void sethUnitnumber(String hUnitnumber) {
        this.hUnitnumber = hUnitnumber;
    }

    public Integer gethFloor() {
        return hFloor;
    }

    public void sethFloor(Integer hFloor) {
        this.hFloor = hFloor;
    }

    public String gethRoomno() {
        return hRoomno;
    }

    public void sethRoomno(String hRoomno) {
        this.hRoomno = hRoomno;
    }

    public String gethAcreage() {
        return hAcreage;
    }

    public void sethAcreage(String hAcreage) {
        this.hAcreage = hAcreage;
    }

    public String gethDirection() {
        return hDirection;
    }

    public void sethDirection(String hDirection) {
        this.hDirection = hDirection;
    }

    public String gethFitment() {
        return hFitment;
    }

    public void sethFitment(String hFitment) {
        this.hFitment = hFitment;
    }

    public Boolean gethIsdoubleair() {
        return hIsdoubleair;
    }

    public void sethIsdoubleair(Boolean hIsdoubleair) {
        this.hIsdoubleair = hIsdoubleair;
    }

    public Integer gethLimit() {
        return hLimit;
    }

    public void sethLimit(Integer hLimit) {
        this.hLimit = hLimit;
    }

    public String gethFacility() {
        return hFacility;
    }

    public void sethFacility(String hFacility) {
        this.hFacility = hFacility;
    }

    public Double gethPrice() {
        return hPrice;
    }

    public void sethPrice(Double hPrice) {
        this.hPrice = hPrice;
    }

    public Integer gethStatus() {
        return hStatus;
    }

    public void sethStatus(Integer hStatus) {
        this.hStatus = hStatus;
    }

    public String gethImg() {
        return hImg;
    }

    public void sethImg(String hImg) {
        this.hImg = hImg;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public Date gethAddtime() {
        return hAddtime;
    }

    public void sethAddtime(Date hAddtime) {
        this.hAddtime = hAddtime;
    }

    public Date gethUpdatetime() {
        return hUpdatetime;
    }

    public void sethUpdatetime(Date hUpdatetime) {
        this.hUpdatetime = hUpdatetime;
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
        House other = (House) that;
        return (this.gethId() == null ? other.gethId() == null : this.gethId().equals(other.gethId()))
            && (this.gethArea() == null ? other.gethArea() == null : this.gethArea().equals(other.gethArea()))
            && (this.gethEstate() == null ? other.gethEstate() == null : this.gethEstate().equals(other.gethEstate()))
            && (this.gethUnitnumber() == null ? other.gethUnitnumber() == null : this.gethUnitnumber().equals(other.gethUnitnumber()))
            && (this.gethFloor() == null ? other.gethFloor() == null : this.gethFloor().equals(other.gethFloor()))
            && (this.gethRoomno() == null ? other.gethRoomno() == null : this.gethRoomno().equals(other.gethRoomno()))
            && (this.gethAcreage() == null ? other.gethAcreage() == null : this.gethAcreage().equals(other.gethAcreage()))
            && (this.gethDirection() == null ? other.gethDirection() == null : this.gethDirection().equals(other.gethDirection()))
            && (this.gethFitment() == null ? other.gethFitment() == null : this.gethFitment().equals(other.gethFitment()))
            && (this.gethIsdoubleair() == null ? other.gethIsdoubleair() == null : this.gethIsdoubleair().equals(other.gethIsdoubleair()))
            && (this.gethLimit() == null ? other.gethLimit() == null : this.gethLimit().equals(other.gethLimit()))
            && (this.gethFacility() == null ? other.gethFacility() == null : this.gethFacility().equals(other.gethFacility()))
            && (this.gethPrice() == null ? other.gethPrice() == null : this.gethPrice().equals(other.gethPrice()))
            && (this.gethStatus() == null ? other.gethStatus() == null : this.gethStatus().equals(other.gethStatus()))
            && (this.gethImg() == null ? other.gethImg() == null : this.gethImg().equals(other.gethImg()))
            && (this.gethAddress() == null ? other.gethAddress() == null : this.gethAddress().equals(other.gethAddress()))
            && (this.gethAddtime() == null ? other.gethAddtime() == null : this.gethAddtime().equals(other.gethAddtime()))
            && (this.gethUpdatetime() == null ? other.gethUpdatetime() == null : this.gethUpdatetime().equals(other.gethUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gethId() == null) ? 0 : gethId().hashCode());
        result = prime * result + ((gethArea() == null) ? 0 : gethArea().hashCode());
        result = prime * result + ((gethEstate() == null) ? 0 : gethEstate().hashCode());
        result = prime * result + ((gethUnitnumber() == null) ? 0 : gethUnitnumber().hashCode());
        result = prime * result + ((gethFloor() == null) ? 0 : gethFloor().hashCode());
        result = prime * result + ((gethRoomno() == null) ? 0 : gethRoomno().hashCode());
        result = prime * result + ((gethAcreage() == null) ? 0 : gethAcreage().hashCode());
        result = prime * result + ((gethDirection() == null) ? 0 : gethDirection().hashCode());
        result = prime * result + ((gethFitment() == null) ? 0 : gethFitment().hashCode());
        result = prime * result + ((gethIsdoubleair() == null) ? 0 : gethIsdoubleair().hashCode());
        result = prime * result + ((gethLimit() == null) ? 0 : gethLimit().hashCode());
        result = prime * result + ((gethFacility() == null) ? 0 : gethFacility().hashCode());
        result = prime * result + ((gethPrice() == null) ? 0 : gethPrice().hashCode());
        result = prime * result + ((gethStatus() == null) ? 0 : gethStatus().hashCode());
        result = prime * result + ((gethImg() == null) ? 0 : gethImg().hashCode());
        result = prime * result + ((gethAddress() == null) ? 0 : gethAddress().hashCode());
        result = prime * result + ((gethAddtime() == null) ? 0 : gethAddtime().hashCode());
        result = prime * result + ((gethUpdatetime() == null) ? 0 : gethUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hId=").append(hId);
        sb.append(", hArea=").append(hArea);
        sb.append(", hEstate=").append(hEstate);
        sb.append(", hUnitnumber=").append(hUnitnumber);
        sb.append(", hFloor=").append(hFloor);
        sb.append(", hRoomno=").append(hRoomno);
        sb.append(", hAcreage=").append(hAcreage);
        sb.append(", hDirection=").append(hDirection);
        sb.append(", hFitment=").append(hFitment);
        sb.append(", hIsdoubleair=").append(hIsdoubleair);
        sb.append(", hLimit=").append(hLimit);
        sb.append(", hFacility=").append(hFacility);
        sb.append(", hPrice=").append(hPrice);
        sb.append(", hStatus=").append(hStatus);
        sb.append(", hImg=").append(hImg);
        sb.append(", hAddress=").append(hAddress);
        sb.append(", hAddtime=").append(hAddtime);
        sb.append(", hUpdatetime=").append(hUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}