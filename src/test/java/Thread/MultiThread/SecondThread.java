package Thread.MultiThread;

public class SecondThread extends Thread {

    @Override
    public void run(){
        for (int i =10;i>=1;i--){
            System.out.println("value of another thread is "+i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
