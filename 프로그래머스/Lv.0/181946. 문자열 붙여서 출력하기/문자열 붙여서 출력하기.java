import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 문자열 a, b 입력받기
        String a = sc.next();
        String b = sc.next();
        //3. 문자열 a, b 출력
        System.out.printf("%s%s", a, b);
    }
}