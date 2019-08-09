package club.dufty.springbootredistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableCaching
public class SpringbootRedisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisTestApplication.class, args);
    }

}
