class Solution {
    public int solution(int n, String control) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. 반복문 : charAt 사용
        for(int i=0; i<control.length(); i++) {
        //3. control 요소 하나씩 분리
            char x = control.charAt(i);
        //4-1. 조건문 : x == 'w', n += 1
            if(x == 'w') { n += 1; }
        //4-2. x == 's', n -= 1
            else if(x == 's') { n -= 1; }
        //4-3. x == 'd', n += 10
            else if(x == 'd') { n += 10; }
        //4-4. x == 'a', n -= 10
            else { n -= 10; }
        //5. answer에 n값 저장
            answer = n;
        }
        //6. return값 answer 설정
        return answer ;
    }
}