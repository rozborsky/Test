package ua.rozborsky.testApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by roman on 12.09.2016.
 */
public class PartOfDay {

    public String getPart() {
        String partOfDay;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");

        int time = Integer.parseInt(simpleDateFormat.format(calendar.getTime()));

        if ( 6 <= time && time < 9) {
            partOfDay = "morning";
        } else if ( 9 <= time && time < 19) {
            partOfDay = "day";
        } else if ( 19 <= time && time < 23) {
            partOfDay = "evening";
        }else {
            partOfDay = "night";
        }
        return partOfDay;
    }
}