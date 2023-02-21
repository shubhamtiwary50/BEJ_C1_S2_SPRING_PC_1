package com.niit;

import com.niit.Config.BeanConfig;
import com.niit.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Product product2 = applicationContext.getBean(Product.class);
        System.out.println(product2);
    }
}
