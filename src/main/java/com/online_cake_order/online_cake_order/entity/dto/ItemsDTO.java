package com.online_cake_order.online_cake_order.entity.dto;

import org.antlr.v4.runtime.misc.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ItemsDTO {
    private Integer id;
    @NotNull
    private String itemName;
    @NotNull
    private byte[] itemImage;
    @NotNull
    private double itemPrice;
    @NotNull
    private Integer quantity;
    @NotNull
    private String description;


}
