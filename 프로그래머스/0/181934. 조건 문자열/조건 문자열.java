class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        //1. 결과값 answer 설정
        int answer = 0;
        //2. ineq.equals(">") && eq.equals("=")
        if(ineq.equals(">")) {
            if(eq.equals("=")) {
        //3. n >= m : true = 1, false = 0;
                if(n >= m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else if(eq.equals("!")){
                //4. ineq.equals(">") && eq.equals("!")
                //5. n > m : true = 1, false = 0;
                if(n > m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        } else if(ineq.equals("<")){
            //6. ineq.equals("<") && eq.equals("=")
            if(eq.equals("=")) {
                //7. n <= m : true = 1, false = 0;
                if(n <= m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else if(eq.equals("!")) {
                //8. ineq.equals("<") && eq.equals("!")
                //9. n < m : true = 1, false = 0;
                if(n < m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        }
        //10. return값 answer 설정
        return answer;
    }
}