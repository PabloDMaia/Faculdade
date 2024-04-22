package Threads;

public class ScdThread{
    public static void main(String[] args) {
        MyThread minhaThread = new MyThread();
        minhaThread.start();
        System.out.println("Thread Principal");
    }
}
