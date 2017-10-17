package com.watson.mandlovutakeaways.factories.burgers;

import com.watson.mandlovutakeaways.domain.burgers.CheeseBurger;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class CheeseBurgerFactoryTest {

    @Test
    public void testGetCheeseBurger() throws Exception {
        CheeseBurger cheeseBurger = CheeseBurgerFactory.getCheeseBurger("Cheese Burger","10");
        assertNotNull(cheeseBurger);
    }

}