package com.caotaibanzi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caotaibanzi.entity.Category;


public interface CategoryService extends IService<Category>  {

    public void remove(Long id);
}
