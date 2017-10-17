package com.watson.mandlovutakeaways.domain.burgers;

import com.watson.mandlovutakeaways.factories.burgers.BeefBurgerFactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class BeefBurgersTest {
    int id = 0;
    String name;
    String price;
    @Test
    public void get_id() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger(name,price);
        assertNotNull(burgers.get_id());
    }

    @Test
    public void set_id() throws Exception {
        BeefBurgers burgers = new BeefBurgers();
        id++;
        burgers.set_id(id);
        assertEquals(burgers.get_id(),id);
    }

    @Test
    public void getName() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger("Beef Burger","10");
        assertNotNull(burgers.getName());
    }

    @Test
    public void setName() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger("Beef Burger","10");
        assertEquals(burgers.getName(),"Beef Burger");
    }

    @Test
    public void getPrice() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger("Beef Burger","10");
        assertNotNull(burgers.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        BeefBurgers burgers = BeefBurgerFactory.getBeefBurger("Beef Burger","10");
        assertEquals(burgers.getPrice(),"10");
    }

    @Test
    public void testHashCode() throws Exception {
        assertNotNull(id ^(id >>> 32));
    }
}