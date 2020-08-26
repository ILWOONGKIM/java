/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : System.in.read()
===============================================*/

// 실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 7

// >> 입력한 문자 : A
// >> 입력한 정수 : 7
// 계속하려면 아무 키나 누르십시오. . . 


// ※ 『System.in.read()』 메소드는 한 문자만 가져온다.
//	  단, 하나의 문자를 입력받아 입력받은 해당 문자의
//	  ASCII Code 값을 반환하게 된다.

import java.io.IOException;


public class Test014
{
	public static void main(String[] args) throws IOException
	{
		
		// 주요 변수 선언

		char ch, chnum;			//-- 사용자로부터 입력받은 문자를 담을 변수
		int num;				//-- 사용자로부터 입력받은 정수를 담을 변수
		
		// 연산 및 처리


		// ① 사용자에게 안내 메시지 출력 및 입력값 담아내기
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		// ② 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기)
		System.in.skip(2);
		//-- 매개변수(2)에 의해 두 글자를 읽지않고 건너뛴다.(버린다.)

		// ③ 사용자에게 안내 메세지 출력 및 입력값 담아내기
		System.out.print("한 자리 정수 입력 : ");
		num = System.in.read();
		chnum = (char)num;

		// 이 방법 말고도 num을 캐릭터화한 chnum 변수없이
		// 아스키코드 정수에서 48만큼 빼고 num을 %d로 출력해도 된다.


		// 결과 출력

		System.out.printf("\n>> 입력한 문자 : %s\n", ch);
		System.out.printf(">> 입력한 정수 : %c\n", chnum);

	}

}

/*실행결과
한 문자 입력 : A
한 자리 정수 입력 : 7

>> 입력한 문자 : A
>> 입력한 정수 : 7
계속하려면 아무 키나 누르십시오 . . .
*/