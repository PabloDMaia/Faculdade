package Threads;

public class ListaNumeros {
    /*synchronized*/ void printTable(int n){
        for (int i = 1; i <= 4; i++){
            System.out.println(n + i);
            try{
                Thread.sleep(300);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
}
