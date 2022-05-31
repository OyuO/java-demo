package org.zy.redistemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class RedisStringTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void setKey() {
        var valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "张三");
    }

    @Test
    public void getValue() {
        var value = redisTemplate.opsForValue().get("name");
        System.out.println(value);
    }

    @Test
    public void setKeyWithExpireTime() {
        var valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "张三", 100, TimeUnit.SECONDS);
    }

    @Test
    public void getExpireTime() {
        var expire = redisTemplate.getExpire("name");
    }

    @Test
    public void hasKey() {
        var hasKey = redisTemplate.hasKey("name");
    }

    @Test
    public void deleteKey() {
        redisTemplate.delete("name");
    }

    @Test
    public void keyToBytes() {
        redisTemplate.dump("name");
    }


    @Test
    public void getKeys() {
        var keys = redisTemplate.keys("name");
    }

    /**
     * 修改key的名称(key不存在会报错)
     */
    @Test
    public void rename() {
        redisTemplate.rename("nafdfdme", "firstName");
    }

    /**
     * 修改key的名称(key不存在会报错)
     */
    @Test
    public void renameIfAbsent() {
        redisTemplate.renameIfAbsent("fdsf", "lastName");
    }

    @Test
    public void getType() {
        var name = redisTemplate.type("name");
    }

    @Test
    public void randomKey() {
        var key = redisTemplate.randomKey();
        System.out.println(key);
    }

}
