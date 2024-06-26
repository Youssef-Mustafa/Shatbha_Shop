package com.shatbha_shop.shatbha_shop.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shatbha_shop.shatbha_shop.Models.User;
import com.shatbha_shop.shatbha_shop.Services.UserService;
import com.shatbha_shop.shatbha_shop.Success.SuccessBody;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("all")
    public List<User> GetAllUsers() {
        return userService.GetAllUsers();
    }
    
    @GetMapping("{id}")
    public User GetUserByID(@PathVariable String id) {
        return userService.GetUserByID(id);
    }
    
}
