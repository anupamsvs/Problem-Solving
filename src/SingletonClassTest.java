import java.lang.reflect.Constructor;

public class SingletonClassTest {

    static class SingletonEager {
        private SingletonEager() {
        }
        private static volatile SingletonClassTest clazz = new SingletonClassTest();

        public SingletonClassTest getInstance() {
            return clazz;
        }
    }

    static class SingletonStaticBlock{
        private SingletonStaticBlock(){}
        private static SingletonStaticBlock clazz;
        static{
            try{
                clazz = new SingletonStaticBlock();
            }
            catch(Exception e) {
                throw new RuntimeException("Exception while creating singleton instance");
            }
        }
        public SingletonStaticBlock getInstance(){
            return clazz;
        }
    }

    static class SingletonLazy{

        private SingletonLazy() {}
        private static SingletonLazy clazz;

        public static SingletonLazy getInstance(){
            if(clazz == null){
                clazz = new SingletonLazy();
            }
            return clazz;
        }
    }

    static class SingletonSyncLazy{

        private SingletonSyncLazy() {}
        private static SingletonSyncLazy clazz;

        public synchronized static SingletonSyncLazy getInstance(){
            if(clazz == null){
                clazz = new SingletonSyncLazy();
            }
            return clazz;
        }
    }

    static class SingletonDoubleCheckSyncLazy{
        private SingletonDoubleCheckSyncLazy(){}
        private static SingletonDoubleCheckSyncLazy clazz;

        public static SingletonDoubleCheckSyncLazy getInstance(){
            if(clazz == null){
                synchronized(SingletonDoubleCheckSyncLazy.class){
                    if(clazz == null){
                        clazz = new SingletonDoubleCheckSyncLazy();
                    }
                }
            }
            return clazz;
        }
    }

    static class SingletonBillPugh{
        private SingletonBillPugh(){}

        private static class SingletonBillPughInner{
            private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
        }

        public static SingletonBillPugh getInstance(){
            return SingletonBillPughInner.INSTANCE;
        }
    }

    public static void main(String... args){
        SingletonLazy instanceOne = SingletonLazy.getInstance();
        SingletonLazy instanceTwo = null;

        try {
            Class<SingletonLazy> clazz = (Class<SingletonLazy>) Class.forName("SingletonLazy");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for(Constructor cons : constructors){
                cons.setAccessible(true);
                instanceTwo = (SingletonLazy) cons.newInstance();
                break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
