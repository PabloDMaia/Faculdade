// package Files;

// import java.io.DataInputStream;
// import java.io.FileInputStream;



// public class Arquivo3 {
    
//     public static void main(String[] args) {

//         String matricula;
//         String nome;
//         double teste, prova, media;
//         int faltas;

//         FileInputStream arq = new FileInputStream("C:\\Users\\Pablo\\Downloads\\asdasd.txt");
//         DataInputStream lerArq = new DataInputStream(arq);

//         matricula = lerArq.readUTF();
//         nome = lerArq.readUTF();
//         teste = lerArq.readDouble();
//         prova = lerArq.readDouble();
//         faltas = lerArq.readInt();

//         media = (teste+prova)/2;

//         System.out.println("Matricula: " + matricula);
//         System.out.println("Nome: " + nome);
//         System.out.println("Teste: " + teste);
//         System.out.println("Prova: " + prova);
//         System.out.println("Faltas: " + faltas);
//         System.out.println("Media: " + media);

//         arq.close();
//     }
// }
