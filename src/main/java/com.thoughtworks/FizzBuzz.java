package com.thoughtworks;

public class FizzBuzz {
    public String fizzBuzz(int num){
        boolean isThreeTimes=num % 3==0;
        boolean isFiveTimes=num % 5==0;
        boolean isSevenTimes=num%7==0;
        boolean isNumContainThree=String.valueOf(num).contains("3");
        boolean isNumContainFive=String.valueOf(num).contains("5");
        boolean isNumContainSeven=String.valueOf(num).contains("7");
        if(isNumContainFive){
            isNumContainThree=false;
            isThreeTimes=false;
        }
        if(isNumContainSeven){
            isThreeTimes=num % 3==0;
            isFiveTimes=false;
        }
        if(isNumContainThree){
            return "Fizz";
        }
        if(isThreeTimes&&isFiveTimes&&isSevenTimes){
            return "FizzBuzzWhizz";
        }
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
