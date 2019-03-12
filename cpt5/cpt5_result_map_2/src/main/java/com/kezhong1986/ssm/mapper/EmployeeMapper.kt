package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Employee

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/8 0:04
 */
interface EmployeeMapper {

    fun getEmployee(empId: Long): Employee?

    fun getEmployee2(empId: Long): Employee?

}