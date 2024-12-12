package com.meac.cousespringboot.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int statusCode;

    private OrderStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public static OrderStatus valueOf(int statusCode) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getStatusCode() == statusCode) {
                return orderStatus;
            }
        }
        throw new IllegalArgumentException("No OrderStatus with statusCode: " + statusCode);
    }


}

