/*==================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 선택 정렬(Selection Sort)
===================================*/


/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
		→ 보기 좋게... 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬...

*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...


public class Test110
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		/*
		int i,j;
		System.out.print("Source Data : ");

		for (i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/

		/*
		for (요소의 데이터 타입 변수명 : 자료구조(배열 등))
		{
			변수명.....
		}
		*/
		
		int i, j;

		for (int n : a)		// a에 있는것 하나씩 순차적으로
			System.out.print(n + " ");
		System.out.println();
		//--==>> 52 42 12 62 60
		
		// Selection Sort 구현
		for (i=0; i<a.length-1; i++)		// 비교 기준 데이터(0		1		2		3	까지만)
		{									//					|		|		|		|
			for (j=i+1; j<a.length; j++)	// 비교 대상 데이터(1234	234		34		4)
			{
				/*
				if(비교기준이 비교대상보다 크다면)
				{
					자리바꿔라
				}
				*/
				
				//a[i] < a[j]		// 내림차순 정렬
				if(a[i] > a[j])		// 오름차순 정렬
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}


		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Sorted Data : 52 42 12 62 60




	}
}



/*
public class Test110
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		/*

		52 42 12 62 60
		== --

		42 52 12 62 60
		==    --

		12 52 42 62 60
		==       --

		12 52 42 62 60
		==          --
		----------------------------------- 1회전
		12 52 42 62 60
		   == --

		12 42 52 62 60
		   ==    --

		12 42 52 62 60
		   ==		--
		----------------------------------- 2회전

		12 42 52 62 60
		      == --

		12 42 52 62 60
		      ==	--
		----------------------------------- 3회전
		
		12 42 52 62 60
		      	 == --
		----------------------------------- 4회전

		12 42 52 60 62

		*/
		/*
		int n;

		for (int i=0; i<a.length; i++)
		{
			 n = a[i];

	//		for (int j=0; j<a[i].length; j++)
	//		{
				if (a[0]<=n)
				{
					a[i] = a[0]^a[i];
					a[0] = a[i]^a[0];
					a[i] = a[0]^a[i];
				}

				if (a[1]<=n)
				{
					a[i] = a[1]^a[i];
					a[1] = a[i]^a[1];
					a[i] = a[1]^a[i];
				}
				if (a[2]<=n)
				{
					a[i] = a[2]^a[i];
					a[2] = a[i]^a[2];
					a[i] = a[2]^a[i];
				}
				if (a[3]<=n)
				{
					a[i] = a[3]^a[i];
					a[3] = a[i]^a[3];
					a[i] = a[3]^a[i];
				}
				if (a[4]<=n)
				{
					a[i] = a[4]^a[i];
					a[4] = a[i]^a[4];
					a[i] = a[4]^a[i];
				}
			
			System.out.print(a[i] + " ");
		

		}
			System.out.println();
	
	}
}
*/