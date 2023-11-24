package com.online_cake_order.online_cake_order.entity.service;

import com.online_cake_order.online_cake_order.entity.entity.Item;
import com.online_cake_order.online_cake_order.entity.dto.ItemsDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    String save(ItemsDTO itemDTO);

    List<Item> getAll();

    Optional<Item> getById(Integer id);

    void deleteById(Integer id);


}
