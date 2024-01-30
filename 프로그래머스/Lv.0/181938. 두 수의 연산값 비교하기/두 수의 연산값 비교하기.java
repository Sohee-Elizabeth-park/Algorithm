class Solution {
    public int solution(int a, int b) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. 정수 a, b를 문자열 x, y로 변환
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        //3. 문자열 x + y,를 정수 x_plus_y로 변환
        int x_plus_y = Integer.parseInt(x + y);
        //4. 조건문 작성 : x_plus_y > (2 * a * b)
        if(x_plus_y > (2 * a * b)) {
            //4-1. answer값에 x_plus_y 넣기
            answer += x_plus_y;
        } else {
            //4-2. x_plus_y < (2 * a * b), answer값에 (2 * a * b) 넣기
            answer += (2 * a * b);
        }
        //5. return값 answer 설정
        return answer;
    }
}