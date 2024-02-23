package edu.zjnu.biz.controller;

import edu.zjnu.biz.service.IPingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨海波
 * @date 2024/2/5 09:06
 * @description TestController
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private IPingService pingService;

    @PostMapping("/direct/ping")
    public String result(@RequestBody String request) {
        return pingService.ping(request);
    }
}
