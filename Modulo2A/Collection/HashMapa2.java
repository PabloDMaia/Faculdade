package Collection;

import java.util.HashMap;

public class HashMapa2 {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Cobol");
        System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);

        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valores: " + linguagensProgramacao.values());
        System.out.println("Chave/valor: " + linguagensProgramacao.entrySet());


    }

}
