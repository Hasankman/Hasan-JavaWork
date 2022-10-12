package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPack {
    public static void main(String[] args) {
        ArrayList<Integer> faveNums = new ArrayList<>();

        faveNums.add(10);
        faveNums.add(1355417);
        faveNums.add(63);

        Collections.sort(faveNums);

        for (int i : faveNums) {
            System.out.println(i);
        }
    }
}