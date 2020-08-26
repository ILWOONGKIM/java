/*=======================================================
■■■ 자바 기본 프로그래밍 ■■■
	- 퀴즈
	  삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	  이 삼각형의 넓이를 구하는 프로그램을 구현한다.
========================================================*/

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3		<- 사용자가 입력
// - 삼각형의 높이 입력 : 5		<- 사용자가 입력

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르십시오 . . .

// ※ 삼각형의 넓이 = 밑변 * 높이 / 2
// ※ 사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;		//-- readline 쓸 때 쓴 것


public class Test012
{
	public static void main(String[] args) throws IOException	//-- readline 쓸 때 쓴 것
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int underlength, height;			//--밑변, 높이
		double area;						//--넓이		자료형 체크
		
		// 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 underlenth에 담아내기
		underlength = Integer.parseInt(br.readLine());

		// ③ 다시 사용자에게 안내 메시지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 height 에 담아내기
		height = Integer.parseInt(br.readLine());

		// ⑤ 삼각형의 넓이를 구하는 연산 처리
		area = underlength * height / 2.0;
		//		정수형		정수형	정수형		→ 정수 기반 연산 → 몫만 취하는 연산
		//		정수형		정수형	실수형		→ 실수 기반 연산 → 나머지 포함 연산

		// ※ 실수 자료형이 결과값으로 나오는 과정에서
		//	  실수 기반의 연산이 필요한 상황이다.
		//	  정수형 『2』가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//	  이 연산은 실수 기반으로 처리한다.


		// 결과 출력
		System.out.println();		// 그냥 개행
		//System.out.print();		// 에러 발생

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n" 
						, underlength, height, area);

		//------------------------------------------------------------------

		/*
		// 주요 변수 선언

		int a, h;			//--밑변, 높이
		double w;			//--삼각형의 넓이

		// 연산 및 처리

		// 1. 안내메시지 출력
		// 2. 사용자가 입력한 삼각형의 높이, 밑변을 변수 a, h에 담아내기

		System.out.print("삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("삼각형의 높이 입력 : ");
		h = Integer.parseInt(br.readLine());

		// BufferedReader 안에, readline() 메소드, 외부 입력값 가져오기

		// 3. 삼각형의 넓이 연산
		w = a * h / 2.0;

		// 결과 출력
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", a, h, w);
		*/

	}

}

// 실행결과
/*
삼각형의 밑변 입력 : 3
삼각형의 높이 입력 : 5
>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/