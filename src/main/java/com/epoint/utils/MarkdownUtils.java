package com.epoint.utils;

import com.vladsch.flexmark.convert.html.FlexmarkHtmlParser;
import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import com.vladsch.flexmark.ext.autolink.AutolinkExtension;
import com.vladsch.flexmark.ext.emoji.EmojiExtension;
import com.vladsch.flexmark.ext.emoji.EmojiImageType;
import com.vladsch.flexmark.ext.emoji.EmojiShortcutType;
import com.vladsch.flexmark.ext.escaped.character.EscapedCharacterExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension;
import com.vladsch.flexmark.ext.gfm.tasklist.TaskListExtension;
import com.vladsch.flexmark.ext.ins.InsExtension;
import com.vladsch.flexmark.ext.media.tags.MediaTagsExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.ext.toc.TocExtension;
import com.vladsch.flexmark.ext.yaml.front.matter.AbstractYamlFrontMatterVisitor;
import com.vladsch.flexmark.ext.yaml.front.matter.YamlFrontMatterExtension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataSet;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MarkdownUtils {

    private static final DataHolder OPTIONS = new MutableDataSet()
            .set(Parser.EXTENSIONS, Arrays.asList(
                    AttributesExtension.create(),
                    AutolinkExtension.create(),
                    EmojiExtension.create(),
                    EscapedCharacterExtension.create(),
                    StrikethroughExtension.create(),
                    TaskListExtension.create(),
                    InsExtension.create(),
                    MediaTagsExtension.create(),
                    TablesExtension.create(),
                    TocExtension.create(),
                    YamlFrontMatterExtension.create())
            )
            .set(TablesExtension.WITH_CAPTION, false)
            .set(TablesExtension.COLUMN_SPANS, false)
            .set(TablesExtension.MIN_HEADER_ROWS, 1)
            .set(TablesExtension.MAX_HEADER_ROWS, 1)
            .set(TablesExtension.APPEND_MISSING_COLUMNS, true)
            .set(TablesExtension.DISCARD_EXTRA_COLUMNS, true)
            .set(TablesExtension.HEADER_SEPARATOR_COLUMN_MATCH, true)
            .set(EmojiExtension.USE_SHORTCUT_TYPE, EmojiShortcutType.GITHUB)
            .set(EmojiExtension.USE_IMAGE_TYPE, EmojiImageType.IMAGE_ONLY);

    private static final  Parser PARSER = Parser.builder(OPTIONS).build();

    private static final HtmlRenderer RENDERER = HtmlRenderer.builder(OPTIONS).build();

    public static String renderHtml(String markdown) {
        if (StringUtils.isBlank(markdown)) {
            return "";
        }
        Node document = PARSER.parse(markdown);
        return RENDERER.render(document);
    }

    public static String renderMarkdown(String html) {
        return FlexmarkHtmlParser.parse(html);
    }

    /**
     * Get front-matter
     *
     * @param content content
     * @return Map
     */
    public static Map<String, List<String>> getFrontMatter(String markdown) {
        AbstractYamlFrontMatterVisitor visitor = new AbstractYamlFrontMatterVisitor();
        Node document = PARSER.parse(markdown);
        visitor.visit(document);
        return visitor.getData();
    }
//    /**
//     * 直接将markdown语义的文本转为html格式输出
//     * @param content markdown语义文本
//     * @return
//     */
//    public static String markdown2Html(String content) {
//        String html = parse(content);
//        return html;
//    }
//    /**
//     * markdown to image
//     * @param content markdown contents
//     * @return parse html contents
//     */
//    public static String parse(String content) {
//        MutableDataSet options = new MutableDataSet();
//        options.setFrom(ParserEmulationProfile.MARKDOWN);
//        //enable table parse!
//        options.set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create()));
//        Parser parser = Parser.builder(options).build();
//        HtmlRenderer renderer = HtmlRenderer.builder(options).build();
//        Node document = parser.parse(content);
//        return renderer.render(document);
//    }
}
