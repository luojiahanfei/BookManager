package com.itheima.reggie.controller;

import com.itheima.reggie.service.CategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//分类管理
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategroyService categroyService;
}
