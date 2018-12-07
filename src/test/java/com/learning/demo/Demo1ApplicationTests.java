package com.learning.demo;

import com.learning.demo.config.JpaConfiguration;
import com.learning.demo.domain.Country;
import com.learning.demo.repository.CountryRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
/*
@ContextConfiguration：引入配置文件
@Autowired：它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。通过 @Autowired的使用来消除set，get方法。
@Before:初始化方法
@Test：测试方法，在这里可以测试期望异常和超时时间
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {JpaConfiguration.class,Demo1Application.class})
public class Demo1ApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(Demo1ApplicationTests.class);
	@Autowired
	private CountryRepository countryRepository;

	@Before
	public void createCountry(){
		Country country = new Country();
		country.setCountrycode("86");
		country.setCountryname("中国");
		countryRepository.save(country);
		assert country.getId()>0:"create error";
	}

	@Test
	public void getData() {
		List<Country> countries = countryRepository.findAll();
		assert countries!=null:"getdata is null";
		for (Country country:countries){
			logger.info("========country name = {}",country.getCountryname());
		}
	}

}
