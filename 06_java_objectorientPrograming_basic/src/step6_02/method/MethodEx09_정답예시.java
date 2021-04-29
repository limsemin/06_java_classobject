package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Ex09 {
	
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		
		for (int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		
		System.out.println("배열의 요소 : " + Arrays.toString(scores));
		System.out.println();
		
	}
	
	
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		
		int total = 0;
		for (int i = 0; i <scores.length; i++) {
			total += scores[i];
		}
										  // 형변환
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/scores.length);
		System.out.println();
		
	}
	
	
	
	//문제 3)
	void printWinner (int [] scores) {
		
		int count = 0;
		for(int i = 0; i <scores.length; i++) {
			if(scores[i] >= 60) {
				count++;
			}
		}
		System.out.println("합격생 수 : " + count);
		System.out.println();
		
	}
	
	
	
	//문제 4)
	void printScore1 (int [] scores) {
		
		System.out.print("인덱스를 입력하세요 : ");
		int index = scan.nextInt();
		
		System.out.println(index +"번째의 성적 : " + scores[index]);
		System.out.println();
		
	}
	
	
	
	//문제 5)
	void printScore2 (int [] scores) {
		
		System.out.print("성적을 입력하세요 : ");
		int value = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (value == scores[i]) {
				System.out.println(value+"성적은 " + i +"번째 위치");
				System.out.println();
			}
		}	
		
	}
	
	
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		
		System.out.println("학번 목록 : " + Arrays.toString(hakbuns));
		
		System.out.print("학번을 입력하세요 : ");
		int getHakbun = scan.nextInt();
		
		boolean isFind = false;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (getHakbun == hakbuns[i]) {
				System.out.println(getHakbun+"의 성적 : " + scores[i]);
				isFind = true;
			}
		}	
		
		if (isFind == false) {
			System.out.println("없는학번입니다.");
		}
		
		System.out.println();
		
	}
	
	
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		
		int maxNumber = scores[0];
		int maxIndex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxNumber < scores[i]) {
				maxNumber = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("1등의 성적 : " + maxNumber);
		System.out.println("1등의 학번 : " + hakbuns[maxIndex]);
		
	}
	
	
}

public class MethodEx09_정답예시 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);	
		
		
		
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		e.printWinner(scores);	
		
		
		
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);
		
		
		
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);
		
		
		
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);		
		
		
		
		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);	


	}

}
*/
