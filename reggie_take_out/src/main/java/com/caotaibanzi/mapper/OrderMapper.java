package com.caotaibanzi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caotaibanzi.entity.Orders;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
