package Collection;

import java.util.Vector;

public class Vetor {
    
    public static void main(String[] args) {
        
        Vector<String> listaNome = new Vector<>();
        listaNome.add("A");
        listaNome.add("B");
        listaNome.add("C");
        listaNome.add("D");

        for(String nome: listaNome){
            System.out.println(nome);
        }

    }

}
