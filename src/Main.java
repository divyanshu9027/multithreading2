public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println("thread priority is"+t1.getPriority());
        t1.setPriority(10);
        System.out.println("thread priority after generating is"+t1);

    }
}
