package com.wayne.seata.controller;

import com.wayne.seata.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BizController {
    @Autowired
    private BizService bizService;

    @GetMapping("/biz")
    public String biz() {
        bizService.biz();
        return "success";
    }
}
