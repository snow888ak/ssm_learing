package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.RoleMapper
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
        val session = SessionUtil.openSession()
        val roleMapper = session.getMapper(RoleMapper::class.java)

        val role = roleMapper.getRoleUseResultMap(1)

        println("rId=${role.rId}, rName=${role.rName}, rNote=${role.rNote}")
    }

}