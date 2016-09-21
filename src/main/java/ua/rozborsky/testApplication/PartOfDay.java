package ua.rozborsky.testApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by roman on 12.09.2016.
 */
public class PartOfDay {

    public String getPart() {
        String partOfDay = "evening";

        int time = getTime();

        if ( 6 <= time && time < 9) {
            partOfDay = "evening";
        } else if ( 9 <= time && time < 19) {
            partOfDay = "evening";
        } else if ( 19 <= time && time < 23) {
            partOfDay = "evening";
        }

        return partOfDay;
    }

    private int getTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");

        return Integer.parseInt(simpleDateFormat.format(calendar.getTime()));
    }
}