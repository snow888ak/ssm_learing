package com.kezhong1986.ssm.pojo

import com.alibaba.fastjson.JSON

/**
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:24
 */
class WorkCard {

    var id: Long? = null
    var empId: Long? = null
    var realName: String? = null
    var department: String? = null
    var mobile: String? = null
    var position: String? = null
    var note: String? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}
