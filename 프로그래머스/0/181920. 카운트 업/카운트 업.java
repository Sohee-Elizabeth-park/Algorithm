class Solution {
    public int[] solution(int start_num, int end_num) {
        //1. 결과값 변수 answer 설정 : 길이[end_num - start_num + 1]
        int[] answer = new int[end_num - start_num + 1];
        //2. 반복문 :  for(int i=start_num; i<=end_num; i++)
        for(int i=start_num; i<=end_num; i++) {
        //3. answer[i-start_num] = i
            answer[i-start_num] = i;
        }
        //4. return값 answer 설정
        return answer;
    }
}