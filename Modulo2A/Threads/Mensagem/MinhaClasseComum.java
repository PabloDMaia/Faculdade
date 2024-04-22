package Threads.Mensagem;

public class MinhaClasseComum {
    /*synchronized*/ public void exibir(String msg){
        System.out.println("[" + msg);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}    

