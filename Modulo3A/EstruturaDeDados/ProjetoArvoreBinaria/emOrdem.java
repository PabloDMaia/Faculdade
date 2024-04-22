import javax.swing.*;

public static void main(String entrada[]){

    ArvoreBinaria ABB;
    ABB = new ArvoreBinaria();
    do{
        op = menu();
        vi = LerNum();
        switch (op){
            case 1: 
                emOrdem(ABB);
                break;
            case 2:
                preOrdem(ABB);
                break;
            case 3:
                posOrdem(ABB);
                break;        
        }
    }while(op<1 && op>3);
    System.exit(0);
}

public void emOrdem(No ABB){

    if(ABB != null){
        emOrdem(ABB.esquerda);
        visita(ABB);
        emOrdem(ABB.direita);
    }
}

public static void visira(No ABB){
    System.out.println(ABB.num + "  ");
}

public static int menu(){
    String msg = "";
    int op;

    msg = msg + "Digite 1 para Em Ordem\n";
    msg = msg + "Digite 2 para Pré Ordem\n";
    msg = msg + "Digite 3 para Pós Ordem\n";
    msg = msg + "Digite 0 para sair do sistema\n";

    op = Intger.parseInt(JOptionPane.showInputDialog(msg));
    return op;
}

public void preOrdem(No ABB){

    if(ABB != null){
        visita(ABB);
        preOrdem(ABB.esquerda);
        preOrdem(ABB.direita);
    }
}

public void posOrdem(No ABB){

    if(ABB != null){
        posOrdem(ABB.esquerda);
        posOrdem(ABB.direita);
        visita(ABB);
    }
}