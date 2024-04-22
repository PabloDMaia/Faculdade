package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapa {
    
    public static void main(String[] args) {
        
        Map<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("Joker","Arsène");
        listaNomes.put("Queen", "Johanna");
        listaNomes.put("Panther", "Milade");
        listaNomes.put("Mona", "Zorro");
        
        System.out.println("LinkedHashMap1: " + listaNomes);

        LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
        novaListaNomes.put("Skull", "Cpt.Kidd");
        System.out.println("LinkedHashMap2: " + novaListaNomes);

    }

}
