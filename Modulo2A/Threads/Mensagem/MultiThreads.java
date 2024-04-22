package Threads.Mensagem;

public class MultiThreads {
    public static void main(String[] args) {
        MinhaClasseComum minhaClasseComum = new MinhaClasseComum();
        MinhaThread minhaThread_1 = new MinhaThread(minhaClasseComum, "Welcome");
        MinhaThread minhaThread_2 = new MinhaThread(minhaClasseComum, "new");
        MinhaThread minhaThread_3 = new MinhaThread(minhaClasseComum, "programmer");
    }
}
