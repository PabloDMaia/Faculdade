// package Excecao.ExcecoesPersonalisadas;

// import java.util.Scanner;

// public class ExceptionCase {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);
//         int opcao;
//         do{
//             System.out.println("Digite o número 1 ou 2:");
//             System.out.println();
//             try{
//                 opcao = teclado.nextInt();
//                 switch(opcao){
//                     case 1:{
//                         System.out.println("Voce digitou a opção " + opcao);
//                         break;
//                     }
//                     case 2:{
//                         System.out.println("Voce digitou a opção " + opcao);
//                         break;
//                     }
//                     default:{
//                         throw new ExcecaoCustomizada();
//                     }
//                 }
//             }
//             catch(ExcecaoCustomizada excecao){
//                 System.out.println(excecao.getMessage());
//             }
//         }while(true);
//     }
// }
