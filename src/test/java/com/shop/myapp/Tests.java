package com.shop.myapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Tests {
    @Autowired
    ProjectService projectService;
    @Test
    public void test(){

    }

}
