import javax.swing.*;

class Factorial{
    static int fat (int n){
        int f;

        if(n == 0){
            return 1;
        }else{
            f = n * fat(n-1);
            return f;
        }
    }
    public static void main(String arg[]){
        int f, nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que voce deseja saber o fatorial"));
        if(nro < 0){
            System.out.println("Valor invalido para calculo de fatorial, o valor precisa ser maior ou igaul a zero");
            System.exit(0);
        }else{
            f = fat(nro);
            System.out.println("O fatorial de " + nro + " é " + f);
        }
        System.exit(0);
    }
}
