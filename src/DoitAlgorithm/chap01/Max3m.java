package DoitAlgorithm.chap01;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.
// 여러 번 반복 출력 : 메서드로 처리

class Max3m {
    //1-1. 매개변수 a, b, c값 필요한 메서드 max3 설정
    static int max3(int a, int b, int c) {
        //1-2. max값 설정
        int max = a;
        //1-3. 조건문 : b > max
        if(b>max) max = b;
        //1-4. 조건문 : c > max
        if(c>max) max = c;
        //1-5. return값 max 설정
        return max;
    }

    public static void main(String[] args) {
        //2. 인자 a=3, b=2, c=1값 -> max3 메서드 호출
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
    }
}
