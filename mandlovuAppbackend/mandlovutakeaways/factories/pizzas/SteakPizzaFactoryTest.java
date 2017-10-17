package com.watson.mandlovutakeaways.factories.pizzas;

import com.watson.mandlovutakeaways.domain.pizzas.SteakPizza;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class SteakPizzaFactoryTest {

    @Test
    public void testGetSteakPizza() throws Exception {
        SteakPizza steakPizza = SteakPizzaFactory.getSteakPizza("Steak Pizza","10");
        assertNotNull(steakPizza);
    }
}