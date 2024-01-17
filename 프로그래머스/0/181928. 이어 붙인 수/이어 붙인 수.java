class Solution {
    public int solution(int[] num_list) {
        //1-1. 결과값 answer 설정
        int answer = 0;
        //1-2. 홀수만 순서대로 이어 붙인 수 odd 설정
        String odd = "";
        //1-3. 짝수만 순서대로 이어 붙인 수 even 설정
        String even = "";
        //2. 반복문
        for (int i=0; i<num_list.length; i++) {
            //3-1. num_list[i] % 2 == 0, String 변환 후 odd에 이어 붙이기
            if(num_list[i] % 2 == 0) {
                odd += Integer.toString(num_list[i]);
            } else {
            //3-2. num_list[i] % 2 == 1, String 변환 후 even에 이어 붙이기
                even += Integer.toString(num_list[i]);
            }
        }
        //4. String type odd, even -> int 변환
        int odd_int = 0;
        int even_int = 0;
        odd_int += Integer.parseInt(odd);
        even_int += Integer.parseInt(even);
        //5. 조건문 : odd_int + even_int = answer
        answer = odd_int + even_int;
        return answer;
    }
}