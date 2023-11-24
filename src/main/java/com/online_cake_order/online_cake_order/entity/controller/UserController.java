package com.online_cake_order.online_cake_order.entity.controller;

import com.online_cake_order.online_cake_order.entity.entity.User;
import com.online_cake_order.online_cake_order.entity.dto.UserDTO;
import com.online_cake_order.online_cake_order.entity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // restful API
@RequestMapping("/user")
@RequiredArgsConstructor // to inject dependency, reduced code
public class UserController {

    private final UserService userService;

    @GetMapping("/data")
    public String getData(){
        return "data retrieved";
    }

    @PostMapping("/save") // "post bhannebitikai kei na kei dhikka aucha"
    public String createData(@RequestBody UserDTO userDTO){
      System.out.println(userDTO);
      userService.save(userDTO);


        return "Created data";

    }
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<User> getById(@PathVariable("id") Integer id){
        return userService.getById(id);

    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){
        userService.deleteById(id);
    }

}
