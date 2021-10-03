import java.util.Stack;

public class Properly {

    public Properly(){

    }
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
}
