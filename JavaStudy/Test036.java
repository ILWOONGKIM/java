/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 112
// 두 번째 정수 입력 : 8
// 세 번째 정수 입력 : 21

// >> 정렬 결과 : 8 21 112
// 계속하려면 아무 키나 누르세요..

// 첫 번째 정수 입력 : 15
// 두 번째 정수 입력 : 121
// 세 번째 정수 입력 : 15

// >> 정렬 결과 : 15 15 121
// 계속하려면 아무 키나 누르세요..


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;		//-- 사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// 3 1 2 
		// - - 
		// 1 3 2
		// -   -
		// 1 3 2
		//   - -
		// 1 2 3	첫 번째 수는 무조건 제일 작은 값


		if (a>b)	// 첫 번째 정수(a)가 두 번째 정수(b)보다 크다면
		{
			// a 와 b 의 자리를 바꾼다.(xor 비트연산자로)
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c)	// 첫 번째 정수(a)가 세 번째 정수(c)보다 크다면
		{
			// a 와 c 의 자리를 바꾼다.
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)	// 두 번째 정수(b)가 세 번째 정수(c)보다 크다면
		{
			// b 와 c 의 자리를 바꾼다.
			b=b^c;
			c=c^b;
			b=b^c;
		}

		// 최종 결과 출력 → a, b, c 순서대로 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);

	}
	
}

// 실행 결과
/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 5
세 번째 정수 입력 : 0

>> 정렬 결과 : 0 5 5
계속하려면 아무 키나 누르십시오 . . .
*/