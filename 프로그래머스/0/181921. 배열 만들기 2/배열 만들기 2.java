import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        //1. 결과값 변수 answer 설정 : 동적 배열 생성
        //int type만 담을 수 있는 ArrayList 객체 생성 후 list 변수에 할당
        List<Integer> list = new ArrayList<>();
        //2. 반복문 : for(int i=l; i<=r; i++)
        for(int i=l; i<=r; i++) {
        //3. 정수 i -> 문자열 변환
            String str = i + "";
        //4. count 변수 설정
            int count = 0;
        //5. 반복문 : str.length
            for(int j=0; j<str.length(); j++) {
        //6. 조건문 : str.chatAt(j) == '0' || str.chatAt(j) == '5'
                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
        //7. 조건 해당 시, count 수 증가
                    count ++;
                    }
                }
        //8. 조건문 : count == str.length()
            if(count == str.length()) {
        //9. 현재 숫자 i -> list에 추가
                list.add(i);
                }
            }
        //10. list에 저장 된 정수들을 int type 배열로 변환 -> answer 변수 할당
        int[] answer = list.stream().mapToInt(i->i).toArray();
        //11. -1 담은 empty 배열 선언
        int[] empty = {-1};
        //12. 조건문 : list에 저장 된 정수 없다면, empty 배열 반환
        if(answer.length == 0) {
            return empty;
        }
        //13. return값 answer 설정
        return answer;
    }
}