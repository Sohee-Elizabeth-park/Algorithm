import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1-1. 에너지 드링크 총 개수 N
        int N;
        //1-2. 에너지 드링크 총 개수(N) 입력 : Scanner
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        //2. 에너지 드링크 양 저장할 배열 길이 지정 (N의 길이 = 배열 길이) : Array
        double[] arr = new double[N];
        //3. 최대값 저장 변수 max (최대값이 실수인 경우 : double)
        double max = 0;
        //4. 최대값 설정 반복문 작성 : for
        for (int i = 0; i < N; i++) {
            //4-1. 입력 받은 에너지 드링크 양 -> 배열에 저장
            arr[i] = sc.nextDouble();
            //4-2. max < arr[i]이면 arr[i]을 max에 저장
            if (max < arr[i]) {
                max = arr[i];
            }
        } //for문 종료
        //5. 결과값 저장 변수 sum
        //a, b 중 max는 그대로, min * 1/2한 후 나누기 -> sum = max 상태에서 계속 xi/2 더하기
        double sum = max;
        //6. 에너지 드링크 합계 반복문 작성 : for
        for (int i = 0; i < N; i++) {
            //6-1. arr[i]이 최대값인 경우, 넘어가서 다시 for문 반복
            if (arr[i] == max)
                continue;
            //6-2. arr[i]가 최대값이 아닐 때, (* 1/2) + sum으로 계속 저장
            sum += arr[i] / 2;
        } //for문 종료
        //7. 결과값 출력
        System.out.println(sum);
    }//main() 종료
}//class 종료
