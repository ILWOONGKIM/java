/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(while) 실습
===============================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 그 수 까지의
// 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 270
// 1 ~ 270 까지 정수의 합 : xxxx
// 1 ~ 270 까지 짝수의 합 : xxxx
// 1 ~ 270 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

//--------------------------------------------------------------------------

// 코딩 전 풀이과정 전개해보기
// 1. BufferedReader 인스턴스 생성, 변수 선언
// 2. 사용자 메세지 출력을 위해 숫자형 문자열인 외부변수를 Integer.parseInt(readLine())으로 변수에 담기
// 3. while문으로 입력받은 값까지의 범위로 반복문 구성
// 4. 해당 while문 안에서 정수,짝수,홀수 일때를 if 문으로 구분하여 구성
// 5. 입력값을 출력


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 선언
		int a;								//--사용자에게 입력받을 정수
		int	n=1;							//--루프변수
		int sumN=0, sumEven=0, sumOdd=0;	//--누적합을 담을 변수

		// 사용자 메세지 출력문 및 변수 담기
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while (n<=a)
		{
			if(n%2==0)
			{
				sumEven += n;
			}
			else if(n%2!=0)
			{
				sumOdd += n;
			}
			n++;
			sumN += n;
		}
		
		// 결과 출력

		System.out.printf("1 ~ %d 까지 정수의 합 : %d\n", a, sumN);
		System.out.printf("1 ~ %d 까지 홀수의 합 : %d\n", a, sumOdd);
		System.out.printf("1 ~ %d 까지 짝수의 합 : %d\n", a, sumEven);

	}
}

// 처리 결과
/*

임의의 정수 입력 : 50
1 ~ 50 까지 정수의 합 : 1325
1 ~ 50 까지 홀수의 합 : 625
1 ~ 50 까지 짝수의 합 : 650
계속하려면 아무 키나 누르십시오 . . .

*/