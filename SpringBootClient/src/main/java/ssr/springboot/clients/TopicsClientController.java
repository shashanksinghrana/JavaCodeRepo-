package ssr.springboot.clients;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ssr.boot.dto.Topic;
import ssr.boot.utility.Util;

@RestController
public class TopicsClientController {
	
//	@Autowired
//	private DiscoveryClient discoveryClient;
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	@RequestMapping(value = "/topics", method = RequestMethod.GET)
	public ResponseEntity<String> getAllTopics() {
		
/*************Using DiscoveryClient**************/		
//		List<ServiceInstance> instances=discoveryClient.getInstances("topics-producer");
//		ServiceInstance serviceInstance=instances.get(0);
		
		/*************Using Load Balancer (Ribbon)*************/
		//ServiceInstance serviceInstance=loadBalancer.choose("topics-producer");
		
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics";
		ResponseEntity<String> response = Util.getResponse(url, HttpMethod.GET);
		System.out.println(response.getBody());
		
		return response;
	}
	
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
	public void getTopicByID(@PathVariable String id) {
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics/"+id;
		ResponseEntity<String> response = Util.getResponse(url, HttpMethod.GET);
		System.out.println(response.getBody());
	}
	
	@RequestMapping(value = "/topics/name/{name}", method = RequestMethod.GET)
	public void getTopicByName(@PathVariable String name) {
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics/name/"+name;
		ResponseEntity<String> response = Util.getResponse(url, HttpMethod.GET);
		System.out.println(response.getBody());
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public ResponseEntity<String> addNewTopic(@RequestBody String topic) {
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics";
		ResponseEntity<String> response = Util.postResponse(url, topic, HttpMethod.POST);
		
		return response;
		
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.PUT)
	public ResponseEntity<String> updateTopicById(@RequestBody String topic) {
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics";
		ResponseEntity<String> response = Util.putResponse(url, topic, HttpMethod.PUT);
		return response;
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopicById(@PathVariable String id) {
		String baseUrl=Util.getBaseUrl("ZUUL-SERVICE", loadBalancer);
		String url = baseUrl + "/topicapi/topics/"+id;
		Util.deleteResponse(url);
		
		
	}
	
	/*@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ResponseEntity<String> getAllStudents() {
		
*//*************Using DiscoveryClient**************//*		
//		List<ServiceInstance> instances=discoveryClient.getInstances("topics-producer");
//		ServiceInstance serviceInstance=instances.get(0);
		
		*//*************Using Load Balancer (Ribbon)*************//*
		//ServiceInstance serviceInstance=loadBalancer.choose("topics-producer");
		String baseUrl=Util.getBaseUrl("STUDENT-SERVICE", loadBalancer);
		String url = baseUrl + "/students";
		ResponseEntity<String> response = Util.getResponse(url, HttpMethod.GET);
		System.out.println(response.getBody());
		
		return response;
	}*/

}
