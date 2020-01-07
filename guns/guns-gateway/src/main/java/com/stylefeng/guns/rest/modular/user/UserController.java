package com.stylefeng.guns.rest.modular.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jia.xue
 * @create: 2019-11-27 10:18
 * @Description
 **/
@RestController
public class UserController {


    @RequestMapping("cccddd")
    public String hello(){
        return "0k";
    }
}