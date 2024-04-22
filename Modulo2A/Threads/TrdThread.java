package Threads;

public class TrdThread {
    public static void main(String[] args) {
        MyThread2 minhaThread = new MyThread2();
        Thread thread = new Thread(minhaThread);
        thread.start();
        System.out.println("Thread Principal");
    }
}
