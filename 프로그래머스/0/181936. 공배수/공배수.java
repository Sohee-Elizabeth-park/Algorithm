class Solution {
    public int solution(int number, int n, int m) {
        //1. 결과값 변수 answer 설정
        int answer = 0;
        //2. (number % n == 0) && (number % m == 0)이면 answer = 1;
        if((number % n == 0) && (number % m == 0)) {
            answer = 1;
        } else {
        //3. 해당 되지 않으면 answer = 0;
            answer = 0;
        }
        //4. return값 answer 설정
        return answer;
    }
}