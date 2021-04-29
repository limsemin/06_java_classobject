package step6_01.classobject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

class Ex08{
	
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
	
}


public class ClassEx08_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex08 e = new Ex08();
		
		int player = 0;
		for (int i=0; i<e.game.length; i++) {
			if (e.game[i] == 2) {
				player = i;
			}
		}

		while (true) {
			
			for (int i=0; i<e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println();
			
			System.out.print("1.left 2.right : ");
			int move = scan.nextInt();
			
			if (move == 1) {
				
				if (player != 0 && e.game[player - 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if (punch != 3) {
						continue;
					}
				}
				
				e.game[player] = 0;
				player--;
				
				if (player == -1) {
					player = e.game.length -1;
				}
				
				e.game[player] = 2;
				
			}
			else if (move == 2) {
				
				if (player != e.game.length-1 && e.game[player + 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if (punch != 3) {
						continue;
					}
				}	
				
				e.game[player] = 0;
				player++;
				if (player == e.game.length) {
					player =  0;
				}
				e.game[player] = 2;
				
			}
			
		}

		
	}

}
