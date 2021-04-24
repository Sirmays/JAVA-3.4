public class Printer implements Runnable {
    private char ch = 'A';

    public synchronized void printA() {
        for (int i = 0; i < 5; i++) {

            while (ch == 'B' || ch == 'C') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("A");
            ch = 'B';
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < 5; i++) {

            while (ch == 'A' || ch == 'C') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("B");
            ch = 'C';
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < 5; i++) {

            while (ch == 'A' || ch == 'B') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("C");
            ch = 'A';
            notifyAll();
        }
    }

    @Override
    public void run() {

    }
}

