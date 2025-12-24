import java.util.Scanner;
public class StopWatch {
    static long startTime;
    static long endTime;

    static void start() {
        startTime = System.currentTimeMillis();
    }

    static void stop() {
        endTime = System.currentTimeMillis();
    }

    static long elapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press ENTER to start the Stopwatch");
        sc.nextLine();
        start();
        System.out.println("Press ENTER to stop the Stopwatch");
        sc.nextLine();
        stop();
        System.out.println("Elapsed Time (milliseconds): " + elapsedTime());
    }
}