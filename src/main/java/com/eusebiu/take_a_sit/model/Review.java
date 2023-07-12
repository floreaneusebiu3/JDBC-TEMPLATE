package com.eusebiu.take_a_sit.model;

public class Review {
    private Long reviewId;
    private Long accountId;
    private Long reservationId;
    private String message;

    public Review() {
    }

    public Review(Long reviewId, Long accountId, Long reservationId, String message) {
        this.reviewId = reviewId;
        this.accountId = accountId;
        this.reservationId = reservationId;
        this.message = message;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
