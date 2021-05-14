import java.util.concurrent.locks.ReentrantLock;

public class UsingMutexExample {

    private ReentrantLock reentrantLock = new ReentrantLock();

    public int printSequence() {
        try {
            reentrantLock.lock();
            return 1;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            reentrantLock.unlock();
        }
        return 2;
    }

}
