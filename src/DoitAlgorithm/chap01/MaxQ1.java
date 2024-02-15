package DoitAlgorithm.chap01;

import java.util.Scanner;

public class MaxQ1 {
    //1-1. 매개변수 a, b, c, d값 필요한 메서드 max4 설정
    static int max4(int a, int b, int c, int d) {
        //1-2. 초기 max값 a 설정
        int max = a;
        //1-3. 조건문 : max < b
        if(max < b) max = b;
        //1-4. 조건문 : max < c
        if(max < c) max = c;
        //1-5. 조건문 : max < d
        if(max < d) max = d;
        //1-6. return값 max 설정
        return max;
    }
    
    //2-1. 메인 메서드 작성
    public static void main(String[] args) {
        //2-2. Scanner 설정
        Scanner sc = new Scanner(System.in);
        //2-3. 변수 a, b, c, d 설정
        int a, b, c, d;
        
        //2-4-1. a의 값 입력 받기 위한 멘트 설정
        System.out.print("a의 값 : ");
        //2-4-2. a 값 입력 받기
        a = sc.nextInt();
        //2-5-1. b의 값 입력 받기 위한 멘트 설정
        System.out.print("b의 값 : ");
        //2-5-2. b 값 입력 받기
        b = sc.nextInt();
        //2-6-1. c의 값 입력 받기 위한 멘트 설정
        System.out.print("c의 값 : ");
        //2-6-2. c 값 입력 받기
        c = sc.nextInt();
        //2-7-1. d의 값 입력 받기 위한 멘트 설정
        System.out.print("d의 값 : ");
        //2-7-2. d 값 입력 받기
        d = sc.nextInt();
        
        //2-8. max4 메서드 결과값 담을 변수 max 설정
        int max = max4(a, b, c, d);
        //2-9. 최종 max 값 표시
        System.out.println("max값은 " + max + "입니다.");
    }
}
