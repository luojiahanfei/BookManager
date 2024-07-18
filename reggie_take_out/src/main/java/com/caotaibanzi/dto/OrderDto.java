package com.caotaibanzi.dto;

import com.caotaibanzi.entity.OrderDetail;
import com.caotaibanzi.entity.Orders;
import lombok.Data;

import java.util.List;


@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}
