package cn.itcast;

import cn.itcast.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private Person person;
	@Autowired
	private ApplicationContext ioc;
	@Test
	public void contextLoads() {
	}

	//判断对象是否在容器中存在（对象通过xml文件创建）
	@Test
	public void beanExist(){
		boolean flag = ioc.containsBean("person");
		System.out.println("对象是否存在:"+flag);
	}

	//判断对象是否存在（对象通过写config类实现创建）
	@Test
	public void isCreate(){
		boolean flag = ioc.containsBean("getFriends");
		System.out.println("对象是否存在:"+flag);
	}

}
