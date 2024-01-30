class Solution {
    public int solution(int a, int b, boolean flag) {
        //1. 결과값 변수 answer 설정
        int answer = 0;
        //2. flag == true, a + b
        if(flag == true) {
            answer = a + b;
        } else {
        //3. flag == false, a - b
            answer = a - b;
        }
        //4. return값 answer 설정
        return answer;
    }
}