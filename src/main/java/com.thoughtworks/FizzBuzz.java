package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int num){
        boolean isThreeTimes=num % 3==0;
        boolean isFiveTimes=num % 5==0;
        if(isThreeTimes&&isFiveTimes){
            return "FizzBuzz";
        }
        if(isThreeTimes){
            return "Fizz";
        }
        if(isFiveTimes){
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
