package com.learning.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//为了JPA能找到我们自定义的实体类和存储库接口设计，我们需要一个JPA配置类
/*
@Configuration:配置spring容器
@Bean标注在方法上（返回某个实例的方法），作用为：注册bean对象
@EnableTransactionManagement：支持事务注解
@EnableJpaRepositories：存储库接口的存储位置
 basePackages用于配置扫描Repositories所在的package及子package。
 简单配置中的配置则等同于此项配置值，basePackages可以配置为单个字符串，也可以配置为字符串数组形式。
 这里的"com.**.repository"，**表示匹配任意多目录
@EntityScan：实体类的扫描路径

PersistenceExceptionTranslationPostProcessor:当使用Hibernate上下文的Session时，抛出的就不是Spring的异常，
                               而是HibernateException，如果我们还想看到Spring的异常体系，就需要做点设置
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.**.repository")
@EntityScan(basePackages = "com.**.domain")
public class JpaConfiguration {
    @Bean
    PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

}
