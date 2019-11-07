package com.epoint.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "blog")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Blog extends BaseEntity{

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
     * 博客标记
     */
    @Column(name = "flag")
    private String flag;

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
    private Integer commentabled;

    /**
     * 发布
     */
    @Column(name = "published")
    private Integer published;

    /**
     * 是否推荐
     */
    @Column(name = "recommend")
    private Integer recommend;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 所属类型id
     */
    @Column(name = "typeid")
    private int typeid;

    /**
     * 所属标签id
     */
    private String tagid;

    /**
     * 所属user
     */
    @Column(name = "userid")
    private int userid;

}
