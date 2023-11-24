package com.online_cake_order.online_cake_order.entity.service.impl;

import com.online_cake_order.online_cake_order.entity.entity.User;
import com.online_cake_order.online_cake_order.entity.dto.UserDTO;
import com.online_cake_order.online_cake_order.entity.repository.UserRepository;
import com.online_cake_order.online_cake_order.entity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public String save(UserDTO userDTO){

        User user  = new User();

        if(userDTO.getId()!=null){
            user = userRepository.findById(userDTO.getId())
                    .orElseThrow(() -> new NullPointerException("Data Not Found"));
        }

        user.setEmail(userDTO.getEmail());
        user.setFullName(userDTO.getFullName());
        user.setMobileNo(userDTO.getMobileNo());
        user.setPassword(userDTO.getPassword());

        userRepository.save(user);

        return "created";
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }


    @GetMapping("/getAll") // executes the method below
    public List<User> getAllData(){
        return userRepository.findAll(); // select * from
    }

    @GetMapping("getByID/{id}")
    public Optional<User> getById(@PathVariable("id") Integer id){
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }
}
