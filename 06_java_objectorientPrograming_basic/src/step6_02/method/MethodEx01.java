package step6_02.method;

/*
 * 
 *  # 클래스의 구성요소
 *  
 *  [1] 변수
 *  [2] 메서드(method)
 * 
 * 
 * 	2-1) void : return 타입 (int,double,char,String,int[]....)
 * 	2-2) printMenu  : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
 *  2-3) ()   : 입력인수
 *  2-4) {}   : 메서드의 영역
 *  
 * */


class Method{
	//메서드 정의부
	void printMenu(){
		System.out.println("========");
		System.out.println("1.로그인");
		System.out.println("2.로그아웃");
		System.out.println("3.정보조회");
		System.out.println("4.정보수정");
		System.out.println("5.종료");
		System.out.println("========");
		return;//반환 타입이 void일 때는 생략 가능하다.
		
	}
}




public class MethodEx01 {

	public static void main(String[] args) {
		
		Method test= new Method();
		
		
		//메서드 호출부(정의된 메서드가 동작한다.)
		//객체.메서드명()형태로 호출한다.
		test.printMenu();	
		test.printMenu();
		test.printMenu();
		
		
		
	
	
	}

}
