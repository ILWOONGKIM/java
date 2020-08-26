/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- switch문 실습
===============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 결과는 편의상 정수 형태로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 : 20
// 두 번째 정수 입력 : 11
// 연산자 입력[+ - * /] : -

// >> 20 - 11 = 9
// 계속하려면 아무 키나 누르세요 . . .

// 첫 번째 정수 입력 : 20
// 두 번째 정수 입력 : 11
// 연산자 입력[+ - * /] : $

// 계속하려면 아무 키나 누르세요. . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//*방법 1	

		int a, b, result;
		String op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine();

		// + → op:43 , - → op:45, * → op:42, / → op:47
		
		switch (op)
		{
			case "+" : result = a+b; break;
			case "-" : result = a-b; break;
			case "*" : result = a*b; break;
			case "/" : result = a/b; break;
			default : return;	//--메소드 종료 → main() 메소드 종료 → 곧 프로그램 종료
		}										

		// ※ 『return』 1. 값의 반환 → 메소드 호출 지점
		//				 2. 메소드의 종료
		
		// 결과 출력

		System.out.println();		
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);





/*방법2
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		// + → op:43 , - → op:45, * → op:42, / → op:47
		
		switch (op)
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			default : return;	//--메소드 종료 → main() 메소드 종료 → 곧 프로그램 종료
		}										

		// ※ 『return』 1. 값의 반환 → 메소드 호출 지점
		//				 2. 메소드의 종료
		
		// 결과 출력

		System.out.println();		
		System.out.printf(">> %d %c %d = %d\n", a, (char)op, b, result);

*/


/* 방법3
		int a, b, result, op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = System.in.read();

		// + → op:43 , - → op:45, * → op:42, / → op:47
		
		switch (op)
		{
			case 43 : result = a+b; break;
			case 45 : result = a-b; break;
			case 42 : result = a*b; break;
			case 47 : result = a/b; break;
			default : return;	//--메소드 종료 → main() 메소드 종료 → 곧 프로그램 종료
		}										

		// ※ 『return』 1. 값의 반환 → 메소드 호출 지점
		//				 2. 메소드의 종료
		
		// 결과 출력

		System.out.println();		
		System.out.printf(">> %d %c %d = %d\n", a, (char)op, b, result);
*/

/*
		if (op=='+')
		{	
		System.out.printf(">>%d + %d = %d\n", a, b, (a+b));
		}
		else if (op=='-')
		{
			System.out.printf(">>%d - %d = %d\n", a, b, (a-b));
		}
		else if (op=='*')
		{
			System.out.printf(">>%d * %d = %d\n", a, b, (a*b));
		}
		else if (op=='/')
		{
			System.out.printf(">> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			
		}

*/

		
	}
}