class Solution {
    public int solution(int a, int b, int c) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2-1. 조건문 : a = b = c
        if((a == b) && (b == c)) {
        //2-2. answer = (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)
            answer = (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) * (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        } else if((a != b) && (b != c) && ((a != c))) {
         //3-1. 조건문 : a != b != c, answer = a + b + c  
            answer = a + b + c;
        } else {
        //4-1. 조건문 : 두 숫자 일치 && 나머지 숫자 불일치, answer = (a + b + c) * (a^2 + b^2 + c^2)
            answer = (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        }
        //5. return값 answer 설정
        return answer;
    }
}