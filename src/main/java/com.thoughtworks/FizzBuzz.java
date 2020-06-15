package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int num){
        boolean isThreeTimes=num % 3==0;
        boolean isFiveTimes=num % 5==0;
        boolean isSevenTimes=num%7==0;
        if(isThreeTimes&&isFiveTimes){
            return "FizzBuzz";
        }
        if(isThreeTimes&&isSevenTimes){
            return "FizzWhizz";
        }
        if(isFiveTimes&&isSevenTimes){
            return "BuzzWhizz";
        }
        if(isThreeTimes){
            return "Fizz";
        }
        if(isFiveTimes){
            return "Buzz";
        }
        if (isSevenTimes){
            return "Whizz";
        }
        return String.valueOf(num);
    }
}
