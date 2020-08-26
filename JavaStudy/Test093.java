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
/*
  1  8  9 16 17   
  2  7 10 15 18
  3  6 11 14 19  
  4  5 12 13 20  
*/

// 1. i와 j 바꿈
// 2. 바꾼상태로 i랑 j 짝수일때 홀수일때 나눠서

public class Test093
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];
		
		int n=0;
		
		for (int i=0; i<5; i++)		// i → 0 1 2 3 4 (arr.length=4에서 5로변경)
		{
			for (int j=0; j<4; j++) // j → 0 1 2 3
			{
				n++;		// n이 0으로 초기화 되어서 1증가시켜줌
				//arr[j][i] = n;
				// 먼저 출력해보고, 조건문 사용
				if (i%2==0)
					arr[j][i] = n;
				else
					arr[3-j][i] = n;	// 전 테스트에서는 가로로가다가 내려가서 뺀만큼 역순으로 갔으니
										// 여기선 j가 있는 앞에부터빼준다
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

/*

public class Test093
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		
		int n=1;
 
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<4; j++)
			{
				if (i%2==0)
					arr[j][i] = n++;
				else
					arr[3-j][i] = n++;
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