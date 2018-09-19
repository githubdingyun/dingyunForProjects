package com.dingyun.entry

import java.io.Serializable
import java.util.*

/**
 * lessee
 * @author DinGYun
 */
class Lessee : Serializable {
    private var lId: Int? = null

    private var lName: String? = null

    private var lTel: String? = null

    private var lSex: String? = null

    private var lNativeplace: String? = null

    private var lIdcard: String? = null

    private var lAddtime: Date? = null

    fun getlId(): Int? {
        return lId
    }

    fun setlId(lId: Int?) {
        this.lId = lId
    }

    fun getlName(): String? {
        return lName
    }

    fun setlName(lName: String) {
        this.lName = lName
    }

    fun getlTel(): String? {
        return lTel
    }

    fun setlTel(lTel: String) {
        this.lTel = lTel
    }

    fun getlSex(): String? {
        return lSex
    }

    fun setlSex(lSex: String) {
        this.lSex = lSex
    }

    fun getlNativeplace(): String? {
        return lNativeplace
    }

    fun setlNativeplace(lNativeplace: String) {
        this.lNativeplace = lNativeplace
    }

    fun getlIdcard(): String? {
        return lIdcard
    }

    fun setlIdcard(lIdcard: String) {
        this.lIdcard = lIdcard
    }

    fun getlAddtime(): Date? {
        return lAddtime
    }

    fun setlAddtime(lAddtime: Date) {
        this.lAddtime = lAddtime
    }

    override fun equals(that: Any?): Boolean {
        if (this === that) {
            return true
        }
        if (that == null) {
            return false
        }
        if (javaClass != that.javaClass) {
            return false
        }
        val other = that as Lessee?
        return ((if (this.getlId() == null) other!!.getlId() == null else this.getlId() == other!!.getlId())
                && (if (this.getlName() == null) other.getlName() == null else this.getlName() == other.getlName())
                && (if (this.getlTel() == null) other.getlTel() == null else this.getlTel() == other.getlTel())
                && (if (this.getlSex() == null) other.getlSex() == null else this.getlSex() == other.getlSex())
                && (if (this.getlNativeplace() == null) other.getlNativeplace() == null else this.getlNativeplace() == other.getlNativeplace())
                && (if (this.getlIdcard() == null) other.getlIdcard() == null else this.getlIdcard() == other.getlIdcard())
                && if (this.getlAddtime() == null) other.getlAddtime() == null else this.getlAddtime() == other.getlAddtime())
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (getlId() == null) 0 else getlId()!!.hashCode()
        result = prime * result + if (getlName() == null) 0 else getlName()!!.hashCode()
        result = prime * result + if (getlTel() == null) 0 else getlTel()!!.hashCode()
        result = prime * result + if (getlSex() == null) 0 else getlSex()!!.hashCode()
        result = prime * result + if (getlNativeplace() == null) 0 else getlNativeplace()!!.hashCode()
        result = prime * result + if (getlIdcard() == null) 0 else getlIdcard()!!.hashCode()
        result = prime * result + if (getlAddtime() == null) 0 else getlAddtime()!!.hashCode()
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(javaClass.simpleName)
        sb.append(" [")
        sb.append("Hash = ").append(hashCode())
        sb.append(", lId=").append(lId)
        sb.append(", lName=").append(lName)
        sb.append(", lTel=").append(lTel)
        sb.append(", lSex=").append(lSex)
        sb.append(", lNativeplace=").append(lNativeplace)
        sb.append(", lIdcard=").append(lIdcard)
        sb.append(", lAddtime=").append(lAddtime)
        sb.append(", serialVersionUID=").append(serialVersionUID)
        sb.append("]")
        return sb.toString()
    }

    companion object {

        private const val serialVersionUID = 1L
    }
}