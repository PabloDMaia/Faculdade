package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador{
    
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Arsène");
        listaNome.add("Satanael");
        listaNome.add("Raoul");
        listaNome.add("Joker");

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}