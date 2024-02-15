package DoitAlgorithm.chap01;

import java.util.Scanner;

public class MinQ2 {
    //1-1. 세 값의 최솟값 구하는 min3 메서드 설정
    static int min3(int a, int b, int c) {
        //1-2. min값 설정
        int min = a;
        //1-3. 조건문 : min > b
        if(min > b) min = b;
        //1-4. 조건문 : min > c
        if(min > c) min = c;
        //1-5. return값 min 설정
        return min;
    }
    
    //2-1. 메인 메서드 설정
    public static void main(String[] args) {
        //2-2. Scanner 설정
        Scanner sc = new Scanner(System.in);
        //2-3. 입력 받을 변수 a, b, c 설정
        int a, b, c;
        
        //2-4-1. 입력 받을 변수 a 멘트 설정
        System.out.print("a : ");
        //2-4-2. a값 입력 받기
        a = sc.nextInt();
        //2-5-1. 입력 받을 변수 b 멘트 설정
        System.out.print("b : ");
        //2-5-2. b값 입력 받기
        b = sc.nextInt();
        //2-6-1. 입력 받을 변수 c 멘트 설정
        System.out.print("c : ");
        //2-6-2. c값 입력 받기
        c = sc.nextInt();
        
        //2-7. min3값 담을 변수 min 설정
        int min = min3(a, b, c);
        //2-8. min값 출력
        System.out.println("min값은 " + min + "입니다.");
    }
}
