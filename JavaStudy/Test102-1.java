/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 설계
	- 배열 활용
	- 정보은닉과 접근제어 지시자
======================================*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스의 설계를 통해
// Test102 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력[공백 구분] : 2020 8 19

// 2020년 8월 19일 → 수요일
// 계속하려면 아무 키나 누르세요...

// ※ 1년 1월 1일 → 월요일
// ※ 윤년 vs 평년, 윤달 vs 평달, 
// ※ 1년 1월 1일 -> 2020 8 19 까지의 총 날짜수 / 7 


// 1. 요일을 출력받아야하므로 private int day - 인스턴스  -> 출력할때 7로나눈 값에따라 요일 출력;
// 메소드 ㄱ. input 
//		Scanner sc = new Scanner
//	    sc.nextInt = day
//		  ㄴ. 1월 1일부터 입력받은 날짜까지의 총 날짜수 계산
//			for 문 이용, 윤년 및 윤달 고려
//		  
//		  ㄷ. 총 날짜수 / 7에서 나머지에 따라 요일에 따른 변수 담기
//		  ㄹ. 배열선언 후 요일변수를 배열에 담기?
//		  ㅁ. 출력시 public class 에서 담아둔 요일변수에 따른 요일 출력
//		



//  값을 입력 받고

//	ex ) 2020 08 19 -> ----년 ----월 ----일  이렇게 저장되고 표시될 수 있게 변수 세개를 설정하고 담음

//			(?년이 윤년인지 판단)				  (?월이 윤달인지 판단) 
//	-> {(맞다면 366, 아니라면 365) x (?-1-1)년 + ?월 ?일까지의 요일계산}-> 입력한 연도수의 '전년도' 12월 31일까지 더하기 위함
//		--------------------------------------	 ------------------------ = ?월이 (30? 31?) -> 30 or 31 x ?일
//					ⓛ									②

//  총 일수가 나오면 7로 나누고 나머지에따라 요일 출력

import java.util.Scanner;

class WeekDay
{
	// 멤버 변수
	private int year;
	private int mon;
	private int day;

	int yearDay=0;
	int monDay=0;
	int dayDay=0;
	int totday;

	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력[공백 구분] : ");
		
		year = sc.nextInt();
		mon = sc.nextInt();
		day = sc.nextInt();
	}

	int calYear()
	{
		// 입력받은 연도 전년도의 12월 31일까지의 계산
		// 1년 1월 1일 부터 4년 7월 1일
		// 3년 12월 31일(2x365) + 4년 1월 1일부터 4년 7월 1일
		// 3(year(4)-1) x 365 + xx

		int y = 1;
		int n = 1;
		int countY=0;
		int countN=0;

		for (int i=1; i<year; i++)		// year-1번까지 반복
		{
			year = y;
			year = n;
			
			if (i%4==0 && i%100!=0 && i%400==0)		// 윤년, 366
			{
				y=366;
				countY++;
			}

			else		// 평년, 365
			{
				n=365;
				countN++;
			}

		}

		yearDay = (y * countY) + (n * countN);
		return yearDay;
	}

	int calMon()
	{
		// 달의 일 수 계산


		// 2월인경우	...1
		// 2 -> 연도year가 4의배수,400의배수,100의배수가 아니면 29일, /  그렇지 않으면 28일

		// 2월이 아닌경우
		// 1,3,5,7,8,10,12 -> 입력받은 달인 mon 이 7이하이고 홀수이거나, / 8이상이고 짝수이면 31
		// 그외 2(else if로 제외) 4 6 9 11 -> 30일

		// 1+2 = return
		
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
		return monDay;
	}

	// 일 수 계산

	int calDay()
	{
		dayDay = day;
		return dayDay;
	}
	
	int calTotDay()
	{
		totday = yearDay + monDay + dayDay
		return totday;
	}


	// 총 날짜 수를 7로 나눈뒤 나머지에 따라서 배열로 정렬
	void arrayDay(int[])
	{
		String[] arr = new String[7];

		for (int i=0; i<arr.length; i++)
		{
			if (totday%7==0)
				arr[0] = "일요일";
			else if (totday%7==1)
				arr[1] = "월요일";
			else if (totday%7==2)
				arr[2] = "화요일";
			else if (totday%7==3)
				arr[3] = "수요일";
			else if (totday%7==4)
				arr[4] = "목요일";
			else if (totday%7==5)
				arr[5] = "금요일";
			else if (totday%7==6)
				arr[6] = "토요일";

		}
	}


	// 출력
	void print(int a)
	{
		System.out.printf("%d년 %d월 %d일 → ", year, mon, day);
		System.out.printf("%s", arr[i]);

	}
}

// 2020년 8월 19일 → 수요일
// 계속하려면 아무 키나 누르세요...



public class Test102
{
	public static void main(String[] args)
	{
		WeekDay wd = new Weekday();
		
		wd.input();

	}
}