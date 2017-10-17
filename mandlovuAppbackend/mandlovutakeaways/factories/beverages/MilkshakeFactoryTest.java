package com.watson.mandlovutakeaways.factories.beverages;

import com.watson.mandlovutakeaways.domain.beverages.Milkshakes;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class MilkshakeFactoryTest {

    @Test
    public void testGetMilkshakeBeverage() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage("Strawberry Milkshake","20");
        assertNotNull(milkshakes);
    }
}