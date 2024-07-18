package com.caotaibanzi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caotaibanzi.dto.SetmealDto;
import com.caotaibanzi.entity.Setmeal;

import java.util.List;


public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品关联的数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);


    /**
     * 回显套餐数据：根据套餐id查询套餐
     * @return
    */
    SetmealDto getDate(Long id);
}
