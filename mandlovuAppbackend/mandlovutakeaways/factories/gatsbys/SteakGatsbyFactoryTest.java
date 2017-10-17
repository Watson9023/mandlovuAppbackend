package com.watson.mandlovutakeaways.factories.gatsbys;

import com.watson.mandlovutakeaways.domain.gatsbys.SteakGatsby;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class SteakGatsbyFactoryTest {

    @Test
    public void testGetSteakGatsby() throws Exception {
        SteakGatsby steakGatsby = SteakGatsbyFactory.getSteakGatsby("Steak Gatsby","10");
        assertNotNull(steakGatsby);
    }
}