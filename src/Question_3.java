public class Question_3 {
//    given x, return x set bits
    public static void main(String[] args) {
        int x = 3;
        int ans = gpTeq(x);
        System.out.println("Ans : "+ans);
    }
    static int myTeq(int x){
        int ans = 0;
        for(int i=0;i<x;i++){
            ans = ans + (1<<i);
        }
        return ans;
    }
    static int gpTeq(int x){
        return (1<<x)-1;
    }
}
