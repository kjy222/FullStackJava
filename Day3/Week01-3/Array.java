import java.util.*;
import java.util.Arrays;

public class Array {
    public static void main(String[] args){ //void는 리턴값 없이 쓸 수 있는 자료형. (원시 자료형으로도 불린다) int/String같은 자료형이 같은 값을 return해줘야하는 것과 다르다. 생성할 때 int로 만들었다면 return할 때도 자료형 int로 맞춰서 해야한다
        // System.out.println("Say Hello!");
        // //Ex1
        // int[] score=new int[5];
        // int k=1;
        // score[0]=50;
        // score[1]=60;
        // score[k+1]=70; //score[2]=70
        // score[3]=80;
        // score[4]=90;
        // //for문으로 배열의 모든 요소를 출력
        // for(int i=0; i<5; i++){
        //     System.out.printf("score[%d]:%d%n", i, score[i]); //%n은 개행
        // }
        // System.out.println(score[4]);
        // System.out.println(score.length);
        // System.out.println(score[-1]);
        // //array length
        // System.out.printf("length: %d%n",score.length);
        // //ArrayIndexOutOfBoundsException
        // System.out.printf("score[%d]: %d%n", 7, score[7]); 
        // //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5 : 배열 크기는 5인데 7이라고? 이건 안되지! 나타냄

        // //배열 초기화 //뭐지
        // int[] score= new int[]{50,60,70,80,90};
        // //int[] scroe= {50,60,70,80,90};

        // //Q1 score 배열에 50, 60, 70, 80, 90 을 입력하고 순서대로 출력
        // int[] score= new int[]{50,60,70,80,90};
        // for(int i=0; i<5; i++){ //생각x
        //     System.out.print(score[i]+" ");
        // }

        // //Q2 chArr 배열에 a, b, c, d, e 를 입력하고 순서대로 출력
        // char[] chArr=new char[]{'a','b','c','d','e'};
        // for(int i=0; i<5; i++){
        //     System.out.print(chArr[i]+" ");
        // }

        // //Q3 boolArr 배열에 true, false, true, true, false 를 입력하고 순서대로 출력
        // boolean[] boolArr= new boolean[]{true,false,true,true,false};
        // for(int i=0; i<5; i++){
        //     System.out.print(boolArr[i]+" ");
        // }

        // //Q4 score 배열에 50, 60, 70, 80, 90 을 입력하고 처음 값과 마지막 값을 더한 다음 출력
        // int[] score= new int[]{50,60,70,80,90};
        // System.out.print(score[0]+score[4]);

        // //Q5 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력
        // int[] score= new int[]{100,88,100,100,90};
        // int sum=score[0]+score[1]+score[2]+score[3]+score[4];
        // int avg=sum/2;
        // System.out.println("총합 : "+sum+", 평균 : "+avg);

        // //Ex2 최대값과 최소값
        // int[] score = {79, 88, 91, 33, 100, 55, 95};
        // int max = score[0];
        // int min = score[0];
        // for(int i=1; i < score.length; i++) {
        //     if(score[i] > max) {
        //         max = score[i];
        //     } else if(score[i] < min) {
        //         min = score[i];
        //     }
        // }
        // System.out.println("max:" + max);
        // System.out.println("min:" + min);

        // //Q5  변수 a, 변수 b 의 값을 서로 교환하고 출력
        // int a=10, b= 20, temp= 0; //강사님 코드
        // temp=b;
        // b=a;
        // a=temp;
        // System.out.println("a는 "+a);
        // System.out.println("b는 "+b);
        // char[] var=new char[]{'a','b'};
        // char s= var[1];
        // var[1]=var[0];
        // var[0]=s;
        // System.out.println(var);

        // //Q6 배열에 75, 100, 85, 60, 95 를 입력하고, 높은 점수순으로 rank를 표시
        // int[] score=new int[]{75, 100, 85, 60, 95};
        // int max = score[0];
        // int min = score[0];
        // //알고리즘
        // for(int i=0; i<5; i++){
        //     for(int j=1; j < score.length; j++) {
        //         if(score[j] > max) {
        //             max = score[j];
        //         } else if(score[j] < min) {
        //             min = score[j];
        //         }
        //     }        
        //     System.out.println(score[i]);
        // }  //print

        // //Ex3 섞기(Shuffle)
        // int[] numArr = new int[10];
        // for (int i=0; i < numArr.length; i++) {
        //     numArr[i] = i;
        //     System.out.print(numArr[i]);
        // }
        // System.out.println();
        // for (int i=0; i < 100; i++) {
        //     int n = (int)(Math.random() * 10);
        //     int tmp = numArr[0];
        //     numArr[0] = numArr[n];
        //     numArr[n] = tmp;
        // }
        // for (int i=0; i < numArr.length; i++) 
        //     System.out.print(numArr[i]);
        
        // //Ex4 임의의 값으로 배열 채우기 //로또 번호
        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = (int)(Math.random()*5);
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // //Q7 미해결 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력 ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
        // System.out.print("거스름돈을 입력하세요 : ");
        // Scanner sc= new Scanner(System.in);
        // int change=sc.nextInt();
        // int[] coin= new int[]{500, 100, 50, 10};
        // int x=0;
        // for(int i=0; i<coin.length; i++){
        //     x=change/coin[i];
        // }
        // System.out.println(coin+"원 : "+x+"개");
        // sc.close();

        //Q8 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요. ex) [1, 3, 3, 2, 1, 1, 4, 5, 5, 1, 3] ->[1, 3, 2, 4, 5]
        
        // O(1) : 상수 System.out.println("hello, world!")

        // O(N) : 선형 for(int i = 0; i < arr.length; i++) {    System.out.println("hello, world!") }
  
        // O(N) : 선형 for(int i = 0; i < arr.length; i++) {    System.out.println("hello, world!") }
 
        
        // //선택 정렬(Selection Sort)
        // int[] arr= {7, 5, 9, 0, 3, 1, 6, 2, 4 ,8};
        // for(int i=0; i<arr.length; i++){
        //     int minIndex= i; //가장 적은 원소의 인덱스
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[minIndex]>arr[j])
        //             minIndex=j ;
        //     }
        //     //스와프
        //     int tmp =arr[i];
        //     arr[i]= arr[minIndex];
        //     arr[minIndex]= tmp;
        // }
        // System.out.println(Arrays.toString(arr));
        
