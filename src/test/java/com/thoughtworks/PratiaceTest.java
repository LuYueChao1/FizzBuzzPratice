package com.thoughtworks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PratiaceTest {
    @Test
    public void should_return_1_given_1_when_fizzPuzz(){
        int number=1;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("1",fizzBuzzResult);
    }

    @Test
    public void shuld_return_Fizz_given_3_when_fizzPuzz(){
        int number=3;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Fizz",fizzBuzzResult);
    }

    @Test
    public void shuld_return_Buzz_given_5_when_fizzPuzz(){
        int number=5;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Buzz",fizzBuzzResult);
    }
    @Test
    public void shuld_return_FizzBuzz_given_15_when_fizzPuzz(){
        int number=15;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("FizzBuzz",fizzBuzzResult);
    }
}
