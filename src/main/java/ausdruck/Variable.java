package ausdruck;

public class Variable extends Ausdruck{

    private String var;

    public Variable(String a) {
        this.var = a;
    }
    @Override
    public boolean equals(Object a) {
        boolean istGleich = false;
        if (a instanceof Variable v) {
            istGleich = this.var.equals(v.var);
        }
        return istGleich;
    }
    @Override
    public int hashCode() {
        return this.var.hashCode() * 42;
    }
    @Override
    public int gibWert(Variablenbelegung a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
