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

        MDC.put("pid", "193012299263");
        MDC.put("searcherId", "Anders Andersson");
        MDC.put("remoteHost", "143.164.83.25");
        MDC.put("remoteIp", "128.243.253.210");
        MDC.put("remotePort", "3472");
        MDC.put("remoteUser", "andand");
        MDC.put("forskrivarHsaId", "SE5555501234-P000000456456");
        MDC.put("josId", "Profdoc");
        MDC.put("josVersion", "1.836");
        logger.info("AuditLogInfoParameters");
        MDC.clear();

        MDC.put("sequenceNo", "1295879066935");
        MDC.put("pid", "194512293363");
        MDC.put("authTime", "2011-02-04@13:43:13");
        MDC.put("persNoForsk", "194412236692");
        MDC.put("arbetsplatskod", "1234567890123");
        MDC.put("authMethod", "urn:oasis:names:tc:SAML:2.0:ac:classes:Password");
        MDC.put("forskrivarkod", "1111129");
        MDC.put("remoteIp", "138.233.253.210");
        MDC.put("sysName", "VgrPliPortal");
        MDC.put("productName", "Melior Melior6.2.1.009");

        logger.info("TicketRequestParameters");
        MDC.clear();

        MDC.put("pid", "195512294545");
        MDC.put("authTime", "2011-02-04@13:43:13");
        MDC.put("overallTime", "1000");
        MDC.put("ticketCreationTime", "5000");

        logger.info("Time measurements");
        MDC.clear();
    }
}
