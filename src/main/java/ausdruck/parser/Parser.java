package ausdruck.parser;

public class Parser {

    public static Ausdruck parse(String a){
        return new Operatorausdruck(new Konstante(69), '+', new Konstante(42));
    }

}
