package com.tds.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 引导类
 * 
 */
@EnableEurekaServer
//@ServletComponentScan
//@EnableWebMvc
//@MapperScan("com.tds.eureka.dal.dao")
//@EnableSwagger2
@SpringBootApplication
public class TdsEurekaApplication {

	public static void main(String[] args) {
//		System.out.println("启动开始");
		try {
			SpringApplication.run(TdsEurekaApplication.class, args);
//			BaseApplication.run(TdsEurekaApplication.class, args);
		} catch (Exception e) {
			System.out.println("启动出错:" + e.getMessage());
		}
	}

	/*@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new CorsFilter());
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/*");
		registrationBean.setUrlPatterns(urlPatterns);
		
		return registrationBean;
	}*/
	
}
