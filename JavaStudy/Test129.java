/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스(내부 클래스) p403 내부클래스 참조
===========================*/

// 변수 생성 시점말고 클래스 컨트롤에 초점

class InnerOuterTest
{
	static int a = 100;
	int b = 20;

	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			
		}
	}

	void write()
	{
		System.out.println("outer 의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();	//-- inner 의 write() 메소드 호출
	}					//--==>>outer 의 write()...
}

public class Test129
{
	public static void main(String[] args)
	{
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//-- outer 의 write() 메소드 호출
		
		//InnerNested ob3 = new InnerNested();
		//--==>> 에러 발생
		//Test129.java:42: error: cannot find symbol
        //       InnerNested ob3 = new InnerNested();
		
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> 에러 발생
		//Test129.java:47: error: an enclosing instance that contains InnerOuterTest.InnerNested is required
		//       InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();

		// ※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//	  외부 클래스의 인스턴스(객체)를 사용하지 않고
		//	  단독으로 내부클래스의 인스턴스를 생성하는 것은 불가능하다.

		// ※ Test127.java와 비교~!

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		//								-----
		//								InnerOuterTest의 인스턴스

		//--==>>	inner 의 write()...
		//			a : 100
		//			b : 20
		//			c : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		//--==>>	inner 의 write()...
		//			a : 100
		//			b : 20
		//			c : 30

	}
}