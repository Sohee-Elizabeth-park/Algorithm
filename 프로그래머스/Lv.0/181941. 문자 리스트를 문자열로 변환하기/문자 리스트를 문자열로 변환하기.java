class Solution {
    public String solution(String[] arr) {
        //1. 결과값 answer 설정
        String answer = "";
        //2. 반복문 작성 : arr.length()
        for(int i=0; i<arr.length; i++) {
            //2-1. answer에 arr[i] 넣기
            answer += arr[i];
        }
        //3. return값 answer 설정
        return answer;
    }
}