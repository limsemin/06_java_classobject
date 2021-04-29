package step6_01.classobject;

import java.util.Random;
//2021-04-13
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

/*
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}
*/
class Ex6{
	int answer[] = {1,3,4,2,5}; // 시험답안
	int hgd[] = new int[5]; // 학생답안
	
	int answerCnt = 0; //정답 맞춘 개수
	int score = 0; // 성적
}


public class ClassEx06_문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		Ex6 e = new Ex6();
		for(int i =0; i<e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5)+1;
		}
		System.out.print("정   답= ");
		for(int i = 0 ; i< e.answer.length; i++) {
			System.out.print(e.answer[i]+" ");
		}
		System.out.println();
		
		
		System.out.print("학   생= ");
		for(int i = 0 ; i< e.hgd.length; i++) {
			System.out.print(e.hgd[i]+" ");
		}
		System.out.println();
		System.out.print("정오표= ");
		for(int i = 0; i< e.hgd.length; i++) {
			if(e.answer[i] == e.hgd[i]) {
				e.answerCnt ++;
				System.out.print("o ");
			}
			else{System.out.print("x ");
			}
		}
		System.out.println();
		e.score = e.answerCnt *20;
		System.out.print("성   적= "+e.score+"점");
	}
	

}
