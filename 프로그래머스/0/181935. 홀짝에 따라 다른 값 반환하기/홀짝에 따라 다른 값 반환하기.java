class Solution {
    public int solution(int n) {
        //1. 결과값 변수 answer 설정
        int answer = 0;
        //2. n == 홀수 : if
        if(n % 2 != 0) {
        //3. 반복문 : n 이하 모든 양의 홀수
            for(int i=1; 2*i-1<=n; i++){
        //4. answer에 2*i-1 값 더하기
                answer += 2*i-1;
            }
        } else {
        //5. n == 짝수, 반복문 : n 이하 모든 양의 짝수 제곱
            for(int i=1; 2*i<=n; i++) {
        //6. answer에 2*i^2 값 더하기
                answer += Math.pow((2*i), 2);
            }
        }
        //7. return값 answer 설정
        return answer;
    }
}