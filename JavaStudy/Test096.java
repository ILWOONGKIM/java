/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/

// ○과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 구성하는 구문과 출력하는 구문은
// 별도로 작성할 수 있도록 한다.

// 실행 예)
/*								i	j
	A							0	0
	B  C						1	01
	D  E  F						2	012
	G  H  I  J					3	0123
	K  L  M  N  O				4	01234

계속하려면 아무 키나 누르세요..
*/


// A~O : aski 65~79(15개)

// 1. 먼저 A,B,C 문자를 출력(A,	B, C, D, ...O)
// 2. n++ 이므로 대입
// 3. 출력할때 i=0, j=0 계행, i=1, j=0,1일때 계행, i=2, j=0,1,2일때 계행 ...→ j=4, j=0,1,2,3,4일때 계행
//		(즉, 행과 열이 같아질때(i=j) 계행(println))


public class Test096
{
	public static void main(String[] args)
	{
		// 배열 선언 및 메모리 할당

		int[][] arr = new int[5][5];

		int n=65;		// 'A'의 아스키코드값을 int형 n으로 초기화하여 시작


		// for문을 이용하여 배열 구조화

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;

				if (i==j)		// i와 j가 같을때마다 n을 1 증가시킨뒤 j열을 빠져나오도록 설정
				{
					break;
				}

			}
		}

		// 출력 

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", (char)arr[i][j]);	// 자료형 변환으로 아스키코드값을 변환하여 출력
			}
			System.out.println();
		}


	}
}

// 실행 결과
/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/