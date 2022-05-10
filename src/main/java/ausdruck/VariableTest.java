package ausdruck;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VariableTest {

    @Test
    void testMethode1(){
        Variable test = new Variable("x");
        assertEquals(test, new Variable("x"));
    }

    @Test
    void testMethode2(){
        Variable test = new Variable("xyz");
        assertEquals(test, new Variable("xyz"));
    }

    @Test
    void testMethode3(){
        String test = "x";
        Variable testV = new Variable(test);
        assertEquals(testV, new Variable("x"));
    }

    @Test
    void testMethode4(){
        Variable test = new Variable("a b");
        assertEquals(test, new Variable("a b"));
    }

    @Test
    void testMethode5(){
        Variable test = new Variable("");
        assertEquals(test, new Variable(""));
    }

    @Test
    void testMethode6(){
        Variable test = new Variable("x");
        Variable test1 = test;
        assertEquals(test1, test);
    }

    @Test
    void testMethode7(){
        Variable test = new Variable("a");
        Variable test1 = test;
        test = new Variable("c");
        assertFalse(test1.equals(test));
    }

}
