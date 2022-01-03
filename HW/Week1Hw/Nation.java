package Week1Hw;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

class Nation{
    //멤버 변수 시작 // 과제3) Class Nation을 나라이름을 private로 지정하고, 면적과 인구수는 public 으로 지정
    private String nc; //나라 이름
    public int area; //면적
    public int np; //인구수
    static String planet; //행성이름 // 과제4) Class Nation 을 만들고 행성이름을 만들고 static으로 지정
   
    public Nation () {
        nc = 
        area = 
        np = 
        planet = 
    }
    //메소드 시작 
    public String changeNc() { //나라이름변경
        System.out.println("나라 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        

    }
    public int changeArea() { //면적변경

    } 
    public int changeNp() {  //인구수변경

    }  
}

class NN extends Nation {
    // 과제2) Class Nation 을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수 하나와 메소드 하나를 생성
    public String n1 = "Korea";
    public String n2 = "USA";
    public String n3 = "Spain";

}