import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int val1, val2, val3, val4, soma;


        
        ArrayList<Integer> listaNum = new ArrayList<>();
        System.out.println("Digite o valor 1");
        listaNum.add(val1 = input.nextInt());
        System.out.println("Digite o valor 2");
        listaNum.add(val2 = input.nextInt());
        System.out.println("Digite o valor 3");
        listaNum.add(val3 = input.nextInt());
        System.out.println("Digite o valor 4");
        listaNum.add(val4 = input.nextInt());
        
        soma = val1 + val2 + val3 + val4;

        System.out.println("Valores:");
        for(Integer num: listaNum){
            System.out.println(num);
        }
        System.out.println("======================");
        System.out.println("Soma: " + soma);

    }
}
