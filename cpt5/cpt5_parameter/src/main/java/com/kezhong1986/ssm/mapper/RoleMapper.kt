package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.PageParams
import com.kezhong1986.ssm.pojo.Role
import com.kezhong1986.ssm.pojo.RoleParams
import org.apache.ibatis.annotations.Param

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:14
 */
interface RoleMapper {

    fun findRolesByMap(parameterMap: Map<String, Any>): List<Role>

    fun findRolesByAnnotation(@Param("roleName") name: String, @Param("note") note: String): List<Role>

    fun findRolesByBean(roleParams: RoleParams): List<Role>

    fun findRolesByMix(@Param("roleParams") role: RoleParams, @Param("pageParams") page: PageParams): List<Role>
}