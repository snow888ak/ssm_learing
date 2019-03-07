package com.kezhong1986.ssm.typeHandler

import org.apache.ibatis.type.JdbcType
import org.apache.ibatis.type.TypeHandler
import java.sql.CallableStatement
import java.sql.PreparedStatement
import java.sql.ResultSet

/**
 *
 * @author: keZhong
 * @email: 396926020@qq.com
 * @date: 2019/3/8 0:16
 */
class SexTypeHandler : TypeHandler<String> {

    override fun setParameter(ps: PreparedStatement, i: Int, parameter: String, jdbcType: JdbcType) {
        when (parameter) {
            "男" -> ps.setInt(i, 1)
            "女" -> ps.setInt(i, 0)
        }
    }

    override fun getResult(rs: ResultSet, columnName: String): String = rs.getInt(columnName).let { getSex(it) }

    override fun getResult(rs: ResultSet, columnIndex: Int): String = rs.getInt(columnIndex).let { getSex(it) }

    override fun getResult(cs: CallableStatement, columnIndex: Int): String = cs.getInt(columnIndex).let { getSex(it) }

    private fun getSex(value: Int): String = when (value) {
        1 -> "男"
        0 -> "女"
        else -> ""
    }
}