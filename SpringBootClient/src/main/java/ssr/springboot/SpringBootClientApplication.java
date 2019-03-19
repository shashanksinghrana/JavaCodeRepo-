package ssr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import ssr.springboot.clients.TopicsClientController;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClientApplication.class, args);
		
		/*TopicsClientController topicsClientController=ctx.getBean(TopicsClientController.class);
		System.out.println(topicsClientController);
		//topicsClientController.getAllTopics();
		//topicsClientController.getTopicByID("Java");
		topicsClientController.getTopicByName("JavaScript Updated");*/
		
	}
	
}
