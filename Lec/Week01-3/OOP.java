
public class OOP{
    public static void main(String[] args){
        // 순서 -> Array-> Car -> OOP -> Human
        // Car랑 같이
        // Car car = new Car();
        // car.numOfTires = 4;
        // car.on();
        // System.out.println(car.numOfTires);
        // System.out.println(car.와이퍼);

        // Human human = new Human();
        // human.age = 1;

        // System.out.println(human.getAge());

        // human.grow();
        // human.grow();
        // human.grow();
        // human.grow();

        // System.out.println(human.getAge());

        
        // Animal dog = new Animal();
        // System.out.println("개 이름 : "+dog.name); 
        // System.out.println("개 나이 : "+dog.age); 

        // int score = 100;
        // score = 200;
        // char ch ='A';
        // String str = "abc";
        // final int MAX = 100;
        // MAX = 200;

        // long l= 1000000000000l;
        // l=1238123L;
        // float f= 3.14f;
        // double d= 3.14d;
        // f=10.f;
        // System.out.println(f);
        // f=3.14e3f; // 3140.0
        // System.out.println(f);
        // f = 1e1f;
        // System.out.println(f);
        // l = 0;
        // System.out.println(l);
        // f = 0.0f;
        // System.out.println(f);
        // d = 0.0d;
        // System.out.println(d);


        //4일차 OOP
        Product product = new Product(); //오토바이 1
        Product product2 = new Product(); //오토바이 2
        Product product3 = new Product(); //오토바이 3
        Product product4 = new Product(); //오토바이 4
        Product product5 = new Product(); //오토바이 5
        Product product6 = new Product(); //오토바이 6
        //노란줄은 워닝 (구현하는데 문제는 안됨)
        System.out.println(product3.price);
        product3.price = 300000;    // 가격 책정
        product3.motorOn(); //수동키로 오토바이 켜기
        System.out.println(product3.motor);
        product3.motorOff(); //수동키로 오토바이 끄기
        System.out.println(product3.motor);
        product3.motorOnOff(); //자동으로 오토바이 켜고/끄기
        System.out.println(product3.motor);
        product3.motorOnOff();
        System.out.println(product3.motor);
        
    }
} //OOP는 약자이므로 대문자로 사용하는 것이 좋다 상위에 psvm이 있다
