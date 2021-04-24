public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        new Thread(() -> printer.printA()).start();
        new Thread(() -> printer.printB()).start();
        new Thread(() -> printer.printC()).start();
    }

}



