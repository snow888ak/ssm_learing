package com.kezhong1986.ssm.mapper

import com.kezhong1986.ssm.pojo.Task

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:37
 */
interface TaskMapper {

    fun getTask(id: Long): Task

}