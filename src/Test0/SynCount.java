package Test0;

class Count implements Runnable {
    private static int money = 0;

    A a = new A();

    public void run() {
        synchronized (a) {
            for (int i = 0; i < 3; i++) {

                money += 1000;
                System.out.println(Thread.currentThread().getName() + " " + money);
            }
        }
    }
}


public class SynCount {
    public static void main(String[] args) {
        Count cc1 = new Count();
        Thread t1 = new Thread(cc1);
        Thread t2 = new Thread(cc1);
        t1.setName("子进程1");
        t2.setName("子进程2");
        t1.start();
        t2.start();

    }
}

class A {
}