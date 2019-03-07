package com.kezhong1986.ssm.pojo

import com.alibaba.fastjson.JSON

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/6 23:33
 */

class FemaleHealthForm : HealthForm() {
    var uterus: String? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}