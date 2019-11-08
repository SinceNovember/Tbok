package com.epoint.test;

import com.epoint.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {
    @Resource
    private BlogService blogService;
    @Test
    public void test() {
        System.out.println(blogService.findById(1));
        System.out.println("123");
    }
}
