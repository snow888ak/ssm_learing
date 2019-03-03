package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.RoleMapper
import com.kezhong1986.ssm.pojo.RoleParams
import com.kezhong1986.ssm.utils.SessionUtil
import org.apache.ibatis.session.RowBounds

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

        println(roleMapper.findByRowBounds(RowBounds(5, 5), RoleParams("员")))
    }

}