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
        if(number <= 0) throw new IllegalArgumentException("0以下の数値は不正な数値です。0よりも大きな数値を入力してください。");
        if(isMultipleOfFifteen(number)) return "FizzBuzz";
        else if(isMultipleOfFive(number)) return "Buzz";
        else if(isMultipleOfThree(number)) return "Fizz";
        else return String.valueOf(number);
    }
}
