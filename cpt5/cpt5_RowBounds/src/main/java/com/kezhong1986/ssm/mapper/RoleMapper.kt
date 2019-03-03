package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Role
import com.kezhong1986.ssm.pojo.RoleParams
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.session.RowBounds

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:14
 */
interface RoleMapper {

    //    使用RowBounds做分页时，在xml文件中不需要写RowBounds相关内容
    fun findByRowBounds(rb: RowBounds, @Param("roleParam") roleParams: RoleParams): List<Role>

}