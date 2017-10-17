package com.watson.mandlovutakeaways.factories.beverages;

import com.watson.mandlovutakeaways.domain.beverages.ColdBeverages;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class ColdBeverageFactoryTest {

    @Test
    public void testGetColdBeverage() throws Exception {
        ColdBeverages coldBeverages = ColdBeverageFactory.getColdBeverage("Coke","10");
        assertNotNull(coldBeverages);
    }
}