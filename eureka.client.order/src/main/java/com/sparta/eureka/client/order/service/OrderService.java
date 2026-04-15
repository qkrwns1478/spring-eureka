package com.sparta.eureka.client.order.service;

import com.sparta.eureka.client.order.client.ProductClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    public String getProductInfo(String productId) {
        return productClient.getProduct(productId);
    }

    public String getOrder(String orderId) {
        if(orderId.equals("1") ){
            String productId = "2";
            String productInfo = getProductInfo(productId);
            return "Your order is " + orderId + " and " + productInfo;

        }
        return "Not exist order...";
    }
}