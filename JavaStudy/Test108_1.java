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

public class Test108_1
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


		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
	
		// 1-1. 먼저 해당 년월의 1일이 어느 요일에 시작되는지
		// 1-2. 2월이면 28일인지 아닌지
		// 1-3. 평달이면 30일인지 31일인지
		// 2. 나온 요일수와 일자를 calendar 배열에 담음
		// 3. 출력

		int yearDay, totDay;
		int monDay=0;
		// 1-1. 해당 년월 1일의 요일을 먼저 알기 위해 총 날 수 계산
		// 1-1-1. 전년도 12월 31일까지 계산
		yearDay = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;

		
		// 1-1-2. 해당 월에 따라 전월 마지막날까지 계산
		
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		

			if (year%4==0 && year%100!=0  || year%400==0)		// 윤년
			{
				// 2월의 마지막 날짜를 29일로 설정
				months[1] = 29;
			}
		
			else												// 평년
			{
				// 2월의 마지막 날짜를 29일로 설정
				months[1] = 28;

			}


			for (int i=0; i<mon-1; i++)
			{
				monDay += months[i];
			}



		// 1-1-3. 나머지 일수 계산(+1일)
		
		// 1-1-4. 총 날 수
		totDay = yearDay + monDay + 1;

		
		// 1-1-5. 해당 날 수 %7==1의 요일찾기

		int w = totDay % 7;
		System.out.println(" " + totDay);
		System.out.println(" " + w);
		
	//	String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

	//	w값이 "" 나오면 -> ""번째 weeknames의 배열


		// 0 → 일 ...

	}
}

	

//
	
