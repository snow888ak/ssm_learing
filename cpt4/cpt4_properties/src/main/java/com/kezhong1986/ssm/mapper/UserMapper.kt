package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.User

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/2/24 22:23
 */
interface UserMapper {

    fun countUserByFirstName(firstName: String): Int

    fun addUser(user: User)

    fun updateUser(user: User)

    fun deleteUser(id: Int)

    fun queryUser(id: Int): User

    fun queryAll(): List<User>
}