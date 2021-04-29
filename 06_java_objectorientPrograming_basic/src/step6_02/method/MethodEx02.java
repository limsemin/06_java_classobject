package step6_02.method;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 입력값(파라메타,매개변수,인수,인자,아규먼트)과 
 * 결과값(return)의 유무에 따라 4가지 형태로 나뉜다.
 * 
 * 입력값이 있고 , 결과값이 있다. ( 11 )
 * 입력값이 있고 , 결과값이 없다. ( 10 )
 * 입력값이 없고 , 결과값이 있다. ( 01 )
 * 입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	//입력값과 결과값이 모두 있는 경우
	int type111(int arg1, int arg2) {
		System.out.println("type11메서드 호출");
		return arg1+arg2;	
	}

// 입력값과 결과값이 모두 있는 경우
int type112(int arg1 , int arg2) {
	System.out.println("type11메서드 호출");
	return arg1 + arg2;
}

// 입력값은 있고 결과값은 없는 경우
void type10(int arg1 , int arg2) {
	System.out.println("두 인자의 합 : " + (arg1 + arg2));
}

// 입력값은 없고 결과값은 있는 경우
double type01() {
	System.out.println("type01 메서드 호출");
	return 3.141592;
}
// 입력값과 결과값이 모두 없는 경우
void type00() {
	System.out.println("type00 메서드 호출");
}
}
	

public class MethodEx02 {

	public static void main(String[] args) {

MethodType mt = new MethodType();
		
		// 입력값과 결과값이 모두 있는 경우
		System.out.println(mt.type111(30, 70));		
		
		int res1 = mt.type111(300, 700);
		System.out.println(res1);
		
		if (10000 == mt.type112(3000, 7000)) {
			System.out.println("결과값은 10000");
		}	
		
		System.out.println("\n=====================\n");
		
		// 입력값은 있고 결과값이 없는 경우
		mt.type10(12, 34);
		mt.type10(123, 345);
		mt.type10(1234, 3456);
		System.out.println("\n=====================\n");
		//입력값은 없고 결과값이 있는 경우
		double res2 = mt.type01();
		double res3 = mt.type01();
		double res4 = mt.type01();
		System.out.println("\n=====================\n");
		//입력값과 결과값이 모두 없는 경우
		mt.type00();
		mt.type00();
		mt.type00();
		
			
		
		}
}
		
		
		
