package se.asplund.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Random;

/**
 * Hello world!
 */
public class App implements Runnable{
    private static Logger logger = LoggerFactory.getLogger(App.class);
    private Random rnd = new Random();

    public static void main(String[] args) {
        App app = new App();
        for(int i = 0 ; i < 10 ; ++i) {
            Thread thread = new Thread(app);
            thread.start();
        }
    }

    public void run() {
        MDC.put("TestKey", String.valueOf(Thread.currentThread().getId()));
        try {
            Thread.sleep(rnd.nextLong() + 400);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        logger.info("Hello World master");
    }
}
