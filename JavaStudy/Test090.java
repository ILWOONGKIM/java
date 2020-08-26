/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 구성하는 구문과 출력하는 구문은
// 별도로 작성할 수 있도록 한다.

// 실행 예)
/*					구성된 숫자				공통된 특징
  1  2  3  4  5		→ 1 2 3 4 5		→i=0 j=0 → 1 출발
  5  1  2  3  4 	→ 1 2 3 4 5		→i=1 j=1 → 1 출발 
  4  5  1  2  3 	→ 1 2 3 4 5		→i=2 j=2 → 1 출발 
  3  4  5  1  2 	→ 1 2 3 4 5		→i=3 j=3 → 1 출발 
  2  3  4  5  1 	→ 1 2 3 4 5		→i=4 j=4 → 1 출발 
  계속하려면 아무키나 누르세요...
*/


public class Test090
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			for (int j=i, n=1; n<=5; n++)
			{				   // ij	n		ij	  n		ij	  n
				arr[i][j] = n; // 00 → 1		11 → 1		22 → 1 
							   // 01 → 2		12 → 2		23 → 2		...
				j++;		   // 02 → 3		13 → 3		24 → 3
							   // 03 → 4		14 → 4		20 → 4
							   // 04 → 5		15 → 1		21 → 5
											//※5가없으므로 0으로 바꿔주는 조건문 작성
				if(j==5)
					j=0;
			}
		}
			/* 어떻게 출력될지 미리 예상하기
			
				00 01 02 03 04			 1  2  3  4  5
				00 01 02 03 04			 5  1  2  3  4  
				00 01 02 03 04    →	 4  5  1  2  3   
				00 01 02 03 04			 3  4  5  1  2
				00 01 02 03 04			 2  3  4  5  1  
			*/
	
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();


		}
	}
}

// 실행 결과
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/


/*

public class Test090
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			n--;

			for (int j=0; j<arr[i].length; j++)
			{
				
				if (i==j)
				{
					n=1;
					
				}
				
				arr[i][j] = n;
				n++;				
			}
			
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);

			}
			System.out.println();
		}


	}
}

*/