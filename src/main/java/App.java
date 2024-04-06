import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {

        Thread shutdownListener = new Thread(() -> {
            System.out.println("shutdown in 10s ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ignored) {
            }
        });

        Runtime.getRuntime().addShutdownHook(shutdownListener);

        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> System.out.println("."), 0, 2, TimeUnit.SECONDS);
    }
}
