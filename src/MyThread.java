public class MyThread implements Runnable{
    private String name;
    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("Thread " + name + ": " + i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " broken...");
            }
        }
    }
}
