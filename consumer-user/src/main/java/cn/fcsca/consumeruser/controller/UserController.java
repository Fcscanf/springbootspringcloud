package cn.fcsca.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * UserController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 上午 10:56 2018-08-27
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了" + s;
    }
}
