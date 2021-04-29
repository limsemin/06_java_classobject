package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	
	// 숫자 셋팅하기
	void setNumber() {
		
		int k = 1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j] = k++;
			}
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				back[i][j] = k++;
			}
		}
		
	}

	
	
	// 카드 섞기
	void suffleCard() {
		
		for (int i = 0; i < 1000; i++) {
			int xR = ran.nextInt(front.length);
			int yR = ran.nextInt(front[0].length);

			int tmp = front[0][0];
			front[0][0] = front[xR][yR];
			front[xR][yR] = tmp;

			tmp = back[0][0];
			back[0][0] = back[xR][yR];
			back[xR][yR] = tmp;
		}
		
	}

	
	
	// 화면 출력하기
	void showCard() {
		
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				System.out.print(front[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}

	
	
	// 입력받기
	void selectCard() {
		
		System.out.print("y입력 : ");
		int yIdx = scan.nextInt();
		System.out.print("x입력 : ");
		int xIdx = scan.nextInt();
		
		if (num == front[yIdx][xIdx]) {
			if (num <= 9) {
				front[yIdx][xIdx] = back[yIdx][xIdx];
			} 
			else {
				front[yIdx][xIdx] = 0;
			}
			num++;
		}
		
	}

	
	
	void run() {

		setNumber();
		suffleCard();

		while (true) {

			showCard();

			// 종료하기
			if (num == 19) {
				System.out.println("게임종료");
				break;
			}

			selectCard();
		}
	}
	
}



public class MethodEx17_테스트문제 {

	public static void main(String[] args) {
		
		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
