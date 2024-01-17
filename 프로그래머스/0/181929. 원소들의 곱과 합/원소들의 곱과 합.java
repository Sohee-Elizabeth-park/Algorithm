class Solution {
    public int solution(int[] num_list) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. 모든 원소들의 곱 multipl 설정, 0으로 초기화되면 결과값 계속 0 됨
        int multipl = 1;
        //3. 모든 원소들의 합 sum 설정
        int sum = 0;
        //4. 반복문
        for(int i=0; i<num_list.length; i++) {
        //5. 모든 원소들의 곱
            multipl *= num_list[i];
        //6. 모든 원소들의 합
            sum += num_list[i];
        }
        //7-1. 조건문 : 모든 원소들의 곱 < (모든 원소들의 합)^2, return 1
        if(multipl < Math.pow(sum, 2)) {
            answer = 1;
        } else {
        //7-2. 모든 원소들의 곱 > (모든 원소들의 합)^2, return 0
            answer = 0;
        }
        //8. return값 answer 설정
        return answer;
    }
}