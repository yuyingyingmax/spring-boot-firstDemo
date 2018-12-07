package com.learning.demo.controller;

import com.learning.demo.domain.Country;
import com.learning.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/*
使用一个简单的控制器，通过定义一个简单的URL“/”来返回一个查询数据的页面“index”
数据查询使用了之前定义的存储库接口CountryRepository

ModelMap:ModelMap对象主要用于传递控制方法处理数据到结果页面
 */
@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value = "/")
    public String test(ModelMap model){
        List<Country> list = countryRepository.findAll();
        model.addAttribute("countries",list);
        return "index";
    }
}
