package myThread2;



class Window4 extends Thread {
    private static int ticket = 100;
   // public  Object obj=new Object();
     static A a=new A();

    public void run() {
        while (true) {
            synchronized (a){
            if (ticket > 0) {
                System.out.println(getName() + "买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
        }
    }
}

public class SynTest2 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
class A{}
