package step6_02.method;

import java.util.Scanner;
//2021-04-14
/*class Ex05{

	void test1() {}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		scan.close();
	}
	
}*/

class Ex5{
	void test1() {
		int total=0;
		for(int i=0; i<=5; i++) {
			total+=i;
		}
		System.out.print("정답= "+total);
		System.out.println();
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[]arr = new int [3];
		for(int i = 0; i<3; i++) {
			System.out.print((i+1)+".정수입력: ");
			arr[i] = scan.nextInt();
		}
		int maxNum = 0;
		for(int i =0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				
			}
		}
		System.out.println("최대값= "+maxNum);
		scan.close();
	}
}
public class MethodEx05_문제 {

	public static void main(String[] args) {

		
			Ex5 e = new Ex5();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		

	}

}
