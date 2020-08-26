/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// ○ 과제 (8월 11일 오전 수업시작전 제출)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가.. 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.


// 실행 예)
// 임의의 연도 입력 : 2020
// 2020 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2020
// 2021 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 윤년 → 2월의 마지막 날이 29일
//	  평년 → 2월의 마지막 날이 28일

// ※ 윤년을 판별하기 위한 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나,
//	  또는 400의 배수이면 윤년, 그렇지 않으면 평년


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성
		int year;		//--연도(year) 변수 생성

		// 사용자 메세지 출력
		System.out.print("임의의 연도 입력 : ");

		// 변수 담기
		year = Integer.parseInt(br.readLine());		//--문자열로 표현된 숫자를 정수형태 year 변수에 담기
		

		// 조건문, 결과 출력
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.printf("%d → 윤년\n", year);
		}
		
		else if(year>0)
		{
			System.out.printf("%d → 평년\n", year);
		}
		else
		{
			System.out.printf("\n>>입력 값 오류\n");
		}
	}
}
// 실행 결과
/*
임의의 연도 입력 : 2021

2021 → 평년
계속하려면 아무 키나 누르십시오 . . .


임의의 연도 입력 : 2020

2020 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : -1

>>입력 값 오류
계속하려면 아무 키나 누르십시오 . . .

*/