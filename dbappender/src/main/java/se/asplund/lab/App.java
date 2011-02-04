package se.asplund.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        MDC.put("TestKey", String.valueOf(Thread.currentThread().getId()));
        logger.info("Hello World master");
    }
}
