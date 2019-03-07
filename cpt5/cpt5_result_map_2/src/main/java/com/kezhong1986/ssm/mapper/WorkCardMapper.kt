package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.WorkCard

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:39
 */
interface WorkCardMapper {

    fun getWorkCardByEmpId(empId: Long): WorkCard

}