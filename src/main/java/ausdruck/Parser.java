package ausdruck;

public class Parser {

    public static Ausdruck parse(String a){
        return new Operatorausdruck(new Konstante(50), '+', new Konstante(40));
    }

}
