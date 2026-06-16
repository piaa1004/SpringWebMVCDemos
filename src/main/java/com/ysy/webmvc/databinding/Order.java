package com.ysy.webmvc.databinding;

public class Order {

    public String product;
    public Integer quantity;
    public String customerEmail;

    @Override public String toString() {
        return "Order{product=" + product + ", quantity=" + quantity + ", customerEmail=" + customerEmail + "}";
    }
}
