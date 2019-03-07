package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.FemaleHealthForm

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 23:57
 */
interface FemaleHealthFormMapper {

    fun getFemaleHealthForm(empId: Long): FemaleHealthForm

}