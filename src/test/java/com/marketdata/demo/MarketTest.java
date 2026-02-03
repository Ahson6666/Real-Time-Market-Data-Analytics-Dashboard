package com.marketdata.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MarketTest {
    
    @Test
    public void testHsiAboveSma() {
        double hsiPrice = 24150;
        double sma20 = 23890;
        assertTrue(hsiPrice > sma20, "HSI above 20-day SMA");
    }
}
