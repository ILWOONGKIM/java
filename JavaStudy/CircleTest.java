/*===============================
 ■■■ 클래스와 인스턴스 ■■■
================================*/

// ※ Test073.java 파일과 세트
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
//-------------------------------------------------------

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// 원의 반지름을 입력받아 넓이와 둘레를 구하는 객체설계

	
public class CircleTest 
{
	// 멤버 변수 → 주요 속성
	int r;								//-- 반지름
	final double PI = 3.141592;			//-- 원주율(변수의 상수화)

	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());

	}

	// 넓이 계산 기능 → 메소드 정의
	double calArea()
	{
		double result = 0;
		result = r * r * PI;

		return result;
	}		

	// 둘레 계산 기능 → 메소드 정의
	double calLength()
	{
		double result = 0;
		result = r * 2.0 * PI;

		return result;
	}			
	
	// 결과 출력 기능 → 메소드 정의
	void print(double a, double l)
		
	{
		// 반지름이 xx인 원의
		// 넓이 : xxx.xx
		// 둘레 : xxx.xx
		System.out.printf("\n반지름이 %d인 원의\n", r);
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n", l);
	}

}






/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
	
class CircleTest 
{

	int r;								// 멤버변수(데이터)
	final double PI = 3.141592;


	void input() throws IOException		// 기능(반지름 값 입력받기)
	{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("반지름 입력 : ");

	r = Integer.parseInt(br.readLine());

	}
	
	double calWidth()					// 원의 넓이
	{
		double result = 0.0;
		result = r * r * PI;

		return result;
	}		
	
	double calLength()					// 원의 둘레계산
	{
		double result = 0.0;
		result = r * 2.0 * PI;

		return result;
	}			
							
	void print(double w, double l)		// 출력
		
	{
		System.out.printf("\n반지름이 %d인 원의\n", r);
		System.out.printf("넓이 : %.2f\n", w);
		System.out.printf("둘레 : %.2f\n", l);
	}

}

*/