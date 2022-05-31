package org.zy.postgis.handler;


import net.postgis.jdbc.PGgeometry;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(PGgeometry.class)
public class GeometryHandler extends BaseTypeHandler<PGgeometry> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, PGgeometry parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter);
    }

    @Override
    public PGgeometry getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getObject(columnName, PGgeometry.class);
    }

    @Override
    public PGgeometry getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getObject(columnIndex, PGgeometry.class);
    }

    @Override
    public PGgeometry getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getObject(columnIndex, PGgeometry.class);
    }
}
