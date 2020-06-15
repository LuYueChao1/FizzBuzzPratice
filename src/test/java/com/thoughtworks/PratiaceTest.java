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
    public void should_return_Fizz_given_3_when_fizzPuzz(){
        int number=3;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Fizz",fizzBuzzResult);
    }

    @Test
    public void should_return_Buzz_given_5_when_fizzBuzz(){
        int number=5;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Buzz",fizzBuzzResult);
    }
    @Test
    public void should_return_FizzBuzz_given_15_when_fizzBuzz(){
        int number=60;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("FizzBuzz",fizzBuzzResult);
    }
    @Test
    public void should_return_Whizz_when_input_number_7(){
        int number=7;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Whizz",fizzBuzzResult);
    }
    @Test
    public void should_return_FizzWhizz_when_input_number_21(){
        int number=21;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("FizzWhizz",fizzBuzzResult);
    }
    @Test
    public void should_return_BuzzWhizz_when_input_number_70(){
        int number=70;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("BuzzWhizz",fizzBuzzResult);
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_input_number_105(){
        int number=210;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("FizzBuzzWhizz",fizzBuzzResult);
    }
    @Test
    public void should_return_Fizz_when_input_number_contain_3(){
        int number=13;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Fizz",fizzBuzzResult);
    }
    @Test
    public void should_ignore_number_contain_3_when_input_number_contain_5(){
        int number=35;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("BuzzWhizz",fizzBuzzResult);
    }
    @Test
    public void should_ignore_number_divided_by_3_when_input_number_contain_5(){
        int number=75;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String fizzBuzzResult= fizzBuzz.fizzBuzz(number);
        assertEquals("Buzz",fizzBuzzResult);
    }

}
