package com.caotaibanzi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caotaibanzi.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
