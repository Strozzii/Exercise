package permutation;

public class Permutation {

    int[] folge;

    public Permutation(int n){
        folge = new int[n];

        for(int i = 0; i < n; i++){
            folge[i] = i;
        }

    }

    public String gibAlsText(){
        String s = "";

        for(int i = 0; i < folge.length - 1; i++){
            s += folge[i];
            s += '-';
        }

        s += folge[folge.length - 1];

        return s;
    }

    public boolean naechstePermutation(){


        boolean nextPermut = true;

        // Deklariere Index i auf das letzte Element

        int i = folge.length - 1;

        /**
         * Bewege Index nach links um das größte
         *  nicht-aufsteigende Stück zu erhalten
         */

        while(i > 0 && folge[i - 1] > folge[i]){
            i--;
        }

        if(i <= 0){

            /**
             * Falls Index i auf das erste Element im Array zeigt, dann
             * existiert keine neue Permutation mehr
             */

            nextPermut = false;

        } else {

            /**
             * Das Element links vom Index i ist das Pivotelement
             */

            /**
             * Suche nun das erste rechte Element was größer als
             * als das Pivotelement ist
             */

            int j = folge.length - 1;
            while(folge[j] <= folge[i - 1]){
                j--;
            }

            /**
             * Tausche Pivotelement mit dem rechtesten Element
             */

            int tmp = folge[i - 1];
            folge[i - 1] = folge[j];
            folge[j] = tmp;

            /**
             * Kehre rechtes Teilstück des Arrays um
             */

            j = folge.length - 1;
            while(i < j){
                tmp = folge[i];
                folge[i] = folge[j];
                folge[j] = tmp;
                i++;
                j--;
            }
        }
        return nextPermut;



    }


}
