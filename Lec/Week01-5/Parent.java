public class Parent {
    private int a = 10; //설명 필요
    public int b =20;
}

class Child extends Parent{
    // public int b =20; //상속됨
    public int c = 30;

    void display(){
        // System.out.println(a); //실행 안해도 error
        System.out.println(b);
        System.out.println(c);
    }
}

class PrivateTest{
    private static void main (String[] args) {
        //선언, 객체화 : Parent, Child
        Parent parent = new Parent();
        Child child = new Child();

        child.display();

    }
}

// 접근 제어자 
// public은 다른 패키지까지 나한테 접근 가능하다고 선언하는 것
// protected는