/*===========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface) 375p~
===========================*/
/*
○  인터페이스(Interface)란
	완전히 미완성된 채로 남겨져
	인터페이스 안에 존재하는 그 어떤 메소드도
	몸체(정의부, 구현부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
	클래스를 위한 템플릿으로써의 기능을 수행하는
	추상 클래스의 한 종류이다.

○	인터페이스는 클래스와 달리 다중 상속이 가능하며
	인터페이스 자체도 상속된다.
	기존의 C++ 언어 등에서 지원되는 다중 상속이
	사용 과정에서 많은 문제점을 노출시켰기 때문에
	자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
	인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

○	인터페이스는 상수와 추상 메소드만 가질 수 있으며
	인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
	『public』으로 설정되어 클래스에서 구현(implements)함으로써
	바로 접근이 이루어질 수 있다.

○ 특징
	- 추상 클래스의 일종으로 선언만 있고 정의가 없다.
	- final 변수는 가질 수 있다.(상수의 개념)
	- 인터페이스는 『public static final』 상수만 만들 수 있다.
	- 인터페이스를 구현하기 위해서는 『extends』 대신에
	  『implements』를 이용한다.
	- 하나 이상의 인터페이스를 implements 할 수 있다.
	- 인터페이스를 implements 한 클래스는
	  인터페이스의 모든 메소드를 Overriding 해야 한다.
	- 인터페이스가 다른 인터페이스를 상속받을 수 있으며
	  이 때, 『extends』 키워드를 사용한다.
	  또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.
*/

// 인터페이스
interface Demo
{
	public static final double PI = 3.141592;
	
	// 인터페이스의 멤버 변수는
	// 『static final』을 별도로 명시하지 않아도
	// 자동으로 『static final』인 상태
	public int a = 10;		

	// 위와 비슷하게 인터페이스의 메소드는 선언만 가능(정의, 구현 불가)
	// 자동으로 『abstract』인 상태(자동으로 붙음)
	//public abstract void print();
	public void print();

	/*
	public void print()
	{
		System.out.println("PI : " + PI);
	}
	*/
}


// 클래스
//class DemoImpl
// 추상 클래스는 인터페이스를 implements한다

//class DemoImpl extends Demo	→	불가
class DemoImpl implements Demo			//	Demo 인터페이스를 implements하는 순간 Demo클래스는 추상클래스가 된다.
{
	@Override
	public void print()		// 이렇게 되면 abstract class DemoImpl 는 추상클래스가 아니게되고
	{						// 인터페이스를 구현하는 클래스가 된다.
		System.out.println("인터페이스 메소드 재정의...");
	}

	public void write()
	{
		System.out.println("클래스에 정의된 메소드...");
	}
}



// 클래스	- main() 메소드를 포함하고 있는 외부 클래스(동일 패키지)
public class Test122
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();		// 인터페이스나 추상 클래스는 인스턴스 생성 불가
		//-- 즉, 인터페이스를 가지고 인스턴스 생성을 하는 것은 불가능하다.

		//DemoImpl ob = new DemoImpl();	// Override로 추상클래스 꼬리표를 똈으므로 가능
		//-- 즉, Demo 소유의 print() 메소드 재정의 후 가능

		//DemoImpl obTemp = new DemoImpl();	// 업캐스팅, 가능
		//Demo ob = (Demo)obTemp;			// 명시적으로 업캐스팅, 가능
		//Demo ob = obTemp;					// 자동으로 업캐스팅, 가능
		
		// ○ 업 캐스팅
		// 인터페이스 객체는 상위 객체	→	※매우 중요※
		Demo ob = new DemoImpl();
		ob.print();
		//--==>> 인터페이스 메소드 재정의...

		//ob.write();
		//--==>> 에러 발생(컴파일에러)
		// 부모(ob, 인터페이스)입장에선 자식이있는지도 모름


		// ○ 다운 캐스팅(하위객체 DemoImpl이 인스턴스 생성했음)
		((DemoImpl)ob).write();
		//--==>> 클래스에 정의된 메소드.



		//System.out.println(Demo.PI);
		//--==>> 3.141592
		//PI는 클래스 변수인 static으로 선언 됐으므로 가능
		
		//System.out.println(Demo.a);
		//--==>> 10
		// 상동

		//Demo.a = 30;		
		//--==>> 에러 발생
		// final이기때문에 불가



	}
}