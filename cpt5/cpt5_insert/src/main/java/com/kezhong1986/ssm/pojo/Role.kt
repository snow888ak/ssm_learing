package com.kezhong1986.ssm.pojo

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/1 0:13
 */
data class Role(var id: Int?, var roleName: String?, var note: String?) {
    constructor(roleName: String?, note: String?) : this(null, roleName, note)
}