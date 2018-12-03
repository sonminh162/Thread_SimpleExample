public class test {
    public static void main(String[] args) {
        MyThread threadI = new MyThread("Number 1");
        MyThread threadII = new MyThread("Number 2");
        Thread thread1 = new Thread(threadI);
        Thread thread2 = new Thread(threadII);
        thread1.start();
        thread2.start();
    }


}
