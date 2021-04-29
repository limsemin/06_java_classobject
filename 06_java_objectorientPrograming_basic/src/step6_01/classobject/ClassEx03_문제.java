package step6_01.classobject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수
//2021-04-12
//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}
class Arr{ 
	int[] arr = {87, 100, 11, 72, 92};
}


public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total=0;
		for(int i =0; i<e.arr.length; i++) {
			total +=e.arr[i];
		}
		System.out.println("정답: "+total);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int tot = 0; 
		for(int i = 0; i < e.arr.length; i ++) {
			if(e.arr[i] % 4 ==0) {
				tot+= e.arr[i];
			}
		}
		System.out.println("정답: "+tot);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int answer = 0;
		for(int i = 0; i< e.arr.length; i++) {
			if(e.arr[i] % 4 ==0) {
				answer++;
			}
		}
		System.out.println("정답: "+answer);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int answr = 0;
		for(int i =0; i<e.arr.length; i++) {
			if(e.arr[i] %2==0) {
				answr++;
			}
		}
		System.out.println("정답: "+answr);

	}

}
