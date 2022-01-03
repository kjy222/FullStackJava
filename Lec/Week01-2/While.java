import java.util.*;

public class While {
    public static void main(String[] args){
        // //Ex1
        // int i=1; // 초기값 설정
		// while (i<=10) { // 조건식 
		// 	System.out.println(i+". joker"); // 실행문
		// 	i++; // 증감식
		// } //초기값, 조건식, 증감식이 나오면 for문 사용하는 것이 더 낫다

        // //Ex2
        // int sum = 0, odd = 0, even = 0; // 합계 계산을 위한 초기값 할당
		// int i = 1; // 반복문 초기값 할당
		// while (i <= 100) { // 반복문 조건식
		// 	sum += i; // sum = sum + i; 총합 구하기
		// 	if (i % 2 == 0) { // 짝수 조건식
		// 		even += i; // even = even + i; 짝수합
		// 	} else {
		// 		odd += i; // odd = odd + i; 홀수 합
		// 	}
		// 	i++; // 증감식
		// }
		// System.out.println("1~100 합 = " + sum); // 결과 : 5050
		// System.out.println("1~100 짝수합 = " + even); // 결과 : 2550
		// System.out.println("1~100 홀수합 = " + odd); // 결과 : 2500

        // //Ex3
        // boolean stop = false;
		// int num;
		// while (!stop) { // true를 의미
		// 	System.out.println("2개의 정수 입력");
		// 	Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		// 	int num1 = sc.nextInt(); // 콘솔창을 통해 값을 입력 받는다
		// 	int num2 = sc.nextInt(); // 콘솔창을 통해 값을 입력 받는다
		// 	num = num1 % num2; // 나머지 구하는 공식
		// 	System.out.println(num1 + " % " + num2 + " = " + num);
		// 	System.out.println("계속 Y, 종료 N 입력");
		// 	String yn = sc.next(); // 콘솔창을 통해 값을 입력을 받음
		// 	if (yn.equals("Y") || yn.equals("y")) { // Y 또는 y 입력시 반복
		// 		System.out.println("---------------------");
		// 		continue; // 보조제어문(반복 계속)
		// 	}
		// 	if (yn.equals("N") || yn.equals("n")) { // N 또는 n 입력시 종료
		// 		break; // 보조제어문(반복 종료)
		// 	}
		// }
		// System.out.println("시스템이 종료되었습니다.");

        // //Q1 알파벳 'A'부터 'Z'까지 출력 미해결
        // char alpa = 'A';
        // while(alpa){

        // }

        // //Q2 1부터 10까지의 합 미해결
        // int num=0;
        // while(num<10){
        //     num++;
        //     System.out.print(num);
        // }
        
        // //Ex1
        // int i = 1; // 초기값 설정
		// do {
		// 	System.out.println(i + ". do while"); // 실행문
		// 	i++; // 증감식
		// } while (i <= 10); // 조건식

        // //Ex2
        // int i = 1; // 초기값
		// do {
		// 	System.out.println(i+". do ~ while"); // 실행문
		// 	i++; // 증감식
		// } while (i<1); // 조건식

        // //Ex3
        // int i=2; // 단수 초기값 설정
		// // int j = 1; // j의 초기값을 여기에 할당하면 잘못된 값이 출력됨!(j값이 초기화가 안되기 때문)
		// do {
		// 	int j = 1; // 곱하기 초기값 설정
		// 	do {
		// 		System.out.print(i+"*"+j+"="+i*j+"\t");
		// 		j++; // j 증감식
		// 	} while (j<=9); // j 조건식
		// 		i++; // i 증감식
		// 		System.out.println();
		// } while (i<=9); // i 조건식

        //Q3 키보드로 숫자를 입력받아서 10이 아니면 계속 반복하는 프로그램



        //Q4 랜덤하게 0~100까지 입력을 받아서 정답을 맞추는 프로그램을 작성하시오. 정답보다 크면 "더 작은 수로 다시 시도해보세요."를 출력하고, 정답보다 작으면 "더 큰 수로 다시 시도해보세요."를 출력

		
	
    }
}
