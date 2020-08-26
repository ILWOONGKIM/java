/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(while) 실습
===============================================*/

// 실행 예)
// 1부터 100까지 정수의 합 : xxxx
// 1부터 100까지 짝수의 합 : xxxx
// 1부터 100까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...


public class Test046
{
	public static void main(String[] args)
	{

		// 주요 변수 선언
		int n=1, sum, even, odd;
		sum=even=odd=0;

		while (n<=100)
		{
			sum+=n;

			if(n%2==0)
			{
				even+=n;
			}
			else if(n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return;
			}
			n++;
		}

		// 결과 출력

		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);


		/*

		int n=1;
		int sumN=0, sumEven=0, sumOdd=0;

		while (n<=100)
		{
			if (n%2==0)
			{
				sumEven += n;
			}
			else if (n%2!=0)
			{
				sumOdd += n;
			}
			
			sumN += n;
			n++;
		}

		System.out.println("1부터 100까지 정수의 합 : " + sumN);
		System.out.println("1부터 100까지 짝수의 합 : " + sumEven);
		System.out.println("1부터 100까지 홀수의 합 : " + sumOdd);

		*/


	}
}