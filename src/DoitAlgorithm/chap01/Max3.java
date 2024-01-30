package DoitAlgorithm.chap01;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        //1. Scanner 설정 : stdIn
        Scanner stdIn = new Scanner(System.in);
        //2. println : 세 정수의 최댓값을 구합니다. / a의 값, b의 값, c의 값
        System.out.println("세 정수의 최댓값을 구합니다.");
        //3-1. print : a의 값, b의 값, c의 값
        //3-2. nextInt : 값 입력받기
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.print("c의 값 : "); int c = stdIn.nextInt();
        //4-1. 최댓값 구하기 : 변수 max 설정 (a값으로 초기화)
        int max = a;
        //4-2. 조건문 : b > max
        if(b>max) max = b;
        //4-3. 조건문 : c > max
        if(c>max) max = c;
        //5. println : max값 출력
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
