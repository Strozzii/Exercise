package ausdruck;

public class Konstante extends Ausdruck{

    private int kon;

    public Konstante(int kon) {
        this.kon = kon;
    }

    @Override
    public boolean equals(Object a) {
        boolean istGleich = false;
        if (a instanceof Konstante k) {
            istGleich = this.kon == k.kon;
        }
        return istGleich;
    }

    @Override
    public int hashCode() {
        return this.kon * 42;
    }

    @Override
    public int gibWert(Variablenbelegung a) {
        throw new UnsupportedOperationException("-");
    }

}
