package Week02Hw;

import java.util.Calendar;

// 과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
abstract class Airplane {
    // 과제5) 출발지와 도착지를 멤버변수로 만들고, 
    public String departure; // 출발지
    public String arrival; // 도착지
    public Calendar departureDate; // 출발 날짜
    public Calendar arrivalDate; // 도착 날짜
    public isDomestic;

    Airplane() {

    }

    // 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
    void domesticFlight() {
        this.departure = departure;
        this.arrival = arrival;
    }
    void internationalFlight() {
        this.departure = departure;
        this.arrival = arrival;
    }
    
    // 출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
    public Calendar getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate() {
        this.departureDate = departureDate;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate() {
        this.arrivalDate = arrivalDate;
    }
}
// 국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
// 국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
// 과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는 국제선에 따라서
class Air extends Airplane {
    String flight() {
        return arrival;
    }
}
// Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)

public class Q2 {
     public static void main(String[] args) {
         // main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
         Airplane airplain = new Airplane();
     }
}
