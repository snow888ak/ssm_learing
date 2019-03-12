package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Role

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/12 0:34
 */
interface RoleMapper {

    fun getRole(id: Long): Role

    fun getRol2(id: Long): Role

    fun findRoleByUser(userId: Long): List<Role>
}