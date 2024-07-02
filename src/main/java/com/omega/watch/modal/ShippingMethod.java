package com.omega.watch.modal;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "shipping_methods")
public class ShippingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    public ShippingMethod() {

    }

    public ShippingMethod(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
