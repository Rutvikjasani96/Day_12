public class Question_2 {
//    given x & y, set x continous set bits and y unset.
    public static void main(String[] args) {
        int x = 2, y = 3;
        int ans = solution(x,y);
        System.out.println("Ans : "+ans);
    }
    static int solution(int x,int y){
        int ans = 0;
//        for(int i=0;i<x;i++){
//            ans = ans + (1<<y);
//            y++;
//        }
        return ((1<<x)-1<<y);   // Without Loop
//        return ans;
    }
}
