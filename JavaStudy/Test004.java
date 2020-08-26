/*================================
■■■ 자바의 개요 및 특징 ■■■
	- 변수와 자료형
	- 키워드와 식별자
================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 25;
		char degree = 'A';

		String name = "강정우";
		//String name = "권소윤";
		//-- 스코프 영역 안에서 변수명은 식별자의 역할

		//String #name = "김승범";
		//--『$』와 『_』를 제외한 다른 특수문자는
		//	변수의 이름으로 활용할 수 없다.
		//	하지만, 그나마 사용 가능한 이들 특수문자도
		//	함부로 사용하는 것은 고려해야 한다.
		
		//int tel = 01011112222; 숫자로 인식하여 앞에 0이 없어짐
		String tel = "01011112222";
		String _tel = "010-1111-2222"; // 가능

		String 주소 = "경기도 고양시"; 
		// 문법적으로 한글 단어를 변수명으로 사용할 수 있찌만
		// 실무적인 측면에서 접근한다면
		// 절대로 한글 단어를 변수명으로 사용해서는 안된다.

		// 결과 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("tel : " + tel);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);

		
	}
}

// 실행 결과
/*
name : 강정우
age : 25
tel : 01011112222
_tel : 010-1111-2222
주소 : 경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
*/