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
    public void 数値5を渡すとBuzzが返ってくる() throws Exception {
        assertThat(fizzBuzz.say(5),is("Buzz"));
    }

    @Test
    public void 数値15を渡すとFizzBuzzが返ってくる() throws Exception {
        assertThat(fizzBuzz.say(15),is("FizzBuzz"));
    }

    @Test
    public void 数値1を渡すと文字列1が返ってくる() throws Exception {
        assertThat(fizzBuzz.say(1),is("1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 数値0を渡すとIllegalArgumentExceptionが発生する() throws Exception {
        fizzBuzz.say(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 負の数を渡すとIllegalArgumentExceptionが発生する() throws Exception {
        fizzBuzz.say(-1);
    }
}

