package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping()
    public String getUser(@RequestParam(value="page") int page,
                          @RequestParam(value="limit") int limit){
        return "get user page: " + page + " limit:" + limit;
    }

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "get user was called." + userId;
    }
    @PostMapping
    public String createUser(){
        return "create user is called.";
    }
    @PutMapping
    public String updateUser()
    {
        return "update user is called.";
    }
    @DeleteMapping
    public String deleteUser()
    {
        return "delete user is called.";
    }
}