        // //Ex5 삽입 정렬(Insertion Sort)
        // int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4 ,8};
        // for(int i=1; i<arr.length; i++){
        //     for(int j=i; j>=1; j--){
        //         if(arr[j]<arr[j-1]){ //한 칸씩 왼쪽으로 이동
        //             int tmp= arr[j];
        //             arr[j]= arr[j-1];
        //             arr[j-1]= tmp;
        //         } else 
        //             break; //자기보다 작은 데이터를 만나면 그 위치에서 멈춤
        //     } System.out.println(Arrays.toString(arr));
        // } System.out.println(Arrays.toString(arr));

        // //Ex6 퀵 정렬(Quicksort)
        // int array[]= {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
        // quickSort(array, 0, array.length-1);
        // for(int i:array){
        //     System.out.printf("%d", i);
        // }
    //with 퀵 정렬
    // public static void quickSort(int array[], int start, int end){
    //     if(start>=end) //원소가 1개인 경우 종료
    //         return;
    //     int pivot= start; // 피벗은 첫 번째 원소
    //     int left= start+1;
    //     int right= end;

    //     while(left<=right){
    //         //피벗보다 큰 데이터를 찾을 때까지 반복
    //         while(left<= end && array[left]<=array[pivot])
    //             left+=1;
    //         //피벗보다 작은 데이털ㄹ 찾을 때까지 반복
    //         while(right>start && array[right]>=array[pivot])
    //             right-=1;
    //         if (left> right){//엇갈렸담녀 작은 데이터와 피벗을 교체
    //             int tmp= array[right];
    //             array[right]= array[pivot];
    //             array[pivot]= tmp;
    //         } else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
    //             int tmp= array[right];
    //             array[right]=array[left];
    //             array[left]=tmp;
    //         }
    //         //분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
    //         quickSort(array, start, right-1);
    //         quickSort(array, right+1, end);
    //     }
    // }

        //Ex7  향상된 for문 
        // for(int i:array){
        //     System.out.printf("%d",i);
        // }
        // String[] name= new String[3];
        // name[0]="kim";
        // name[0]="park";
        // name[0]="yi";

        // // 미해결 Q8 향상된 for 문을 사용해 String 배열  name의 값을 출력
        // String[] name= new String[3];
        // name[0]="kim";
        // name[0]="park";
        // name[0]="yi";
        // for(String string:name.toCharArray()){
        //     System.out.println(string);
        // }
        
        //Q9 name 배열의 원소에서 각 문자열의 첫글자를 대문자로 출력

        //Q10 split 함수를 사용해 콤마를 기준으로 문자열을 문자열 배열로 만들어

        //Q11 String 배열에 "hello" 가 포함되어 있으면 "안녕하세요."를 출력하고, 그렇지 않으면 "안녕히가세요."를 출력

        // //Ex8
        // int[][] arr = new int[2][3];
        // int k = 10;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = k; // 인덱스를 이용한 초기화
        //         k += 10;
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }

        //     System.out.println();
        // }

        // //Q12 arr의 원소를 출력 미해결
        // int[][] arr = {
        //     {10, 20, 30},
        //     {40, 50, 60}
        // };
        
        // //Ex9 가변 배열(dynamic array)
        // int[][] arr = new int[3][];
        // arr[0] = new int[2];
        // arr[1] = new int[4];
        // arr[2] = new int[1];
        // int[][] arr = {
        //     {10, 20},
        //     {10, 20, 30, 40},
        //     {10}
        // };

        //ctrl / 안될때 ctrl shift누르고 하면 다시 잘 됨

        // TV t;
        // t= new TV();
        
        // // int i;
        // // i=0;

        // TV t= new TV();
        // t.channel = 7;
        // t.channelDown();
        // System.out.println("현재 채널은 "+t.channel+"입니다.");
        // // int i=0;

        // // Scanner sc = new Scanner();
    // }
    // public class TV{ //클래스 선언하면 위에 TV 빨간 줄 없어진다
    //     //attribute=클래스 안에 있을 때 멤버변수라고도 한다
    //     String color;
    //     boolean power;
    //     int channel;

    //     void power(){
    //         power = !power;
    //     }
    //     void channelUp(){
    //         ++channel;
    //     }
    //     void channelDown(){ //절차지향에서는 function 객체 지향에서는 메서드라고 한다
    //         --channel; 
    //     }
    }
}