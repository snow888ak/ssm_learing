package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Role
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.session.RowBounds

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:14
 */
interface RoleMapper {

    /**
     * 主键回填
     */
    fun insertRole(role: Role): Int

    /**
     * 自定义主键
     */
    fun insertRoleCustomPK(role: Role)

}