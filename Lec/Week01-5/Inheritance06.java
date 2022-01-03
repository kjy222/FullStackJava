class Parent{
    void display(){
        System.out.println("부모 클래스의 display() 메소드입니다" );
    }
}

class Child extends Parent{
    //오버라이딩된 display() 메소드
    void display(){
        System.out.println("자식 클래스의 display() 메소드입니다." );
    }
    void display(String str){
        System.out.println(str);
    }
}

public class Inheritance06 {
    private static void main(String[] args) {
        Child ch = new Child();
        ch.display();
        ch.display("오버로딩된 display() 메소드")
    }
}
//https://typecast.ai/ko/product/audio
//https://www.youtube.com/watch?v=Z9dvM7qgN9s
