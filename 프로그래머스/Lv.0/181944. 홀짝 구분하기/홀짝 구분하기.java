import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 자연수 n 입력 받기
        int n = sc.nextInt();
        //3. 조건문 : if -> n % 2 == 0일 경우, n은 짝수
        if(n % 2 == 0) {
            //3-1. n is even 출력
            System.out.printf("%d is even", n);
        } else {
            //3-2. n은 홀수 -> n is odd 출력
            System.out.printf("%d is odd", n);
        }
    }
}