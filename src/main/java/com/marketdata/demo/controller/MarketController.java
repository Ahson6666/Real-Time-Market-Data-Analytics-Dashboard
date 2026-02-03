package com.marketdata.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
    
    @GetMapping("/api/market/health")
    public String health() {
        return "Market Data Dashboard running! HKEX real-time ready.";
    }
    
    @GetMapping("/api/market/hsi")
    public String hsiData() {
        return "HSI: 24,150 (+1.2%) | SMA(20): 23,890 | Top Gainers: 0005.HK +2.3%";
    }
}
