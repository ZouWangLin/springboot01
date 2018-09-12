package cn.itcast.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Map;

/**
 * @author zouwanglin
 * @create 2018-09-12 21:26
 */
@Component/*将当前实体类加入ioc容器*/

/*@ConfigurationProperties作用：将当前实体类和配置文件中的对象数据对应起来，进行数据的绑定工作
* 默认从全局配置文件中获取，prefix代表前缀*/
@ConfigurationProperties(prefix = "person")

@Validated/*该注解的作用：开启数据校验*/
public class Person {
    private String name;
    private String sex;
    private int age;
    private Friends friends;
    private List<String> list;
    private Map<String, Object> map;
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(String name, String sex, int age, Friends friends, List<String> list, Map<String, Object> map) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.friends = friends;
        this.list = list;
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;

    }

    public Map<String, Object> getMap() {
        return map;
    }
}
