class Solution {
    public int solution(int num, int n) {
        //1. 결과값 변수 answer 설정
        int answer = 0;
        //2. num % n == 0이면 1 return
        if(num % n == 0) {
            answer = 1;
        } else {
        //3. num % n != 0이면 0 return
            answer = 0;
        }
        //4. return값 answer 설정
        return answer;
    }
}