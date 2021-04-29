package step6_01.classobject;

import java.util.Scanner;

class Ex05{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}


public class ClassEx05_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			// 전교생 성적확인
			if (choice == 1) {
				
				int total = 0;
				
				for (int i=0; i<mega.arScore.length; i++) {
					total += mega.arScore[i];
				}
				
				double avg = (double)total / mega.arScore.length;
				
				System.out.println("전교생 수 = " + mega.arScore.length + "명");
				System.out.printf("평균 = %.1f점\n", avg);
				System.out.println("총점 = " + total + "점");
				
			}
			// 1등학생 확인하기
			else if (choice == 2) {
				
				int maxScore = mega.arScore[0];
				int maxIdx = 0;
				
				for (int i=1; i<mega.arScore.length; i++) {
					if (maxScore < mega.arScore[i]) {
						maxScore = mega.arScore[i];
						maxIdx = i;
					}
				}
				
				System.out.println("=== 1등 ===");
				System.out.println("학번 : " + mega.arHakbun[maxIdx]);
				System.out.println("성적 : " + maxScore);
				
			}
			// 꼴등학생 확인하기
			else if (choice == 3) {
				
				int minScore = mega.arScore[0];
				int minIdx = 0;
				
				for (int i=1; i<mega.arScore.length; i++) {
					if (minScore > mega.arScore[i]) {
						minScore = mega.arScore[i];
						minIdx = i;
					}
				}
				
				System.out.println("=== 꼴등 ===");
				System.out.println("학번 : " + mega.arHakbun[minIdx]);
				System.out.println("성적 : " + minScore);
				
			}
			// 성적 확인하기
			else if (choice == 4) {
				
				System.out.print("학번을 입력하세요 : ");
				int hakbun = scan.nextInt();
				
				// 학번 유효성 검사
				int check = -1;
				for (int i=0; i<mega.arHakbun.length; i++) {
					if (mega.arHakbun[i] == hakbun) {
						check = i;
					}
				}
				
				if (check == -1) {
					System.out.println("학번을 잘못 입력하였습니다.");
				}
				else {
					System.out.println(hakbun + "학번 학생의 성적은 " + mega.arScore[check] + "점 입니다.");
				}
				
			}
			// 종료하기
			else if (choice == 5) {
				
				System.out.println("프로그램 종료");
				break;
				
			}
		}

		scan.close();
	}

}
