package string;

import java.util.StringTokenizer;

public class Tokens {

    public static String[] tokens(String s, String t){
        StringTokenizer st = new StringTokenizer(s,t);
        String[] tokens = new String[st.countTokens()];


        int i = 0;
        while(st.hasMoreTokens()){
            tokens[i] += st.nextToken();
            i++;
        }



        return tokens;
    }

}
