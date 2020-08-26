/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 조건문(분기문)
	- if문, if-else문
===============================================*/

// ○과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음(a e i o u)일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요..

// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요..

// 알파벳 한 문자 입력 : 3
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요..


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{	
		// 인스턴스 생성

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 설정

		char let;	//--알파벳 문자,철자(letter) 변수 생성
		
		// 사용자가 받을 메세지 출력

		System.out.print("알파벳 한 문자 입력 : ");
		
		// 변수 담기
		
		let = (char)System.in.read();	//-- system.in.read()로 숫자로 표현된 문자를 char로 변환, 대입하여 변수담기

		// 조건문
		
		if (let=='a'|| let=='e'|| let=='i'||let=='o'||let=='u'||let=='A'||let=='E'||let=='I'||let=='O'||let=='U')
		
		{
			System.out.print("\n>> 모음 OK~!!!\n");
		}
		else
		{
			System.out.print("\n>> 입력 오류~!!!\n");
		}

	}
}

// 실행 결과
/*
알파벳 한 문자 입력 : a

>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : A

>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 1

>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
