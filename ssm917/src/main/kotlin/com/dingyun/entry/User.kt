package com.dingyun.entry

import java.io.Serializable

/**
 * user
 * @author
 */
class User : Serializable {
    private var uId: Int? = null

    private var uStatus: String? = null

    private var uTel: String? = null

    private var uName: String? = null

    private var uPassword: String? = null

    private var uUsername: Int? = null



    companion object {

        private const val serialVersionUID = 1L
    }

    override fun toString(): String {
        return "User(uId=$uId, uStatus=$uStatus, uTel=$uTel, uName=$uName, uPassword=$uPassword, uUsername=$uUsername)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (uId != other.uId) return false
        if (uStatus != other.uStatus) return false
        if (uTel != other.uTel) return false
        if (uName != other.uName) return false
        if (uPassword != other.uPassword) return false
        if (uUsername != other.uUsername) return false

        return true
    }

    override fun hashCode(): Int {
        var result = uId ?: 0
        result = 31 * result + (uStatus?.hashCode() ?: 0)
        result = 31 * result + (uTel?.hashCode() ?: 0)
        result = 31 * result + (uName?.hashCode() ?: 0)
        result = 31 * result + (uPassword?.hashCode() ?: 0)
        result = 31 * result + (uUsername ?: 0)
        return result
    }

}