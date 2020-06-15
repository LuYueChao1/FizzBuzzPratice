package com.thoughtworks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PratiaceTest {
    @Test
    public void should_return_1_given_1_when_input_number_1(){
        int number=1;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(1);
        assertEquals(fizzBuzzResult,"1");

    }
}
