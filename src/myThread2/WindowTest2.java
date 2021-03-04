package myThread2;

class Window3 implements Runnable {

    private int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}


public class WindowTest2 {
    public static void main(String[] args){
        Window3 w = new Window3();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();



    }

}
