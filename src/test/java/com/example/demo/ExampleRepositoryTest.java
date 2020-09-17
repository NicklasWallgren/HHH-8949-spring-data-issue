package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleRepositoryTest {

    @Autowired
    private ExampleRepository exampleRepository;

    @Test
    void findById() {
        exampleRepository.findById(1L);
    }

}