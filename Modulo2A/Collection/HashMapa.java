package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapa {
    
    public static void main(String[] args) {
        
        Map<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Cobol");
        System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);

        String valor = linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + valor);

    }

}
