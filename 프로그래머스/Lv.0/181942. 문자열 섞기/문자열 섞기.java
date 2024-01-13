class Solution {
    public String solution(String str1, String str2) {
        //1. 결과값 변수 answer 설정
        String answer = "";
        //2. 반복문 작성 : str1.length() = str2.length()
        for(int i=0; i<str1.length(); i++) {
            //2-1. str1 요소 하나씩 분리 : x
            char x = str1.charAt(i);
            //2-2. str2 요소 하나씩 분리 : y
            char y = str2.charAt(i);
            //2-3. answer에 x 하나씩 넣기
            answer += x;
            //2-4. answer에 y 하나씩 넣기
            answer += y;
        }
        //3. return값 answer 설정
        return answer;
    }
}