package com.watson.mandlovutakeaways.factories.burgers;

import com.watson.mandlovutakeaways.domain.burgers.VeggyBurger;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class VeggyBurgerFactoryTest {

    @Test
    public void testGetVeggyBurger() throws Exception {
        VeggyBurger burger = VeggyBurgerFactory.getVeggyBurger("Veggy Burger","10");
        assertNotNull(burger);
    }


}