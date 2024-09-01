package com.springBoot_Learning.SpringBoot_Learnings;

import com.springBoot_Learning.SpringBoot_Learnings.Value.ValueAnnotation;
import com.springBoot_Learning.SpringBoot_Learnings.controller.MyController;
import com.springBoot_Learning.SpringBoot_Learnings.controller.PizzaController;
import com.springBoot_Learning.SpringBoot_Learnings.lazy.LazyLoader;
import com.springBoot_Learning.SpringBoot_Learnings.propertySource.PropertySourceDemo;
import com.springBoot_Learning.SpringBoot_Learnings.repository.MyRepository;
import com.springBoot_Learning.SpringBoot_Learnings.scope.PrototypeBean;
import com.springBoot_Learning.SpringBoot_Learnings.scope.SingletonBean;
import com.springBoot_Learning.SpringBoot_Learnings.service.MyHolidays;
import com.springBoot_Learning.SpringBoot_Learnings.service.MyService;
import com.springBoot_Learning.SpringBoot_Learnings.service.NonVegPizza;
import com.springBoot_Learning.SpringBoot_Learnings.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootLearningsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootLearningsApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootLearningsApplication.class);
	/*
	* Spring IOC container created the object of the pizzaController class
	* we can managed their object by give @component class level annotation in pizzaController class
	*/
//		PizzaController pizzaController = context.getBean(PizzaController.class);	//retrieved this object by using getBean method
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaDemo");	//using by component name
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");	//using by className with small letter at first
		System.out.println(pizzaController.getPizza());
//		MyHolidays myHolidays = (MyHolidays) context.getBean("myHolidays");	//using by className with small letter at first
//		System.out.println(myHolidays.getHolidays());

//		VegPizza vegPizza = (VegPizza) context.getBean("veg-pizzaBean");	//using by Bean name
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizza");	//using by class name with small letter
//		System.out.println(vegPizza.getPizza());

//		MyController myController = context.getBean(MyController.class);	//using by className with small letter at first
//		System.out.println(myController.hello());

		MyService myService = context.getBean(MyService.class);	//using by className with small letter at first
		System.out.println(myService.hello());
		myService.cronJobSch();


//		MyRepository myRepository = context.getBean(MyRepository.class);	//using by className with small letter at first
//		System.out.println(myRepository.hello());

//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);	//using by className with small letter at first

		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());
		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());
		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());

		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
		System.out.println(valueAnnotation.getDefaultName());
//		System.out.println(valueAnnotation.getHost());
//		System.out.println(valueAnnotation.getEmail());
//		System.out.println(valueAnnotation.getPassword());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getMessageHost());
		System.out.println(propertySourceDemo.getMessageEmail());
		System.out.println(propertySourceDemo.getMessagePassword());
	}

}
