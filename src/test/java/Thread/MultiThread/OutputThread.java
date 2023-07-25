package Thread.MultiThread;

public class OutputThread {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();

        Thread thread = new Thread(firstThread);
        SecondThread secondThread = new SecondThread();
        secondThread.start();

        thread.start();
    }
}
