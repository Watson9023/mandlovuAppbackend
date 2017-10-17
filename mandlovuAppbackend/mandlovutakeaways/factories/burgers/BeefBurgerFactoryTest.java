package com.watson.mandlovutakeaways.factories.burgers;

import com.watson.mandlovutakeaways.domain.burgers.BeefBurgers;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;


public class BeefBurgerFactoryTest {

    @Test
    public void testGetBeefBurger() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger("Beef Burgers","10");
        assertNotNull(burgers);

    }
}