/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문 실습
===============================================*/

/*
○ 반복문의 개요

	주어진 조건이 『참』인 경우
	일정한 영역의 문장들을 반복 수행하다가
	조건식이 거짓이 되는 순간이 오면,
	반복 수행을 중단하는 문장이다.
	이러한 반복문에는 『while』, 『do-while』, 『for』문 등이 있으며
	반복문의 제어를 위해 『break』, 『continue』문을
	사용하는 경우가 있다.

○	while 문

	조건식을 먼저 비교하여
	조건식의 처리 결과가 참인 경우, 특정 영역을 반복 수행하는 문장으로
	반복 횟수가 정해져 있지 않은 경우나
	반복 횟수가 비교적 많은 경우 주로 사용한다.

○	while 문의 형식 및 구조

	while(조건식)
	{
		실행문;
	}

*/

public class Test043
{
	public static void main(String[] args) 
	{
		/*
		int n=0;
		while (n<=10)
		{
			System.out.println("n = " + n);
			n++;
		}
		*/

		/*
		int n=0;
		while (n<=10)
		{
			n++;
			System.out.println("n = " + n);		// n++;의 위치만바꿈, '추측하고 결과확인' 반복
		}
		*/

		/*
		int n=1;
		while (n<10)
		{
			n++;
			System.out.println("n = " + n);
		}
		*/
		
		/*
		int n=1;
		while (n++<=10)
		{
			System.out.println("n = " + ++n);	// n이 1,2,3,8,9,10일때 생각해보자
		}
		*/

		// 1부터 100 까지의 합을 계산하여
		// 결과를 출력하는 프로그램을 작성한다.
		// 단, while 반복문을 사용한다.

		// 실행 예)
		// 1부터 100까지의 합 : 5050
		// 계속하려면 아무 키나 누르세요...


		System.out.print("1부터 100까지의 합 : ");

		int n=1, sum=0;

		
		while (n<=100)
		{
			sum+=n;
			n++;
		}
			System.out.printf("%d\n",sum);

	}

}

//※ 문제 인식 및 분석
//	1. 출력구문이 반복문의 영역 밖에 위치해야 한다.
//	2. 1부터 1씩 증가할 변수와 누적합을 담을 변수
//		이렇게 두 개의 변수가 필요하다.

// 1부터 차례로 담아 1씩 증가하는 변수 선언 및 초기화
int n=1;

// 누적합을 계산하며 담아낼 변수 선언 및 초기화(꼭 초기화!)
int sum=0;

// 연산 및 처리(반복문 구성)
while (n<=100)
{
	// sum을 n만큼 증가시켜라
	sum += n;

	// n이 1씩 증가해 나가는 연산 필요
	n++;
}

// 결과 출력(반복문 영역 밖에 위치)
//-- 실행 예에서 최종 결과값이 한 번 출력되기 때문
//	 즉, 연산은 반복하되, 출력은 한번만!
System.out.println("1부터 100까지의 합 : " + sum);

