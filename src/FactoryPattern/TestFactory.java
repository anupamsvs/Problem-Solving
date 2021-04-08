package FactoryPattern;

public class TestFactory {

    public static void main(String... args){

        Computer pc = ComputerFactory.getComputer("PC","2 GB","500 GB","2.4 Ghz");
        Computer server = ComputerFactory.getComputer("Server","8 GB","1 TB","2.9 Ghz");
        System.out.println("PC Config: "+ pc);
        System.out.println("Server Config: "+ server);
    }
}
