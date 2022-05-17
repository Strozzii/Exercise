package permutation;

public class PermutExec {

    public static void main(String[] args) {
        Permutation_2 p = new Permutation_2(10);
        //Permutation p = new Permutation(10);

        System.out.println(p.gibAlsText());

        System.out.println(p.naechstePermutation());

        System.out.println(p.gibAlsText());

        for(int i = 0; i < 362878; i++){
            p.naechstePermutation();
        }

        System.out.println(p.gibAlsText());

        System.out.println(p.naechstePermutation());
        System.out.println(p.gibAlsText());

        for(int i = 0; i < 3265918; i++){
            p.naechstePermutation();
        }

        System.out.println(p.gibAlsText());
        System.out.println(p.naechstePermutation());
        System.out.println(p.gibAlsText());
        System.out.println(p.naechstePermutation());
        System.out.println(p.gibAlsText());

        System.out.println("-------------------");




    }
}
