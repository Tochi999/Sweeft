import java.util.Arrays;

public class Sweeft {
    public Sweeft(){

    }
    //Task 1
    public boolean isPalindrom(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    //Task 2
    public int minSplit(int coins){
        int answer = 0;
        int x = 50;
        while(true){
            if(coins%x == 0){
                break;
            }
            int y = coins / x;
            answer += y;
            coins = coins % x;
            if(x == 50){
                x = 20;
            }else if(x == 20){
                x = 10;
            }else if(x == 10){
                x = 5;
            }else if(x == 5){
                x = 1;
            }
        }
        int y = coins / x;
        answer += y;
        return answer;
    }
    //Task 3
    public int notContains(int[] args){
        int answer = 0;
        Arrays.sort(args);
        int x = 1;
        for(int i = 0; i < args.length; i++){
            if(args[i] > 0){
                if(args[i] != x){
                    answer = x;
                    break;
                }else{
                    x++;
                }
            }
        }

        return answer;
    }
    //Task 4
    public boolean isProperly(String s){
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            if(num < 0){
                return false;
            }
            if(s.charAt(i) == '('){
                num++;
            }
            if(s.charAt(i) == ')'){
                num--;
            }
        }
        if(num != 0){
            return false;
        }
        return true;
    }
    //Task 5
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
