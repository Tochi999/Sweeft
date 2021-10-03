import java.util.Arrays;

public class minPositive {

    public minPositive(){

    }
    public int minNum(int[] args){
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
}
