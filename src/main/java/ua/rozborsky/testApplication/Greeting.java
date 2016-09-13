package ua.rozborsky.testApplication;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by roman on 12.09.2016.
 */
public class Greeting {

    PartOfDay partOfDay;

    public void showMessage() {

        partOfDay = new PartOfDay();

        ResourceBundle bundle = ResourceBundle.getBundle(setLanguage());
        String message = bundle.getString(partOfDay.getPart());
        System.out.println(message);
        Main.logger.info("application write: \"" + message + "\"");
    }

    private String setLanguage() {
        Locale locale = Locale.getDefault();
        String messageFile = "Messages_default";

        if (locale.toString().equals("ru_RU")){
            messageFile = "Messages_ru";
        }
        return messageFile;
    }
}