package clockwiseCalculation;

import java.util.Scanner;

import clockwiseCalculation.RotationLogic.*;


public class CircleRotationGame {


	public static void main(String args[]) {

		Node head = null;
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the number of nodes of children: ");
		int n = sn.nextInt();
		for (int i = 1; i <= n; i++) {
			head = RotationLogic.push(head, i);
		}

		System.out.print("The child designated as number 1: ");
		int k = sn.nextInt();
		// rotating counter clock wise with designated as number 1
		Node updated_head = RotationLogic.rotateCounterClockwise(head, k);

		System.out.print("Enter the lucky number : ");
		int m = sn.nextInt();
		// clockwise rotation with lucky number count
		Node expected_head = RotationLogic.rotateClockwise(updated_head, m);
		RotationLogic.printWinner(expected_head);
	}
}
