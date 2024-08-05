package com.appsdeveloperblog.app.ws.ui.controller;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping()
    public String getUser(@RequestParam(value="page", defaultValue = "1", required = false) int page,
                          @RequestParam(value="limit", defaultValue = "50") int limit,
                          @RequestParam(value = "sort", required = false) String sort){
        return "get user page: " + page + " limit:" + limit;
    }

    @GetMapping(path = "/{userId}", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
    })
    public UserRest getUser(@PathVariable String userId){

        UserRest user = new UserRest();
        user.setUserId("5");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john@doe.com");

        return user;
    }
    @PostMapping(consumes = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
    },
    produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE,
    })
    public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel details){
        UserRest user = new UserRest();
        user.setFirstName(details.getFirstName());
        user.setLastName(details.getLastName());
        user.setEmail(details.getEmail());
        return  ResponseEntity.ok(user);
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
