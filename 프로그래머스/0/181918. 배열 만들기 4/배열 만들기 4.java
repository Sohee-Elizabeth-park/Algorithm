import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        //1. 결과값 stk 동적 배열 생성
        List<Integer> stk = new ArrayList<>();
        //2. 반복문
        for(int i=0; i<arr.length;) {
            //3-1. 조건문 : if(stk.length == 0)
            if(stk.size() == 0) {
                //3-2. arr[i]를 stk에 추가, i에 1 더하기
                stk.add(arr[i]);
                i++;
            }
            //4-1. 조건문 : if(stk.length > 0)
            else if(stk.size() > 0) {
                //5-1. 조건문 : stk 마지막 원소 < arr[i]
                if(stk.get(stk.size()-1) < arr[i]) {
                    //5-2. arr[i]를 stk 뒤에 추가, i에 1 더하기
                    stk.add(arr[i]);
                    i++;
                }
                //6-1. 조건문 : stk 마지막 원소 >= arr[i]
                else if(stk.get(stk.size()-1) >= arr[i]) {
                    //6-2. stk 마지막 원소를 stk에서 제거
                    stk.remove(stk.size() - 1);
                }
            }
        }
        //7. return값 str 설정
        return stk.stream().mapToInt(i->i).toArray();
    }
}