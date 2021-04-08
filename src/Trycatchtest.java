public class Trycatchtest {
    public static void main(String[] args) {
        try{
            System.out.println("in try");
            System.out.println(10/0);
            System.out.println("after finally");
        }
        catch (Exception e){
            System.out.println("in catch");
        }
        finally {
            System.out.println("in finally");
        }
    }
}
