package tdd.pragmatic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    @Test
    public void 数値3を渡すとFizzが返ってくる() throws Exception {
        FizzBuzz fizzbuzz = null;
        assertThat(fizzbuzz.say(3),is("Fizz"));
    }
}
