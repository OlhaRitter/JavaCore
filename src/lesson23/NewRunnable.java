package lesson23;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10==0){
                System.out.println(Thread.currentThread().getName()+ " "+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        Thread thread1 = new Thread(newRunnable);
        Thread thread2 = new Thread(newRunnable);
        Thread thread3 = new Thread(newRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
