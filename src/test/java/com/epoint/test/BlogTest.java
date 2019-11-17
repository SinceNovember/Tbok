package com.epoint.test;

import com.epoint.model.dto.ArticleDTO;
import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Article;
import com.epoint.model.entity.Log;
import com.epoint.model.enums.ArticleType;
import com.epoint.model.enums.LogType;
import com.epoint.service.ArticleService;
import com.epoint.service.CategoryService;
import com.epoint.service.LogService;
import com.epoint.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {
    @Resource
    private ArticleService articleService;
    @Resource
    private CategoryService categoryService;
    @Resource
    private LogService logService;
    @Resource
    private MenuService menuService;

    @Test
    public void test() {
        List<ArticleDTO> articles = articleService.convertTo(articleService.findAll());
        System.out.println(articles);
//        Log log = new  Log();
//        log.setId(1);
//        log.setContent("asda");
//        log.setType(LogType.BLOG_INITIALIZED);
//        LogDTO logDTO = new LogDTO().covertFrom(log);
//        System.out.println(logDTO);
//        List<Log> logs = logService.findAll();
//        System.out.println(logs);
//        List<Article> articles = articleService.findAllByState(ArticleType.Draft);
//        System.out.println(articles);
//        List<Log> logs = logService.findAllByPage(2, 2);
//        System.out.println(logs);
//        String a = "[imCoding 爱编程](http://www.lirenmi.cn)";
//        List<Menu> meus = menuService.getRootMenu();
//        List<MenuDTO> menuDTOS = menuService.convertTo(meus);
//        System.out.println(menuDTOS);
//        Log log = new Log();1
//        log.setId(3);
//        log.setContent("aaqqq");
//        log.setType(LogType.valueOf("BLOG_INITIALIZED"));
//        log.setIpAddress("azzx");
//        LogParam logParam = new LogParam();
//        logParam.setLogKey("123");
//        logParam.setType(LogType.valueOf("BLOG_INITIALIZED"));
//        Log log1= logParam.convertTo();
//        System.out.println(log1);
//        Menu menu = new Menu();
//        menu.getAlwaysShow();
//        logService.save(log);
//        List<Log> logs = logService.findAll();
//        System.out.println(logService.findAll());
//        LogType s = LogType.valueOf("BLOG_INITIALIZED");
//        StringToEnumConverterFactory factory = new StringToEnumConverterFactory();
//        Object logType = factory.getConverter(LogType.class).convert("BLOG_INITIALIZED");
//        System.out.println(LogType.BLOG_INITIALIZED);
//        Blog blog = new Blog();
//        blog.setId(1);
//        blog.setTitle("测试");
//        blog.setContent("测试2");
//        blog.setDescription("addd");
//        Optional<String> name = Optional.of("dolores");
//        Optional empty = Optional.ofNullable(null);
//        categoryService.findByParentId(4).orElseThrow(() -> new IllegalArgumentException("查询不到该分类的信息"));
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
