package cn.itcast.controller;

import cn.itcast.pojo.Friends;
import cn.itcast.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zouwanglin
 * @create 2018-09-12 20:45
 */
@RestController/*作用：可以起到@Controller和@ResponseBody的两者作用*/
public class HelloController {
    /*从容器中注入person对象*/
    @Autowired
    private Person person;
    @Autowired
    private Friends friends;

//    1.第一次接触springBoot
    @RequestMapping("/hello")
    public String hello() {
        return "say hello springboot";
    }

//    2.响应从yml中读取到的数据给前端
    @RequestMapping("person")
    public Person readYml() {
        return person;
    }
//    3.响应从任务位置下yml中读取到的数据给前端
    @RequestMapping("friends")
    public Friends writeFriends(){
        return friends;
    }
}
