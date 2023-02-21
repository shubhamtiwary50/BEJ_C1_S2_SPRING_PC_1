package com.niit.Config;

import com.niit.domain.Product;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Product getProduct1() {
        return new Product(1, "Product1", 5500.0, "Black");
    }
}
