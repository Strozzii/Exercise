package ausdruck;

import ausdruck.parser.Konstante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KonstanteTest {

    @Test
    void testSomeMethod() {
        Konstante test = new Konstante(50);
        assertEquals(test, new Konstante(50));
    }
    @Test
    void testSomeMethod1() {
        Konstante test = new Konstante(50);
        Konstante test1 = test;
        assertEquals(test1, test);
    }
    @Test
    void testSomeMethod2() {
        int test = 50;
        Konstante test1 = new Konstante(test);
        assertFalse(test1.equals(test));
    }

}
