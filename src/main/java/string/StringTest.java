package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringTest {

    String s;

    @BeforeEach
    void setUp() {
        s = "0123456789";
    }

    @Test
    @DisplayName("Konventioneller Substring Aufruf")
    void substringTest1(){
        assertEquals("345", s.substring(3,6), "Funzt net!");
    }

    @Test
    @DisplayName("Substring mit EINEM Parameter")
    void substringTest2(){
        assertEquals("56789", s.substring(5), "Funzt net!");
    }

    @Test
    @DisplayName("Leeren String hervorholen")
    void substringTest3(){
        assertEquals("", s.substring(10), "Funzt net!");
        assertEquals("", s.substring(5,5), "Funzt net!");
    }

    @Test
    @DisplayName("OutOfBound erzeugen")
    void substringTest4(){
        assertThrows(IndexOutOfBoundsException.class, () -> s.substring(5,14), "IndexOutOfBound wurde erwartet...");
    }

    @Test
    @DisplayName("AssertSame nutzen")
    void substringTest5(){

    }


}
