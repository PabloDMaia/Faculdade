package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedSetHash {
    
    public static void main(String[] args) {

        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(7);
        numArrayList.add(6);
        numArrayList.add(8);
        numArrayList.add(7);

        System.out.println("ArrayList: " + numArrayList);


        LinkedHashSet<Integer> numLinkedHashSet = new LinkedHashSet<>(numArrayList);
        System.out.println("LinkedHashSet: " + numLinkedHashSet);
        
    }
}
