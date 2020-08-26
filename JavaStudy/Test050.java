/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(while) 실습
===============================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 100
// 100 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...


// ※ 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도
//			나누어 떨어지지 않는 수.
//			단, 1은 소수가 아니다.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int num;		//-- 사용자 입력값을 담아둘 변수


		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n=2;		//-- 입력값을 대상으로 나눗셈 연산을 수행할 변수
						//	 (1씩 증가)		27 → 2 3 4 5 6 ... 26

		boolean flag = true;
		//String flag = "소수다";
		
		while(n<num)	// num=7 → n=2~6 / num=50 → n=2~49
						// num=1 → while 반복문 수행안하므로, 처음 flag에 대입한 "소수다" 출력
		{
			if (num%n==0)
			{
				flag = false;	// 이미 소수가 아니므로 break 사용
				break;		// 가장 가까운 '반복문'을 빠져나감, while 밖으로 나감
			}

			n++;
		}

		// 결과 출력
		//-- 출력 전에 수행해야 할 추가 확인
		//	→ 입력값이 1인지 아닌지에 대한 추가 검토
		
		if (flag && num!=1)
			System.out.printf("%d → 소수\n", num);
		else
			System.out.printf("%d → 소수가 아니다\n", num);





/*

		// 변수 선언
		int n, m=1, count=0;
		
		// 사용자 메세지
		System.out.print("임의의 정수 입력 : ");
		
		// 변수 담기
		n = Integer.parseInt(br.readLine()); 

		// 조건문

		while (m<=n)
		{
			if (n%m==0)
			{
				count++;		// 입력받은 n의 값과 m의 값을 나누었을때 나머지가 0인 수의 개수가 1과 자기자신으로 2개가 나와야함
			}
			m++;
		}
		
		if (count==2)
		{
		System.out.printf("%d → 소수\n", n);
		}
		else if(count!=2)
		{
		System.out.printf("%d → 소수 아님\n", n);
		}

*/
	}
}

// 코딩 전 생각
// 1. 사용자 메세지 출력과 '숫자열'을 숫자로 입력받아야하므로 BufferedReader의 Integer.parseInt(readLine())로 변수를 담는다.
// 2. 담은 변수를 조건문을 사용하여 연산 한다.
// 2-1. 조건문 while로 자기자신까지 나누는 반복연산 + if문으로 나누어질떄와 안나누어 질때를 구분한다.
// 3. 출력한다.