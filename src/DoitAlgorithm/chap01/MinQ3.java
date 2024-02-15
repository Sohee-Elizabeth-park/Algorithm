package DoitAlgorithm.chap01;

import java.util.Scanner;

public class MinQ3 {
    //1-1. 네 값의 최솟값 구하는 min4 메서드 설정
    static int min4(int a, int b, int c, int d) {
        //1-2. min값 설정
        int min = a;
        //1-3. 조건문 : min > b
        if(min > b) min = b;
        //1-4. 조건문 : min > c
        if(min > c) min = c;
        //1-5. 조건문 : min > d
        if(min > d) min = d;
        //1-6. return값 min 설정
        return min;
    }
    
    //2-1. 메인 메서드 설정
    public static void main(String[] args) {
        //2-2. Scanner 설정
        Scanner sc = new Scanner(System.in);
        //2-3. 입력 받을 변수 a, b, c, d 설정
        int a, b, c, d;
        
        //2-4-1. 입력 받을 변수 a 입력 멘트 설정
        System.out.print("a : ");
        //2-4-2. a값 입력 받기
        a = sc.nextInt();
        //2-5-1. 입력 받을 변수 b 입력 멘트 설정
        System.out.print("b : ");
        //2-5-2. b값 입력 받기
        b = sc.nextInt();
        //2-5-1. 입력 받을 변수 c 입력 멘트 설정
        System.out.print("d : ");
        //2-5-2. c값 입력 받기
        c = sc.nextInt();
        //2-6-1. 입력 받을 변수 d 입력 멘트 설정
        System.out.print("d : ");
        //2-6-2. d값 입력 받기
        d = sc.nextInt();
        
        //2-7. min4 메서드 결과값 담을 변수 min 설정
        int min = min4(a, b, c, d);
        //2-8. min값 결과 출력
        System.out.println("min값은 " + min + "입니다.");
    }
}
