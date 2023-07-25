package Thread;

public class MThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        MThread mthread = new MThread();
        Thread thread = new Thread(mthread);
        thread.start();
    }

}
