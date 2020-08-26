/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 14
// 연산자 입력[+ - * /] : 

// >> 10 + 14 = 24
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String[] args) throws IOException
	{
/*
		// 방법 ①

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;		//-- 첫 번째, 두 번째 정수
		char op;		//-- 연산자
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		// Integer.parseInt()		→	입력된 문자열이 숫자형이어야한다.
		// "1234"	→	Integer.parseInt("1234");	→ 1234
		// "abcd"	→	Integer.parseInt("abcd");	→ (Ⅹ)
		
		System.out.print("연산자 입력[+ - * /] : ");
		// op = Integer.parseInt(br.readLine());	→ (Ⅹ)
		// op = br.readLine();						→ (Ⅹ)
		op = (char)System.in.read();

		// System.in.read() 연산자 출력 테스트
		//System.out.println("op : " + op);


		
		if (op=='+')
		{
			System.out.printf("\n>> %d + %d = %d\n" , a, b, (a+b));
		}
		else if(op=='-')
		{
			System.out.printf("\n>> %d - %d = %d\n" , a, b, (a-b));
		}
		else if(op=='*')
		{
			System.out.printf("\n>> %d * %d = %d\n" , a, b, (a*b));
		}
		else if(op=='/')
		{
			System.out.printf(">>\n %d / %d = %.2f\n" , a, b, (a/(double)b));		// a/b에서 둘 중 하나 double
		
		}
		else
		{
			System.out.printf(">>\n 입력 과정에 오류가 존재합니다.\n");
		}
*/

/*
		// 방법 ② , 연산자도 정수형으로 처리

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, op;		//-- 첫 번째, 두 번째 정수, 연산자
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		// op = Integer.parseInt(br.readLine());
		op = System.in.read();

		if (op==43)
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if (op==45)
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op=='*')
			System.out.printf("\n>> %d * %d = %d\n" , a, b, (a*b));
		else if(op=='/')
			System.out.printf("\n>> %d / %d = %d\n" , a, b, (a/b));
		else
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.");

*/

		// 방법 ③, result, 결과값 변수 추가선언 → 결과 출력을 하나로

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result = 0;	// result 초기화했음, 선언만 할거면 else 구문 필요
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		if(op=='+')
			result = a + b;
		else if (op=='-')
		{
			result = a - b;
		}
		else if (op=='*')
		{
			result = a * b;
		}
		else if (op=='/')
		{
			result = a / b;
		}

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);




/*(나의 풀이)
public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 선언 
		int a, b;
		char calc;
		
		// 사용자 메세지
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력[+ - * /] : ");
		calc = (char)System.in.read();


		
		if (calc=='+')
		{
			System.out.printf(">> %d + %d = %d\n" , a, b, (a+b));
		}
		else if(calc=='-')
		{
			System.out.printf(">> %d - %d = %d\n" , a, b, (a-b));
		}
		else if(calc=='*')
		{
			System.out.printf(">> %d * %d = %d\n" , a, b, (a*b));
		}
		else if(calc=='/')
		{
			if (b==0)
			{
			System.out.printf("0 으로 나눌 수 없습니다.\n");
			}

			else
			{
			System.out.printf(">> %d / %d = %.2f\n" , a, b, (a/(double)b));
			}

		}
		else
		{
			System.out.printf(">> 판별 불가\n");
		}
*/
	}
}
/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 7
연산자 입력[+ - * /] : /

>> 10 / 7 = 1
계속하려면 아무 키나 누르십시오 . . .
*/