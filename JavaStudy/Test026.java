/*==============================================
	■■■ 연산자(Operator) ■■■
	- 조건 연산자(→ 삼항 연산자)
===============================================*/

/*
피연산자	연산자	 피연산자	연산자	 피연산자
-------				 --------			 --------
  1항			  	   2항					3항

피연산자	?	 피연산자	:	피연산자
-------		     --------		--------
  1항			   2항			  3항

*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수인지 홀수인지 판별할 수 있는 프로그램을 구혀한다.
// 단, 조건연산자(삼항연산자)를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : 5

// ==[판별 결과]==
// 5 → 홀수
// ===============
// 계속하려면 아무 키나 누르십시오. . . 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test026
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int nNum;			//-- 사용자로부터 입력받은 정수 형태의 데이터를 담아들 변수
		String strResult;	//-- 홀수인지 짝수인지에 대한 판별 결과를 담아둘 변수
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		System.out.print("임의의 정수 입력 : ");

		// ② 입력값(문자열)을 정수 형태로 변환 후 변수 nNum에 담아내기
		nNum = Integer.parseInt(br.readLine());

		// ③ 홀수인지 짝수인지에 대한 판별 안산
		//    _______? _______: ______;
		//	    수식1   수식2    수식3

		// 수식1 : 참(true) 또는 거짓(false)을 반환할 수 있는 수식 형태로 작성.
		// 수식2 : 수식1의 처리 결과가 참(true)일 경우 수행하는 영역.
		// 수식3 : 수식1의 처리 결과가 거짓(false)일 경우 수행하는 영역

		// 입력받은 정수(nNum)가 홀수인지 짞수인지 확인하기 위한 연산
		// → 입력값(nNum)을 2로 나눈 나머지가 0이면 짝수
		//									   0이 아니면 홀수
		strResult = (nNum % 2 == 0) ? "짝수" : "홀수";
		// strResult = (10 % 2 == 0) ? "짝수" : "홀수";
		// strResult = (0 == 0) ? "짝수" : "홀수";
		// strResult = (True) ? "짝수" : "홀수";
		// strResult = "짝수";

		// strResult = (9 % 2 == 0) ? "짝수" : "홀수";
		// strResult = (1 == 0) ? "짝수" : "홀수";
		// strResult = (False) ? "짝수" : "홀수";
		// strResult = "홀수";


		// 결과 출력
		System.out.println();
		System.out.println("==[판별 결과]==");
		
		// 	System.out.printf("5 → "홀수"")
		System.out.printf("%d → %s\n", nNum, strResult);
		
		System.out.println("===============");

	}
}

/*
임의의 정수 입력 : 5

==[판별 결과]==
5 → 홀수
===============
계속하려면 아무 키나 누르십시오 . . .
*/