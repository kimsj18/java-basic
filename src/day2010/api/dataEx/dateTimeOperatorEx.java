package day2010.api.dataEx;
//LocalDateTime 클래스는 시간을 조작 할 수 있는 기능 제공

import javax.xml.transform.sax.SAXResult;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeOperatorEx {
    public static void main(String[] args) {

        //1. 현재 시간 받아오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");
        System.out.println("현재시간 :"+now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년후 현재시간 : "+result1.format(dtf));

        //1달 전
        LocalDateTime result2 = now.minusMonths(1);
        System.out.println("1달 전 현재시간 : " + result2.format(dtf));

        //일주일후
        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 후 : "+result3.format(dtf));

        //LocalDateTime target = LocalDateTime.of(year,month,dayofMonth,hour,minute,second);
        LocalDateTime startDateTime = LocalDateTime.of(2025,02,10,0,0,0);
        System.out.println("시작일 : "+startDateTime.format(dtf));
        LocalDateTime endDateTime = LocalDateTime.of(2025,02,11,0,0,0);
        System.out.println("종료일 : "+ endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)) System.out.println("진행중");
        else if(startDateTime.isEqual(endDateTime)){
            System.out.println("종료함");
        }else if(startDateTime.isAfter(endDateTime)) System.out.println("종료했음");



    }
}
