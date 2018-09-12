package cn.itcast.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zouwanglin
 * @create 2018-09-12 21:28
 */
/*@Component*//*将当前类加入ioc容器*/
@PropertySource(value = {"classpath:Friends.properties"})/*加载指定文件*/
public class Friends {
    //注入属性
    @Value("${person.name}")
    private String name;//学生姓名
    @Value("${person.age}")
    private int age;//学生年龄
    public Friends() {
    }

    public Friends(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
