public class Question_1 {
//    check if n is a power of 2?
    public static void main(String[] args) {
        int n = 16;
        boolean ans = isPowerof2(n);
        System.out.println("Ans : "+ans);
    }
    static boolean isPowerof2(int n){
        if((n&n-1)==0){
            return true;
        }else{
            return false;
        }
    }
}
