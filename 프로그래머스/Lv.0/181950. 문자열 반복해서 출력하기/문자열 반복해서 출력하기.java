import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 문자열 str 입력
        String str = sc.next();
        //3. 정수 n 입력
        int n = sc.nextInt();
        //4. 반복문 작성
        for(int i=0; i<n; i++) {
            //4-1. 문자열 str 출력
            System.out.print(str);
        }
    }
}