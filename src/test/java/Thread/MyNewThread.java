package Thread;

public class MyNewThread extends Thread {

    @Override
    public void run(){
        System.out.println("Another thread is running");
    }

    public static void main(String[] args) {
        MyNewThread myNewThread = new MyNewThread();
        myNewThread.start();
    }

}
