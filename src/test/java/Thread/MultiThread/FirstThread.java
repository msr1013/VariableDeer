package Thread.MultiThread;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("value of thread is :"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
