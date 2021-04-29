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

class scoreMngs{
	Random ran = new Random();
	
	int[] omr = {1, 3, 4, 2, 5};
	int[] rNum = new int[5];
	
	int answerCnt = 0;
	int score = 0;

	void makeAnswer() {
		for(int i = 0; i<rNum.length; i++) {
			rNum[i] =ran.nextInt(4)+1;
		}
	}
	void showAnswer() {
		
		//omr카드 출력
		System.out.print("omr =");
		System.out.println(Arrays.toString(omr));
		//me카드 출력
		System.out.print("rNum=");
		System.out.println(Arrays.toString(rNum));
	}
	
	void checkAnswer() {
		answerCnt = 0;
		System.out.print("정오표 [");
		for(int i =0; i<omr.length; i++) {
			if(omr[i] == rNum[i]) {
				System.out.print(" o ");
				answerCnt++;
			}else 
				System.out.print(" x");
		}System.out.println("]");
		score = 20 * answerCnt;
		System.out.println("점수 = "+score);
	}
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
}

	
	
	

public class MethodEx12_테스트문제복사1 {

	public static void main(String[] args) {
		
		scoreMngs sm = new scoreMngs();
		sm.run();

	}

}
