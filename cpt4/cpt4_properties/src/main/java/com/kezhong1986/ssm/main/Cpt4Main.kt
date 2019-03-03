package com.kezhong1986.ssm.main

import com.kezhong1986.ssm.mapper.UserMapper
import com.kezhong1986.ssm.pojo.User
import com.kezhong1986.ssm.utils.SessionUtil
import java.io.IOException

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/24 22:30
 */
object Cpt4Main {

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        queryUser()
//        updateUser()
//        val total = userMapper.countUserByFirstName("张")
//        println(total)
//        session.close()
    }

    private fun addUser() {
        val session = SessionUtil.openSession()
        val userMapper = session.getMapper(UserMapper::class.java)
        println(userMapper.queryAll())
        userMapper.addUser(User(null, "zs", "123456", "男", "13300000001"))
        session.commit()
        println(userMapper.queryAll())
    }

    private fun deleteUser() {
        val session = SessionUtil.openSession()
        val userMapper = session.getMapper(UserMapper::class.java)
        println(userMapper.queryAll())
        userMapper.deleteUser(1)
        session.commit()
        println(userMapper.queryAll())
    }

    private fun queryUser() {
        val userMapper = getMapper()
        println(userMapper.queryUser(3))
    }

    private fun updateUser() {
        val session = SessionUtil.openSession()
        val userMapper = session.getMapper(UserMapper::class.java)
        val user = userMapper.queryUser(3)
        println(userMapper.queryUser(3))
        user.userName = "ww"
        user.sex = "女"
        userMapper.updateUser(user)
        session.commit()
        println(userMapper.queryUser(3))
    }

    private fun getMapper(): UserMapper = SessionUtil.openSession().getMapper(UserMapper::class.java)
}

