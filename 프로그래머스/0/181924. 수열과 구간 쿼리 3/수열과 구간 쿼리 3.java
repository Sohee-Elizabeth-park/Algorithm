class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //1-1. 결과값 answer 설정
        int[] answer = new int[arr.length];
        //1-2. 임시 저장 변수 tmp 설정
        int tmp = 0;
        //2. 반복문 : queries.length
        for(int i=0; i<queries.length; i++) {
            //3-1. arr[queries[i][0]]값 tmp에 넣기
            //3-2. queries[i][j] : i, j는 arr의 index값
            tmp = arr[queries[i][0]];
            //4-1. arr[queries[i][0]]을 arr[queries[i][1]]에 담기
            //4-2. [0,3] => [(0,0), (0,1)]
            //4-3. queries[i][1] => i번째 요소의 끝 인덱스
            arr[queries[i][0]] = arr[queries[i][1]];
            //5. queries[i][1]을 tmp에 담기
            arr[queries[i][1]] = tmp;
        }
        //6. 반복문 : arr을 answer에 옮겨담기
        for(int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        //7. return값 answer 설정
        return answer;
    }
}