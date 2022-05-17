package ausdruck;

import ausdruck.parser.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    private Ausdruck a1, a2, a3;

    @BeforeEach
    void setUp() {
        a1 = new Operatorausdruck(new Konstante(69), '+', new Konstante(42));
        a2 = new Operatorausdruck(new Variable("x"), '/', new Variable("y"));
        a3 = new Operatorausdruck(a1, '*', a2);
    }

    @Test
    void testParse1() {
        assertEquals(a1, Parser.parse("69 + 42"));
    }

    @Test
    void testParse2() {
        assertFalse(a3.equals(Parser.parse("(69 + 42) * (x / y)")));
    }

    @Test
    void testParse3() {
        assertFalse(a2.equals(Parser.parse("(x /) y)")));
    }

}
