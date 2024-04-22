package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparador{
    
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Arsène");
        listaNome.add("Satanael");
        listaNome.add("Raoul");
        listaNome.add("Joker");
        listaNome.add("Ann");

        System.out.println("Elementos antes da ordenação");

        for(int i = 0; i < listaNome.size(); i++){
            System.out.println(listaNome.get(i));
        }

        Comparator<String> comparator = Collections.reverseOrder();

        Collections.sort(listaNome, comparator);
 
        System.out.println("Elementos depois da ordenação");

        for(String nome: listaNome){
            System.out.println(nome);
        }

    }

}