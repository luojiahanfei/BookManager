package com.caotaibanzi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caotaibanzi.entity.AddressBook;
import com.caotaibanzi.mapper.AddressBookMapper;
import com.caotaibanzi.service.AddressBookService;
import org.springframework.stereotype.Service;


@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
