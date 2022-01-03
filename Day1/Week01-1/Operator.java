public class Operator{
    public static void main(String[] args){
        //p35 증감연산자
        int i=5;
        System.out.println(i); //5
        i++;
        System.out.println(i); //6
        i=i+1;
        System.out.println(i); //7
        i--; 
        System.out.println(i); //6
        i=i-1;
        System.out.println(i); //5

        System.out.println(i++); //5 이거 끝난 후 1이 올라가서 밑에가 6나옴 왜지?? 
        System.out.println(i); //6 후위연산
        System.out.println(++i); //전위 연산 내가 실행하는 타임 이전에 실행되므로 7이 나옴
        System.out.println(i); //7
        //전위 후위 제대로 다시 확인하자
        
        //p36
        i = -10;
        System.out.println(i);
        i = +i;
        System.out.println(i);
        i = -i;
        System.out.println(i);

        boolean power = false;
        System.out.println(power);
        power = !power;
        System.out.println(power); // true
        power = !power;
        System.out.println(power); // false
    }
}
