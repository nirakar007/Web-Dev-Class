package com.online_cake_order.online_cake_order.entity.controller;

import com.online_cake_order.online_cake_order.entity.entity.Item;
import com.online_cake_order.online_cake_order.entity.dto.ItemsDTO;
import com.online_cake_order.online_cake_order.entity.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // restfull API
@RequestMapping("/item")
@RequiredArgsConstructor // to inject dependency, reduced code

public class ItemsController {
    private final ItemService itemService;

    @GetMapping("/data")
    public String getData(){
        return "data retrieved";
    }

    @PostMapping("/save") // "post bhannebitikai kei na kei dhikka aucha"
    public String createData(@RequestBody ItemsDTO itemsDTO){
        System.out.println(itemsDTO);
        itemService.save(itemsDTO);


        return "Created data";

    }
    @GetMapping("/getAll")
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<Item> getById(@PathVariable("id") Integer id){
        return itemService.getById(id);

    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){
        itemService.deleteById(id);
    }
}


