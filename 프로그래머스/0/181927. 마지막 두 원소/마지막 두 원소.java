class Solution {
    public int[] solution(int[] num_list) {
        //1-1. 결과값 int type 배열 answer 설정 : 기존 배열 길이 + 1
        int[] answer = new int[num_list.length + 1];
        //1-2. 추가할 값 저장 변수 result 설정
        int result = 0;
        //2. 반복문 : num_list 요소들을 answer에 넣기
        for(int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        //3-1. 마지막 요소 > 그전 요소 : 마지막 요소 - 그전 요소 = result
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            result = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
        //3-2. 마지막 요소 < 그전 요소 : 마지막 요소 * 2 = result
            result = num_list[num_list.length-1] * 2;
        }
        //4. result -> answer 배열 마지막에 넣기
        answer[num_list.length] = result;
        //5. return 값 answer 설정
        return answer;
    }
}
