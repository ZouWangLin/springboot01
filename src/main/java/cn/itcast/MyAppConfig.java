package cn.itcast;

import cn.itcast.pojo.Friends;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zouwanglin
 * @create 2018-09-12 22:41
 */
@Configuration/*指定当前类是一个配置类*/
public class MyAppConfig {

    @Bean/*将返回的对象注入ioc容器，组件默认的id就是方法名*/
    public Friends getFriends() {
        System.out.println("自定义配置类给ioc容器添加组件!");
        return new Friends();
    }
}
