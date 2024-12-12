package com.meac.cousespringboot.config;

import com.meac.cousespringboot.entities.Order;
import com.meac.cousespringboot.entities.User;
import com.meac.cousespringboot.entities.enums.OrderStatus;
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



    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "1111111111", "123456");
        User u2 = new User(null, "Alex", "alex@gmail.com", "2222222", "13231231");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.PAID);

        userRepository.saveAll(Arrays.asList(u1, u2));
       orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
