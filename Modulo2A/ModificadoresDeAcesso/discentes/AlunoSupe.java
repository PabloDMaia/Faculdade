package ModificadoresDeAcesso.discentes;

public class AlunoSupe extends Aluno {


    public double getMedia() {
        return (teste+prova)/2;
    }

    //default uso apenas dentro do mesmo package
    /*double getMedia() {
        return (teste+prova)/2;
    }*/

}
