package ua.rozborsky.testApplication;


import org.apache.log4j.Logger;


/**
 * Created by roman on 12.09.2016.
 */
public class Main {
    public static final Logger logger = Logger.getLogger(Greeting.class);

    public static void main(String[] args) {
        logger.info("application start");

        Greeting greeting = new Greeting();
        greeting.showMessage();

        logger.info("application close");
    }
}
