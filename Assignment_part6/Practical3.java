//PREPARED BY 21ce001
// Write a program to increment the value of one variable by one and display it after one
// second using thread using sleep() method.
class Practical3 implements Runnable {
    public volatile int count = 0;

    public void run() {
        Thread current = Thread.currentThread();
        try {
            while (count < 21) {
                System.out.println(current.getName() + " count = " + count++);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread one = new Thread(new Practical3(), "one");
        Thread two = new Thread(new Practical3(), "two");

        try {
            one.start();
            two.start();
            System.out.println("one alive? " + one.isAlive());
            one.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}