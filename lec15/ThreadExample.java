package lec15;
public class ThreadExample {

    static class MyThread extends Thread {
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                System.out.println("MyThread " + i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main " + i);
        }
    }
}
