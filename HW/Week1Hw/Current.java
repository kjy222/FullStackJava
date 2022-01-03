package Week1Hw;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Current {
    Date now = Date.now("yyyy-dd-mm");

    int year = now.getYear();
    int month = now.getMonth();
    int day = now.getDay();

    System.out.println(now);
    System.out.println(year);
    System.out.println(day);
    System.out.println(now);

}
// 과제9) java.util.Date, java.text.SimpleDateFormat 을 임포트하고 현재 날짜를 2021-12-31 23:59:59 로 출력하시오.