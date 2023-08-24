package com.edubridge.onlinemobilestore.dto;



import lombok.Data;

import java.util.Set;

import com.edubridge.onlinemobilestore.entity.Address;
import com.edubridge.onlinemobilestore.entity.Customer;
import com.edubridge.onlinemobilestore.entity.Order;
import com.edubridge.onlinemobilestore.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}