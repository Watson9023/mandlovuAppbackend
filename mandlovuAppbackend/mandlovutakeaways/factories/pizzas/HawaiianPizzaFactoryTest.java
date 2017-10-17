package com.watson.mandlovutakeaways.factories.pizzas;

import com.watson.mandlovutakeaways.domain.pizzas.HawaiianPizza;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class HawaiianPizzaFactoryTest {

    @Test
    public void testGetHawaiianPizza() throws Exception {
        HawaiianPizza hawaiianPizza = HawaiianPizzaFactory.getHawaiianPizza("Hawaiian Pizza","10");
        assertNotNull(hawaiianPizza);
    }
}