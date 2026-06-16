package com.ysy.webmvc.annotatedcontrollers.handlermethods.sessionattributes;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<String> items = new ArrayList<>();

    @Override public String toString() {
        return "Cart{" + items + "}";
    }
}
