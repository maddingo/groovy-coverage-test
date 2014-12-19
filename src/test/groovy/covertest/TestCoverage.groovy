package covertest

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

import static org.junit.Assert.assertThat
import static org.hamcrest.CoreMatchers.*

class TestCoverage {

    public @Rule ExpectedException exception = ExpectedException.none()

    @Test
    void checkJava() {
        (0..2).each {
            assertThat MyEnumJava.getValue(it), is(notNullValue())
        }
    }

    @Test
    void checkGroovy() {
        (0..2).each {
            assertThat MyEnumGroovy.getValue(it), is(notNullValue())
        }
    }

    @Test
    void checkGroovyException() {
        exception.expect(isA(IllegalArgumentException.class))
        MyEnumGroovy.getValue(3)
    }

    @Test
    void checkJavaException() {
        exception.expect(isA(IllegalArgumentException.class))
        MyEnumJava.getValue(3)
    }
}
