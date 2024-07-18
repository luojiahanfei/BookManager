package com.caotaibanzi.dto;

import com.caotaibanzi.entity.Setmeal;
import com.caotaibanzi.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
