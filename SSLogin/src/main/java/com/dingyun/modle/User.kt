package com.dingyun.modle


class User {

    var name: String? = null
    var password: String? = null

    constructor(name: String, password: String) {
        this.name = name
        this.password = password
    }

    constructor() {}

    override fun toString(): String {
        return "User{" +
                "name='" + name + '\''.toString() +
                ", password='" + password + '\''.toString() +
                '}'.toString()
    }




}
