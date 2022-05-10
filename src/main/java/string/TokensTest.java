package string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TokensTest {

    String s = "abc-def+ghi";
    String t = "+-";

    @BeforeEach
    void setUp(){
        s = "abc-def+ghi";
        t = "+-";
    }

    @Test
    @DisplayName("Tokens Test")
    void tokensTest(){
        assertEquals("def", Tokens.tokens(s,t)[1], "Funzt net!");
    }


}
