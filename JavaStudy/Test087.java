/*====================
 ■■■ 배열 ■■■
 - 배열의 배열(2차원 배열)
=====================*/




public class Test087
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언과 생성, 초기화

		// 방법 ①
		//int[] arr1 = new int[3];
		int[][] arr1 = new int[3][3];

		//arr1[0] = 1;		1차원일때 초기화방법
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		arr1[2][0] = 7;
		arr1[2][1] = 8;
		arr1[2][2] = 9;
							// 2차원일때 초기화

		
		// 방법 ②
		// int[] arr2 = {1, 2, 3};							// 1차원일때
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// 방법 ③
		int[][] arr3 = new int[3][3];
		int n=1;

		for (int i=0; i<arr3.length; i++)		// 첫번째 반복문 ->  0   1   2
		{
			for (int j=0; j<arr3[i].length; j++)	// 두번째 반복문 -> 012 012 012
			{
				// 테스트
				// System.out.rpitnln("i:" + i + ", j:" +j);
				arr3[i][j] = n;	// 00=1 01=2 02=3 ... 12=6 ...
				n++;
			}
		}
		
		// 배열의 배열 요소 전체 출력
		for (int i=0; i<arr3.length; i++)
		{
			for (int j=0; j<arr3[i].length; j++)
			{
				System.out.printf("%2d", arr3[i][j]);
			}
			System.out.println();
		}
		System.out.println();




	}
}