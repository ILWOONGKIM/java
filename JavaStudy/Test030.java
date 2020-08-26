/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());	// 13 → true 부분 '수행안함', false 부분만 '수행', 결과값 도출
												// if가 2개 → 독립적인 연산임

		if(num%2==0)
		{
			System.out.printf("%d는 짝수입니다.\n", num);
	
		}

		if(num%2!=0)
		{
			System.out.printf("%d는 홀수입니다.\n", num);
		}

	}
}
/*
임의의 정수 입력 : 13
13는 홀수입니다.
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 24
24는 짝수입니다.
계속하려면 아무 키나 누르십시오 . . .
*/