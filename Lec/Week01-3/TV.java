public class TV { //클래스 선언하면 위에 TV 빨간 줄 없어진다(Array1229.java에서)
    //attribute=클래스 안에 있을 때 멤버변수라고도 한다
    // TV의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // TV의 기능(메서드)
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){ //절차지향에서는 function 객체 지향에서는 메서드라고 한다
        --channel; 
    }
}