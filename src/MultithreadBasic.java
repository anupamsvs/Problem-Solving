public class MultithreadBasic {
    public static void main(String... args){
        System.out.println("Thread name: "+ Thread.currentThread().getName());

        //Thread t1 = new Thread(new MyThread());
 /*       Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name: "+ Thread.currentThread().getName());
                int i=0;
                while(i++ < 1000) {
                    System.out.println(i);
                }
            }
        });*/
        Thread t1 = new Thread(() -> {
            System.out.println("Thread name: "+ Thread.currentThread().getName());
            int i=0;
            while(i++ < 1000) {
                System.out.println(i);
            }
        });
        t1.start();
        System.out.println("Thread name: "+ Thread.currentThread().getName());

    }
}
/*class MyThread extends Thread{

    public void run(){
        System.out.println("Thread name: "+ Thread.currentThread().getName());
        int i=0;
        while(i++ < 1000) {
            System.out.println(i);
        }
    }
}*/
/*class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name: "+ Thread.currentThread().getName());
        int i=0;
        while(i++ < 1000) {
            System.out.println(i);
        }
    }
}*/
