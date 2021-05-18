package com.wayne.seata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StorageService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void storage() {
        jdbcTemplate.update("INSERT INTO storage.t_storage(commodity_code, name, count) VALUES('123', '321', 0);");
    }
}
