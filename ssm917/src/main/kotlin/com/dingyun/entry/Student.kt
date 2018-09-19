package com.dingyun.entry

class Student(var userName: String?, var userId: String?, var userPassword: String?, var userSex: String?) {

    override fun toString(): String {
        return "Student{" +
                "userName='" + userName + '\''.toString() +
                ", userId='" + userId + '\''.toString() +
                ", userPassword='" + userPassword + '\''.toString() +
                ", userSex='" + userSex + '\''.toString() +
                '}'.toString()
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is Student) return false

        val strudent = o as Student?

        if (if (userName != null) userName != strudent!!.userName else strudent!!.userName != null) return false
        if (if (userId != null) userId != strudent.userId else strudent.userId != null) return false
        if (if (userPassword != null) userPassword != strudent.userPassword else strudent.userPassword != null)
            return false
        return if (userSex != null) userSex == strudent.userSex else strudent.userSex == null
    }

    override fun hashCode(): Int {
        var result = if (userName != null) userName!!.hashCode() else 0
        result = 31 * result + if (userId != null) userId!!.hashCode() else 0
        result = 31 * result + if (userPassword != null) userPassword!!.hashCode() else 0
        result = 31 * result + if (userSex != null) userSex!!.hashCode() else 0
        return result
    }

    fun aa(): String {
        println(userId)
        return userId.toString()
    }
}
