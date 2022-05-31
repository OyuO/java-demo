package org.zy.postgis.mapper;

import net.postgis.jdbc.PGgeometry;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.zy.postgis.model.ResultDTO;

import java.util.List;
import java.util.UUID;

@Repository
public interface TestMapper {
    List<ResultDTO> select();

    int insert(@Param("1") PGgeometry geo, @Param("2") UUID uuid);

    int insertFloatArray(Float[] array);
}
