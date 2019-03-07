package com.kezhong1986.ssm.pojo

import com.alibaba.fastjson.JSON

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/6 23:26
 */
open class HealthForm {

    var id: Long? = null
    var empId: Int? = null
    var heart: String? = null
    var liver: String? = null
    var spleen: String? = null
    var lung: String? = null
    var kidney: String? = null
    var note: String? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}

