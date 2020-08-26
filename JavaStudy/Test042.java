/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- switch문 실습
===============================================*/

// 사용자로부터 임의의 한 문자를 입력받아
// 입력받은 문자가 숫자인지 숫자가 아닌지를 판별하는 프로그램을 구현한다.
// 단, switch-case 문을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 한 문자 입력 : 6
// >> 입력하신 문자는 숫자입니다.
// 계속하려면 아무 키나 누르세요. . . 

// 한 문자 입력 : t
// >> 입력하신 문자는 숫자가 아닙니다.
// 계속하려면 아무 키나 누르세요. . . 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{ 
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;

		System.out.print("한 문자 입력 : ");
		n = System.in.read();

		switch (n)
		{
		case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: 
			System.out.printf(">> 입력하신 문자는 숫자입니다.\n");
				break;
		default :
			System.out.printf(">> 입력하신 문자는 숫자가 아닙니다.\n");
		}

	}
}