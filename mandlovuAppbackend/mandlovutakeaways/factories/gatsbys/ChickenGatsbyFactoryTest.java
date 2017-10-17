package com.watson.mandlovutakeaways.factories.gatsbys;

import com.watson.mandlovutakeaways.domain.gatsbys.ChickenGatsby;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ChickenGatsbyFactoryTest {

    @Test
    public void testGetChickenGatsby() throws Exception {
        ChickenGatsby chickenGatsby = ChickenGatsbyFactory.getChickenGatsby("Chicken Gatsby","10");
        assertNotNull(chickenGatsby);
    }


}