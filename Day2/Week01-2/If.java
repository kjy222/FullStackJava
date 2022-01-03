import java.util.*;

public class If {
    // if문
    // if(조건식){
    //     //조건식이 참(true)일 때 수행될 문장들을 적는다.
    // }

    // if else 조건문
    // if (조건문) {   
    //     // 조건이 참일때 실행
    // } else {
    // // 조건이 거짓일 때 실행 부위
    // }
    // else if 문
    // if (조건식1) {
    //     실행문1;
    // } else if (조건식2) {
    //     실행문2;
    // } else {
    //     실행문3;
    // }

    public static void main(String[] args) {
        // //Ex1
        // if(true){
        //     System.out.println("실행 1");
        // }
        // //Ex2
        // if(false){
        //     System.out.println("실행 2");
        //     System.out.println("실행 3");
        // }
        // //Ex3
        // int a =6;
        // if(a%2==0){
        //     System.out.println(a+"는 2의 배수");
        // }

        // int input;
        // System.out.print("숫자를 하나 입력하세요 : ");
        // Scanner sc= new Scanner(System.in);
        // String tmp= sc.nextLine(); //nextLine 함수는 String으로 반환해준다
        // input=Integer.parseInt(tmp); //Integer로 parse해준다 //형변환
        // if(input%2==0){ //input에 %연산 ->모듈러 연산 : 앞에 있는 숫자를 
        //     System.out.println("짝수");
        // } else
        //     System.out.println("홀수");
        // sc.close();

        ////If ex
        // System.out.print("숫자를 하나 입력하세요.> ");
        // Scanner sc= new Scanner(System.in);
        // String tmp= sc.nextLine();
        // int input =Integer.parseInt(tmp);
        // if(input==0){
        //    System.out.println("입력하신 숫자는 0입니다.");
        // }
        // if(input!=0){
        //    System.out.println("입력하신 숫자는 0이 아닙니다.");
        //    System.out.printf("입력하신 숫자는 %d입니다.",input);
        // }

        ////Q1 키보드로 입력받은 숫자가 10보다 작으면 "10보다 작습니다."를 출력
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc= new Scanner(System.in);
        // int num= sc.nextInt();
        // if(num<10){
        //     System.out.println("10보다 작습니다.");
        // }
        
        ////Q2 키보드로 입력받은 숫자가 2로 나누었을때 나머지가 0이면 "짝수입니다."를 출력
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc= new Scanner(System.in);
        // int num2 = sc.nextInt();
        // if(num2%2==0){
        //    System.out.println("짝수입니다.");
        // }

        ////Q3 변수 a 는 4 이면서, 변수 b 는 짝수이고, 변수 c 는 true 가 아닐 경우 "정답입니다."를 출력
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc1= new Scanner(System.in);
        // int a = sc1.nextInt();
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc2= new Scanner(System.in);
        // int b = sc2.nextInt();
        // System.out.print("T/F 입력하세요. ");
        // Scanner sc3= new Scanner(System.in);
        // boolean c = sc3.nextBoolean();
        // if(a==4 && b%2==0 && c!=true){
        //     System.out.println("정답입니다.");
        // }
        
        // //Q4 변수 a 가 10보다 크거나 5보다 작으면서 변수 b가 홀수일 경우 "정답입니다."를 출력        
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc1= new Scanner(System.in);
        // int a = sc1.nextInt();
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc2= new Scanner(System.in);
        // int b = sc2.nextInt();
        // if(a>10 || a<5 && b%2!=0){
        //     System.out.println("정답입니다.");
        // }
        
        // //Q5 변수 a 가 -10보다 작거나 같고, 변수 b가 10보다 작으면서, a * b 가 100보다 크면 "정답입니다."를 출력
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc1= new Scanner(System.in);
        // int a= sc1.nextInt();
        // System.out.print("숫자를 입력하세요. ");
        // Scanner sc2= new Scanner(System.in);
        // int b= sc2.nextInt();
        // if(a<=-10 && b<10 || a*b>100){
        //     System.out.println("정답입니다.");
        // }

        ////Ex4
        // int money=2000;
        // if (money>=3000) {
        //     System.out.println("택시를 타고 가라");
        // } else {
        //     System.out.println("택시를 타고 가라");
        // }
        // int money=2000;
        // boolean hasCard = true;
        // if (money>=3000 || hasCard) {
        //     System.out.println("택시를 타고 가라");
        // } else {
        //     System.out.println("걸어가라");
        // }
        
        // //Q6 키보드로 입력받은 숫자가 짝수이면 "짝수", 홀수이면 "홀수"를 출력
        // System.out.print("숫자를 입력하세요 : ");
        // Scanner sc= new Scanner(System.in);
        // int num=sc.nextInt();
        // if(num%2==0){
        //     System.out.println("짝수");
        // } else{
        //     System.out.println("홀수");
        // }

        // //Q7 미해결 0~100까지의 난수를 생성하여 아래와 같이 출력
        // double dValue = Math.random();
        // int randomValue = (int) (dValue * 100);
        // System.out.println(randomValue);
        // 0.0~0.1 //random은 0~1까지만 발생
        // 0.123405035 * 10 -> 1.23405035
        // 1.23405035를 casting int하면 1이 된다
        // 0.123405035 * 100 -> 12.3405035 -> casting 12
        // double dValue = Math.random();
        // int randomValue = (int)(dValue * 100);
        // if(dValue>90){
        //     System.out.println("수");
        //     if(dValue>80){
        //         System.out.println("우");
        //     } 
        //     if(dValue>70){
        //         System.out.println("미");
        //     } 
        //     if(dValue>60){
        //         System.out.println("양");
        //     } 
        //     if(dValue<=60){
        //         System.out.println("가");
        //     } 
        //     System.out.println(dValue);
        // } 
        
        // //Q8 정수 3개를 비교하여 최댓값을 구하시오 미해결?
        // int a = 10, b = 20, c = 9;
        // int max;
        // if (a>b) {  // 부등호와 논리연산자 사용 //a>b&&a>c
	    //     max = a;  // 위의 조건식이 true일때 실행
        // } else {  // 위의 조건식이 false일때 실행
	    //     if (b > c) {
		//         max = b; // 위의 조건식 true일때 실행
	    //     } else {
	    // 	    max = c; // 위의 조건식 false일때 실행
	    //     }       
        // }   
        // System.out.println("max = " + max);

        // //Ex6
        // int age = 22;
        // if (age>=20 && age<30) {	// 조건식 1 // 조건식 1이 true일 때 실행
	    //     System.out.println("20대");
        // } else if (age<20) {	// 조건식 2 // 조건식 1이 false이면서 조건식 2가 true일 때 실행
	    //     System.out.println("10대 이하");
        // } else { // 조건식 1과 2가 false일 때 실행
	    //     System.out.println("30대 이상");
        // }

        // //Q9 else if를 사용하여 주사위의 번호를 뽑으시오
        // int num=(int)(Math.random()*6)+1; //난수 발생 코드
        // if(num==1){
        //    System.out.println("1번이 나왔습니다.");
        // } else if (num==2){
        //    System.out.println("2번이 나왔습니다.");
        // } else if (num==3){
        //    System.out.println("3번이 나왔습니다.");
        // } else if (num==4){
        //    System.out.println("4번이 나왔습니다.");
        // } else if (num==5){
        //    System.out.println("5번이 나왔습니다.");
        // } else {
        //    System.out.println("6번이 나왔습니다.");
        // }

        // //Q10
        // System.out.print("userID를 입력하세요. ");
        // Scanner sc= new Scanner(System.in);
        // int userID=sc.nextInt();
        // if(userID==1){
        //     System.out.println("관리자로 로그인 하였습니다.");
        // } else if (userID==2){
        //     System.out.println("판매자로 로그인 하였습니다.");
        // } else{
        //     System.out.println("구매자로 로그인 하였습니다.");
        // }

        // //Q11 userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하고 관리자의 경우 password 가 1234와 일치하면 "관리자로 로그인 하였습니다."를 출력
        // System.out.print("userID를 입력하세요. ");
        // Scanner sc1= new Scanner(System.in);
        // int userID=sc1.nextInt();
        // if(userID==1){
        //     System.out.print("password를 입력하세요. ");
        //     Scanner sc2= new Scanner(System.in);
        //     int password=sc2.nextInt();
        //     if(password==1234){
        //         System.out.println("관리자로 로그인 하였습니다.");
        //     } sc2.close();
        // } else if (userID==2){
        //     System.out.println("판매자로 로그인 하였습니다.");
        // } else{
        //     System.out.println("구매자로 로그인 하였습니다.");
        // }
        // sc1.close();
       
    }
}