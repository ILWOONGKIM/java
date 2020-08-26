/*==================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
  ==================================*/

/*
○ 메소드 오버라이딩(Method Overriding)의 특징


	- 메소드 이름, 리턴타입(반환 자료형), 파라미터 수나 타입이 완전히 일치해야 한다.

	- 반드시 상속 관계가 있어야 한다.

	- 재정의된 하위 클래스의 메소드 접근제어지시자는
 	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	  접근제어지시자는 『protected』 또는 『public』 이어야 한다.

				메소드도 final로 고정가능하나, 				private은 상속은커녕 접근자체가 안 된다
	- 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding) 할 수 없다.
	  먼저 태어났는데 다시 덮어쓴다..?	

	- Exception의 추가가 불가능하다.
	  즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
	  새로운 Exception을 추가하는 것은 불가능하다는 것이다.

*/

// 부모 클래스
class SuperTest119
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		//System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
		//-- Super Class에서 선언된 변수 a에는 접근할 수 없다.
		//	→ private 변수이기 때문에...

		System.out.println("Super print() 메소드 : " + a + " : " + b + " : " + c);

	}

}

// 자식 클래스
class SubTest119 extends SuperTest119
{
	protected int b = 100;

	public void print()
	{
		System.out.println("Sub print() 메소드 : " + b + " : " + c);

		//System.out.println("Super print() 메소드 : " + b);
		//System.out.println("Sub print() 메소드 : " + this.b);
		//System.out.println("Sub print() 메소드 : " + super.b);
		//-- 변수 b는 접근 방법에 따라
		//	 다른 b로 접근 및 출력이 이루어진다.
		//	 슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		//System.out.println("Super print() 메소드 : " + c);
		//System.out.println("Super print() 메소드 : " + this.c);
		//System.out.println("Super print() 메소드 : " + super.c);
		//-- 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//	 슈퍼클래스에서 선언된 c

	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
		// 재정의하기 이전과 같음(문자열만 다름, ~메소드), 하지만 a가 private이라 컴파일에러
		//-- Super Class에서 선언된 변수 a에는 접근할 수 없다.
		//		→ private 변수이기 때문에...
		System.out.println("Sub write() 메소드 : " + b + " : " + c);

	}

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스(동일 패키지)
public class Test119
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest119) 인스턴스 생성
		SubTest119 ob = new SubTest119();
		ob.print();
		//--==>>Sub print() 메소드 : 100 : 20

		// write() 메소드를 override하기 이전 상황
		ob.write();
		//--==>>Super print() 메소드 : 5 : 10 : 20

		// write() 메소드를 override하기 이후 상황
		//--==>>Sub write() 메소드 : 100 : 20

		System.out.println("-----------------------------------------------------------구분선");

		System.out.println(ob.b);
		//--==>> 100

		//System.out.println(ob.super.b)
		// super라는 키워드를 본다면 해당 키워드가 포함된 클래스(Test119)를 보고 그 부모클래스를 보고 b를 찾아야
		
		System.out.println( ((SuperTest119)ob).b);
		//--==>> 10
		// ※ 슈퍼 부름

		//((SuperTest119)ob).write();
		//--==>>Sub write() 메소드 : 100 : 20
		// 자식이 재정의한 메소드로 나옴
		// 부모로부터 받은 write()를 '이미 덮어써버려서' 원본 복원 불가

		// ※ 메소드와 변수를 꼭!!!!!!!!!!!!!!!!!!!!! 구분하여 정리 할 것 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


	}
}