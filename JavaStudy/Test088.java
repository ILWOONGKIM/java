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
  1  2  3  4  5 
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 계속하려면 아무키나 누르세요...

*/

public class Test088
{
	public static void main(String[] args)
	{
		// 배열의 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		// 변수 선언 및 초기화
		int n=1;
		// 1부터 1씩 증가하여 25까지 만들어낼 변수
		// ( 1 2 3 4 5 6 7 .. 25)

		// 배열의 배열을 반복문의 중첩 구문을 활용하여 구조화

		for (int i=0; i<arr.length; i++)		// outer for(i)		:	 0			1		  2		  3		   4		  5
		{	
			for (int j=0; j<arr[i].length; j++) // inner for(j)	 :	 1 2 3 4 5  6 7 8 9 10 ...
			{
				arr[i][j] = n;					// arr[0][0] = 1(n);, [0][1] = 2 ...[4][4] = 25
				n++;
			}
		}

		// 여기까지 수행하면 배열의 각 방에 값 채우기 완료
		
		// 전체 요소 출력
		for (int i=0; i<arr.length ; i++)
		{
			for (int j=0; j<arr[i].length; j++)		// 012345 까지가 arr[i].length의 길이이므로 그만큼 출력하고, 5에서 끝날떄마다 외부에서 계행해주면 맞다
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

/*
public class Test088
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		
		int n=1;
		
		for (int i=0; i<arr.length; i++)		// outer for(i)		:	 0			1		  2		  3		   4		  5
		{	
			for (int j=0; j<arr[i].length; j++) // inner for(j)	 :	 1 2 3 4 5  6 7 8 9 10 ...
			{
				arr[i][j] = n;					// arr[0][0] = 1(n);, [0][1] = 2 ...[5][5] = 25
				n++;
			}
		}

		// 5의 배수만큼 계행하여 출력

		for (int i=0; i<arr[i].length ; i++)
		{
			if (n%5==0)
			{	
				System.out.println();
			}

		}


	}
}
*/