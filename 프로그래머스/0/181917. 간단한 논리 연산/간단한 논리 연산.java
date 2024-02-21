class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        //1-1. return값 설정
        //1-2. 교집합 : ||
        //1-3. 합집합 : &&
        return ((x1 || x2)&&(x3 || x4));
    }
}