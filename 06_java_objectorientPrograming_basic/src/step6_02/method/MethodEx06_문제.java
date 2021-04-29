package step6_02.method;

/*2021-04-14 //3번 복습
class Ex06{
	
	void test1(int x, int y) {}
	
	void test2(int[] arr) {}
	
	void test3(int[] arr, int idx1, int idx2) {}
	
}
*/
class Ex6{
	void test1(int x, int y) {
		int total = 0;
		for(int i =0; i<=y; i++) {
			total += i;
		}
		System.out.println("정답= "+ total+"\n");
	}
	void test2(int[] arr) {
		
		int maxNum =0;
		for(int i = 0; i <arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("정답= "+maxNum+"\n");
	}
	void test3(int[]arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//복습
	}
}

public class MethodEx06_문제 {

	public static void main(String[] args) {
		
		
			Ex6 e = new Ex6();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1, idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);
		

	}

}
