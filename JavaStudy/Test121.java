/*=======================================
  ■■■ 클래스 고급 ■■■
  - 상속 관계에 있는 클래스들 간의 캐스팅
  - 업 캐스팅, 다운 캐스팅
 =======================================*/

// super class, 부모 클래스, 상위 클래스
class SuperTest121
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드 ...");
	}

	public int hap()
	{
		return a + b;
	}
}

// sub class, 자식 클래스, 하위 클래스
class SubTest121 extends SuperTest121
{
	public int b=100, c=200;
	
	@Override
	public int hap()
	{
		return a + b + c;
	}
	public void print()
	{
		System.out.println("서브 클래스 print() 메소드 ...");
	}

}

// main() 메소드를 포함하고 있는 외부의 다른 클래스(동일 패키지)
public class Test121
{
	public static void main(String[] args)
	{
		/*---------------------
		public int a=10, b=20;

		public void write()
		{
			System.out.println("슈퍼 클래스 write() 메소드 ...");
		}

		public int hap()
		{
			return a + b;
		}
		----------------------*/


		//sub class 기반 인스턴스 생성
		SubTest121 ob1 = new SubTest121();		// 자식 클래스 인스턴스 생성하면서 '부모객체도' 메모리퍼올려진거임
		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob.b : 100
		

		// ○ 업캐스팅
		//SuperTest121 ob2;
		SuperTest121 ob2 = ob1;		//	  여기서 부모객체가 만들어진것이아님!!
									//    만들어진 부모객체에 대한 메모리에서
									//	  자식형 -> 부모형으로 형변환 한것임

		//--『SuperTest121 ob2 = (SuperTest121)ob1;』과 동일한 구문

		/*
		학생 인경 = new 학생();
		인간 사람 = 인경;			// 『인간 사람 = (인간)인경;』과 동일한 구문

		byte a = 10;
		short b = a;				// short b = (short)a;
		*/

		System.out.println("ob2.b : " + ob2.b);
		//--==>> ob2.b : 20
		//-- '변수는 객체별로 따로 할당'되므로(부모, 자식거 변수들따로)
		//	 변수 b는 ob2(부모)의 변수이다.
		
		System.out.println("합	: " + ob2.hap());
		//--==>> 합		: 310
		//-- hap() 메소드는 오버라이딩(Overriding)되어 있고
		//	 ob2 는 ob1 을 업캐스팅한 상태의 객체이므로
		//	 『SuperTest121』의 hap() 메소드를 호출하는 것이 아니라
		//	 『SubTest121』에서 재정의한 hap() 메소드를 호출하게 된다.
		//	 재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다.

		// cf) 변수와 메소드 비교

		ob2.write();
		//--==>> 슈퍼 클래스 write() 메소드 ...

		//ob2.print();
		//--==>> 에러발생(컴파일에러)
		//	cannot find symbol       ob2.print();
		//	부모는 자식것을 쓸수없음(범위가 더 좁음)


		// ○ 다운 캐스팅(업캐스팅한 것을 하위로 ...)
		((SubTest121)ob2).print();
		//--==>> 서브 클래스 print() 메소드 ...

		
		// ※ 추가 관찰--------------------------------------------------
		//	  다운 캐스팅 가능 여부

		SuperTest121 ob3 = new SuperTest121();		// 부모 클래스 인스턴스 생성(※※자식 클래스 메모리는 올라가지않음!!)
		SubTest121 ob4;

		//System.out.println(ob3.c);
		//--==>> 에러 발생(컴파일 에러)
		//	cannot find symbol         System.out.println(ob3.c);
		//-- 마찬가지로 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.
		// 부모는 어떤 자식이있는지도 모른다.

		//ob4 = ob3;
		//--==>> 에러 발생(컴파일 에러)
		//-- 상위 객체는 하위 객체에 담을(참조할) 수 없다.

		ob4 = (SubTest121)ob3;
		//--==>> 에러 발생(런타임 에러)
		//java.lang.ClassCastException: SuperTest121 cannot be cast to SubTest121
		//-- 작성된 구문의 문법적인 구조는 다운캐스팅이 이루어지는 것처럼 보이나
		//	 정상적인 캐스팅이 이루어지지 않는다.(자식클래스의 메모리 없음!!)

		//	 그 이유는, 현재 SubTest121 객체에 대해 메모리 할당이 이루어지지 않아
		//	 다운 캐스팅이 불가능하기 때문이다.

	}
}

/*
○ 업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우

	1. 하위 객체 생성;
	2. 상위 = 하위;			// 업 캐스팅, 정상
	3. 하위 = 상위;			// 에러 발생
	4. 하위 = (하위)상위;	// 다운 캐스팅, 정상


○ 다운 캐스팅이 정상적으로 이루어지지 않는 경우

	1. 상위 객체 생성;		
	2. 하위 = 상위;			// 에러 발생
	3. 하위 = (하위)상위;	// 다운 캐스팅, 런타임 에러 발생(하위의 메모리할당 안됨)

※ 업 캐스팅은 항상 가능, 다운 캐스팅은 경우에 따라


*/