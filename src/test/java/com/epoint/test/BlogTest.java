package com.epoint.test;

import com.epoint.model.dto.BlogDTO;
import com.epoint.model.entity.Blog;
import com.epoint.model.entity.Category;
import com.epoint.service.BlogService;
import com.epoint.service.CategoryService;
import org.apache.ibatis.javassist.NotFoundException;
import org.apache.ibatis.jdbc.Null;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.text.html.Option;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {
    @Resource
    private BlogService blogService;
    @Resource
    private CategoryService categoryService;

    @Test
    public void test() {
        Blog blog = new Blog();
        blog.setId(1);
        blog.setTitle("测试");
        blog.setContent("测试2");
        blog.setDescription("addd");
        Optional<String> name = Optional.of("dolores");
        Optional empty = Optional.ofNullable(null);
        categoryService.findByParentId(4).orElseThrow(() -> new IllegalArgumentException("查询不到该分类的信息"));
//        Optional noEmpty = Optional.of(null);
//        System.out.println(name.orElse("There is some value"));
//        System.out.println(empty.orElse("There is no value present!"));
//        System.out.println(noEmpty.orElse("There id no value "));
//        BlogDTO blogDTO = new BlogDTO();
//        blogDTO.covertFrom(blog);
//        System.out.println(blogDTO);
//        System.out.println(blogService.findById(1));
//        Category category = new Category();
//        category.setId(10);
//        category.setDescription("3333");
//        category.setParentId(3);
//        category.prePersist();
//        System.out.println(categoryService.save(category));
//        System.out.println(category);
//        blogService.save(blog);
//        categoryService.findByParentId(4);
    }

}
