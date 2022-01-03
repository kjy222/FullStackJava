//4일차 OOP
public class OOP2{
    private static void main(String[] args) {
        Product p1 = new Product(2000000);
        System.out.println("hello world");
    }
}
class Product{
    String color;
    boolean motor = false;
    int width;
    int height;
    int depth;
    int price;
    
    Product(){
        System.out.println("This is construct func.");
    }
    Product(int price){
        this(price, true, "red");
        System.out.println("This is construct func.");
        this.price = price;
        System.out.println(price);
    }
    Product(int price, boolean motor){
        System.out.println("This is construct func.");
        this.price = price;
        this.motor = motor;
        System.out.println(price);
        System.out.println(motor);
    }
    Product(int price, boolean motor, String color){
        System.out.println("This is construct func.");
        this.price = price;
        this.motor = motor;
        this.color = color;
        System.out.println(price);
        System.out.println(motor);
        System.out.println(color);
      }
    // int price(){ } //int price와 상관 없다
    void motorOn () {
        this.motor = true;
        System.out.println(this.motor);
    }
    void motorOff () {
        this.motor = false;
        System.out.println(this.motor);
    }
    boolean motorOnOff(){
        this.motor = !this.motor;
        System.out.println(this.motor);
        return this.motor;
    }
    int setPrice(int price) {
        System.out.println("Validation function");
        System.out.println("Database save");
        this.price = price;
        System.out.println(this.price);
        System.out.println("Logging");
        return this.price;
    }
    String print() {
        return "이 오토바이의 색깔은 : " + this.color + " 이고, 이 오토바이의 가격은 : " + this.price + " 입니다.";
    }
    String print(int a) {
        return a + "되는가?";
    }
    String print(int a, int b) {
        return a + "되는가?";
    }
    String print(String a, int b) {
        return a + "";
    }
    String print(int a, String name, int price, boolean isExists) {
        return a + "되는가?";
    }
    void print2() {
        System.out.println("이 오토바이의 색깔은 : " + this.color + " 이고, 이 오토바이의 가격은 : " + this.price + " 입니다.");
    }
}
//https://cremazer.github.io/java-Class-and-Object/
// 강사님 자료
// class Product {
//     String color;
//     boolean motor = false; //~~여기 boolean 자료형과 같아야 한다
//     int width;
//     int height;
//     int depth;
//     int price; //~여기 price이다

    // Product(){
    //     System.out.println("This is construct func.");
    // }
    // Product(int price){
    //     System.out.println("This is construct func.");
    //     this.price = price; //클래스 나 자신은 this로 하고 인자의 int price는 price/ 인자에서 받은 값을 this.price에 할당해라//this.price는 멤버변수 price를 의미한다 //생성자 Product의 price는 매개변수
    //     System.out.println("이 오토바이의 가격은 "+this.price+"입니다.");
    // }

//     void motorOn () {
//         this.motor = true; //this.멤버변수/메서드
//     }

//     void motorOff () { //void는 return 사용x
//         this.motor = false;
//     }

//     boolean motorOnOff(){ //boolean 자료형은 ~~ //이런 경우는 return 반드시 지정
//         this.motor = !this.motor;
//         return this.motor;
//     }

//     int setPrice(int price) {
//         this.price = price; //this.price는 ~
//         return this.price;
//     }
// } 

// 강사님 코드
// Product product = new Product();    // 오토바이 1
//         Product product2 = new Product();   // 오토바이 2
//         Product product3 = new Product();   // 오토바이 3
//         Product product4 = new Product();   // 오토바이 4
//         Product product5 = new Product();   // 오토바이 5
//         Product product6 = new Product();   // 오토바이 6

//         System.out.println(product3.price);

//         product3.price = 300000;            // 가격 책정
//         product3.motorOn();                 // 수동키로 오토바이 켜기
//         System.out.println(product3.motor);
//         product3.motorOff();                // 수동키로 오토바이 끄기
//         System.out.println(product3.motor);
//         product3.motorOnOff();              // 자동으로 오토바이 켜고 끄기
//         System.out.println(product3.motor);
//         product3.motorOnOff();              // 자동으로 오토바이 켜고 끄기
//         System.out.println(product3.motor);

//         System.out.println(product3.price);

//         System.out.println();

        // product3.setPrice(100);
        // product3.setPrice(200);
        // product3.print2();
        // Product product7 = new Product(1000000); //오토바이 7


//http://tcpschool.com/java/java_methodConstructor_constructor
