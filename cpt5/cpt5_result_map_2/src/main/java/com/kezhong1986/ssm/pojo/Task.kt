package com.kezhong1986.ssm.pojo

import com.alibaba.fastjson.JSON

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:27
 */
class Task {
    var id: Long? = null
    var title: String? = null
    var context: String? = null
    var note: String? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}