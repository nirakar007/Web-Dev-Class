package com.online_cake_order.online_cake_order.entity.service.impl;

import com.online_cake_order.online_cake_order.entity.entity.Item;
import com.online_cake_order.online_cake_order.entity.dto.ItemsDTO;
import com.online_cake_order.online_cake_order.entity.repository.ItemRepository;
import com.online_cake_order.online_cake_order.entity.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public String save(ItemsDTO itemsDTO){
        Item item = new Item();
        if(itemsDTO.getId()!=null){
            item = itemRepository.findById(itemsDTO.getId())
                    .orElseThrow(() -> new NullPointerException("Item not found"));
        }

        item.setItemName(itemsDTO.getItemName());
        item.setItemPrice(itemsDTO.getItemPrice());
        item.setQuantity(itemsDTO.getQuantity());
        item.setItemImage(itemsDTO.getItemImage());

        itemRepository.save(item);
        return "Created";
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getById(@PathVariable("id") Integer id){
        return itemRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        itemRepository.deleteById(id);

    }

}
