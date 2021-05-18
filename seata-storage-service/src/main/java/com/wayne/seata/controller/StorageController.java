package com.wayne.seata.controller;

import com.wayne.seata.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/storage")
    public String storage() {
        storageService.storage();
        return "success";
    }
}