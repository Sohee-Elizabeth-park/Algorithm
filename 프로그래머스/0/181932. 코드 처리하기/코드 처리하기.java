class Solution {
    public String solution(String code) {
        //1. 결과값 변수 ret 설정
        String ret = "";
        //2. mode 변수 설정, 0으로 초기화
        int mode = 0;
        //3. 반복문 : code.length
        for(int i=0; i<code.length(); i++) {
        //4. 조건문 : code.charAt(i) == "1"
            if(code.charAt(i) == '1') {
                //5. mode 변환
                mode = 1 - mode;
            } else if(i % 2 == mode) {
                //6-1. mode == 0, i % 2 == 0, ret += code.charAt(i)
                //6-2. mode == 1, i % 2 == 1, ret += code.charAt(i)
                ret += code.charAt(i);
                }
        }
        //7-1. return값 ret 설정
        //7-2. ret.length == 0, EMPTY
        //7-3. ret.length > 0, ret
        return "".equals(ret) ? "EMPTY" : ret;
    }
}