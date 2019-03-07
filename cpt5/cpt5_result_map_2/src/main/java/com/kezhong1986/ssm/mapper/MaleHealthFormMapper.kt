package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.MaleHealthForm

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 23:53
 */
interface MaleHealthFormMapper {

    fun getMaleHealthForm(empId: Long): MaleHealthForm

}