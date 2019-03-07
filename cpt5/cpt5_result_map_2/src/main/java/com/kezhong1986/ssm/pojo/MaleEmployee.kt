package com.kezhong1986.ssm.pojo

import com.alibaba.fastjson.JSON

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/7 0:34
 */
class MaleEmployee : Employee() {

    var maleHealthForm: MaleHealthForm? = null

    override fun toString(): String {
        return JSON.toJSONString(this)
    }
}