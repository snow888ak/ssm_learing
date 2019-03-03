package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Role

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:14
 */
interface RoleMapper {

    fun getRoleUseResultMap(id: Long): Role

}