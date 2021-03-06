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
   ***
  *****
 *******
*********
 *******
  *****
   ***
	*

*/

public class Test065
{
	public static void main(String[] args)
	{
		for (int i=0; i<5; i++)		// 5번째 줄 기준 위쪽에있는 삼각형 라인을 출력하는 반복문
		{
			for(int j=i; j<5; j++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<i ; j++)
			{
				System.out.print("*");
			}
			for (int j=0; j<(i-1) ; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i=0; i<5; i++)		// 5번째 줄을 포함하여 아래쪽에있는 역삼각형 라인을 출력하는 반복문
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for (int j=i; j<5 ; j++)
			{
				System.out.print("*");
			}
			for (int j=(i+1); j<5 ; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
// 실행 결과
/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/