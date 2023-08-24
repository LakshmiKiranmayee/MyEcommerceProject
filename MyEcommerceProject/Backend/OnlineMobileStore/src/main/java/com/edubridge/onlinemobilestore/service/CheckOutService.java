package com.edubridge.onlinemobilestore.service;



import com.edubridge.onlinemobilestore.dto.Purchase;
import com.edubridge.onlinemobilestore.dto.PurchaseResponse;

public interface CheckOutService {

    PurchaseResponse placeOrder(Purchase purchase);
}