class Solution {
    //문자열 return값 solution() 작성
    public String solution(String my_string, String overwrite_string, int s) {
        //1. result 값 담을 변수 answer 지정
        String answer = "";
        //2. answer에 my_string.index[0] ~ index[s]까지 담기
        answer += my_string.substring(0, s);
        //3. answer에 overwrite_string 담기
        answer += overwrite_string;
        //4. overwrite_string 이후 문자열 있다면, : 조건문 If
        if(my_string.length() - answer.length() > 0) {
            //4-1. answer에 나머지 문자열 담기 : s + overwrite_string.length() 이후부터 끝까지의 문자열
            answer += my_string.substring(s + overwrite_string.length());
        }
        //5. return값 answer 설정
        return answer;
    }
}