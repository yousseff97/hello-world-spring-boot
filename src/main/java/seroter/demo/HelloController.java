package seroter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private CounterService counter;
	
	@Autowired
	public HelloController(CounterService counter) {
		this.counter = counter;
	}
	
	@RequestMapping("/")
	public String SayHello() {
	
		return "Hello ";
	}

}
