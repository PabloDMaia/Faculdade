package Files;

import java.io.File;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome de um arquivo com o seu path:\nc");
        String nome = teclado.next();

        File objFile = new File(nome);
        if (objFile.exists()){
            if(objFile.isFile()){
                System.out.println("Nome do arquivo: " + objFile.getName());
                System.out.println("Tamanho do aquivo: " + objFile.length());
            }
        } else System.out.printf("Arquivo inexistente");
    }
}
