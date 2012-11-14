package tdd.pragmatic;

public class FizzBuzz {

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number% 3 == 0;
    }

    public String say(int number) {
        if(isMultipleOfFive(number) && isMultipleOfThree(number)) return "FizzBuzz";
        else if(isMultipleOfFive(number)) return "Buzz";
        else return "Fizz";
    }
}
