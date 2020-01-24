package org.bacraftmanship.assertionsHowTo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Unit test for simple App.
 */
public class AssertionsTest
{

    @Test
    @Disabled("Example!")
    public void testIsDisabled() {
        assertThat(false).isTrue();

    }

    @Test
    public void assertBooleanValues()
    {
        assertThat(true).isTrue();
        assertThat( "12".equals("12")).isTrue();
        assertThat( 1 == 1).isTrue();

        assertThat( 12 == 1).isFalse();
    }

    @Test
    public void testingExceptions() {

        assertThatThrownBy(() -> {
            throw new UnknownError();
        }).isInstanceOf(UnknownError.class);
    }
}
