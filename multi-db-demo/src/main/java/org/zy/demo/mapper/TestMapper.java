package org.zy.demo.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface TestMapper {

    @Select("select * from test")
    Map<Object, Object> select();
}
