package com.example.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestAppApplication {

 /*	@PostMapping("/purchase/{userName}/{amount}/{productName}")
	public String purchase(@PathVariable String userName, @PathVariable double amount, @PathVariable String productName) {
		return "Hi " + userName + " order for " + productName + " with amount " + amount + " stored successfully...";
	}*/
	
	@PostMapping("/purchase")
    public String purchase(@RequestBody Order order) {
		
			return "Hi " + order.getUserName()+ " order for " + order.getProductName() + " with amount " + order.getAmount() + " stored successfully...";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestAppApplication.class, args);
	}
}
