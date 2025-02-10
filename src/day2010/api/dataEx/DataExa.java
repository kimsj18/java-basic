package day2010.api.dataEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExa {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        System.out.println("=============");


        SimpleDateFormat now1 = new SimpleDateFormat("yyyy.MM.dd.ss");
        String strNow2 = now1.format(now);
        System.out.println(strNow2);
    }
}
