package club.dufty.springbootredistest;

import club.dufty.springbootredistest.pojo.Student;
import club.dufty.springbootredistest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisTestApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        Student s1= userService.getStudentById(1);
        userService.deleteStudentById(1);
        Student s2 = userService.getStudentById(1);
        userService.updateStudentById(1);
        Student s3 = userService.getStudentById(1);
        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        System.out.println("s3"+s3);
    }

}
