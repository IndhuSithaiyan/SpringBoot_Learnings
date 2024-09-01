package com.springBoot_Learning.SpringBoot_Learnings.controller;

import com.springBoot_Learning.SpringBoot_Learnings.service.Pizza;
import com.springBoot_Learning.SpringBoot_Learnings.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizzaDemo")     //we can use the name
//@Component          // If we didn't mention the name by default we can give class name with airletter should be small(pizzaController)
public class PizzaController {

//    @Autowired         //field injection
//    private VegPizza vegPizza;

//    @Autowired          //constructor injection
//    public PizzaController(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

//    @Autowired          //setter Injection - giving @Autowired to call this setter method
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    /*
    * To Achieve loosely coupling, inject the interface and pass the information dynamically
    * So avoid field injection instead of this, create constructor injection
    *  */

    private Pizza pizza;

//    @Autowired
//    public PizzaController(@Qualifier("NON-veg Pizza") Pizza pizza) {
    public PizzaController(Pizza pizza) {       //@Primary - to alternate @Qualifiers
        this.pizza = pizza;
    }

    public String getPizza(){
//        return  "Hot Pizza!";
//        return vegPizza.getPizza();
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Method Initialized");
    }

    public void destroy(){
        System.out.println("Method destruct");
    }

}
