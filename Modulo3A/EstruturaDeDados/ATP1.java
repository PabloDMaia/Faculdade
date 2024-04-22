import java.util.Scanner;
public class ATP1 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int i;
        double[] num = new double[50];  
        double media, soma = 0;
        for (i = 0; i <= 49; i++) {

            System.out.print("Digite um número: ");
            num[i] = input.nextDouble();
            soma = soma + num[i];

        }
        media = soma / 50;
        System.out.println("A média das 50 notas digitadas é: " + media);

 }

}