class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //1. 결과값 변수 answer 설정
        int[] answer = new int[arr.length];
        //2. 반복문 : queries.length
        for(int i=0; i<queries.length; i++) {
        //3. s, e, k 변수 설정
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
        //4. 반복문 : for(int j=s, j<=e; j++)
            for(int j=s; j<=e; j++) {
        //5. 조건문 : if(j % k == 0)
                if(j % k == 0) {
        //6. arr[j] += 1
                    arr[j] += 1;
                    }
                }
            }
        //7. 반복문 : arr.length (arr[i] -> answer[i] 넣기)
        for(int i=0; i<arr.length; i++) {
        //8. answer[i] = arr[i]
            answer[i] = arr[i];
        }
        //9. return값 answer 설정
        return answer;
    }
}