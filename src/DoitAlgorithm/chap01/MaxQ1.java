package DoitAlgorithm.chap01;

public class MaxQ1 {
    //1. 
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(max4(4,15,10,4));
    }
}
