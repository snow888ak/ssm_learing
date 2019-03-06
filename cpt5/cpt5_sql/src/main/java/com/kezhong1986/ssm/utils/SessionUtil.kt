package com.kezhong1986.ssm.utils

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/27 0:24
 */
object SessionUtil {

    private val factory : SqlSessionFactory

    init {
        val inputStream = Resources.getResourceAsStream("mybatis-config.xml")
        factory = SqlSessionFactoryBuilder().build(inputStream)
    }

    fun openSession(): SqlSession = factory.openSession()

}