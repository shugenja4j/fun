package com.shugenja.gateway.controllor;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanruofei on 16/8/4.
 */
@EnableAutoConfiguration
@RestController
public class PingControllor {

    @ResponseBody
    @RequestMapping(value = "/ping")
    String home() {
        return "Hello World!";
    }


}
