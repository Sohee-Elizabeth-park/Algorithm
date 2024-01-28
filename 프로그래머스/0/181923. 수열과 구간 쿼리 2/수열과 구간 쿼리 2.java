class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //1. 결과값 담을 answer 설정
        int[] answer = new int[queries.length];
        //2. 반복문 : queries.length
        for(int i=0; i<queries.length; i++) {
        //3. s, e, k 변수 생성
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
        //4. 최소값 min 설정
            int min = 1000000;
            int max = 1000000;
        //5. 반복문 : s <= j <= e 조건
            for(int j=s; j<=e; j++) {
        //6. 조건문 : arr[j] > k && arr[j] == min
                //if(min > arr[j]) {arr[j] = min;}
                if(arr[j] > k && min > arr[j]) {
        //7. answer에 min값 넣기
                    min = arr[j];
                    //answer[i] = min;
                    } 
        //8. 하나라도 성립되지 않으면
                
        //9. answer에 -1값 넣기

                } //5. 반복문 : s <= j <= e 조건 종료
            if(min != max) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }
            } //2. 반복문 : queries.length 종료
        return answer;
    }
}