package com.omega.watch.modal;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "watch_id")
    private Watch watch;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "price_at_purchase", nullable = false)
    private BigDecimal priceAtPurchase;

    public OrderItem() {

    }

    public OrderItem(Order order, Watch watch, int quantity, BigDecimal priceAtPurchase) {
        this.order = order;
        this.watch = watch;
        this.quantity = quantity;
        this.priceAtPurchase = priceAtPurchase;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Watch getWatch() {
		return watch;
	}

	public void setWatch(Watch watch) {
		this.watch = watch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPriceAtPurchase() {
		return priceAtPurchase;
	}

	public void setPriceAtPurchase(BigDecimal priceAtPurchase) {
		this.priceAtPurchase = priceAtPurchase;
	}

}
