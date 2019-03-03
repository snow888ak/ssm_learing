package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.RoleMapper
import com.kezhong1986.ssm.pojo.PageParams
import com.kezhong1986.ssm.pojo.RoleParams
import com.kezhong1986.ssm.utils.SessionUtil

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:19
 */
object Cpt5Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val session = SessionUtil.openSession()
        val roleMapper = session.getMapper(RoleMapper::class.java)

        roleMapper.findRolesByMap(mapOf(Pair("roleName", "管理"), Pair("note", ""))).let {
            println(it)
        }

        roleMapper.findRolesByAnnotation("收", "").let {
            println(it)
        }

        roleMapper.findRolesByBean(RoleParams("办", "")).let {
            println(it)
        }

        roleMapper.findRolesByMix(RoleParams("员", ""), PageParams(5, 5)).let {
            println(it)
        }
    }
}
