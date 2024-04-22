import javax.swing.*;

class AP16 {
    public static void soma() {
        int s = 0, vet[] = new int [5];

        for(int i = 0; i < vet.length; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteito para posicao " + i));
            s = s + vet[i];
        }

        JOptionPane.showMessageDialog(null, "A somatoria é "+ s);
    }    

    public static int produto() {
        int p = 1, vet[] = new int [5];

        for(int i = 0; i < vet.length; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteito para posicao " + i));
            p = p * vet[i];
        }
        return p;
    }

    public static void main(String entrada[]) {
        int r;

        soma();
        r = produto();
        JOptionPane.showMessageDialog(null, "A produtoria é "+ r);
        System.exit(0);
    }
}
