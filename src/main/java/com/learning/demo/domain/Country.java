package com.learning.demo.domain;

import javax.persistence.*;
/*
@Entity：对实体注释
@Table：声明此对象映射到数据库的数据表，
        通过它可以为实体指定表(talbe),目录(Catalog)和schema的名字。
        该注释不是必须的，如果没有则系统使用默认值(实体的短类名)。
@Id：声明此属性为主键
@GeneratedValue：指定主键的生成策略，有四个值：
                 -AUTO主键由程序控制, 是默认选项 ,不设置就是这个
                 -IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
                 -SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
                 -Table 提供特定的数据库产生主键, 该方式更有利于数据库的移植
 */
@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryname;
    private String countrycode;

    public Country(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
