package com.watson.mandlovutakeaways.factories.beverages;

import com.watson.mandlovutakeaways.domain.beverages.HotBeverages;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class HotBeverageFactoryTest {

    @Test
    public void testGetHotBeverage() throws Exception {
        HotBeverages hotBeverages = HotBeverageFactory.getHotBeverage("Coffee","10");
        assertNotNull(hotBeverages);
    }
}