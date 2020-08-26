/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(for) 실습
	- 다중 for문(반복문의 중첩)을 활용
===============================================*/

// 1부터 100까지의 수 중 소수만 출력하는 프록램을 구현한다.
// 단, for 문의 중첩 구문을 활용하여 작성할 수 있도록 하며
// 5개가 출력될 때 마다 개행 처리할 수 있도록 한다.

// 실행 예)
// ====[1부터 100사이의 소수]====
//  2	3	5	7	11
//	13	17	19	23	29
//			:
// 계속하려면 아무 키나 누르세요...


public class Test059
{
	public static void main(String[] args)
	{			
		int divisor;		//-- 나누는 수를 담아낼 변수
		int count = 0;		//-- 개행을 위해 출력 항목을 카운트할 변수

		System.out.println("====[1부터 100사이의 소수]====");
		for (int number=2; number<=100; divisor++)	// 2,3,4 ...99 100
		{
			for (divisor=2; number%divisor!=0; divisor++);		//--"매우중요!!"-->> for 문 끝에 ;을 붙이고 시행문이 없으면?
																//-->> 두번째가 참이면 divisor++(증가), 거짓이면 다음줄로 넘어가는 점을 이용
			

			// 확인
			// System.out.printf("number: %d, divisor : %d\n", number, divisor);
			
			if (divisor==number)
			{
				System.out.printf("%5d", number);

				if (++count%5==0)
				System.out.println();
			}

			
		}


	}		
			
}


/*(나의 풀이)
		// outer for문은 2 3 5 7 11을 5개씩 출력 후 개행하는 구문담당
		// inner for문은 소수인지 판별하는 반복작업 담당

		
		int count=0;

		System.out.println("====[1부터 100사이의 소수]====");

		for (int i=1; i<=100; i++)
		{
			for (int j=2; j<=i; j++)
			{
				if(i%j==0)
				{
					if (i==j)
					{
						System.out.printf("%4d", i);
						count++;

						if (count%5==0)
						{
							count=0;
							System.out.println();
						}
					}
					
					else if (i!=j)
					{
						break;
					}
				
				}
			}	
			
		}
*/

/*(재확인)

		int j;

		for (j=2; j<=100; j++)
		{
			if (j<=10)
			{
				if (j==2 && j==3 && j==5 && j==7)
				{
					System.out.printf("%4d", j);
				}
			}

			else if (j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0)
				{
					System.out.printf("%4d", j);
				}

				
		}
*/
		


/*
			System.out.printf("%4d", n);	//-- %4d는 4칸떼고 그곳을 기준으로 오른쪽정렬
			if(n%(4*5)==0)					//-- n이 4*5의 배수가 될 때 → 20의 배수
				System.out.println();

*/