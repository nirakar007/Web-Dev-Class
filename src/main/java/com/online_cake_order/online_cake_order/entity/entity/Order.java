package com.online_cake_order.online_cake_order.entity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {

    @Id
    @SequenceGenerator(name="order_seq_gen", sequenceName = "order_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "order_seq_gen", strategy = GenerationType.SEQUENCE)

    private Long id;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;


    @ManyToOne
    private User user;

    @Column(name="quantity", nullable = false)
    private Integer quantity;

}
