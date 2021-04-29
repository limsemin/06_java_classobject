package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

//class NumberGame{
//	
//	Scanner scan = new Scanner(System.in);
//
//	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
//	int playerLocation = 4;
//	
//	void printPlay() {
//		
//		for (int i=0; i<move.length; i++) {
//			if (move[i] == 0) 	System.out.print("[ ]"); 
//			else  				System.out.print("옷"); 
//		}
//		System.out.println();
//		
//	}
//	
//	
//	
//	void showMenu() {
//		
//		System.out.println("1.좌로 이동");
//		System.out.println("2.우로 이동");
//		System.out.println("3.종료하기");
//		
//	}
//	
//	
//	
//	void moveLeft() {
//		
//		if (playerLocation > 0) {
//			move[playerLocation] = 0;
//			move[playerLocation - 1] = 8;
//			playerLocation--;
//		}
//		else {
//			System.out.println("더이상 움직일 수 없습니다!");
//		}
//		
//	}
//	
//	
//	
//	void moveRight() {
//		
//		if (playerLocation < move.length - 1) {
//			move[playerLocation] = 0;
//			move[playerLocation + 1] = 8;
//			playerLocation++;
//		}
//		else {
//			System.out.println("더이상 움직일 수 없습니다!");
//		}
//		
//	}
//	
//	
//	
//	void run() {
//		
//		while (true) {
//			// 게임화면 출력
//			printPlay();
//			// 메뉴 출력
//			showMenu();
//			
//			// 메뉴 선택
//			System.out.print(": ");
//			int choice = scan.nextInt();
//			
//			// 좌로 이동
//			if(choice == 1) { 
//				moveLeft(); 
//			}
//			// 우로 이동
//			else if (choice == 2) { 
//				moveRight(); 
//			}
//			// 종료
//			else if (choice == 3) {
//				System.out.println("게임 종료");
//				break;
//			}
//		}
//		
//	}
//	
//}
//
//public class MethodEx14_테스트문제복사 {
//
//	public static void main(String[] args) {
//		
//		NumberGame g = new NumberGame();
//		g.run();
//
//	}
//
//}
