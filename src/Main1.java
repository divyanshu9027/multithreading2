public class Main1 {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
            Thread t1 = new Thread();
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("even numbers between 1 to 100"+" "   + i);
                    try {Thread.sleep(1000);} catch(Exception e){}
                }
            }
            Thread t2 = new Thread();
            for (int i = 100; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.println("odd numbers between 100 to 0"+" " +   i);
                    try {Thread.sleep(1000);} catch(Exception e){}

                }
            }

        t1.start();
        t2.start();
K




    }

}
