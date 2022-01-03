import java.util.*; //외부 라이브러리 사용하기 위해 작성 Scanner 사용시 필요

public class App {
    public static void main(String[] args) throws Exception { //psvm
        System.out.println("Hello, World!");
        //sysout->enter 자동 생성
        //Run 단축키 : Ctrl+F5
        //자바의 정석 p13 변수, 상수, 리터럴
        int score=100; //int에 100 값 할당
        System.out.println(score);
        score = 200; //score와 같이 변수(variable)에는 값을 할당할 수 있다
        System.out.println(score);
        char ch ='A'; //앞에서 ch라는 변수 선언해서 error 발생 // ch에는 Single port로 들어가고 단어 하나만, 두 개는 error, 공백도 허용 안 함
        System.out.println(ch); 
        ch='\u0041'; //앞에서 ch 변수 선언했으므로 그냥 인가만 해주면 된다. 선언은 duplicate X
        System.out.println(ch);
        String str= "abc"; //String은 문자열이므로 abc이렇게 세 개 들어갈 수 있다. 공백도 가능
        System.out.println(str);
        final int MAX =100; //constant는 final을 줘서 ~
        System.out.println(MAX);
        //p14 리터럴과 접미사
        boolean power = true; //boolean은 t/f 자료형이다
        System.out.println(power);
        char tab ='\t';
        System.out.println(tab+"탭");
        byte b=127;
        System.out.println(b);
        short s= 32767;
        System.out.println(s);
        int i= 100;
        System.out.println(i);
        int oct=0100;
        System.out.println(oct); 
        int hex= 0x100;
        System.out.println(hex); 
        long l= 10000000000L;
        System.out.println(l); 
        float f= 3.14f;
        System.out.println(f);
        double d = 3.14d;
        System.out.println(d);
        f=100f;
        System.out.println(f); 
        //p15 변수의 기본값과 초기화
        boolean bool=false; //초기화 안 되어 있으면 error -> 초기값 줘
        System.out.println(bool);
        int int2=0;
        System.out.println(int2);
        
        //p16 문자와 문자열
        ch='A';
        String s1="A"+"B"; //공백 에러 발생 하지 않음 확인
        System.out.println(s1);
        System.out.println(""+7);
        System.out.println(""+"7");
        System.out.println("7");

        System.out.println(""+7+7);
        System.out.println("7"+7);
        System.out.println("7"+"7");
        System.out.println("77");

        System.out.println(7+7+"");
        System.out.println(14+"");
        System.out.println("14"+"");
        System.out.println("14");

        //p18 정수의 오버플로우
        b=127;
        System.out.println(b);
        b++; //b=b+1; b에 b+1값을 인가한다
        System.out.println(b); //-128 error(128의도했는데 -128이 나왔으므로) -> overflow 

        //p19 형변환
        f=1.6f;
        i=(int)f; //1.6->1 (정수, 버림 연산)
        System.out.println(i);

        i=65;
        ch=(char)i;
        System.out.println(ch); 

        i=10;
        f=(float)i;
        System.out.println(f);

        //p20 값손실
        b=10;
        i=(int)b;
        i=b;
        System.out.println(i);

        int i2=300;
        byte b2=(byte)i2;
        System.out.println(b2); //

        //형식화된 출력
        System.out.println(10.0/3); //
        System.out.println(0x1A); //

        //p21 println의 단점 : 출력 형식을 지정할 수 X
        //printf 사용 -> 출력 형식 지정 O
        System.out.printf("%.5f\n",10.0/3); //.5f는 소수점 2째 자리까지 표현
        System.out.printf("%d\n",0x1A);
        System.out.printf("%X\n",0x1A); //결과값 : 3.33261A라고 나옴
        // printf는 println과 다르게 새로운 new라인이 되지 않고 자기가 찍힌 게 있으면 그 뒤로 연속해서 붙어짐.
        // System.out.println() : ()안에 있는 입력값을 출력하고 1개 라인 줄을 바꿔라
        // 원래는 3.33 26 1A로 나와야 하는데 printf는 개행이 없기 때문에 3.33261A처럼 다 붙어서 나온다
        //\n 개행

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.printf("1\n");
        System.out.printf("2\n");
        System.out.printf("3\n"); //\n의 쓰임:

        //p22
        System.out.printf("age: %d, year: %d\n",14,2017);
        int age =101;
        System.out.printf("age: %d",age);
        System.out.printf(", age: %d%n",age);
        System.out.printf("age: %d",age);
     
        System.out.printf(", This state is %b.%n",true);
        
        //p23 printf 지시자
        System.out.printf("%d%n",15); //10진법 //
        System.out.printf("%o%n",15); //8진법 //
        System.out.printf("%x%n",15); //16진법 //
        System.out.printf("%s%n", Integer.toBinaryString(15)); //2진법

        System.out.printf("%#o%n",15); //8진법 접두사 //
        System.out.printf("%#x%n",15); //16진법 소문자 //
        System.out.printf("%#X%n",15); //16진법 대문자 //
 
        //float에 선언할 때 뒤에 f, double도 선언할 때 뒤에 d 붙이는 이유 : long은 뒤에 l이 붙음. 한마디로 컴퓨터에 float이면 f를 붙여서 float형인 것을 알려줌  

        //
        f= 123.4567890f;
        System.out.printf("%d%n",f);
        System.out.printf("%e%n",f);
        //
        System.out.printf("%g%n",123.456789);
        System.out.printf("%g%n",0.000000001);

        //println있는데 왜 printf 사용하나요 차이점은?
        System.out.println("3곱하기 4는 12입니다.");
        int first=3;
        int second=4;
        System.out.printf("%d곱하기 %d는 %d입니다.%n",first, second); //%n과 \n의 차이점은 크게 없다

        //p24
        System.out.printf("[%5d]%n",10); //앞에 세 자리 비우고 10채움
        System.out.printf("[%-5d]%n",10); //뒤에 세 자리 비우고 앞에 10채움
        System.out.printf("[%05d]%n",10); //앞에 세 자리 0으로 채우고 뒤에 10붙임
        System.out.printf("d=%14.10f%n",d); //?

        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url); //전체 출력
        System.out.printf("[%20s]%n", url); //앞에 공백 주고 바로 뒤에부터 채움 
        System.out.printf("[%-20s]%n", url); //앞에 채우고 뒤에 공백
        System.out.printf("[%.8s]%n", url); //8자리만 출력

        //p25
        Scanner sc = new Scanner(System.in); //Scanner라는 생성자에는 System.in는 매개변수가 들어가있던 것이다
        int num = sc.nextInt();
        System.out.println(num);
        String input = sc.nextLine();
        num = Integer.parseInt(input);
        System.out.println(num);
        sc.close();
    }
}