class Solution {
    public int solution(int a, int d, boolean[] included) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. 반복문 작성 : included[i] -> i + 1항, int i = 1;
        for(int i = 0; i < included.length; i++) {
            //3-1. included[i] == "true", answer += a + i * d
            //3-2. an = a1 + (n-1)d
            if(included[i]) {
                answer += a + i * d;
            }
        }
        //4. return값 answer 설정
        return answer;
    }
}