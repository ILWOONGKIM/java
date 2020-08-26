 /*=======================================
  ■■■ 전역변수와 지역변수 ■■■
  - 지역변수의 초기화 테스트 실습
=======================================*/

// Test070.java와 비교

// 지역변수와 전역변수의 특징
// 1. scope 2. 변수에따른 초기화 처리 방식차이

public class Test071
{
	// 전역 변수 a 선언 → 인스턴스(객체)가 생성되어야 메모리를 할당받을 수 있고, 
							// 메인 메소드안에서 호출 받을 수 있음(ex 이 상태에서 main() 안에서 System.~(a) 불가)
	long a;			
	//-- int a는 자동으로 0으로 초기화를 지원함
	//-- char a는 공백으로 초기화 지원
	//-- float와 double은 0.0, 
	//-- boolean은 false, 
	//-- byte와 short, long는 0,
	//-- String은 null

	// main() 메소드 밖, 클래스 영역안에서 선언된 변수라고해서
	// '클래스변수'라고 해서는 절대로 안됨!!
		
	public static void main(String[] args)
	{
		//System.out.println("a : " + a)

		// Test071 인스턴스 생성
		Test071 ob = new Test071();

		System.out.println("ob.a : " + ob.a);

	}
	
}