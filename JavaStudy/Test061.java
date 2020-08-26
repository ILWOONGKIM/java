/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(for) 실습
	- 다중 for문(반복문의 중첩)을 활용
===============================================*/

// ○과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*

	*
   **
  ***
 ****
*****
i 1				2				3 4 5		공백	(i<j)
j 5 4 3 2 1		5 4 3 2 1		5...		*
 "" "" "" "" * """"""**
*/

public class Test061
{
	public static void main(String[] args)
	{

		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>0; j--)
			{
				if (i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}


	}
} 












		/*
		for (int i=1; i<=5; i++)	// 줄 5개 생성
		{
			for (int j=5; j>0; j--)	// 5부터 줄어들면서 반복수행
			{
				if (i<j)
				System.out.print(" ");

				else
				System.out.print("*");
			}
			System.out.println();
		}
		*/

// 실행결과
/*
    *
   **
  ***
 ****
*****
계속하려면 아무 키나 누르십시오 . . .
*/