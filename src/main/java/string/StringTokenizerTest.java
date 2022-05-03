package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

public class StringTokenizerTest {

    StringTokenizer st;

    @BeforeEach
    void setUp(){
        st = new StringTokenizer("--abc +-xyz", "+-");
    }

    @Test
    @DisplayName("nextToken")
    void nextTokenTest1(){
        assertEquals("abc ", st.nextToken(), "Funzt net");
        assertEquals("xyz", st.nextToken(), "Funzt net");
    }

    @Test
    @DisplayName("hasMoreToken - Teste True Ausgabe")
    void hasMoreTokenTest1(){
        assertTrue(st.hasMoreTokens());
    }

    @Test
    @DisplayName("hasMoreToken - Teste False Ausgabe")
    void hasMoreTokenTest2(){
        st.nextToken();
        st.nextToken();

        assertFalse(st.hasMoreTokens());
    }




}
