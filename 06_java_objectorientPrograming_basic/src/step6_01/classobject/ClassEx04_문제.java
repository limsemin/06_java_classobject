package step6_01.classobject;

import java.util.Random;
import java.util.Scanner;

/*2021-04-13
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/
class Ex4 { int[]hakbuns = {1001, 1002, 1003, 1004, 1005};
			 int[]scores = new int[5];}

public class ClassEx04_문제 {

	private static int i;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex4 e = new Ex4();
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			  
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		double avarage = 0.0;
		for(int i =0; i<e.scores.length;i++) {
			total+=e.scores[i];
		}
		avarage = total / (double) e.scores.length;
		System.out.print("총점:"+total+" ");
		System.out.println("평균:"+avarage);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int tot=0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				tot++;
			}
		}
		System.out.println(tot + "명");
		System.out.println();
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스를 입력하세요: ");
		int index = scan.nextInt();
		for(int i =0; i<e.scores.length; i++) {
			if(i == index) {
			}
		}
		System.out.println("성적:" +e.scores[index]);
		System.out.println();
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.print("성적을 입력하세요: ");
		int score = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] == score) {
				System.out.print("인덱스:"+ i);
				System.out.println("\n");
			}
		}
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.print("학번을 입력하세요: ");
		int totalData = scan.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == totalData) {
			}
		}
		System.out.println("성적:" +e.scores[i]);
		System.out.println("\n");
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.print("학번을 입력하세요: ");
		totalData = scan.nextInt();
		int noNum = -1;
		for (int i = 0; i <e.hakbuns.length; i++) {
			if(e.hakbuns[i] == totalData) {
				noNum = i;
			}
		}
		if(noNum == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}else {
			System.out.println("성적:"+e.scores[noNum]);
		}
		System.out.println("\n");
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int maxNum = 0;
		int maxScore = 0;
		for(int i =0; i<e.scores.length; i++) {
			if(maxNum < e.scores[i]) {
				maxNum = e.scores[i];
				maxScore = i;
			}
		}
		System.out.println(e.hakbuns[maxScore]+"번"+"(" +maxNum+")"+"점");
			
		scan.close();
	}

}
