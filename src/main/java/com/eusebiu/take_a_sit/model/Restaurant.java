package com.eusebiu.take_a_sit.model;

public class Restaurant {
    private Long restaurantId;
    private Long accountId;
    private String name;
    private String address;

    public Restaurant() {
    }

    public Restaurant(Long restaurantId, Long accountId, String name, String address) {
        this.restaurantId = restaurantId;
        this.accountId = accountId;
        this.name = name;
        this.address = address;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
