package org.zerock.guestbook;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.zerock.guestbook.sample.Restaurant;
import org.zerock.guestbook.sample.School;

import java.util.Arrays;

@SpringBootApplication
public class GuestbookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(GuestbookApplication.class, args);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(bean -> {
			System.out.println(bean);
		});

		School school = applicationContext.getBean("school", School.class);
		System.out.println(school);

		School school2 = applicationContext.getBean("sch2", School.class);
		System.out.println(school);

		Restaurant restaurant = applicationContext.getBean("restaurant", Restaurant.class);
		System.out.println(restaurant);
	}
}