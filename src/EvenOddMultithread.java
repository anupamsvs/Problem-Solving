public class EvenOddMultithread {
    public static void main(String... args){
        Printer printer = new Printer();
        Thread tEven = new Thread(new MyThread(10,printer,true));
        Thread tOdd = new Thread(new MyThread(10, printer, false));
        tOdd.start();
        tEven.start();
    }
}

class MyThread implements Runnable {

    private int max;
    private Printer printer;
    private Boolean isEven;

    public MyThread(int max, Printer printer, Boolean isEven) {
        this.max = max;
        this.printer = printer;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        int number = isEven == true ? 2 : 1;
         while(number <= max){
            if(isEven){
                printer.printEven(number);
            }
            else{
                printer.printOdd(number);
            }
             number += 2;
         }
    }
}

class Printer {

    boolean isOdd = false;

    public synchronized void printEven(int i){
        while(!isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even " + Thread.currentThread().getName() + "number" +i);
        isOdd = false;
        notifyAll();
    }
    public synchronized void printOdd(int i){
        while(isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd " + Thread.currentThread().getName() + "number" +i);
        isOdd = true;
        notifyAll();
    }
}
