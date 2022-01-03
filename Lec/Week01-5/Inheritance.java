public class Inheritance {
    private static void main(String[] args) {
        Mother mother = new Mother();

        Son son = new Son();
        son.printMotherAge();

        son.setBloodType("A");
        System.out.println(son.getBloodType());
    }
}
//부모 클래스 정의
class Mother{
    int motherAge = 50;
    String hometown = "경상도";
    boolean isMarried = true;
    String bloodType = "O";
    
    public Mother(){
        System.out.println("Welcome to super class");
    }
}

//자식 클래스 정의(부모 클래스 상속)
class Son extends Mother{
    int son = 23;
    String hometown = "서울";
    //String bloodType;

    public Son(){
        System.out.println("Welcome to sub class0");
    }

    public void printMotherAge(){
        System.out.println("Mother's Age : "+super.motherAge);
    }
    
    public String getBloodType(){
        //return super.bloodType;
        return this.bloodType;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
}
