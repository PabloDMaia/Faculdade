import java.util.Scanner;

public class ExFor {
    public static void main(String[] args) {
        /*//int i;
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }*/

        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);

        for(int na=1;na<=3;na++){
            System.out.println("Aluno " + na);
            System.out.println("Digite a nota 1: ");
            nota1 = input.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = input.nextDouble();

            media = (nota1+nota2)/2;
            System.out.println("Média: " + media);
            System.out.println("---------------");
        }

    }

}
