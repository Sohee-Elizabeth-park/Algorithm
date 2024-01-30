import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 정수 a, b 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        //3. 'a + b = c' 형식의 결과값 출력
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}