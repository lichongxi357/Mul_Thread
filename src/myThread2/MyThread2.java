package myThread2;


class HelloThread extends Thread {

    public HelloThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                sleep(100);
            } catch (InterruptedException f) {
                f.printStackTrace();
            }
                  /*if (i % 10 == 0) {
                 //  yield();
            }*/
        }

    }
}

public class MyThread2 {
    public static void main(String[] args) {
        HelloThread t2 = new HelloThread("子线程0");
        // t2.setName("子线程1");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i == 20) {
                try {
                    System.out.println(t2.isAlive());
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
        System.out.println(t2.isAlive());
    }

}

