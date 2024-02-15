import java.util.*;

class Solution {
    public int[] solution(int n) { 
        //1. 결과값 변수 answer 동적 배열 생성
        List<Integer> answer = new ArrayList<>();
        //2. 배열 첫 인덱스 -> n 추가
        answer.add(n);
        //3. 반복문 : while(n != 1)
        while(n != 1) {
        //4. 조건문 : n % 2 == 0 -> n = n / 2
            if(n % 2 == 0) {n /= 2;}
        //5. 조건문 : n % 2 != 0 -> n = n * 3 + 1
            else {n = n * 3 + 1;}
        //6. 배열에 n 추가
            answer.add(n);
        }
        //7. return값 answer 설정
        //stream, toArray -> integer type list를 int 배열로 변환
        return answer.stream().mapToInt(i->i).toArray();
    }
}