package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.RoleMapper
import com.kezhong1986.ssm.pojo.Role
import com.kezhong1986.ssm.pojo.RoleParams
import com.kezhong1986.ssm.utils.SessionUtil

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 23:51
 */
object Cpt5Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        insertRole()
        getRole()
    }

    @JvmStatic
    fun insertRole() {

        SessionUtil.openSession().also {
            val mapper = it.getMapper(RoleMapper::class.java)
            mapper.insertRole(Role("一体办_领导", "一体办"))
            it.commit()
        }

    }

    @JvmStatic
    fun getRole() {
        SessionUtil.openSession().getMapper(RoleMapper::class.java).let {
            println(it.getRole(20))
            println(it.getRole2(20))
        }
    }

}