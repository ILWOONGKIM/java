/*===============================
 ■■■ 클래스와 인스턴스 ■■■
================================*/

// ※ CircleTest.java 파일과 세트
//			→ 해당 파일 참조

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest)

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xx <- 사용자가 입력

// 반지름이 xx인 원의		<- 인스턴스 생성이후 출력
// 넓이 : xxx.xx
// 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

//----------------------------------------------------


import java.io.IOException;

public class Test073
{
			// ※ 메모리할당 순서 : 클래스로딩 -> 인스턴스 생성
			// static은 클래스로딩과정에서 이미 메모리를 할당받음

	public static void main(String[] args) throws IOException		// input 에서 throw 되면 main 메소드에서 터지므로 main에서도 throw해야함
																	// 이로 미루어 보아, br의 readLine 메소드에도 IOException이 throw 되었을 것임
	{
		CircleTest ct = new CircleTest();

		ct.input();
		double a = ct.calArea();
		double l = ct.calLength();
		ct.print(a, l);

	}
}

// 처리 결과
/*
반지름 입력 : 10

반지름이 10인 원의
넓이 : 314.16
둘레 : 62.83
계속하려면 아무 키나 누르십시오 . . .
*/


/*(나의 풀이)

// 1. 클래스 설계(반지름, 원주율, 원의 둘레, 원의 넓이)
// 2. 전개 방식 및 분류


반지름(데이터)
기능(입력받은 반지름 값, return 안받음)

원의 둘레
원의 넓이
출력




import java.io.IOException;

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// 인스턴스 생성
		CircleTest ct = new CircleTest();

		// 입력 메소드 호출(반지름)
		ct.input();

		// 넓이 메소드 호출
		double width = ct.calWidth();

		// 둘레 메소드 호출
		double length = ct.calLength();

		// 출력 메소드 호출
		ct.print(width, length);

	}
}

*/