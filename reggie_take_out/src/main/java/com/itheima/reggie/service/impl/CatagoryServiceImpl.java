package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.mapper.CategorMapper;
import com.itheima.reggie.service.CategroyService;
import org.springframework.stereotype.Service;


@Service
public class CatagoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
