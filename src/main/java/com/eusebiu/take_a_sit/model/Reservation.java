package com.eusebiu.take_a_sit.model;

import java.time.LocalDate;

public class Reservation {
    private Long reservationId;
    private Long accountId;
    private Long restaurantId;
    private int noPersons;
    private LocalDate reservationDate;

    public Reservation() {
    }

    public Reservation(Long reservationId, Long accountId, Long restaurantId, int noPersons, LocalDate reservationDate) {
        this.reservationId = reservationId;
        this.accountId = accountId;
        this.restaurantId = restaurantId;
        this.noPersons = noPersons;
        this.reservationDate = reservationDate;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getNoPersons() {
        return noPersons;
    }

    public void setNoPersons(int noPersons) {
        this.noPersons = noPersons;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
}
