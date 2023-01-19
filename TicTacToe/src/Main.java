import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] gameBoard = { { " ", " ", " " }, 
							   { " ", " ", " ", }, 
							   { " ", " ", " ", } };
		
		int count = 0;	
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("X");
        list.add("O");

        System.out.println("X starts the game\nWhoever lines up the same symbol 3 times side by side, "
        		+ "upside down or diagonally wins.\n");
        System.out.println("1|2|3");
        System.out.println("4|5|6");
        System.out.println("7|8|9\n");
        	
        int i = 0;
        while (true) {
            System.out.println("Choose a place: (1...9)");
            int input = scan.nextInt();
            
            switch (input) {
            case 1:
            	gameBoard[0][0] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 2:
            	gameBoard[0][1] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 3:
            	gameBoard[0][2] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 4:
            	gameBoard[1][0] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 5:
            	gameBoard[1][1] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 6:
            	gameBoard[1][2] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 7:
            	gameBoard[2][0] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 8:
            	gameBoard[2][1] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
            case 9:
            	gameBoard[2][2] = list.get(i);
            	bringBoard(gameBoard);
            	count++;
            	break;
			}
            
			i++;
			
			if (i == 2) {
				
				i = 0;
				
            }
            
		if ((gameBoard[0][0] == "X" && gameBoard[0][1] == "X" && gameBoard[0][2] == "X")
			|| (gameBoard[1][0] == "X" && gameBoard[1][1] == "X" && gameBoard[1][2] == "X")
			|| (gameBoard[2][0] == "X" && gameBoard[2][1] == "X" && gameBoard[2][2] == "X")
			|| (gameBoard[0][0] == "X" && gameBoard[1][0] == "X" && gameBoard[2][0] == "X")
			|| (gameBoard[0][1] == "X" && gameBoard[1][1] == "X" && gameBoard[2][1] == "X")
			|| (gameBoard[0][2] == "X" && gameBoard[1][2] == "X" && gameBoard[2][2] == "X")
			|| (gameBoard[0][0] == "X" && gameBoard[1][1] == "X" && gameBoard[2][2] == "X")
			|| (gameBoard[0][2] == "X" && gameBoard[1][1] == "X" && gameBoard[2][0] == "X")) {
			System.out.println("'X' WINS!");
			break;
			}

		else if ((gameBoard[0][0] == "O" && gameBoard[0][1] == "O" && gameBoard[0][2] == "O")
			|| (gameBoard[1][0] == "O" && gameBoard[1][1] == "O" && gameBoard[1][2] == "O")
			|| (gameBoard[2][0] == "O" && gameBoard[2][1] == "O" && gameBoard[2][2] == "O")
			|| (gameBoard[0][0] == "O" && gameBoard[1][0] == "O" && gameBoard[2][0] == "O")
			|| (gameBoard[0][1] == "O" && gameBoard[1][1] == "O" && gameBoard[2][1] == "O")
			|| (gameBoard[0][2] == "O" && gameBoard[1][2] == "O" && gameBoard[2][2] == "O")
			|| (gameBoard[0][0] == "O" && gameBoard[1][1] == "O" && gameBoard[2][2] == "O")
			|| (gameBoard[0][2] == "O" && gameBoard[1][1] == "O" && gameBoard[2][0] == "O")) {
			System.out.println("'O' WINS!");
			break;
		}
		else if(count == 9) {
			System.out.println("NO WINNER!");
			break;
		}
		            
	}

}

	private static void bringBoard(String[][] gameBoard) {
		System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1] + "|" + gameBoard[0][2]);
		System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1] + "|" + gameBoard[1][2]);
		System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1] + "|" + gameBoard[2][2]);

	}

}
