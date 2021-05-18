package com.wayne.seata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Transactional
    public void order(){
        jdbcTemplate.update("INSERT INTO t_order(order_no, user_id, commodity_code, count, amount) VALUES('123', 'zhangsan', '1', 0, 0.00);");
    }
}
