package Snakeandladder;

public class SnakeAndLadder {
	static final int START_POSITION=0;
	static final int NO_PLAY=0;
	static final int LADDER=1;
	static final int SNAKE=2;
	static int[] position_numdieroll=new int[2];
	
	public static int position_update(int position,int dice_value,int check_value) {
		if(check_value==NO_PLAY) {
			
		}
		
		else if(check_value== LADDER){
			position+=dice_value;
			
			if(position>100) {
				position=position-dice_value;
			}
			
//			else if(position==100) {
//				b=false;
//			}
//			else{
//				
//			}
			
		}
		else {
			position-=dice_value;
			if(position<=START_POSITION) {
				position=START_POSITION;
			}
			else {
			   
			}
		}
		return position;
	}
	
	public static int[] roll(int position,int n,int noofdierolls) {
		
		int dice_value=1+(int) Math.floor(Math.random()*10)%6;
		System.out.println("Dice value :"+dice_value);

		int check_value=(int) Math.floor(Math.random()*10)%3;
		System.out.println("Check Value :"+check_value);
		
		position=position_update(position,dice_value,check_value);
		System.out.println("Current position of player "+n+": "+position+"\n");
		
		if(position<100) {
		if(check_value==1) {
			noofdierolls+=1;
			roll(position,n,noofdierolls);
		}}
		
		position_numdieroll[0]=position;
		position_numdieroll[1]=noofdierolls;
		return position_numdieroll;
	}
	
	public static void main(String[] args) {
		int position_1=START_POSITION;
		int position_2=START_POSITION;
		System.out.println("Welcome to Snake and Ladder game");
		boolean b= true;
		int[] values=new int[2];
		int no_of_die_rolls=0;
		while(b) {
			no_of_die_rolls+=1;
			
			System.out.println("Player 1:");
			
			values=roll(position_1,1,no_of_die_rolls);
			position_1=values[0];
			no_of_die_rolls=values[1];
			
			if(position_1==100 ) {
				b=false;
				System.out.println("Player 1 has won the game");
				break;
			}
			
			System.out.println("Player 2");
			values=roll(position_2,2,no_of_die_rolls);
			position_2=values[0];
			no_of_die_rolls=values[1];
			
			
			if(position_2==100) {
				b=false;
				System.out.println("Player 2 has won the game");
			}
		}
	
	
		//System.out.println("player has won the game");
		System.out.println("Number of die rolls :"+no_of_die_rolls);
	}
}
