package club.dufty.springbootredistest.util;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/8/9 17:34
 */
@Component
public class MyRedisKeygenerator implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        return method.getName()+"#"+objects[1];
    }
}
