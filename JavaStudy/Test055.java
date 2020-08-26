/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(do-while) 실습
===============================================*/

//사용자로부터 여러 개의 정수를 입력받아
// 그 합을 계산하여 결과를 출력하는 프로그램을 구현한다.
// 단, 사용자가 『-1』을 입력하게 되면
// 입력받던 행위를 중단하고 그 돈안 입력해둔 정수들의 합을
// 연산하여 출력할 수 있도록 처리한다.
// 입력받는 과정은 Scanner 인스턴스를 생성하여 처리할 수 있도록 한다.

// 실행 예)
// 1번째 정수 입력[-1 종료] : 100
// 2번째 정수 입력[-1 종료] : 20
// 3번째 정수 입력[-1 종료] : 10
// 4번째 정수 입력[-1 종료] : 5
// 5번째 정수 입력[-1 종료] : -1

// >> 현재까지 입력된 정수의 합 : 135
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{

		java.util.Scanner sc = new Scanner(System.in);
		
		int num;		//--외부로부터의 사용자 입력값을 담아낼 변수
		int sum=0;		//--누적합을 담아낼 변수
		int n=1;		//--루프 변수로 활용하며, 몇 번째 입력값인지에 대한 값을 담아낼 변수

		
		do
		{
			System.out.printf("%d번째 정수 입력[-1 종료] : ", n);
			num = sc.nextInt();
			sum += num;

			n++;
		}
		while (num!=-1);		// num이 -1이 아닐때까지 반복, 즉 n이 -1이면 반복끝
		

		// 결과 출력
		System.out.printf(">> 현재까지 입력된 정수의 합 : %d\n", (sum+1));

// 실행결과
/*
1번째 정수 입력[-1 종료] : 10
2번째 정수 입력[-1 종료] : 10
3번째 정수 입력[-1 종료] : -1
>> 현재까지 입력된 정수의 합 : 20
계속하려면 아무 키나 누르십시오 . . .
*/

/* 나의 풀이

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a=1,n,sum=0;
		
		do
		{
			System.out.printf("%d번째 정수 입력[-1 종료] : ", a);
			n = sc.nextInt();

			a++;
			sum+=n;

		}
		while (n!=-1);
		
		if (n==-1)
			{
				sum++;	
			}

		System.out.printf(">> 현재까지 입력된 정수의 합 : %d\n", sum);
*/
	}

}

/*

		do
		{
			System.out.print("100 이상의 정수를 입력하세요 : ");
			num = sc.nextInt();
		}
		while (num<100);

		System.out.println(num + " → 100 이상의 정수 입력 완료");

*/
// 1. scanner 인스턴스, 2. 변수 선언, 3. 