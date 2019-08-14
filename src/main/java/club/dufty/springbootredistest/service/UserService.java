package club.dufty.springbootredistest.service;

import club.dufty.springbootredistest.pojo.Student;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/8/9 14:53
 */
@Service
@CacheConfig(cacheNames = "myredis")
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private RedisTemplate redisTemplate = new RedisTemplate();
    @Autowired
    private StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
    /**
     * 查询
     * @param id
     * @return
     */
//    @Cacheable(cacheNames = "myredis",keyGenerator = "myRedisKeygenerator") //自定义key类型
//    @Cacheable(cacheNames = "myredis",key = "#id") //当方法有多个参数时，指定key是哪个。不指定的话，两个参数拼装作为key
    @Cacheable(cacheNames = "myredis")
    public Student getStudentById(int id) {
        Student student = new Student();
        student.setId(id);
        student.setName("嘿嘿");
        logger.error("查询数据库。返回："+student);
        return student;
    }

    /**
     * 删除
     * @param id
     */
    @CacheEvict(cacheNames = "myredis")
    public void deleteStudentById(int id){
        logger.error("删除用户成功：");
    }

    /**
     * 更新
     * @param id
     */
    @CachePut(cacheNames = "myredis")
    public Student updateStudentById(int id){
        Student student = new Student();
        student.setId(id);
        student.setName("哈哈");
        logger.error("更新用户成功");
        return student;
    }

    /**
     * 直接存
     * @param s
     */
    public void setStudentById2(Student s){
        ValueOperations<Integer,Student> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(s.getId(),s);
    }

    /**
     * 直接取
     * @param id
     * @return
     */
    public Student getStudentById2(int id){
        ValueOperations<Integer,Student> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(id);
    }

}
