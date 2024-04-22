package Collection;

import java.util.TreeMap;

public class TreeMapa {
    
    public static void main(String[] args) {
        
        TreeMap<String, String> mapaNomes = new TreeMap<>();
        mapaNomes.put("Joker", "Arsène");
        mapaNomes.put("Ann", "Milade");
        mapaNomes.put("Makoto", "Johanna");
        mapaNomes.put("Morgana", "Zorro");

        System.out.println("TreeMap de Nomes: " + mapaNomes);

        System.out.println("Chaves: " + mapaNomes.keySet());
        System.out.println("Valores: " + mapaNomes.values());
        System.out.println("Chave/Valor: " + mapaNomes.entrySet());

    }

}
