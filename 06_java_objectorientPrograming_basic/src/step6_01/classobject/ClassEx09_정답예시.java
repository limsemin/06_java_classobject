package step6_01.classobject;

import java.util.Random;
import java.util.Scanner;

class Ex09{

	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		

}

public class ClassEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09 e = new Ex09();
		
		int size = e.front.length;
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(size);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}

		while (true) {

			for (int i=0; i<size; i++) {
				if 		(e.front[i] == 1) 	System.out.print("○\t");
				else if (e.front[i] == 2) 	System.out.print("□\t");
				else if (e.front[i] == 3) 	System.out.print("△\t");
				else if (e.front[i] == 4) 	System.out.print("♤\t");
				else if (e.front[i] == 5) 	System.out.print("◇\t");
			}
			System.out.println();
			
			for(int i=0; i<size; i++) {
				if (e.back[i] == 1) 		System.out.print("○\t");
				else if (e.back[i] == 2) 	System.out.print("□\t");
				else if (e.back[i] == 3) 	System.out.print("△\t");
				else if (e.back[i] == 4) 	System.out.print("♤\t");
				else if (e.back[i] == 5) 	System.out.print("◇\t");
				else 						System.out.print("■\t");
			}
			System.out.println();
			
			
			if (e.answerCnt == 5) 			break;
			
			System.out.print("인덱스1 입력 : ");
			int idx1 = scan.nextInt();
			
			System.out.print("인덱스2 입력 : ");
			int idx2 = scan.nextInt();
			
			if (e.front[idx1] == e.front[idx2]) {
				e.back[idx1] = e.front[idx1];
				e.back[idx2] = e.front[idx2];
				e.answerCnt += 1;
			}
			
		}

		scan.close();
		
	}

}
