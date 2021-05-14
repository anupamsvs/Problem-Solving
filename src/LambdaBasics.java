public class LambdaBasics {
    public static void main (String[] args) {
        Thread t1 = new Thread(()-> System.out.println("Hello Myhthread from Lambda") ,"MyThread-1");
        t1.start();
    }
}