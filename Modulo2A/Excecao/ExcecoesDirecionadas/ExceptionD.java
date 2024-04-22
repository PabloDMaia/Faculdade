package Excecao.ExcecoesDirecionadas;

public class ExceptionD {
    
    public static void main(String[] args) {
        
        try {
            ClasseFilha ClasseFilha = new ClasseFilha();

            ClasseFilha.executar();
        }
        catch(Exception e){
            System.out.println("Erro Classe Principal");
        }

    }

}
