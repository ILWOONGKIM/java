/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스(내부 클래스) p403 내부클래스 참조
===========================*/

/*
○ Annonymous 클래스(익명의 클래스, 무명 클래스)

   - AWT 나 안드로이드 이벤트 처리에서 일반적으로 사용.
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용.
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움으로 인해 익명의 클래스를 생성하여 처리할 수 있다.

○ 형식 및 구조

   new 상위클래스의 생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {
		   ...;
	   }
   };	// ← 반드시 세미콜론 필요함~!!


// 즉, 클래스의 메소드 중 하나만 쓰고싶을때 클래스선언 또 하면 번거로우니까 쓴다?

*/

//package default;

//import java.lang.*;	→	import java.lang.Object;

class Test3 // extends Object
{
	/*
	
	Object 클래스의 멤버들...
	...
	...
	
	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		//return ...;
		//	     ----
		//       Object 타입 ... ※Line83 참조

		//return new Object();
		//	     ------------
		//	     Object 타입
		
		// 밑에는 new Object(); 를 new Object() {...};로 한것
		//						   -------------------
		//							Object 타입

		return new Object()
		{
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};
	}		// ← 세미콜론 check~!!!

}


public class Test130 // extends Object
{
	/*
	Object 가 갖고있는 멤버들
	즉, Object로 부터 상속받는 멤버들
	...
	*/

	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		System.uut.println(ob2.getString());
		//--==>> 익명의 클래스...
	}
}

/*
public int 메소드명()
{
	return 10;
		   ---
		   int 타입
}

public Scanner 메소드명()
{
	Scanner sc = new Scanner(System.in);

	return sc;
		   ---
		   Scanner 타입
}

public Scanner 메소드명()
{
	
	return new FruitSeller();
		   -----------------
		   	FruitSeller 타입
		  
}

*/