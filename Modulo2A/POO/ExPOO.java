package POO;
public class ExPOO {
    public static void main(String[] args) {
        
        /*AlunoEnsMedio aluno = new AlunoEnsMedio();
        Professor professor = new Professor();

        aluno.setNome("Arsène");;
        aluno.teste = 9;
        aluno.prova = 7;

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());

        professor.setNome("Raoul");
        professor.setSalario(1000);

        System.out.println(professor.getNome());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());*/

        AlunoEnsMedio alunoEnsMedio = new AlunoEnsMedio();
        AlunoEnsSuperior alunoEnsSuperior = new AlunoEnsSuperior();

        alunoEnsMedio.nome = "Arsène";
        alunoEnsMedio.teste = 8;
        alunoEnsMedio.prova = 9;

        System.out.println("Aluno do Ensino médio:");
        System.out.println("Nome: " + alunoEnsMedio.nome);
        System.out.println("Média: " + alunoEnsMedio.getMedia());
        

        alunoEnsSuperior.nome = "Satanael";
        alunoEnsSuperior.teste = 8;
        alunoEnsSuperior.prova = 9;

        System.out.println("Aluno do Ensino Superior:");
        System.out.println("Nome: " + alunoEnsSuperior.nome);
        System.out.println("Média: " + alunoEnsSuperior.getMedia());


    }
}
