package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seed")
                .burgers(3)
                .ingredient("onion")
                .sauce("BBQ")
                .ingredient("lettuce")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        String sauce = bigmac.getSauce();
        int burgers = bigmac.getBurgers();
        int ingredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals("BBQ",sauce);
        Assert.assertEquals(3,burgers);
        Assert.assertEquals(3,ingredients);
    }
}
