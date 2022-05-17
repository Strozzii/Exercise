package permutation;

public class Permutation_2 {

    int[] folge;

    public Permutation_2(int n){
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

    public boolean naechstePermutation() {
        boolean nextPermut = true;
        int i = folge.length - 1;
        for (; i > 0 && folge[i - 1] >= folge[i]; i--);
        if (i <= 0){
            nextPermut = false;
        } else {

            int j = folge.length - 1;
            for (; folge[j] <= folge[i - 1]; j--);
            int temp = folge[i - 1];
            folge[i - 1] = folge[j];
            folge[j] = temp;


            for (j = folge.length - 1; i < j; i++, j--) {
                temp = folge[i];
                folge[i] = folge[j];
                folge[j] = temp;
            }
        }
        return nextPermut;
    }

}
