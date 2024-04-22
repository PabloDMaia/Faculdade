/*package Excecao;

import java.util.Scanner;

public class CriaExcecao {
    
    public class Divisao {
     
        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            int opcao;
    
            do{
                System.out.println("Digite 1 ou 2:");
                System.out.println();
                try{
                    opcao = teclado.nextInt();
                    switch(opcao){
                        case 1:{
                            System.out.println("Vc digitou " + opcao);
                            break;
                        }
                        case 2:{
                            System.out.println("Vc digitou " + opcao);
                            break;
                        }
                        default:{
                            throw new Excecao("Erro");
                        }
                    }
                }
                catch(Excecao excecao){
                    System.out.println(excecao.getMessage());
                }
                finally{
                    System.out.println("-------------------");
                }
            }while(true);
    
        }
    }    
}*/
