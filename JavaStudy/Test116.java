/*==================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance) 309p~
  ==================================*/

/*
○  상속(Inheritancae)이란
	새로 설계(생성)하고자 하는 클래스가
	이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
	이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

	즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
	고수준의 재사용성(reusability)을 확보하고
	객체간의 관계를 구성함으로써
	객체 지향의 또 다른 큰 특징인 『다형성』의 문법적 토대가 된다.

	상속은 기존 프로그램의 클래스 내용을 공유함으로써
	중복된 코드들을 재작성할 필요 없이
	반복적이고 세부적인 작업을 처리하지 않기 떄문에
	프로그램을 작성하는 시간을 절약할 수 있고
	유지보수를 편리하게 할 수 있으며,
	프로그램의 길이도 짧아지게 된다.

	또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
	오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.



※  물려주는 클래스	→ 상속하는 클래스 → 상위 클래스 → 부모(조상) 클래스 → Super Class
	물려받는 클래스	→ 상속받는 클래스 → 하위 클래스 → 자식(자손) 클래스 → Sub Class


※	주의할 점

	 자바는 다.중.상.속 을 지원하지 않기 떄문에
	 두 개 이상의 클래스로부터 상속받을 수 없다.
	 즉, 자바는 단.일.상.속.만 허용된다.
*/


// 부모 클래스
class SuperTest116 
{
	//『proteceted』 : 상속받는 ㅡㅋ랠스, 동일한 패키지, 클래스 내부에서 접근 가능
	//protected double area;	// 상속받은 클래스에서 접근가능하도록 미리염두하여..
	protected double area;

	// 『default』 : 동일한 패키지, 클래스 내부에서 접근가능
	// 부모 클래스의 생성자	→ ※ 상속 제외!!
	SuperTest116()
	{
		System.out.println("Super Class");
	}

	// 『default』 : 동일한 패키지, 클래스 내부에서 접근가능
	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

public class Test116 extends SuperTest116//, SuperTest117, SuperTest118		//우리 부모님이 SuperTest116이다~!
{
	// 부모 클래스로부터 상속받은 내용
	/*---------------
	protected double area;						// 상속받은 클래스에서 접근가능하도록 미리염두하여..
	void write(String title)
	System.out.println(title + " - " + area);	//	문법적으로 두 클래스는 디폴트 접근제어지시자를 사용했기때문에 디폴트 패키지로 같다!!
												//	※ 만약 다른 패키지에 있으면 상속 불가 !!	
	----------------*/


	//double area = 10.1234;

	// 자식 클래스의 생성자
	Test116()
	{
		// 부모 클래스의 생성자 호출
		//SuperTest116();		//→ super();	//→부모 클래스를 대신하는 키워드

		//Test116();	대신	//→ this();	//→this가 포함된 클래스를 찾음

		System.out.println("Sub Class...");

		//super();	→ ※ 생성자 내부에서 또다른 생성자의 생성은 가능하나, 가장 먼저 실행되어야한다는 문법위반!
		//--==>> 에러 발생(컴파일 에러)
	}


	public void circle()
	{
		int r = 10;
		area = r * r * 3.141592;
		write("원");
	}

	public void rect()
	{
		int w = 20, h=5;
		area = w * h;
		write("사각형");
	}

// write 메소드는 부모 클래스에서 하나이기때문에 write로 받을때 super.write();든 write();든 SuperTest116.write()든 같다.
// 허나 area 라는 변수에서 super.area와 자식클래스의 area가 서로 다르기때문에 구분해주어야한다.



// 자식 클래스, 부모클래스의 유산받음

	public static void main(String[] args)
	{
		
		// Test116 클래스(자식 클래스) 기반 인스턴스 생성
		Test116 ob = new Test116();
		//--==>> Super Class ...
		//		 Sub Class ...
		// 자식 생성자는 부모의 생성자를 호출할 책임이있음
		
		ob.circle();
		//--==>> (73번 주석처리하고) 원 - 314.1592

		ob.rect();
		//--==>> 사각형 - 100.0

	}
}