package com.omega.watch.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "shipping_addresses")
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "post_index", nullable = false)
    private String postIndex;

    @Column(name = "country", nullable = false)
    private String country;

    public ShippingAddress() {

    }

    public ShippingAddress(Long userId, String address, String city, String postIndex, String country) {
        this.userId = userId;
        this.address = address;
        this.city = city;
        this.postIndex = postIndex;
        this.country = country;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostIndex() {
		return postIndex;
	}

	public void setPostIndex(String postIndex) {
		this.postIndex = postIndex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
