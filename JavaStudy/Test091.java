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
  1  6  11  16  21	→ n n+5 +5 ...		→i=0 j=0 → 1 출발
  2  7  12  17  22  → n+1 n+5 +5 ...	→i=1 j=1 → 2 출발 
  3  8  13  18  23	→ (n+1)+1 n+5 +5 ...→i=2 j=2 → 3 출발 
  4  9  14  19  24	→ 					→i=3 j=3 → 4 출발 
  5 10  15  20  25	→ 					→i=4 j=4 → 5 출발 
  계속하려면 아무키나 누르세요...
*/
// i j
// 0 0  =  1
// 0 1  =  6
// :
// 1 0  =  2
// 1 1  =  7


// j문은 n이 +5만큼 증가
// i문은 j가 0일때 n이 i+1로 초기화 되고, +1만큼 증가
// n과 i,j와의 관계식 j++ -> n += 5
//					 if (j==0) i++ -> n += i+1

public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[j][i] = n++;		// ji		ji			ji	
										// 00 → 1	00 → 6		02 → 11
										// 10 → 2	00 → 7		12 → 12
										// 20 → 3	00 → 8		22 → 13
										// 30 → 4	00 → 9		32 → 14
										// 40 → 5	00 → 10	42 → 15 
			
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
}

/*
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];

		int n=1;

		for (int i=0; i<arr.length; i++)
		{
			n = i+1;

			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;

				if (j==0)
				{
					n=i+1;
				}			
				n += 5;		
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