package ausdruck.parser;

public class Variablenbelegung extends Ausdruck {

    public Variablenbelegung() {

    }



    public void belege(String a, int b){

    }

    public int gibWert(String a){
        return 420;
    }

    @Override
    public int gibWert(Variablenbelegung a) {
        throw new UnsupportedOperationException("-");
    }


}
