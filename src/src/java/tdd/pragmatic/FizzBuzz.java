package tdd.pragmatic;

public class FizzBuzz {
    public String say(int number) {
        if(number % 5 == 0) return "Buzz";
        return "Fizz";
    }
}
