package zahlenfolge;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class EndlicheFolge implements Zahlenfolge{

    private int[] nums;
    private int pointer;

    public EndlicheFolge(int[] nums){
        this.nums = nums;
        this.pointer = -1;
    }

    @Override
    public boolean hatNaechstes() {
        return pointer < nums.length - 1;
    }

    @Override
    public int gibNaechstes() throws NoSuchElementException {
        if(hatNaechstes()){
            pointer++;
            return nums[pointer];
        } else {
            throw new NoSuchElementException("Kein weiteres Element vorhanden");
        }
    }
}
