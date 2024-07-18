package com.caotaibanzi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caotaibanzi.common.BaseContext;
import com.caotaibanzi.entity.ShoppingCart;
import com.caotaibanzi.mapper.ShoppingCartMapper;
import com.caotaibanzi.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
    @Override
    public void clean() {
        //sql:delete from shopping_cart where userId =？
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId, BaseContext.getCurrentId());
        //如果直接注入ShoppingCartService是有可能报循环依赖的
        this.remove(queryWrapper);
    }
}
