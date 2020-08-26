/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가... 짝수인지, 홀수인지, 영인지
// 결과를 판별하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 4
// 4 → 짝수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 13
// 4 → 홀수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int nNum;

		// 사용자 메세지
		System.out.print("임의의 정수 입력 : ");

		// 변수 받기
		nNum = Integer.parseInt(br.readLine());

/*
		// 조건문의 구성'순서' 중요(영 조건문이 짝수보다 나와야함)

		if (nNum == 0)
		{
			System.out.printf("%d → 영 \n", nNum);
		}
		
		else if (nNum %2 != 0)
		{
			System.out.printf("%d → 홀수\n", nNum);
			
		}
		else if (nNum%2 ==0)
		{
			System.out.printf("%d → 짝수\n", nNum);
		}
*/

		String result;

		if (nNum ==0)
		{
			result = "영";
		}
		else if (nNum%2==0)
		{
			result = "짝수";	
		}
		else if (nNum%2!=0)
		{
			result = "홀수";
		}
		else
		{
			result = "판별 불가";
		}

		System.out.println(nNum + " → " + result);

// ※ 조건문을 구성할 때에는 항상 조건의 구성 순서에 유의해야 한다.

// ※ 조건문의 구성 과정에서 임의의 영역(else)을
//	  업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
//	  불가능한 경우는 어쩔 수 없더라도
//	  가급적이면 업무에 포함되지 않은 내용을
//	  이외의 영역(else)에서 처리할 수 있도록 한다.

//	예) if 양수 else if 음수 else 판별불가(변수2개중 조건문2개, 나머지1개 이런식으로)

/*
		String result = "판별 불가";

		if (nNum ==0)
		{
			result = "영";
		}
		else if (nNum%2==0)
		{
			result = "짝수";	
		}
		else if (nNum%2!=0)
		{
			result = "홀수";
		}

		System.out.println(nNum + " → " + result);
*/

		/*
		// 조건문

		if (nNum == 0)
		{
			System.out.printf("%d → 영\n", nNum);
		}
		
		else if (nNum %2 == 1)
		{
			System.out.printf("%d → 홀수\n", nNum);
			
		}
		else
		{
			System.out.printf("%d → 짝수\n", nNum);
		}
		*/


	}
}