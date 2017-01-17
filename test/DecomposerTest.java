import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by employee on 11/4/16.
 */
public class DecomposerTest {
    @Test
    public void whereYouInputAnyNumberMoreOneWithMoreNumbersWithAddition() {
        assertThat("[2, 2, 3]", is(Decomposer.add(2 + 5 + 5).toString()));
    }

    @Test
    public void whereYouInputWhereNumbersLessTen() {
        assertThat("[2, 5]", is(Decomposer.add(10).toString()));
    }
    @Test
    public void whereYouInputAnyNumberMoreOneWithMoreNumbersWithMultiplication() {
        assertThat("[2, 5, 5]", is(Decomposer.add(2 * 5 * 5).toString()));
    }

    @Test
    public void whereYouInputAnyNumberMoreOne() {
        assertThat("[2, 5, 5]", is(Decomposer.add(50).toString()));
    }

    @Test
    public void whereYouInputWhereNumbersLessNull() {
        RuntimeException exception = null;
        int number = -5;
        try {
            assertThat(number, is(Decomposer.add(number)));
        } catch (RuntimeException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertThat("inputted a number = " + number, is(exception.getMessage()));
    }


    @Test
    public void whereYouInputWhereNumbersEqualNull() {
        RuntimeException exception = null;
        int number = 0;
        try {
            assertThat(number, is(Decomposer.add(number)));
        } catch (RuntimeException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertThat("inputted a number = " + number, is(exception.getMessage()));
    }

    @Test
    public void whereYouInputOne() {
        assertThat("[1]", is(Decomposer.add(1).toString()));
    }
}