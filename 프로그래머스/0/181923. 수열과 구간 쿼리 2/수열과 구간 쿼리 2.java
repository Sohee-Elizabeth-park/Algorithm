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
        //4-1. 최대값 max 설정
            int max = 1000000;
        //4-2. 최소값 min 설정 (max값으로 초기화)
        //max값 mi에 할당 -> 이후 작은 수 존재 시 해당 값으로 갱신 위함
            int min = max;
        //5. 반복문 : s <= j <= e 조건 반영
            for(int j=s; j<=e; j++) {
        //6. 조건문 : arr[j] > k && min > arr[j]
                if(arr[j] > k && min > arr[j]) {
        //7. answer에 min값 넣기
                    min = arr[j];
                    }
                } //(5. 반복문 : s <= j <= e 조건 종료)
        //8. 조건문 : 'min != max' -> min값 갱신 됨
            if(min != max) {
        //9. answer에 min값 넣기
                answer[i] = min;
            } else {
        //10. 'min == max' -> min값 갱신 안됨 (조건'arr[j] > k && min > arr[j]' 충족 X)
        //11. answer에 -1값 넣기
                answer[i] = -1;
                }
            } //(2. 반복문 : queries.length 종료)
        return answer;
    }
}