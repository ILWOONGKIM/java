/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/

// ○과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 구성하는 구문과 출력하는 구문은
// 별도로 작성할 수 있도록 한다.

// 실행 예)
/*					i=0,1,2,3..,j=4
	1	 2	 3	 4	 10
	5	 6	 7	 8	 26
	9	10	11	12	 42
   13	14	15	16	 58
   28	32	36	40	136
i=0,j=0,1,2,3

계속하려면 아무 키나 누르세요..
*/

// 1. i가 출발할때 n=i+4로 초기화
// 2. j는 arr[i][j] = n;, n++; 인데 
// 2-1. if(j==4) → sum = arr[0][4] + arr[1][4] + ... + arr[3(=i-1)][4]
// 2-2. if(i==4) → sum = arr[0][4] + arr[1][4] + ... + arr[3(=j-1)][4]

// (그다음 다음 i에서 n 값 n=i+4로 초기화
// 3. 출력


public class Test095
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당

		int[][] arr = new int[5][5];

		int n=0;

		for (int i=0; i<4; i++)		// 5x5 만들고 ij 둘다 4까지만
		{
			for (int j=0; j<4; j++)
			{
				n++;
				arr[i][j] = n;

				arr[i][4] += arr[i][j];	// 00 → 1 01 → 2 02  → 3 ...

			/*
			   1   2   3   4  10
			   5   6   7   8  26
			   9  10  11  12  42
			  13  14  15  16  58
			   0   0   0   0   0
			*/

				arr[4][j] += arr[i][j];

			/*
			   1   2   3   4  10
			   5   6   7   8  26
			   9  10  11  12  42
			  13  14  15  16  58
			  28  32  36  40   0
			
			*/
			
				arr[4][4] += arr[i][j];

			}
				
		}

		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			

			}
			System.out.println();
		}
	}
}


/*
public class Test095
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당

		int[][] arr = new int[5][5];

		int n=1;
		int sum=0;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;

				if (j==4)
				{
					for (int k=0; k<4; k++)
					{
						sum =n;
						n += arr[k][4];
					}
				}
				
			}
			

		}

	
		
		// 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			

			}
			System.out.println();
		}
	}
} 

*/