package ssr.boot.utility;

import java.io.IOException;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Util {
	
	
	public static String getBaseUrl(String serviceName, LoadBalancerClient loadBalancer){
		ServiceInstance serviceInstance=loadBalancer.choose(serviceName);
		String baseUrl=serviceInstance.getUri().toString();
		return baseUrl;
	}
	
	public static ResponseEntity<String> getResponse(String url, HttpMethod httpMethod){
		ResponseEntity<String> response = null;
		RestTemplate restTemplate = new RestTemplate();
		try{
			response = restTemplate.exchange(url, httpMethod, getJSONHeaders(), String.class);
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	public static void deleteResponse(String url){
		RestTemplate restTemplate = new RestTemplate();
		try{
			restTemplate.delete(url);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static ResponseEntity<String> postResponse(String url, String input, HttpMethod httpMethod){
		ResponseEntity<String> response = null;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		try{
			response = restTemplate.exchange(url, httpMethod, entity, String.class);
			System.out.println(response.getBody());
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	public static ResponseEntity<String> putResponse(String url, String input, HttpMethod httpMethod){
		ResponseEntity<String> response = null;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(input, headers);
		try{
			response = restTemplate.exchange(url, httpMethod, entity, String.class);
			System.out.println(response.getBody());
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
	}
	
	private static HttpEntity<?> getJSONHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
