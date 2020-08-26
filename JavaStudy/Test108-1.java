/*================================
	■■■ 만년달력 ■■■
=================================*/

// 실행 예)
// 『연도』를 입력하세요 : 2021
// 『월』을 입력하세요	 : 1

/*
	[ 2021년 1월 ]

 일  월  화  수  목  금  토
============================
					  1	  2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30 
 31
============================
계속하려면 아무 키나 누르세요...

*/
		// 1-1. 먼저 해당 년월의 1일이 어느 요일에 시작되는지
		// 1-2. 2월이면 28일인지 아닌지
		// 1-3. 평달이면 30일인지 31일인지
		// 2. 나온 요일수와 일자를 calendar 배열에 담음
		// 3. 출력


import java.util.Scanner;

public class Test108-1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int year, mon;

		System.out.print("『연도』를 입력하세요 : ");
		year = sc.nextInt();
		
		System.out.print("『월』을 입력하세요 : ");
		mon = sc.nextInt();

		System.out.println("\n\n");
		System.out.printf("	[ %4d년 %2d월 ]  \n", year, mon);

	}
		// 
	public String[] week = {"일", "월", "화", "수", "목", "금", "토"};
	{
		// 1-1. 먼저 해당 년월의 1일이 어느 요일에 시작되는지
		// 1-2. 2월이면 28일인지 아닌지
		// 1-3. 평달이면 30일인지 31일인지
		// 2. 나온 요일수와 일자를 calendar 배열에 담음
		// 3. 출력


		// 1-1. 해당 년월 1일의 요일을 먼저 알기 위해 총 날 수 계산
		// 1-1-1. 전년도 12월 31일까지 계산
		int yearDay = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		// 1-1-2. 해당 월에 따라 전월 마지막날까지 계산
		int m0=0;		// 28일
		int m1=0;		// 29일
		int m2=0;		// 31일
		int m3=0;		// 30일
		int count0=0;
		int count1=0;
		int count2=0;
		int count3=0;

		for (int i=1; i<mon; i++)
		{
			m0=mon;
			m1=mon;
			m2=mon;
			m3=mon;

			if (m==2 && year%4==0 && year%100!=0 || year%400==0)		// 2월, 29일인경우
			{
				m0 = 29;
				count0++;
			}
			else if (m==2)			// 2월, 28일인 경우
			{
				m1 = 28;
				count1++;
			}

			else if ( (m!=2 && m<=7 && m%2!=0) || (m!=2 && m>8 && m%2==0) )		// 평월, 31일인 경우
			{
				m2 = 31;
				count2++;
			}
			else if (m!=2)
			{
				m3 = 30; 			// 평월, 30일인 경우
				count3++;
			}


		}
		monDay = (m0 * count0) + (m1 * count1) + (m2 * count2) + (m3 * count3);

		// 1-1-3. 나머지 일수 계산(+1일)
		
		// 1-1-4. 총 날 수
		int totDay = yearDay + monDay + 1;
		
		// 1-1-5. 해당 날 수 %7==1의 요일찾기

		int w = totDay % 7;
		System.out.println(" " + w);
		
		return week[w];
	}

	

//
	
}