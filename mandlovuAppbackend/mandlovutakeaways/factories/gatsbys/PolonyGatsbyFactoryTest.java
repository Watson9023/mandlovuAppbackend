package com.watson.mandlovutakeaways.factories.gatsbys;

import com.watson.mandlovutakeaways.domain.gatsbys.PolonyGatsby;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class PolonyGatsbyFactoryTest {

    @Test
    public void testGetPolonyGatsby() throws Exception {
        PolonyGatsby polonyGatsby = PolonyGatsbyFactory.getPolonyGatsby("Polony Gatsby","100");
        assertNotNull(polonyGatsby);
    }
}