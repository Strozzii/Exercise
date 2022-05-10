package ausdruck.parser;

public class Operatorausdruck extends Ausdruck {

    private Ausdruck a1, a2;
    private char op;

    public Operatorausdruck(Ausdruck a, char z, Ausdruck b){
        a1 = a;
        a2 = b;
        op = z;
    }

    @Override
    public boolean equals(Object a){
        boolean istGleich = false;
        if(a instanceof Operatorausdruck o){
            istGleich = (this.a1.equals(o.a1)) && (this.a2.equals(o.a2)) && (this.op == o.op);
        }
        return istGleich;
    }

    @Override
    public int hashCode(){
        return this.a1.hashCode() + this.a2.hashCode() + this.op;
    }


    @Override
    public int gibWert(Variablenbelegung a) {
        return 0;
    }
}
