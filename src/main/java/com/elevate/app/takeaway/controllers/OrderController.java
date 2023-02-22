package com.elevate.app.takeaway.controllers;

import com.elevate.app.takeaway.model.OrderRequest;
import com.elevate.app.takeaway.model.ResponseModel;
import com.elevate.app.takeaway.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @GetMapping("/user/{userId}")
    public ResponseModel getOrdersByUserId(@PathVariable long userId) {
        ResponseModel model = new ResponseModel();
        model.data = Collections.singletonList(orderService.getOrderByUserId(userId));
        model.message = "Users Found";
        model.responseCode = HttpStatus.CREATED.value();
        return model;
    }

    @PostMapping("/create")
    public ResponseModel createOrder(@Valid @RequestBody OrderRequest orderRequest) {
        ResponseModel model = new ResponseModel();
        orderService.createOrder(orderRequest);
        model.message = "Your order has been successfully placed";
        model.responseCode = HttpStatus.CREATED.value();
        return model;
    }

}
