package org.zy.postgis;

import net.postgis.jdbc.PGgeometry;
import net.postgis.jdbc.geometry.Point;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zy.postgis.mapper.TestMapper;
import org.zy.postgis.model.ResultDTO;

import java.util.UUID;

@SpringBootTest
class MybatisTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void select() {
        var results = testMapper.select();
        for (ResultDTO result : results) {
            System.out.println(result.getPoint());
        }
    }

    @Test
    public void insert() {
        var point = new Point(-81.064545, 42.287868);
        point.setSrid(4326);
        testMapper.insert(new PGgeometry(point), UUID.randomUUID());
    }

    @Test
    public void insertFloatArray() {
        var floats = new Float[]{1.2f, 1.3f};
        testMapper.insertFloatArray(floats);
    }

}
