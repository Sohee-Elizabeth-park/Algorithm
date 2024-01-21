class Solution {
    public String solution(int[] numLog) {
        //1. 결과값 answer 설정
        String answer = "";
        //2. 반복문 : i=1부터 시작
        for(int i=1; i<numLog.length; i++) {
            // 3-1. 조건문 : numLog[i] - numLog[i-1] == 1 == 'w'
            if(numLog[i] - numLog[i-1] == 1) {
                //3-2. answer에 'w' 추가
                answer += 'w';
            } else if(numLog[i] - numLog[i-1] == -1) {
                //4. numLog[i] - numLog[i-1] == 1 == 's'
                answer += 's';
            } else if(numLog[i] - numLog[i-1] == 10) {
                //5. numLog[i] - numLog[i-1] == 10 == 'd'
                answer += 'd';
            } else {
                //6. numLog[i] - numLog[i-1] == -10 == 'a'
                answer += 'a';
            }
        }
        //7. return값 answer 설정
        return answer;
    }
}