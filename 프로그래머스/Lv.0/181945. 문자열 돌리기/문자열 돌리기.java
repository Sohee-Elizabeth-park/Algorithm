import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 문자열 a 입력받기
        String a = sc.next();
        //3. 반복문 작성 : for
        for(int i=0; i<a.length(); i++) {
            //3-1. 요소 하나씩 분리
            char x = a.charAt(i);
            //3-2. 요소 하나씩 출력
            System.out.println(x);
        }
    }
}