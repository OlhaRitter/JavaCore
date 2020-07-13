package lesson23;

public class NewThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
