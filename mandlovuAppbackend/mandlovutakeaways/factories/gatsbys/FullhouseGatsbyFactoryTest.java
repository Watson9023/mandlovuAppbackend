package com.watson.mandlovutakeaways.factories.gatsbys;

import com.watson.mandlovutakeaways.domain.gatsbys.FullhouseGatsby;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class FullhouseGatsbyFactoryTest {

    @Test
    public void testGetFullhouseGatsby() throws Exception {
        FullhouseGatsby fullhouseGatsby = FullhouseGatsbyFactory.getFullhouseGatsby("Fullhouse Gatsby", "10");
        assertNotNull(fullhouseGatsby);
    }
}