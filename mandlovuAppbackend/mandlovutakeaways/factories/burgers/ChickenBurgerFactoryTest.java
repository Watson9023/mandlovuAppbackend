package com.watson.mandlovutakeaways.factories.burgers;

import com.watson.mandlovutakeaways.domain.burgers.ChickenBurgers;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class ChickenBurgerFactoryTest {

    @Test
    public void testGetChickenBurger() throws Exception {
        ChickenBurgers burger = ChickenBurgerFactory.getChickenBurger("Chicken Burger","10");
        assertNotNull(burger);
    }
}