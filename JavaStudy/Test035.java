/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// 사용자로부터 임의의 정수를 두 개 입력받아
// 큰 수를 출력하는 프로그램을 구현한다.
// 단, 입력받은 두 수가 같은 경우,
// 아무것도 출력하지 않도록 구성한다.

// 실행 예)
// 첫 번째 정수 입력 : 11
// 두 번째 정수 입력 : 22
// >> 큰 수 → 22
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 55
// 두 번째 정수 입력 : 4
// >> 큰 수 → 55
// 계속하려면 아무 키나 누르세요...

// 첫 번째 정수 입력 : 31
// 두 번째 정수 입력 : 31
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		if (a>b)
		{
			System.out.printf("\n큰 수 → %d\n", a);
		}
		else if (a<b)
		{
			System.out.printf("\n큰 수 → %d\n", b);
		}
		else
		{
		}
	}
}