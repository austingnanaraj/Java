public class Gamble{
public static void main(String args[]){
int start=1000;
int end =10000;
int T=100;
int bets=0;
int wins=0;
for(int t=0;t<T;t++){
int cash=start;
while(cash>0 && cash<end){
if(Math.random() < 0.5) cash++;
else cash--;
} if(cash == end) wins++;
}
System.out.println(wins+"wins of"+T);
System.out.println("Percent of games won = "+100.00*wins/T);
System.out.println("Avg # bets"+1*bets/T);
}
}