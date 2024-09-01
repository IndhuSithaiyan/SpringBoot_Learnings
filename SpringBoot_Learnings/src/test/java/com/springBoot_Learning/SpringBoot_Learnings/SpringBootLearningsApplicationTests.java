package com.springBoot_Learning.SpringBoot_Learnings;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootLearningsApplicationTests {

	@Value("${Fruits.flow}")
	private List<String> fruits;
//
//	@Value("${timeout}")
//	private int time;
//
	@Value("${TEST_url:https://www.google.com/}")     //default value. if value is not there in property file
	private String path;

	@Autowired
	private Television tv;

	@Autowired
	private Faker faker;

	@Test
	void contextLoads() {
		System.out.println(fruits);
		System.out.println(fruits.size());
//		System.out.println(time+" seconds");
		System.out.println(path);
		tv.playmovies();
//		Faker faker = new Faker();
		System.out.println(faker.name().firstName());
	}
}
