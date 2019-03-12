package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.User


/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/12 0:38
 */
interface UserMapper {

    fun getUser(id: Long): User

    fun findUserByRole(roleId: Long): List<User>

}