package com.epoint.test;

import com.epoint.model.dto.MenuDTO;
import com.epoint.model.entity.Log;
import com.epoint.model.entity.Menu;
import com.epoint.model.enums.LogType;
import com.epoint.model.params.LogParam;
import com.epoint.service.BlogService;
import com.epoint.service.CategoryService;
import com.epoint.service.LogService;
import com.epoint.service.MenuService;
import com.epoint.utils.MarkdownUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yaml.snakeyaml.error.Mark;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {
    @Resource
    private BlogService blogService;
    @Resource
    private CategoryService categoryService;
    @Resource
    private LogService logService;
    @Resource
    private MenuService menuService;

    @Test
    public void test() {
        String table = "# 2017-12-17 WEEK186 一级恐惧\n" +
                "一级恐惧——————————————Primal Fear\n" +
                "![](/Blog/static/pic/1554815529503.jpg)\n" +
                "1. 导演：格里高利·霍布里特\n" +
                "2. 主演：理查·基尔/劳拉·琳妮/约翰·马奥尼/阿尔法·伍达德/弗兰西斯·麦克多蒙德/爱德华·诺顿/特瑞·欧奎恩/安德鲁·布劳尔/斯蒂文·鲍尔/乔·斯帕诺/托尼·普拉纳/斯坦利·安德森/毛拉·蒂尔内/乔恩·塞达/瑞格·罗杰斯\n" +
                "3. 片长：129 分钟\n" +
                "4. 影 片类型：剧情/悬疑/惊悚/犯罪\n" +
                "5. 豆 瓣评分：8.4/10(from88,522users)\n" +
                "6. IMDB评分：7.7/10(from146,891users)\n" +
                "\n" +
                "Hi，各位好久不见。本周给大家推荐的是一部96年的悬疑惊悚电影。你如果看过《搏击俱乐部》，一定不会忘记爱德华·诺顿饰演的杰克。而作为他的荧幕处女座，本片他虽然作为一个配角却已经技惊四座。当然主角的演技也不容忽视。可以说本片的一大亮点在于演员的精湛功力。\n" +
                "\n" +
                "歌颂完演技，来说说这部片子的实质。本片讨论的核心就在于正义。何为正义？通常我们觉得某个案子里，A是好人，B是坏人。那么B就应该受到惩罚，A就是应该伸张正义。然而很多时候，好人坏人的界定却很模糊。在某些情况下，A可能是好人，但是在某些情况下A就有可能是坏人。所以世间万事并不能简单的来下定义。正义正是如此。本片探讨的正义，在不同的情形下有不同的理解。而本片最让人觉得恐惧，并且赞叹的地方莫过于结局。那是来自内心的恐惧，那是Primal Fear。非常有意思的一部电影，值得一看。\n" +
                "\n" +
                "------------\n" +
                "\n" +
                "# 2017-11-26 WEEK183 嘉年华\n" +
                "![](https://img.piegg.cn/week183.jpg?imageslim)\n" +
                "1. 导演：文晏\n" +
                "2. 主演：文淇/周美君/史可/耿乐/刘威葳/彭静/王栎鑫/李梦男\n" +
                "3. 片长：107分钟\n" +
                "4. 影 片类型：剧情\n" +
                "5. 豆 瓣评分：8.6/10(from27,228users)\n" +
                "6. IMDB评分：7.2/10(from195users)\n" +
                "\n" +
                "Hi，各位好久不见。最近的一个月来，社会上发生了很多事，很多不是很好的事。不过这部电影能够过审，能够上映，却真的是一件最难得的事了。\n" +
                "\n" +
                "相信很多人都看过《熔炉》这部韩国电影，这部取材自真实事件，优秀的剧本+实力派的演员演绎的电影，自是获得无数赞誉，并且对韩国社会产生了意义深远的影响。而很多人把《嘉年华》这部电影比作中国版的《熔炉》，但我觉得这是不对的。不是说《熔炉》不好，《熔炉》这部好电影也是我以前推荐过的。我觉得更难得的是，我们拍出了《熔炉》这个级别的电影，而不是中国版的它——是难得的，是进步，伟大的一步。\n" +
                "\n" +
                "从剧情角度上来说，它可能不如《熔炉》“好看”。但我认为这部电影不是以“好看”“不好看”来鉴别的。它更多的是把这个社会对于幼童被性侵之后的种种态度，克制而坚决地表达了出来。它虽然是一部虚构的电影，但是它却时时刻刻能发生在我们的国家，我们的身边。\n" +
                "\n" +
                "片名的中文是《嘉年华》。但是英文名却很有意思的是《Angels Wear White》（天使穿着白衣）。与熔炉绝望的结局不同的是，《嘉年华》给出的结局，是开放的。有可能变得更好，也有可能一直糟糕下去，不过它带给我们的思考却是延续的，至少希望还是有的。我们在指责影片中那些令人发指的人物的行径的同时，可曾想过，如果事情发生在我们的身边，我们是否依然只是操起键盘一阵轰炸，茶余饭后一阵笑谈，三日之后相忘于江湖呢？我一直说，从电影中反观社会。《熔炉》之后改变了韩国，而《嘉年华》之后呢？看着那寥寥无几的排片，少得可怜的宣传，我曾想过的一些波澜，看来还是无法在我们的社会中惊起一些水花。\n" +
                "\n" +
                "我感动的是在观影中大家的安静，凝重和沉思。豆瓣上的一句话我看完，印象非常深刻但也非常痛心：“我们拍出了熔炉一样的电影，却没有熔炉一样的观众”。我希望这部电影应该是当下所有国人都应该观看的一部电影，因为，它真的是一部好电影。\n" +
                "\n" +
                "# 2017-11-12 WEEK182 非常嫌疑犯\n" +
                "![](https://img.piegg.cn/week182.jpg?imageslim)\n" +
                "1. 导演：布莱恩·辛格\n" +
                "2. 主演：史蒂芬·鲍德温/加布里埃尔·伯恩/本尼西奥·德尔·托罗/凯文·波拉克/凯文·史派西/查兹·帕尔明特瑞/皮特·波斯尔思韦特/苏茜·爱米斯/吉安卡罗·埃斯波西托/丹·哈达亚/保罗·巴特尔/卡尔·布瑞斯勒/菲力浦·西蒙/杰克·希勒/克里斯汀·艾斯布鲁克\n" +
                "3. 片长：106分钟\n" +
                "4. 影 片类型：剧情/悬疑/惊悚/犯罪\n" +
                "5. 豆 瓣评分：8.6/10(from113,108users)\n" +
                "6. IMDB评分：8.6/10(from820,898users)\n" +
                "\n" +
                "Hi，各位好久不见~本周给大家带来的是一部比较早期的电影——1995年的《非常嫌疑犯》。作为一部悬疑片，我觉得他的前几分钟的铺垫做的真的特别好。好的悬疑电影自然是在给观众想尽办法地留坑，然后再给你来一记重拳。不过明显的地方就是，你能感觉到留坑了，或者可能留坑了。\n" +
                "\n" +
                "这部电影则不一样，因为你是从一开始就被牵着鼻子走。而且得知真相的你还没来得及喘气之时，非常嫌疑犯已经扬长而去。不得不说凯文·史派西的演技在那个时候有已经是非常棒了。想感受一下被致命一击的恍然大悟，然后再由衷发出惊叹的话，这部电影不能错过。\n" +
                "\n" +
                "# 2017-11-09 WEEK181 暧暧内含光\n" +
                "![](https://img.piegg.cn/week181.jpg?imageslim)\n" +
                "\n" +
                "1. 导演：米歇尔·贡德里\n" +
                "2. 主演：金·凯瑞/凯特·温丝莱特/伊利亚·伍德/克斯汀·邓斯特/汤姆斯·杰·瑞恩/马克·鲁弗洛/简·亚当斯/大卫·克罗斯/汤姆·威尔金森/Amir Ali Said/Brian Price/Paulie Litt\n" +
                "3. 片长：108分钟\n" +
                "4. 影 片类型：剧情/爱情/奇幻\n" +
                "5. 豆 瓣评分：8.4/10(from140,391users)\n" +
                "6. IMDB评分：8.3/10(from741,540users)\n" +
                "\n" +
                "Hi，各位好久不见~本周给大家推荐的是来自美国的一部很有意思的电影。关于记忆和爱情，它给出了别样的思考。\n" +
                "\n" +
                "这部电影可能一开始节奏有点慢有点怪。不过从一个时刻开始，这部电影就真的开始走向令人惊讶的地步了。情节猎奇，但是却一点也不狗血，相反很有内涵。我记得以前，曾听过一个我觉得很有感觉的说法。你可以抹去一个人的记忆，但是你却没有办法抹去对这个人的感觉。我觉得这句话用在这部电影里真的很合适。虽然是一部奇幻电影，但是带给我们的启迪却远超一部现实主义的电影。很多时候面对问题的时候我们很喜欢回避、逃避。但是很多时候直面问题反而能得到更好的效果。我们可以选择忘却一些东西，但是无法忘却曾经为此付出的时间和感情。\n" +
                "\n" +
                "也许你需要的不过是鼓起勇气说一声“对不起”，不过是一句“我错了”，不过是一句“我爱你”。但是选择了忘记，选择了逃避，你就选择了失去。好电影，值得一看。\n";
        System.out.println(MarkdownUtils.renderHtml(table));
//        String a = "[imCoding 爱编程](http://www.lirenmi.cn)";
//        List<Menu> meus = menuService.getRootMenu();
//        List<MenuDTO> menuDTOS = menuService.convertTo(meus);
//        System.out.println(menuDTOS);
//        Log log = new Log();
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
