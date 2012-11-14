package tdd.pragmatic;

public class FizzBuzz {

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number% 3 == 0;
    }

    private boolean isMultipleOfFifteen(int number) {
        return isMultipleOfFive(number) && isMultipleOfThree(number);
    }

    public String say(int number) {
        if(isMultipleOfFifteen(number)) return "FizzBuzz";
        else if(isMultipleOfFive(number)) return "Buzz";
        else if(isMultipleOfThree(number)) return "Fizz";
        else return String.valueOf(number);
    }
}
