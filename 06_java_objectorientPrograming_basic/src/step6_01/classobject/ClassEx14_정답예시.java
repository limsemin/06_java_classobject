package step6_01.classobject;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

class Ex14{
	
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	
	String[] menu = {"죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두"};
	
}


public class ClassEx14_정답예시 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex14 e = new Ex14();
		
		// 초기화면
		System.out.println("[오늘의 점심메뉴]");
		
		for (int i = 0; i < e.ladder[0].length; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
		System.out.println("\n");
		for (int j = 0; j < e.ladder.length; j++) {
			for (int k = 0; k < e.ladder[j].length; k++) {
				if 		(e.ladder[j][k] == 0) 															System.out.print(" │ ");
				else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) 						System.out.print("─┤ ");
				else if (k != e.ladder[j].length - 1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) System.out.print(" ├─");
			}
			System.out.println();
		}
		for (int i=0; i<e.menu.length; i++) {
			System.out.println((i+1) + "." + e.menu[i]);
		}
		System.out.println("------------------");		
		System.out.println("\n");

		System.out.print("번호 선택[1~5] : ");
		e.x = scan.nextInt();
		e.x--;
		
		//진행 화면
		for (int i=0; i<e.ladder.length; i++) {
			
			for (int j=0; j<e.ladder.length; j++) {
				for (int k=0; k<e.ladder[j].length; k++) {
					if 		(j == e.y && k == e.x)															System.out.print(" * ");
					else if (e.ladder[j][k] == 0) 															System.out.print(" │ ");
					else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) 						System.out.print("─┤ ");
					else if (k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) 	System.out.print(" ├─");
				}
				System.out.println();
			}
			System.out.println();
			
			if (e.x != e.ladder[0].length-1 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x + 1] == 1) {
				e.x++;
				for (int j=0; j<e.ladder.length; j++) {
					for (int k=0; k<e.ladder[j].length; k++) {
						if 		(j == e.y && k == e.x)														  System.out.print(" * ");
						else if (e.ladder[j][k] == 0) 														  System.out.print(" │ ");
						else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) 					  System.out.print("─┤ ");
						else if (k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) System.out.print(" ├─");
					}
					System.out.println();
				}
				System.out.println();
			}
		
			else if (e.x != 0 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x - 1] == 1) {
				e.x--;
				for (int j=0; j<e.ladder.length; j++) {
					for (int k=0; k<e.ladder[j].length; k++) {
						if 		(j == e.y && k == e.x)															System.out.print(" * ");
						else if (e.ladder[j][k] == 0) 															System.out.print(" │ ");
						else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) 						System.out.print("─┤ ");
						else if( k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) 	System.out.print(" ├─");
					}
					System.out.println();
				}
				System.out.println();
			}
			e.y++;
			
		}
		
		System.out.println("오늘의 점심메뉴는 \"" + e.menu[e.x] + "\" 입니다.");
		scan.close();
		
	}

}
