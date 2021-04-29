package step6_02.method;

/*2021-04-14
class Ex07 {
	
	void printEvenOrOdd(int x) {
		
	}
	void sumBetweenValues(int x, int y) {
	}

	void printPrimeNums(int primeNumber) {
		
	}
}
*/
class Ex7{
	void printEvenOrOdd(int x) {
		if( x % 2 ==0) {
			System.out.println("짝수");
		}else {System.out.println("홀수");}
	}
	void sumBetweenValues(int x, int y) {
		int tot = 0;
		for(int i =0; i<= y; i++) {
			tot+=i;
		}
		System.out.println("\n정답= "+ tot + "\n");
	}
	void printPrimeNums(int primeNumber) {
		for(int i =2; i<=primeNumber; i++) {
			int count = 0;
			for(int n = 1; n<= i; n++) {
				if(i % n ==0) {
					count--;				
				}
			}
			if(count == 2) {
			}
			System.out.print(i+" ");
		}
	}
}

public class MethodEx07_문제 {

	public static void main(String[] args) {
		
		
			Ex7 e = new Ex7();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.sumBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
