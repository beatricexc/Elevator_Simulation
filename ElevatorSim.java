package elevator_sim;

import java.util.Scanner;
 /** 
  * This program simulates an elevator panel that skips the 13th floor
  */
public class ElevatorSimulator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please press the floor number: ");
		int floor = keyboard.nextInt();
		int actualFloor = floor ;
		
		if (floor > 13) {
			actualFloor --;
		}
		System.out.println("The elevator will travel to the actual floor " + actualFloor);

	}

}
