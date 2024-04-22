package ModificadoresDeAcesso;

import ModificadoresDeAcesso.discentes.AlunoSupe;

public class ModAcess {
    
    public static void main(String[] args) {
        
        AlunoSupe aluno = new AlunoSupe();

        //aluno.nome="Arsène"; 
        aluno.setNome("Arsène");
        //aluno.teste = 9; 
        aluno.setTeste(9);
        //aluno.prova = 10; 
        aluno.setProva(10);

       

        System.out.println(aluno.getMedia());

    }

}
