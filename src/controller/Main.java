package controller;

import java.util.Scanner;

import players.Player1;
import players.Player2;

public class Main {
	public static void main(String[] args) {

		String attempt[][] = new String[3][3];

		Scanner sc = new Scanner(System.in);

		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		
		
		/*To check who won! Later it will be better explained*/
		int totalLine = 0;
		int totalCol = 0;
		int totalLine3 = 0;
		int totalCol3 = 0;
		
		System.out.println("WELCOME TO THE GAME!");
		for (int line = 0; line < 3; line++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" | ");
			}
			System.out.println();
		}

		try {
		for (int line = 0; line < 3; line++) {
			for (int col = 0; col < 3; col++) {
				System.out.println("Choose a position");
				System.out.println("Player1's turn");
				System.out.println("Enter the position of the line:");
				int line1 = sc.nextInt();

				System.out.println("Enter the position of the column:");
				int col1 = sc.nextInt();

				p1.setPositionLine(line1);
				p1.setPositionCol(col1);

				attempt[line1][col1] = "X";
				System.out.println(attempt[line1][col1]);

				System.out.println("Player2's turn");
				System.out.println("Enter the position of the line:");
				int line3 = sc.nextInt();

				System.out.println("Enter the position of the column:");
				int col3 = sc.nextInt();

				p2.setPositionLine(line3);
				p2.setPositionCol(col3);

				attempt[line3][col3] = "0";
				System.out.println(attempt[line3][col3]);
				
				/*Variables to check if the player won. If the player entered these position (diagonal or entire column), he/she won */
				/*DIAGONAL --> Line 0 + Line 1 + Line 2
				           --> Col 0 + Col 1 + Col 2*/
				int allDiagonalLine = 0 + 1 + 2;
				int allDiagonalCol = 0+ 1 + 2;
				
				
				/*ENTIRE COLUMN --> Line 0 + Line 1 + Line 2
				                --> Col0 + Col 0 + Col 0 (OR) Col 1 + Col 1 + Col 1 (OR) Col 2 + Col 2 + Col 2*/
				int allEntireLine = 0 + 1 + 2;
				int allEntireCol = 0 + 0 + 0;
				int allEntireCol1 = 1+ 1+ 1;
				int allEntireCol2 = 2+2+2;
				/*==================================*/
				
				
				/*Checking who won*/
				if (totalLine == allDiagonalLine && totalCol == allDiagonalCol) {
					System.out.println("PLAYER 1 WINS");
					System.out.println("-----END-----");
					System.out.println("==========================================");
					main(args);
					
					
				} else {
					System.out.println("PLAYER 2 WINS");
					System.out.println("--------END--------");
					System.out.println("==========================================");
					main(args);
					
				}
				
				if (totalLine == allEntireLine && totalCol == allEntireCol || totalCol == allEntireCol1 || totalCol == allEntireCol2) {
					System.out.println("PLAYER 1 WINS");
					System.out.println("----END----");
					System.out.println("==========================================");
					main(args);
					
					
				} else {
					System.out.println("PLAYER 2 WINS");
					System.out.println("--------END--------");
					System.out.println("==========================================");
					main(args);
					
				}

				for (int z = 0; z < 3; z++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(" | ");
						System.out.print(attempt[z][j]);
					}
					System.out.println();
				}
				
				totalLine += line1 ;
				totalCol += col1;
				
				totalLine3 += line3;
				totalCol3 +=  col3;
			}
		}
		} catch(IndexOutOfBoundsException e) {
			System.out.println("ERROR. Invalid Position. Please try again");
			System.out.println("___________________________");
			System.out.println();
			main(args);
		}
		
		
	}
}

