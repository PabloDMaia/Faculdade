package Collection;

import java.util.ArrayList;

public class ExpArrayList{
    
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Arsène");
        listaNome.add("Satanael");
        listaNome.add("Raoul");
        listaNome.add("Joker");

        for(String nome: listaNome){
            System.out.println(nome);
        }


    }

}