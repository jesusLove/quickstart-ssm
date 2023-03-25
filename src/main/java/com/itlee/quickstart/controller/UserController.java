package com.itlee.quickstart.controller;


import com.itlee.quickstart.domin.User;
import com.itlee.quickstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getAll(){
        return userService.list();
    }

    @PostMapping()
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    public boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }
    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.removeById(id);
    }
}
