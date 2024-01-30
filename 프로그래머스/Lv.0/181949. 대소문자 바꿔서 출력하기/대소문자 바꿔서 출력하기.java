import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //1. Scanner
        Scanner sc = new Scanner(System.in);
        //2. 문자열 a 입력
        String a = sc.next();
        //3. 나눈 문자열 담을 result 변수 지정
        String result = "";
        //4. 반복문 : for
        for(int i=0; i<a.length(); i++) {
            //4-1. char x에 a 하나씩 분리하기
            char x = a.charAt(i);
            //4-2. x 요소 == 대문자일 경우 : if
            if(x == Character.toUpperCase(x)) {
                //4-3. 대문자 -> 소문자
                result += Character.toLowerCase(x);
            } else{
                //4-4. 소문자 -> 대문자
                result += Character.toUpperCase(x);
            }
        }
        //5. result 출력
        System.out.println(result);
    }
}