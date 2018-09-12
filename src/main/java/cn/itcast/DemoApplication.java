package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication/*来标注springboot主程序，来说明这是一个springboot的应用*/
@ImportResource("classpath:bean.xml")/*加载指定资源文件，方便对象的注入，不推荐使用这种方式*/
public class DemoApplication {

	public static void main(String[] args) {
		/*spring应用启动起来*/
		SpringApplication.run(DemoApplication.class, args);
	}
	/**
	 * 当前配置类继承的注解
	 * 1.@EnableAutoConfiguration	开启自动配置功能
	 * 2.@AutoConfigurationPackage	自动配置包
	 * 3.
	 */

	/*
	* 1.配置文件方面
	* (1)默认配置文件为application.properties
	* (2)默认配置文件还可以为application.yml
	* */
}
