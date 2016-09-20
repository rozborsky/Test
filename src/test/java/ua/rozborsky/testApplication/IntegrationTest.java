package ua.rozborsky.testApplication;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by roman on 13.09.2016.
 */
public class IntegrationTest {
    private final ByteArrayOutputStream outString = new ByteArrayOutputStream();

    @Test
    public void application() {
        Main.logger.info("Start testing application");
        System.setOut(new PrintStream(outString));
        Greeting greeting = new Greeting();
        greeting.showMessage();
        Main.logger.info("End testing application\n");
        assertEquals(getExpectedMessage(), outString.toString());
    }

    private String getExpectedMessage() {
        String partOfDay = "Доброй ночи, мир!\r\n";

        int time = getTime();

        if ( 6 <= time && time < 9) {
            partOfDay = "Доброе утро, мир!\r\n";
        } else if ( 9 <= time && time < 19) {
            partOfDay = "Добрый день, мир!\r\n";
        } else if ( 19 <= time && time < 23) {
            partOfDay = "Добрый вечер, мир!\r\n";
        }

        return partOfDay;
    }

    private int getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        return Integer.parseInt(dateFormat.format(date));
    }
}
