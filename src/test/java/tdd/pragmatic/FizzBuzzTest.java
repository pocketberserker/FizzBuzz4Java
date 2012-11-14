package tdd.pragmatic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void 数値3を渡すとFizzが返ってくる() throws Exception {
        assertThat(fizzBuzz.say(3),is("Fizz"));
    }

    @Test
    public void 数値6を渡すとFizzが返ってくる() throws Exception {
        assertThat(fizzBuzz.say(6),is("Fizz"));
    }
}

