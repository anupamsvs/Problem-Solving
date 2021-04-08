import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorAndFuture {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        ExecutorService service = Executors.newFixedThreadPool(runtime.availableProcessors());
        service.submit(Animal::new);

        Future<Animal> future = service.submit(Animal::new);

        try {
            future.get();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
