/*================================
■■■ 자바 기본 프로그래밍 ■■■
	- 변수와 자료형
================================*/

public class Test003
{
	public static void main(String[] args)
	{
		// 변수 선언
		int a;

		// 변수 초기화(변수 a에 10을 대입)
		a = 10;

		// 변수 선언 및 초기화(같이 함께함)
		int b = 20;

		// 변수 선언
		int c;

		// 테스트
		System.out.println(a);	//--==>> 10
		System.out.println(b);	//--==>> 20
		//System.out.println(c);	//--==>> 에러 발생(컴파일 에러)
		//-- 에러 사유 : 초기화 되지 않은 지역 변수에 접근하여 출력을 시도

		// 연산 및 처리
		c = a + b;

		// 테스트
		System.out.println(c);	//--==>> 30

		/*
		System.out.println(a b c);
		//--==>> 에러 발생(컴파일 에러)
		*/

		// 출력
		System.out.print(a + " " + b + " " + c);
		
		// ※   덧셈 연산자(+)
		//	    피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
		//		산술연산자로써의 기능을 수행하는 것이 아니라
		//		문자열 결합 연산자로써의 기능을 수행하게 된다.

		System.out.println("a 의 값은 " + a + "입니다.");
		System.out.println("b 의 값은 " + b + "입니다.");
		System.out.println("a 와 b 를 더한 결과값 : " + c);

	}

}
/*
10
20
30
10 20 30a 의 값은 10입니다.
b 의 값은 20입니다.
a 와 b 를 더한 결과값 : 30
계속하려면 아무 키나 누르십시오 . . .
*/