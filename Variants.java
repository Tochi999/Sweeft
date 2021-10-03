public class Variants {
    public Variants(){

    }
    private int recursion(int n){
        if (n <= 1){
            return n;
        }
        int ans = 0;
        for(int i = 1; i <= 2 && i <= n; i++){
            ans += recursion(n - i);
        }
        return ans;
    }
    public int countVariants(int stearsCount){
        int answer = 0;
        answer = recursion(stearsCount + 1);
        return answer;
    }

}
