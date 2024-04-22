package Collection;

import java.util.LinkedList;

public class ListaLinkada {

    public static void main(String[] args) {

        LinkedList<String> listaNome = new LinkedList<>();
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
    
