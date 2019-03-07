package com.kezhong1986.ssm.pojo

import java.util.*

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:31
 */
open class Employee {

    var id: Long? = null
    var realName: String? = null
    var sex: String? = null
    var birthday: Date? = null
    var mobile: String? = null
    var email: String? = null
    var position: String? = null
    var note: String? = null

    var workCard: WorkCard? = null
    var employeeTaskList: List<EmployeeTask>? = null

}