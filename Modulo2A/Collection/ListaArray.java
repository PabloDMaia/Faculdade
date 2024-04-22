package Collection;

import java.util.ArrayList; 

public class ListaArray {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Arsène");
        listaNome.add("Satanael");
        listaNome.add("Raoul");
        listaNome.add("Joker");

        System.out.println("Antes");

        for(String nome: listaNome){
            System.out.println(nome);
        }


        listaNome.set(1,"Ann");

        System.out.println();
        System.out.println();

        System.out.println("Depois");

        for(String nome: listaNome){
            System.out.println(nome);
        }

    }

}
