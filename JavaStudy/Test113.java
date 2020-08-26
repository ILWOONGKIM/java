/*==================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
  - 향상된 버블 정렬(Bubble Sort)
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


/*

※ 앞에서 확인해 본 Selection Sort(Test110)나 Bubble Sort(Test111)의 성능은 같다
	(→ 반복의 횟수로 추정)
	하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라
	일반 Bubble Sort 나 Selection Sort 보다 성능이 좋게 나타날 수 있다.

원본 데이터 : 61 15 20 22 30
			  15 20 22 30 61	-	1회전 (스왑 발생 → true)	→	다음 회전 진행 ○
			  15 20 22 30 61	-	2회전 (스왑 발생 → false)	→	다음 회전 진행 Ⅹ

==>> 1회전 수행...2회전 수행.. 을 해보았더니..
	 2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
	 불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
	 수행하지 않는다.

*/

// 실행 예)
// Source Data : 10 50 22 31 43
// Sorted Data : 10 22 31 43 50
// 계속하려면 아무키나 누르세요..


public class Test113
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 22, 31, 43};
		/*
		10 50 20 31 43
		== --
		10 22 50 31 43
		   == --
		10 22 31 50 43
			  == --
		10 22 31 43 50
			     == --
		--------------- 1회전 → 스왑 발생
		10 22 31 43 50
		== --
		10 22 31 43 50
		   == --
		10 22 31 43 50
			  == --
				:
			스왑 Ⅹ
		--------------- 2회전 → 스왑 발생 Ⅹ
						  :
						4회전 → Ⅹ
		*/
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		boolean flag;
		int pass = 0;

		// 향상된 Bubble Sort 구현

		do
		{

			// 테스트(확인)
			//System.out.println("반복문 수행");
			//-- 2회전 확인

			flag = false;		//-- 자리바꿈이 발생할 경우 true로 설정
			pass++;

			for (int i=0; i<a.length-pass; i++)	// 0 1 2 3	/ 0 1 2 / 0 1 / 0 
			{
				//System.out.println("쑝");	→	4번
				
				if (a[i] > a[i+1])		//	01 12 23 34 
				{						//  01 12 23 
					// 자리바꾸기		//  01 12
					a[i]=a[i]^a[i+1];	//  01
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];
					
					flag = true;
					//-- 단 한번이라도 스왑이 발생하면,
					//	 flag 변수를 true로 변경하여
					//	 다음 회전을 추가로 진행할 수 있도록 처리
				}
			}
		}
		while (flag);
		//-- flag 변수가 false 라는 것은
		//	 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우
		//	 더 이상의 반복문 수행은 무의미한 것으로 판단 가능


/*
		int i, j;
		int count=0;


		for (i=1; i<a.length-1; i++)		// 0123
		{			
			for (j=0; j<a.length-i; j++)		// 
			{ 
				a[j] = a[j]^a[j+1];
				a[j+1] = a[j+1]^a[j];
				a[j] = a[j]^a[j+1];
				count++;
			}

			if (count>0)
			{
				break;
			}
		}
*/



		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();


	}
}