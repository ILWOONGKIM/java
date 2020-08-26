/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 : java.util.Scanner
===============================================*/

// ※ java.util.Scanner
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』	메소드를 사용
//	  다른 형태(자료형)의 값으로 변환할 수 있다.

import java.util.Scanner;


public class Test018
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 주요 변수 선언
		String name;
		int kor, eng, mat, tot;

		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(『,』구분) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				-----------		구분자, 	이걸로    짤라달라 라는 의미, 
		//				김일웅,90,80,70(공백없음)
		//
		// 이때, 역슬러시 하나는 옵션으로 인식해서 두개를써서 진짜 역슬러시 의미를 나타내준다

		name = sc.next();			// 김일웅
		kor = sc.nextInt();			// 90
		eng = sc.nextInt();			// 80
		mat = sc.nextInt();			// 70

		tot = kor + eng + mat;
		

		// 결과 출력

		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);

	}
}

//실행 결과
/*
이름,국어,영어,수학 입력(『,』구분) : 김일웅,90,80,70

>> 이름 : 김일웅
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/