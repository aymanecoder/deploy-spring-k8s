package com.test.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class K8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sApplication.class, args);
	}

	@GetMapping("am-i-lucky")
	public String myLuckyDay(){
		Random random = new Random();
		return random.nextBoolean() ? "It's your lucky Day!" : "Oh no ! try again, murder:)";
	}

}
