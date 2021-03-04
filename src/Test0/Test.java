package Test0;


class MyThread extends  Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class Test {
        public static void main(String[] args)
        {
            MyThread t1=new MyThread("子线程:");
            t1.start();
        }

}
