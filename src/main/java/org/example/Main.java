package org.example;

import org.example.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Customer customer = (Customer) context.getBean("customer");
        customer.placeOrder();
    }
}