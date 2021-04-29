package step6_01.classobject;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

class Ex12{
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;	
	
}



public class ClassEx12_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex12 e = new Ex12();
		
		for (int i=0; i<e.game.length; i++) {
			for (int j=0; j<e.game[i].length; j++) {
				e.game[i][j] = "[ ]";
			}
		}
	
		while (true) {
			
			for (int i=0; i<e.game.length; i++) {
				for (int j=0; j<e.game[i].length; j++) {
					System.out.print(e.game[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			if (e.win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			else if (e.win == 2) {
				System.out.println("[p2]승리");
				break;
			}
			
			if (e.win == 0 && e.turn == 9) {
				System.out.println("비겼다.");
				break;
			}
			
			if (e.turn % 2 == 0) {
				System.out.print("[p1]y좌표 입력 : ");
				int y = scan.nextInt();
				System.out.print("[p1]x좌표 입력 : ");
				int x = scan.nextInt();
				
				if (e.game[y][x].equals("[ ]")) {
					e.game[y][x] = "[O]";
					e.turn += 1;
				}
			}
			else if (e.turn % 2 == 1) {
				System.out.print("[p2]y좌표 입력 : ");
				int y = scan.nextInt();
				System.out.print("[p2]x좌표 입력 : ");
				int x = scan.nextInt();
				
				if(e.game[y][x].equals("[ ]")) {
					e.game[y][x] = "[X]";
					e.turn += 1;
				}
			}
			
			for (int i=0; i<e.game.length; i++) {
				if (e.game[i][0].equals("[O]") && e.game[i][1].equals("[O]") && e.game[i][2].equals("[O]")) e.win = 1;				
				if (e.game[i][0].equals("[X]") && e.game[i][1].equals("[X]") && e.game[i][2].equals("[X]")) e.win = 2;
			}
			
			for (int i=0; i<e.game.length; i++) {
				if (e.game[0][i].equals("[O]") && e.game[1][i].equals("[O]") && e.game[2][i].equals("[O]")) e.win = 1;			
				if (e.game[0][i].equals("[X]") && e.game[1][i].equals("[X]") && e.game[2][i].equals("[X]")) e.win = 2;
			}
			
			if (e.game[0][0].equals("[O]") && e.game[1][1].equals("[O]") && e.game[2][2].equals("[O]")) e.win = 1;
			if (e.game[0][0].equals("[X]") && e.game[1][1].equals("[X]") && e.game[2][2].equals("[X]")) e.win = 2;
			
			if (e.game[0][2].equals("[O]") && e.game[1][1].equals("[O]") && e.game[2][0].equals("[O]")) e.win = 1;
			if (e.game[0][2].equals("[X]") && e.game[1][1].equals("[X]") && e.game[2][0].equals("[X]")) e.win = 2;
			
			
		}
		
		scan.close();

	}

}
