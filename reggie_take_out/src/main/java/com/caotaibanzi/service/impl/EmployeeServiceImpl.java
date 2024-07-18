package com.caotaibanzi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caotaibanzi.entity.Employee;
import com.caotaibanzi.mapper.EmployeeMapper;
import com.caotaibanzi.service.EmployeeService;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
