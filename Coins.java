public class Coins {

    public Coins(){

    }
    public int numOfCoins(int coins){
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
}
