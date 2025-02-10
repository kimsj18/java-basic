package day2010.api.dataEx;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();  //시스템에서 제공하는 값을 바로 받아쓴다

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int ampm = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        System.out.println(year+" "+month+" "+day+" "+week);

        String[] availableIDs = TimeZone.getAvailableIDs();
        for(String id : availableIDs) System.out.println(id);
    }
}
