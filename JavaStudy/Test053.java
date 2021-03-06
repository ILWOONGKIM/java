/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(while) 실습
===============================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 이에 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해 버릴 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//	 :
// 7 * 8 = 56
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

// 원하는 단(구구단) 입력 : 17
// 1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...


//--------------------------------------------------------------------------


// 코딩 전 풀이과정 전개해보기
// 1. BufferedReader 인스턴스 생성, 변수 선언
// 2. 사용자 메세지 출력을 위해 숫자형 문자열인 외부변수를 Integer.parseInt(readLine())으로 변수에 담기
// 3. while문으로 입력받은 값까지의 범위로 구구단의 반복문 구성
// 4. 해당 while문 안에서 1~9사이 정수일때, 1~9사이 정수가 아닐 때를 if 문으로 구분하여 구성
// 5. 입력값을 출력


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		// 인스턴스 생성

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 선언

		int a;								//--사용자에게 입력받을 정수
		int	n=1;							//--루프변수


		// 사용자 메세지 출력 및 외부 문자열 변수에 담기
		
		System.out.print("원하는 단(구구단) 입력 : ");
		a = Integer.parseInt(br.readLine());
		


		// 연산 및 처리 및 출력

		if (a<=9)	//-->> 입력받은 변수 범위
		{

			while (n<=9)	//-->> 반복횟수
			{
				System.out.printf("%d * %d = %d\n", a, n, (a*n));
				n++;
			}

		}

		else
		{
			System.out.printf("1부터 9까지의 정수만 입력이 가능합니다.\n");
		}

	}
}

// 처리 결과
/*
원하는 단(구구단) 입력 : 3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
계속하려면 아무 키나 누르십시오 . . .
*/

/*
원하는 단(구구단) 입력 : 11
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
