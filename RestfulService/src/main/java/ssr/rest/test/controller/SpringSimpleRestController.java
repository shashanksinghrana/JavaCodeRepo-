package ssr.rest.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringSimpleRestController {
	@RequestMapping(value ="/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name){
		
		return "Hello "+name;
	}

}
