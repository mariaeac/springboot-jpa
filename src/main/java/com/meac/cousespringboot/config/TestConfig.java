package com.meac.cousespringboot.config;

import com.meac.cousespringboot.entities.Category;
import com.meac.cousespringboot.entities.Order;
import com.meac.cousespringboot.entities.User;
import com.meac.cousespringboot.entities.enums.OrderStatus;
import com.meac.cousespringboot.repositories.CategoryRepository;
import com.meac.cousespringboot.repositories.OrderRepository;
import com.meac.cousespringboot.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;




    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
