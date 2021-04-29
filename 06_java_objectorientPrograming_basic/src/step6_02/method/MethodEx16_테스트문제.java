package step6_02.method;

import java.util.Scanner;

//# 틱택토

class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	// game 배열을 공백(" ")으로 초기화 ( 초기화하지 않을 경우 null 값)
	void setGame() {
		
		for (int i=0; i<game.length; i++) {
			for (int j=0; j<game[i].length; j++) {
				game[i][j] = " ";
			}
		}
		
	}
	
	
	
	// 게임 화면 출력
	void showGame() {
		
		System.out.println("== 틱택톡 ==");
		for (int i=0; i<game.length; i++) {
			for (int j=0; j<game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("==========");
		
	}
	
	
	
	
	// 인덱스 선택
	void choiceIdx() {
		
		if (turn % 2 == 0) {
			
			System.out.print("[1턴]y인덱스 입력 : ");
			int yIdx = scan.nextInt();
			System.out.print("[1턴]x인덱스 입력 : ");
			int xIdx = scan.nextInt();
			
			if (game[yIdx][xIdx].equals(" ")) {
				game[yIdx][xIdx] = "O";
				turn += 1;
			}
			else {
				System.out.println("잘못 입력 했습니다.");
			}
			
		}
		else if (turn % 2 == 1) {
			
			System.out.print("[2턴]y인덱스 입력 : ");
			int yIdx = scan.nextInt();
			System.out.print("[2턴]x인덱스 입력 : ");
			int xIdx = scan.nextInt();
			
			if (game[yIdx][xIdx].equals(" ")) {
				game[yIdx][xIdx] = "X";
				turn += 1;
			} 
			else {
				System.out.println("잘못 입력 했습니다.");
			}
		}
	}
	
	
	void exitWidth() {
		for (int i=0; i<game.length; i++) {
			if (game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 1;
			if (game[i][0].equals("X") && game[i][1].equals("X") && game[i][2].equals("X")) win = 2;
		}
	}
	
	
	void exitHeight() {
		for (int i=0; i<game.length; i++) {
			if (game[0][i].equals("O") && game[1][i].equals("O") && game[2][i].equals("O")) win = 1;
			if (game[0][i].equals("X") && game[1][i].equals("X") && game[2][i].equals("X")) win = 2;
		}
	}
	

	void exitCross() {
		if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) win = 1;
		if (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) win = 2;
		if (game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) win = 1;
		if (game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("X")) win = 2;
	}
	
	void run() {
		
		// game 배열을 공백(" ")으로 초기화 ( 초기화하지 않을 경우 null 값)
		setGame();
		
		while(true) {
			
			showGame();
			
			// 게임 종료
			if (win == 1) {
				System.out.println("turn1 승리");
				break;
			}
			else if (win == 2) {
				System.out.println("turn2 승리");
				break;
			}
			
			choiceIdx();
			exitWidth();
			exitHeight();
			exitCross();
			
		}		
	}
	
}


public class MethodEx16_테스트문제 {

	public static void main(String[] args) {
		
		TicTacToe tic = new TicTacToe();
		tic.run();

	}

}
