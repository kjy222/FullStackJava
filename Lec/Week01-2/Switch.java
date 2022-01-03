import java.util.*;

public class Switch {
    // switch 문 코드
    //switch(입력변수) {
    //    case 입력값1: ...
    //        break;
    //    case 입력값2: ...
    //        break;
    //    ...
    //    default: ...
    //        break;
    //}

    public static void main(String[] args){
        // //Ex1 month 를 기준으로 몇 월인지 문자로 출력하는 예제
        // int month = 8;
        // String monthString = "";
        // switch (month) { //swtich (변수 지정)
        //     case 1:  monthString = "January"; //값은 case에 
        //              break; // 다 돌면 break
        //     case 2:  monthString = "February";
        //              break;
        //     case 3:  monthString = "March";
        //              break;
        //     case 4:  monthString = "April";
        //              break;
        //     case 5:  monthString = "May";
        //              break;
        //     case 6:  monthString = "June";
        //              break;
        //     case 7:  monthString = "July";
        //              break;
        //     case 8:  monthString = "August";
        //              break;
        //     case 9:  monthString = "September";
        //              break;
        //     case 10: monthString = "October";
        //              break;
        //     case 11: monthString = "November";
        //              break;
        //     case 12: monthString = "December";
        //              break;
        //     default: monthString = "Invalid month";
        //              break;
        // }
        // System.out.println(monthString);

        // //Q1  Switch / case문을 사용하여 짝수이면 "짝수입니다." 홀수이면 "홀수입니다."를 출력 미해결
        // System.out.print("숫자를 입력하세요 : ");
        // Scanner sc= new Scanner(System.in);
        // int num=sc.nextInt();
        // String numString = "";
        // switch (num) {
        //         case 1: 
        //             if(num%2==0) 
        //                 numString = "짝수입니다.";
        //             break;
        //         case 2: 
        //             if(num%2!=0) 
        //                 numString = "홀수입니다.";
        //             break;
        // }
        // System.out.println(numString);

        // 단항 연산자
        // i++, i--, ++i, --i, +i, -i, !b

        // 이항 연산자
        // a+b, a-b, a*b, a/b, a&b

        // 삼항 연산자
        // num%2==0?1:2
        // (조건식)?(참이면):(거짓이면)

        // //Q2 Switch / case문을 사용하여 사용자로부터 점수를 입력받아 점수가 90이상이면 'A', 90미만 80이상이면 'B', 80미만 70이상이면 'C', 70미만 60이상이면 'D', 그 미만이면 'F'를 출력
        // System.out.print("점수를 입력하세요 : ");
        // Scanner sc= new Scanner(System.in);
        // int score= sc.nextInt();
        // switch(score){
        //     case 1: 
        //         if(score>=90){
        //             System.out.print("A");
        //         }
        //         break;
        //     case 2:
        //         if(score>79 && score<91){
        //             System.out.print("B");
        //         }
        //         break;
        //     case 3:
        //         if(score>69 && score<81){
        //             System.out.print("C");
        //         }
        //         break;
        //     case 4:
        //         if(score>59 && score<71){
        //             System.out.print("D");
        //         }
        //         break;
        //     case 5:
        //         if(score<60){
        //             System.out.print("F");
        //         }
        //         break;
        // }

        // //Ex2
        // System.out.print("순위를 적으세요. ");
        // Scanner sc = new Scanner(System.in);
        // int rank = sc.nextInt();
        // char medalColor; 
        // switch(rank) {
	    //     case 1: medalColor = '금';// char은 '' String은 ""
		//         System.out.println("금메달");
		//         break; // 중괄호를 빠져나가라. 안쓰면 금은동메달 다나오고 마지막에 A라고나옴..
	    //     case 2: medalColor = '은';
		//         System.out.println("은메달");
		//         break;
	    //     case 3: medalColor = '동';
		//         System.out.println("동메달");
		//         break;
	    //     default : medalColor = 'A';  //default 값을 안넣어도 되는데 안낳을거면 초기값을 줘야함- medalcolor : 'A'
        // }
        // System.out.println(rank + "등은 " +medalColor +"메달 입니다."); //1, 금메달 1등은금메달 입니다.

        //Q3 라는 800원, 사이다는 900원, 커피는 700이다. 콜라, 사이다, 커피 중에 하나의 문자를 입력해서 가격을 출력하는 프로그램
        //int coke=800, soda=900, coffee=700;
        
        //Q4 각 월에 따른 한달 날짜 수를 day 변수 값으로 출력하시오. 단 2월은 28일 까지 입니다.

        //Q5 Switch / case문을 사용하여 짝수 및 홀수를 구분하고, 짝수 및 홀수 함수를 만들어서 호출

        // //Ex3  미해결
        // int optionNumber;   // 사용자에 의해 선택되는, 메뉴의 선택지 번호.
        // double measurement; // 사용자에 의해 입력되는, 숫자 측정값.
        //             //    측정 단위는 사용자가 선택한 선택지에 달려 있음.
        // double inches;      // 동일한 측정값을 인치로 변환한 것.

        // /* 메뉴를 표시하고 사용자가 선택한 선택지 번호를 얻음. */

        // System.out.println("어떤 측정 단위를 입력값에 사용합니까?");
        // System.out.println();
        // System.out.println("         1.  인치(inches)");
        // System.out.println("         2.  피트(feet)");
        // System.out.println("         3.  야드(yards)");
        // System.out.println("         4.  마일(miles)");
        // System.out.println();
        // System.out.println("선택할 번호를 입력하세요: ");
        // optionNumber = TextIO.getlnInt();

        // /* 사용자의 측정값을 읽고 인치로 이를 변환함. */

        // switch ( optionNumber ) {
        // case 1:
        //     System.out.println("인치 수를 입력: ");
        //     measurement = TextIO.getlnDouble();
        //     inches = measurement;
        //     break;          
        // case 2:
        //     System.out.println("피트 수를 입력: ");
        //     measurement = TextIO.getlnDouble();
        //     inches = measurement * 12;
        //     break;          
        // case 3:
        //     System.out.println("야드 수를 입력: ");
        //     measurement = TextIO.getlnDouble();
        //     inches = measurement * 36;
        //     break;          
        //     case 4:
        //         System.out.println("마일 수를 입력: ");
        //         measurement = TextIO.getlnDouble();
        //         inches = measurement * 12 * 5280;
        //         break;
        //     default:
        //         System.out.println("오류! 허용되지 않은 선택지 번호! 종료합니다!");
        //         System.exit(1);          
        //  } // switch 종료
        //  enum Season { SPRING, SUMMER, FALL, WINTER }

        // switch ( currentSeason ) {
        // case WINTER:    // ( Season.WINTER가 아니다! )
        //     System.out.println("December, January, February");
        //     break;
        // case SPRING:
        //     System.out.println("March, April, May");
        //     break;
        // case SUMMER:
        //     System.out.println("June, July, August");
        //     break;
        // case FALL:
        //     System.out.println("September, October, November");
        //     break;
        // }

        //Q6 가위 바위 보를 랜덤하게 발생하는 코드

        //Q7 3, 6, 9 게임을 작성하시오. 입력한 숫자에 3, 6, 9가 한 번만 나오면 "짝", 두번나오면 "짝짝"을 출력


        // 단항 연산자
        // i++, i--, ++i, --i, +i, -i, !b

        // 이항 연산자
        // a + b, a - b, a * b, a / b, a % 2

        // 삼항 연산자
        // num % 2 == 0 ? 1 : 2
        // (num % 2 == 0) ? (1) : (2)
        // (조건식)?(참이면):(거짓이면)
        // switch((num % 2 == 0) ? (1) : (2))

        // System.out.print("점수를 입력하세요 : ");
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();

        // String str = "";
        // switch (num / 10 + 1) {
        //     // num = 91 => 9.1 => 9 => 10
        //     // num = 100 => 10 => 11
        //     // 의도 : 0 ~ 100, A,B,C,D,F
        //     case 10:
        //         str = "A";
        //         break;
        //     case 9:
        //         str = "B";
        //         break;
        //     case 8:
        //         str = "C";
        //         break;
        //     case 7:
        //         str = "D";
        //         break;
        //     default:
        //         str = "F";
        //         break;
        // }
        // System.out.println("당신은 " + str + " 점입니다.");
        // scan.close();

    }
}