package Collection;

import java.util.HashSet;

public class SetHash {

    public static void main(String[] args) {

        HashSet<String> listaNome = new HashSet<>();
        listaNome.add("Air");
        listaNome.add("Boat");
        listaNome.add("Car");
        listaNome.add("Desk");
        listaNome.add("Desk");


        for(String nome: listaNome){
            System.out.println(nome);
        }

        
    }
    
}
