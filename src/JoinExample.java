public class JoinExample {
    public static void main(String... args){

        Thread t1 = new Thread(() -> {
            System.out.println("--Thread Name--"+Thread.currentThread().getName());
            for(int i=0 ; i < 100 ; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
}

