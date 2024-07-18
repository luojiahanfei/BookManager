package com.caotaibanzi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caotaibanzi.entity.ShoppingCart;


public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
