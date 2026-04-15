package com.sparta.eureka.client.order.controller;

import com.sparta.eureka.client.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public String getOrder() {
        return "Order details";
    }

    @GetMapping("/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }
}