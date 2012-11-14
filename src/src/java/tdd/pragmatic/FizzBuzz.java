package tdd.pragmatic;

public class FizzBuzz {

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    public String say(int number) {
        if(isMultipleOfFive(number) && number % 3 == 0) return "FizzBuzz";
        else if(number % 5 == 0) return "Buzz";
        else return "Fizz";
    }
}
