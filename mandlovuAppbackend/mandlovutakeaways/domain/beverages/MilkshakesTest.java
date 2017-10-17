package com.watson.mandlovutakeaways.domain.beverages;

import com.watson.mandlovutakeaways.factories.beverages.MilkshakeFactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class MilkshakesTest {

    int id = 0;
    String name;
    String price;

    @Test
    public void get_id() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage(name,price);
        assertNotNull(milkshakes.get_id());
    }

    @Test
    public void set_id() throws Exception {
        Milkshakes milkshakes = new Milkshakes();
        id++;
        milkshakes.set_id(id);
        assertEquals(milkshakes.get_id(),id);
    }

    @Test
    public void getName() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage("Strawberry Milkshake","20");
        assertNotNull(milkshakes.getName());
    }

    @Test
    public void setName() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage("Bubblegum Milkshake","20");
        assertEquals(milkshakes.getName(),"Bubblegum Milkshake");
    }

    @Test
    public void getPrice() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage("Chocolate Milkshake","20");
        assertNotNull(milkshakes.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        Milkshakes milkshakes = MilkshakeFactory.getMilkshakeBeverage("Chocolate Milkshake","20");
        assertEquals(milkshakes.getPrice(),"20");
    }



    @Test
    public void testHashCode() throws Exception {
        assertNotNull(id ^(id >>> 32));
    }
}