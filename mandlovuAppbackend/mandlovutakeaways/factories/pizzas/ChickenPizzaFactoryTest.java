package com.watson.mandlovutakeaways.factories.pizzas;

import com.watson.mandlovutakeaways.domain.pizzas.ChickenPizza;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class ChickenPizzaFactoryTest {

    @Test
    public void testGetChickenPizza() throws Exception {
        ChickenPizza chickenPizza = ChickenPizzaFactory.getChickenPizza("Chicken Pizza","10");
        assertNotNull(chickenPizza);
    }
}