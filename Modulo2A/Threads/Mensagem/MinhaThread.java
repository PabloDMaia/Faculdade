package Threads.Mensagem;

public class MinhaThread extends Thread{
    String mensagem;
    MinhaClasseComum minhaClasseComum;

    MinhaThread(MinhaClasseComum classeComum, String msg){
        minhaClasseComum = classeComum;
        mensagem = msg;
        start();
    }

    public void run(){
        synchronized(minhaClasseComum){
            minhaClasseComum.exibir(mensagem);
        }
    }
}
