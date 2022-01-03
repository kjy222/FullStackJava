import java.util.*;

public class For {
    // // 기본형
    // for(int i = 0; i < 10; i++) {...}
    // // 증감식
    // for(int i = 10; i > 1; i--) {...}
    // for(int i = 1; i <= 10; i+=2) {...}
    // for(int i = 1; i <= 10; i*=3) {...}
    // 초기화식 생략
    // int i = 1;
    // for( ; i <= 100; i++) {...}
    // // 초기화식이나 증감식이 둘 이상인 경우
    // for(int i = 0, j = 100; i <= 50 && j >= 50; i++, j --) {...}
    //@SuppressWarnings("resource") //Ex4
    
    public static void main(String[] args) {

        // //Ex1 1-100까지의 합
        // int sum=0;
        // for(int i=1; i<=100; i++){
        //     sum=sum+i;
        // }
        // System.out.println("1-100까지의 합 : "+sum);

        // //Q1 1-5까지 숫자 출력
        // System.out.print("1-5까지 숫자 출력 : ");
        // for(int i=1; i<6; i++){
        //     System.out.print(" "+i);
        // }            
        
        // //Q2 93부터 50까지 합을 출력
        // int sum=0;
        // for(int i=93; i>=50; i--){
        //     sum=sum+i;
        // }
        // System.out.print("\n93부터 50까지의 합 : "+sum);
        
        // //Q3 아래와 같은 별 모양을 출력  미해결
        // String star="*";
        // for(int i=1; i<=5; i++){
        //     System.out.println("star");
        // }

        // //Ex2 중첩 for문
        // int n=0;
        // for(int i=0; i<5; i++) {
        // for(int j=0; j<5;j++) {
        //     n += 1; // n = n + 1;
        //     System.out.print(n+"\t");
        // }
        // System.out.println();
        // }
        
        //Q4 아래와 같은 별 모양을 출력 미해결

        //이중 for문
        //for문
       
        // //Q5 구구단을 작성하시오. 2~9단
        // for (int i=2; i<10; i++){
        //     System.out.println(i+"단을 출력합니다.");
        //     for (int j=1; j<10; j++){
        //         System.out.println(i+"x"+j+" = "+i*j);
        //     }
        // } 

        // 강사님 문제 별을 마름모로 찍기
        // 1 2 3 4 5
        //         *
        //     *   *   *
        // *    *   *   *   *
        //     *   *   *
        //         *


        // //Ex3 1 ~ 100까지 숫자 중 3과 5의 배수 출력
        // int sum = 0; 
        // for(int i = 1; i <= 100; i++) {
        //     if(i % 3 == 0 && i % 5 == 0) {
        //         sum += i;
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println("\n합계: " + sum);

        // //Ex4 한 개의 정수를 입력받아서 그 수의 배수를 차례로 10개 출력하는 프로그램 작성.
        // System.out.print("숫자를 입력하세요 : ");
        // int num = new Scanner(System.in).nextInt();
        // for(int i = num; i <= num * 10; i+=num) {
        //     System.out.print(i + " ");
        // }
        
    }
}
