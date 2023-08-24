package com.edubridge.onlinemobilestore.controller;

import com.edubridge.onlinemobilestore.dto.Purchase;
import com.edubridge.onlinemobilestore.dto.PurchaseResponse;
import com.edubridge.onlinemobilestore.service.CheckOutService;

import org.springframework.web.bind.annotation.*;

	@CrossOrigin("http://localhost:4200")
	@RestController
	@RequestMapping("/api/checkout")
	public class CheckOutController {

	    private CheckOutService checkoutService;

	    public CheckOutController(CheckOutService checkoutService) {
	        this.checkoutService = checkoutService;
	    }

	    @PostMapping("/purchase")
	    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

	        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

	        return purchaseResponse;
	    }

	}


