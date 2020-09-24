package Snakeandladder;

public class SnakeAndLadder {
	static final int START_POSITION=0;
	static final int NO_PLAY=0;
	static final int LADDER=1;
	static final int SNAKE=2;
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game");
		
		int dice_value=1+(int) Math.floor(Math.random()*10)%6;
		System.out.println("Dice value :"+dice_value);

		int check_value=(int) Math.floor(Math.random()*10)%3;
		System.out.println("Check Value :"+check_value);
		
		int position=START_POSITION;
		
		if(check_value==NO_PLAY) {
			
		}
		else if(check_value== LADDER){
			position+=dice_value;
		}
		else {
			if(position==START_POSITION) {
				
			}
			else {
			position-=dice_value;
			}
		}
		System.out.println("Current position :"+position);
		
	}
}
