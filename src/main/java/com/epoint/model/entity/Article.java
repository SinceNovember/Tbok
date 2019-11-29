package com.epoint.model.entity;

import com.epoint.model.enums.ArticleType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "article")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Article extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    /**
     * 博客标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 博客内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 博客首图
     */
    @Column(name = "first_picture")
    private String firstPicture;

    /**
     * 博客类型
     */
    @Column(name = "type")
    private ArticleType type;

    /**
     * 访问次数
     */
    @Column(name = "views")
    private Integer views;

    /**
     * 赞赏开启
     */
    @Column(name = "appreciation")
    private Integer appreciation;

    /**
     * 版权开启
     */
    @Column(name = "share_statement")
    private Integer shareStatement;

    /**
     * 评论开启
     */
    @Column(name = "commentabled")
    private Boolean commentabled;

    /**
     * 发布
     */
    @Column(name = "published")
    private Boolean published;

    /**
     * 是否推荐
     */
    @Column(name = "recommend")
    private Boolean recommend;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 所属类型id
     */
    @Column(name = "typeid")
    private Integer typeId;

    /**
     * 所属标签id
     */
    private String tagId;

    /**
     * 所属user
     */
    @Column(name = "userid")
    private Integer userId;

}
