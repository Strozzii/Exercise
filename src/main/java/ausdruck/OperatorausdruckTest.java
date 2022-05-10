package ausdruck;

import ausdruck.parser.Konstante;
import ausdruck.parser.Operatorausdruck;
import ausdruck.parser.Variable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperatorausdruckTest {

    private Operatorausdruck op1,op2,op3;

    @BeforeEach
    void setUp() {
        op1 = new Operatorausdruck(new Konstante(69), '+',new Konstante(42));
        op2 = new Operatorausdruck(new Variable("x"), '/',new Variable("y"));
        op3 = new Operatorausdruck(op1, '*',op2);
    }
    @Test
    void testSomeMethod() {
        assertFalse(op1.equals(op3));
    }
    @Test
    void testSomeMethod1() {
        Operatorausdruck kontrolle = new Operatorausdruck(
                new Operatorausdruck(new Konstante(69), '+',new Konstante(42)),
                '*',
                new Operatorausdruck(new Variable("x"), '/',new Variable("y")));
        assertEquals(op3, kontrolle);
    }


}
