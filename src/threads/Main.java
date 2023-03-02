package threads;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.setName("birinchi oqim");
        thread2.setName("ikkinchi oqim");

        thread1.start();
        thread2.start();
    }
}
