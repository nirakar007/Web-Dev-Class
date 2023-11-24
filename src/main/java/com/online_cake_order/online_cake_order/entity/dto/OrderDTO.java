package com.online_cake_order.online_cake_order.entity.dto;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class OrderDTO {
    @NotNull
    private Long item_id;
    @NotNull
    private Integer user_id;
    @NotNull
    private Integer quantity;

}
