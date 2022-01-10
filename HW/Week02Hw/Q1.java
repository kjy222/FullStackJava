package Week02Hw;

// 과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
interface Runnable {
    
}
class Human implements Runnable, Speak {

    @Override
    public void silent() {
        
    }

    @Override
    public void loud() {
        
    }

}
// 과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
class Animal {
    private String name;
    private String location; 
    // getter와 setter를 만드시오. 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }  
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
// 과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. 
interface Speak {
    public void silent();
    public void loud();

    default void setVolume(boolean volume) {
        if(volume) {
            System.out.println("조용히 말합니다.");
        } else {
            System.out.println("크게 말합니다.");
        }
    }
}
// Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)
class Tiger extends Animal {

}

public class Q1 {
    public static void main(String[] args) {
        Q1 spk = null;

        
    }
}
