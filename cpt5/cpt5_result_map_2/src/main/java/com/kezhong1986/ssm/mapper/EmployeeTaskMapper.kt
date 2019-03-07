package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.EmployeeTask

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:44
 */
interface EmployeeTaskMapper {

    fun getEmployeeTaskByEmpId(empId: Long): List<EmployeeTask>

}