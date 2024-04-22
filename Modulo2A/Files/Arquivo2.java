package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo2 {
    
    public static void main(String[] args) {

        String nome = "C:\\Users\\Pablo\\Downloads\\asdasd.txt";

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); //le a primeira linha
            while (linha != null){
                System.out.println(linha);
                linha = lerArq.readLine();//le da segunda linha ate a ultima
            }
            arq.close();
        }catch(IOException e){
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }
}
