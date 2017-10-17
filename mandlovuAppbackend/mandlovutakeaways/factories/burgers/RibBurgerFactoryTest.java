package com.watson.mandlovutakeaways.factories.burgers;

import com.watson.mandlovutakeaways.domain.burgers.RibBurger;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

class RibBurgerFactoryTest {

    @Test
    public void testGetRibBurger() throws Exception {
        RibBurger ribBurger = RibBurgerFactory.getRibBurger("Rib Burger","10");
        assertNotNull(ribBurger);
    }
}