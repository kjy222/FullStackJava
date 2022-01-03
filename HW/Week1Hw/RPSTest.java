package Week1Hw;

public class RPSTest {
    public static void main(String[] args) {
        System.out.println("가위 바위 보");
    }
    public static void RPSChoice() {
        System.out.println("1. 가위");
        System.out.println("2. 바위");
        System.out.println("3. 보");
    }
}

public class RPS {
    public int num;

    class Rock extends RPS {
        public Rock()
    }
}
 // 과제8) 객체지향 방식으로 가위바위보를 하는데 두명의 선수가 무작위로 가위 바위 보를 낸 다음 승부를 출력하시오.