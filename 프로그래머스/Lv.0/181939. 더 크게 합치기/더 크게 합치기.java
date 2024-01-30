class Solution {
    public int solution(int a, int b) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. 정수 a, b를 각각 문자열 x, y로 변환
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        //3. 문자열 x + y, y + x 연산을 각각 x_plus_y, y_plus_x로 정수 변환
        int x_plus_y = Integer.parseInt(x + y);
        int y_plus_x = Integer.parseInt(y + x);
        //4. 조건문 작성 : x_plus_y > y_plus_x
        if(x_plus_y > y_plus_x) {
            //4-1. answer에 x_plus_y 넣기
            answer += x_plus_y;
        } else {
            //4-2. x_plus_y < y_plus_x, answer에 y_plus_x 넣기
            answer += y_plus_x;
        }
        //5. return값 answer 설정
        return answer;
    }
}