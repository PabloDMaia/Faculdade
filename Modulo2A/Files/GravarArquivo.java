package Files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarArquivo {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileWriter arq = new FileWriter("C:\\Users\\Pablo\\Downloads\\asdasd.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        System.out.println("Digite sua matricula: ");
        matricula = teclado.next();
        
        System.out.println("Digite seu nome: ");
        nome = teclado.next();

        System.out.println("Digite seu teste: ");
        teste = teclado.nextDouble();

        System.out.println("Digite sua prova: ");
        prova = teclado.nextDouble();

        System.out.println("Digite suas faltas: ");
        faltas = teclado.nextInt();

        gravarArq.println(matricula);
        gravarArq.println(nome);
        gravarArq.println(teste);
        gravarArq.println(prova);
        gravarArq.println(faltas);

        arq.close();

        System.out.println("Gravacao efetuada com sucesso");
    }    
}
