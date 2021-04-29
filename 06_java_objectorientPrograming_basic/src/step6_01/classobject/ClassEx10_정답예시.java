package step6_01.classobject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

import java.util.Scanner;

class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜	라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Ex10 e = new Ex10();
		
		boolean isInsufficient = false;
		
		
		e.name = "맘스터치";

		System.out.println("==========" + e.name + "==========");
		for ( int i = 0; i < e.arMenu.length; i++ ) {
			System.out.println(i+1 +". "+ e.arMenu[i] + "\t : " + e.arPrice[i] + "원");
		}
	
		while ( true ) {
						
			System.out.println(">>> 1) 주문 2) 영수증 출력 : ");
			int choice = scan.nextInt();
			
			if ( choice == 1 ) {
				
				System.out.print(">>> 메뉴번호 선택 :  ");
				int sel = scan.nextInt();
				
				sel--;
				e.arCount[sel]++;
				isInsufficient = false;
				
			}
			
			else if ( choice == 2 ) {
				
				if (!isInsufficient) {
					for ( int i = 0; i < e.arCount.length; i++ ) {
						e.total += e.arCount[i] * e.arPrice[i];
					}
				}
				System.out.println("----------------------");
				System.out.println("ITEM" + "	\t"+ "QTY" + "\t" + "AMT");
				
				for ( int i = 0; i < e.arCount.length; i++ ) {
					System.out.println(e.arMenu[i] + "\t" + e.arCount[i] + "\t" + e.arPrice[i]);
				}
				System.out.println("----------------------");
				System.out.println(">>합계 금액 : " + e.total +"원");
				System.out.println();
				System.out.print(">>지불액 입력 : ");
				int money = scan.nextInt();
				
				if ( money >= e.total ) {
					
					int deposit = money - e.total;
					
					System.out.println(">>받은 금액 : " + money + "원");
					System.out.println("----------------------");
					System.out.println(">>잔돈 : " + deposit + "원");
					scan.close();
					break;
				}
				
				else  {
					System.out.println("[메세지] 입금액 부족 / 확인하세요");
					isInsufficient = true;
				}
				
			}
			
		}
		
	}
}
