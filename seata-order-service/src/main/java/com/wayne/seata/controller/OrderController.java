package com.wayne.seata.controller;

import com.wayne.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order")
    public String order(){
        orderService.order();
        return "success";
    }
}
