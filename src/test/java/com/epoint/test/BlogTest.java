package com.epoint.test;

import com.epoint.model.dto.BlogDTO;
import com.epoint.model.entity.Blog;
import com.epoint.service.BlogService;
import com.epoint.service.CategoryService;
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
    @Resource
    private CategoryService categoryService;

    @Test
    public void test() {
//        Blog blog = new Blog();
//        blog.setId(1);
//        blog.setTitle("测试");
//        blog.setContent("测试2");
//        blog.setDescription("addd");
//        BlogDTO blogDTO = new BlogDTO();
//        blogDTO.covertFrom(blog);
//        System.out.println(blogDTO);
//        System.out.println(blogService.findById(1));
        System.out.println(categoryService.findByParentId(4).get(0).getCreateTime());
    }
}
