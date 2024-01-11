//프로그래머스 0단계 문자열 출력하기
import java.util.Scanner;
public class PrintStr {
    public static void main(String[] args) {
        try {
            //1. 사용자 입력 : Scanner
            Scanner sc = new Scanner(System.in);
            //2. 입력 받은 글자 변수 지정 : a
            String a = sc.next();
            //3. a 출력
            System.out.println(a);
        } catch (Exception e) {
            //4. 예외 발생 시 메시지 출력
            System.out.println(e.getMessage());
        }
    }
}
