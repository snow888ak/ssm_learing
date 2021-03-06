package com.kezhong1986.ssm.main

import com.alibaba.fastjson.JSON
import com.kezhong1986.ssm.mapper.*
import com.kezhong1986.ssm.utils.SessionUtil

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 23:51
 */
object Cpt5Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        SessionUtil.openSession().getMapper(TaskMapper::class.java).let {
//            println(it.getTask(1))
//            println(it.getTask(2))
//            println(it.getTask(3))
//            println(it.getTask(4))
//            println(it.getTask(5))
//            println()
//        }
//
//        SessionUtil.openSession().getMapper(WorkCardMapper::class.java).let {
//            println(it.getWorkCardByEmpId(1))
//            println(it.getWorkCardByEmpId(2))
//            println()
//        }
//
//        SessionUtil.openSession().getMapper(EmployeeTaskMapper::class.java).let {
//            println(it.getEmployeeTaskByEmpId(1))
//            println(it.getEmployeeTaskByEmpId(2))
//            println()
//        }
//
//        SessionUtil.openSession().getMapper(FemaleHealthFormMapper::class.java).let {
//            println(it.getFemaleHealthForm(2))
//            println()
//        }
//
//        SessionUtil.openSession().getMapper(MaleHealthFormMapper::class.java).let {
//            println(it.getMaleHealthForm(1))
//            println()
//        }
//
//        SessionUtil.openSession().getMapper(EmployeeMapper::class.java).let {
//            println(it.getEmployee(1))
//            println(it.getEmployee(2))
//        }
//
//        SessionUtil.openSession().getMapper(EmployeeMapper::class.java).let {
//            println(it.getEmployee2(1))
//            println(it.getEmployee2(2))
//        }

        SessionUtil.openSession().getMapper(UserMapper::class.java).let {
            val user = it.getUser(3)
            println(user)
            println(JSON.toJSONString(user.roles))
            println(it.getUser(4))
            println()
            println(it.findUserByRole(2))
            println(it.findUserByRole(4))
            println()
            println()
            println()
        }

        SessionUtil.openSession().getMapper(RoleMapper::class.java).let {
            println(it.getRole(2))
            println(it.getRole(4))
            println()
            println(it.findRoleByUser(3))
            println(it.findRoleByUser(4))
        }

    }

}