package com.online_cake_order.online_cake_order.entity.service;

import com.online_cake_order.online_cake_order.entity.entity.User;
import com.online_cake_order.online_cake_order.entity.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String save(UserDTO userDTO);

    List<User> getAll();

    Optional<User> getById(Integer id);

    void deleteById(Integer id);
}
