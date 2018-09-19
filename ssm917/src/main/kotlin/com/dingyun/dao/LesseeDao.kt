package com.dingyun.dao

import com.dingyun.entry.Lessee

interface LesseeDao{
    fun findAll():List<Lessee>
    fun addOne(lessee: Lessee):List<Lessee>
    fun updataById():Boolean
    fun deleteById():Boolean
    fun selectById():Lessee?
}