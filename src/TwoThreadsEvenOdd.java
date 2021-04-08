public class TwoThreadsEvenOdd {

    private static final int MAX = 10;
    public static void main(String[] args) {
        Thread evenT = new Thread(new EvenOddThreads(MAX, true));
        Thread oddT = new Thread(new EvenOddThreads(MAX,false));
        oddT.start();
        evenT.start();
    }
}

class EvenOddThreads implements Runnable{

    int max;
    Boolean isEven;

    public EvenOddThreads(int max, Boolean even) {
        this.max = max;
        this.isEven = even;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"running tread ");
        printNumber(max, isEven);
    }
    private synchronized void printNumber(int max, Boolean isEven) {
        if(isEven){

        }
        else {

        }
    }
}