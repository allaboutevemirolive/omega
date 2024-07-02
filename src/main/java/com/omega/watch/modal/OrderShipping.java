package com.omega.watch.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "order_shipping")
public class OrderShipping {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "shipping_address_id", nullable = false)
    private ShippingAddress shippingAddress;

    @ManyToOne
    @JoinColumn(name = "shipping_method_id", nullable = false)
    private ShippingMethod shippingMethod;

    @Column(name = "tracking_number")
    private String trackingNumber;

    public OrderShipping() {

    }

    public OrderShipping(Order order, ShippingAddress shippingAddress, ShippingMethod shippingMethod,
            String trackingNumber) {
        this.order = order;
        this.shippingAddress = shippingAddress;
        this.shippingMethod = shippingMethod;
        this.trackingNumber = trackingNumber;
    }

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public ShippingMethod getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(ShippingMethod shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
}
