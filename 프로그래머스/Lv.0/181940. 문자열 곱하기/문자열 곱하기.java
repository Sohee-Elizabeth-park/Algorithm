class Solution {
    public String solution(String my_string, int k) {
        //1. 결과값 answer 설정
        String answer = "";
        //2. 반복문 : k
        for(int i=0; i<k; i++) {
            //2-1. answer에 my_string 넣기
            answer += my_string;
        }
        //3. return값 answer 설정
        return answer;
    }
}