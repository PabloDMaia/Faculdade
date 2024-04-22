package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {

    public static void main(String[] args) {

        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Air");
        listaNome.add("Boat");
        listaNome.add("Car");
        listaNome.add("Desk");

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        
    }
    
}
