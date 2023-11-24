package com.online_cake_order.online_cake_order.entity.entity;

import jakarta.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "users", uniqueConstraints = {
                @UniqueConstraint(name = "UNIQUE_user_email", columnNames = "email")
}
)

public class Item {

    @Id
    @SequenceGenerator(name = "item_seq_gen", sequenceName = "item_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "item_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "itemName", nullable = false)
    private String itemName;

    @Lob
    @Column(name = "itemImage", nullable = false, columnDefinition = "BLOB")
    private byte[] itemImage;

    @Column(name = "itemPrice", nullable = false)
    private double itemPrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "description", nullable = false)
    private String description;

}
