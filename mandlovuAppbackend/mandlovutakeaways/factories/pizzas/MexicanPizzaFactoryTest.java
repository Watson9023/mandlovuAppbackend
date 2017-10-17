package com.watson.mandlovutakeaways.factories.pizzas;

import com.watson.mandlovutakeaways.domain.pizzas.MexicanPizza;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class MexicanPizzaFactoryTest {

    @Test
    public void testGetMexicanPizza() throws Exception {
        MexicanPizza mexicanPizza = MexicanPizzaFactory.getMexicanPizza("Mexican Pizza","10");
        assertNotNull(mexicanPizza);
    }
}