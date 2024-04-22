package Threads;

public class FstThread extends Thread {
    public void run(){
        System.out.println("Thread Secundaria");
    }
    public static void main(String[] args) {
        FstThread minhaThread = new FstThread();
        minhaThread.start();
        System.out.println("Thread Principal");
    }
}
