package com.wayne.seata.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class BizService {

    @Autowired
    private RestTemplate restTemplate;
    @GlobalTransactional
    public void biz(){
        String result1 = restTemplate.getForObject("http://localhost:8020/order", String.class);
        System.out.println("order:"+result1);
        String result2 = restTemplate.getForObject("http://localhost:8030/storage", String.class);
        System.out.println("storage:"+result2);
    }
}
