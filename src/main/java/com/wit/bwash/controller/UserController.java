package com.wit.bwash.controller;

import com.wit.bwash.dto.UserDTO;
import com.wit.bwash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/create-request")
    public  String createRequest(@RequestBody UserDTO userDTO){
        userService.createRequest(userDTO);
        return "OK";
    }
}
