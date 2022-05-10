package ausdruck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    private Ausdruck a1, a2, a3;

    @BeforeEach
    void setUp() {
        a1 = new Operatorausdruck(new Konstante(50), '+', new Konstante(32));
        a2 = new Operatorausdruck(new Variable("x"), '/', new Variable("y"));
        a3 = new Operatorausdruck(a1, '*', a2);
    }

    @Test
    void testParse1() {
        assertEquals(a1, Parser.parse("50 + 32"));
    }

    @Test
    void testParse2() {
        assertEquals(a3, Parser.parse("(50 + 32) * (x / y)"));
    }

    @Test
    void testParse3() {
        assertFalse(a3.equals(Parser.parse("(50 + 32) * (x / y)")));
    }

    @Test
    void testParse4() {
        assertFalse(a2.equals(Parser.parse("(x /) y)")));
    }

}
