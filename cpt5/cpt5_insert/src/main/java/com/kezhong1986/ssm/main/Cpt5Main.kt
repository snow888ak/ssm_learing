package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.Role2Mapper
import com.kezhong1986.ssm.mapper.RoleMapper
import com.kezhong1986.ssm.pojo.Role
import com.kezhong1986.ssm.pojo.Role2
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
//        insertRoleCustomPK()
        insertRole2()
    }

    @JvmStatic
    fun insertRole() {

        val session = SessionUtil.openSession()
        val roleMapper = session.getMapper(RoleMapper::class.java)

        val role = Role("一体办_操作员", "一体办")
        println(role)
        val count: Int = roleMapper.insertRole(role)
        println(count)
        println(role)

        session.commit()
    }

    @JvmStatic
    fun insertRoleCustomPK() {

        val session = SessionUtil.openSession()
        val roleMapper = session.getMapper(RoleMapper::class.java)

        val role = Role("人社局_操作员", "人社局")
        println(role)
        roleMapper.insertRoleCustomPK(role)
        println(role)

        session.commit()
    }

    @JvmStatic
    fun insertRole2() {

        val session = SessionUtil.openSession()
        val role2Mapper = session.getMapper(Role2Mapper::class.java)

        val role = Role2(null, "人社局_操作员", null)
        println(role)
        role2Mapper.insertRole2(role)
        println(role)

        session.commit()
    }

}