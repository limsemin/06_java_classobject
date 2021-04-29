package step6_02.method;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] rNum = new int[5];		// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
		for (int i=0; i<rNum.length; i++) {
			rNum[i] = ran.nextInt(4) + 1;		// [0 ~ 3] + 1		
		}
	}
	
	
	
	// 2.정답 출력하기
	void showAnswer() {
		
		// omr카드 출력
		System.out.print("omr  = ");
		System.out.println(Arrays.toString(omr));
		
		// me카드 출력
		System.out.print("rNum = ");
		System.out.println(Arrays.toString(rNum));
		
	}
	
	
	
	// 3.정답 비교하기
	void checkAnswer() {
		answerCnt = 0;
		System.out.print("정오표= [");
		for (int i=0; i<omr.length; i++) {
			if (omr[i] == rNum[i]) {
				System.out.print("O ");
				answerCnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = 20 * answerCnt;
		System.out.println("점  수 = " + score + "점");
	}
	
	
	
	// 4.실행하기
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
}

public class MethodEx12_테스트문제 {

	public static void main(String[] args) {
		
		ScoreMng sm = new ScoreMng();
		sm.run();

	}

}
