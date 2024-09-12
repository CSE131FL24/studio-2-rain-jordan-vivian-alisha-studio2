package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		
		while (!(startAmount == 0) && totalSimulations != 0 && winLimit != startAmount) {
			if (Math.random()*10.0+1 <= winChance*10) { 
					System.out.println("win");
					startAmount = startAmount + 1;
				}
				else {
					System.out.println("lose");
					startAmount = startAmount - 1;
					
				} totalSimulations = totalSimulations - 1;
		}
	}
}
