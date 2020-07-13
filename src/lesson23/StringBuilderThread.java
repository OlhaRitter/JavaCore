package lesson23;

public class StringBuilderThread extends Thread{
    private StringBuffer stringBuilder;

    public StringBuilderThread(StringBuffer stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run (){
        synchronized (stringBuilder){
        for (int i = 0; i < 100; i++) {
            System.out.print(stringBuilder.toString());
        }
        System.out.println();
        char symbol = stringBuilder.charAt(0);
        stringBuilder.setCharAt(0, ++symbol);
    }}

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("A");
        StringBuilderThread thread1 = new StringBuilderThread(str);
        StringBuilderThread thread2 = new StringBuilderThread(str);
        StringBuilderThread thread3 = new StringBuilderThread(str);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
