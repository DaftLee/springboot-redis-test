package club.dufty.springbootredistest.pojo;

import java.io.Serializable;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/8/9 14:14
 */
public class Student implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
