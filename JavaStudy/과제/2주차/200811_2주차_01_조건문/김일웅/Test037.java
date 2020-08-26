/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// ○ 과제
// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner 를 활용하여 공백으로 구분된 데이터를
// 한 번에 입력받아 처리할 수 있도록 한다.

// 실행 예)
// 정수 5개(공백구분)를 입력하세요 : 12 3 4 5 6

// >> 짝수의 합은 22이고, 홀수의 합은 8 입니다.
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;


public class Test037
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 변수 생성
		int a, b, c, d, e;			//--정수 5개
		int addOdds=0, addEvens=0;	//--홀수의 합, 짝수의 합을 담을 변수 생성 및 초기화

		// 사용자가 안내받을 메세지

		System.out.print("정수 5개(공백구분)를 입력하세요 : ");

		// 변수에 담기
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		// 조건문 작성

		if (a%2==0)	addEvens+=a;
		else addOdds+=a;
		if (b%2==0)	addEvens+=b;
		else addOdds+=b;
		if (c%2==0)	addEvens+=c;
		else addOdds+=c;
		if (d%2==0)	addEvens+=d;
		else addOdds+=d;
		if (e%2==0)	addEvens+=e;
		else addOdds+=e;
		

		// 결과 출력

		System.out.println();
		System.out.printf(">> 짝수의 합은 %d이고, 홀수의 합은 %d 입니다.\n", addEvens, addOdds);


	}
}

//실행 결과
/*
정수 5개(공백구분)를 입력하세요 : 2 4 7 8 0

>> 짝수의 합은 14이고, 홀수의 합은 7 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/