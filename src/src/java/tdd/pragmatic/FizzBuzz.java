package tdd.pragmatic;

public class FizzBuzz {
    public String say(int number) {
        if(number % 5 == 0 && number % 3 == 0) return "FizzBuzz";
        else if(number % 5 == 0) return "Buzz";
        else return "Fizz";
    }
}
