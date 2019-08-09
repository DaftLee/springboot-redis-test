package club.dufty.springbootredistest.service;

import club.dufty.springbootredistest.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/8/9 14:53
 */
@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Cacheable(cacheNames = "myredis")
    public Student getStudentById(int id) {
//        Student student = new Student();
//        student.setId(id);
//        student.setName("嘿嘿");
//        logger.error("查询数据库。返回："+student);
//        return student;
        return null;
    }
}
