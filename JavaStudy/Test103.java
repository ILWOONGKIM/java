/*===========================================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 변수(static 변수)와 클래스 메소드(static 메소드)
============================================================*/

// ※ 실습 편의상 접근 제어지시자 생략


public class Test103
{
	//	※	클래스 변수 또는 클래스 메소드는
	//		클래스 정보라 로딩되는 순간 메모리 할당이 이루어지며,
	//		클래스 이름 또는 객체(인스턴스)를 통해 접근할 수 있다.
	//		즉. 『new』연산자를 통해 메모리 할당을 받지 않아도
	//		사용이 가능하다는 것이다.

	static int a = 10;		// static 변수(클래스 변수) class 변수 정적변수						// 쌍둥이, 형
	
	//	※	인스턴스 변수 또는 인스턴스 메소드는
	//		동일한 클래스의 메소드에서는 바로 접근하는 것이 가능하지만
	//		클래스 메소드에서는 접근할 수 없다.

	int b = 20;		// non-static 변수(인스턴스 변수) instance 변수							// 동생


// 메소드


	void write()	// non-static 메소드(인스턴스 메소드) instance 메소드					// 동생
	{
		System.out.println("클래스 변수  a : " + a);	// 이미 형이 태어나서 가능
		System.out.println("인스턴스 변수 b : " + b);	// write 태어났을때 b 태어난거 보장, 가능

	}

	static void print()		// static 메소드(클래스 메소드) class 메소드 정적 메소드			// 쌍둥이, 형
	{
		System.out.println("클래스 변수  a : " + a);	// print가 태어났다면 a가 태어났다는게 보장받아서 가능
		//System.out.println("인스턴스 변수 b : " + b);	// print(형)가 태어났다고해서 b(동생)이 태어났다는 것을 보장받을 수 없음, 불가
		//-- 에러 발생(컴파일 에러)
	}


	public static void main(String[] args)
	{
		System.out.println("main() → 클래스 변수 a : " + Test103.a);		// 원래는 인스턴스 생성을 따로해야했었지만, 클래스변수로 공유
		//--클래스 변수에 접근하기 위해서는				// cf)this.a
		// 『클래스명.변수명』의 형태로
		//	클래스의 이름을 통해 접근하는 것이 가능하다.
		//-->> main() → 클래스 변수 a : 10

		System.out.println("main() → 클래스 변수 a : " + a);
		//-->> main() → 클래스 변수  a : 10
		//--같은 클래스(Test103) 내부에 존재하기 때문에
		//	클래스의 이름을 생략하는 것이 가능하다.

		Test103.print();	// 클래스의 이름을 직접 부르는 경우 가능
		print();			// 형으로서 쌍둥이이기때문에 생략가능

		//-- 클래스 메소드에서 클래스 메소드의 호출은 가능하며,
		//	 『클래스명.메소드명()』의 형태로 접근하며 호출하는 것이 가능하다.
		//	 또한, 지금은 같은 클래스 내부에 존재하고 있는 상황이기 때문에
		//	 클래스의 이름을 생략하는 것이 가능하다.


		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//System.out.println("main() → 인스턴스 변수 b : " + Test103.b);
		/*Test103.java:65: error: non-static variable b cannot be referenced from a static context
                System.out.println("main() → 인스턴스 변수 b : " + b);
                                                             ^
		  Test103.java:66: error: non-static variable b cannot be referenced from a static context
                System.out.println("main() → 인스턴스 변수 b : " + Test103.b);
		*/
		//-->> 컴파일 에러
		//클래스.인스턴스 -> 불가

		//Test103.write();
		//write();
		//-->> 컴파일 에러



		// Test103 클래스 기반 인스턴스 생성
		Test103 ob = new Test103();

		//System.out.println("main() → 인스턴스 변수 b : " + b);
		//-->> 에러 발생, 순서는 맞아도 생성된 인스턴스(ob)를 통해서 접근해야됨

		// 생성된 인스턴스를 통해 인스턴스 변수에 접근하는 방법
		System.out.println("main() → 클래스 변수 b : " + ob.b);
		//-->> main() → 클래스 변수 b : 20

		// 생성된 인스턴스를 통해 인스턴스 메소드 접근(호출)
		ob.write();
		//-->>  클래스 변수  a : 10
		//		인스턴스 변수 b : 20

		System.out.println("main() → 클래스 변수 a : " + ob.a);
		//-->> main() → 클래스 변수 a : 10


		// 생성된 인스턴스를 통해 클래스 메소드 접근(호출)
		ob.print();
		//-->> 클래스 변수  a : 10

		
		//	※	클래스 변수나 클래스 메소드는
		//		『생성된인스턴스명.변수명』, 『생성된인스턴스명.메소드명()』
		//		의 형태로도 접근(호출)이 가능하지만,
		//		『클래스명.변수명』, 『클래스명.메소드명()』
		//		의 형태로 접근(호출)하는 것이 일반적이다.

		System.out.println("main → 클래스 변수 a : " + a);
		System.out.println("main → 클래스 변수 a : " + Test103.a);
		System.out.println("main → 클래스 변수 a : " + ob.a);
		//-->> main → 클래스 변수 a : 10
		//	   main → 클래스 변수 a : 10
		//	   main → 클래스 변수 a : 10


		//--------------------------------------------

		System.out.println();


		// Test103 클래스 기반 인스턴스 생성
		Test103 ob2 = new Test103();

		ob2.a = 10000;		// 클래스 변수 초기화
		ob2.b = 20000;		// 인스턴스 변수 초기화

		System.out.println("ob2 확인 -------------");
		ob2.write();
		//-->>  ob2 확인 -------------
		//		클래스 변수  a : 10000
		//		인스턴스 변수 b : 20000


		System.out.println("ob 확인 -------------");
		ob.write();
		//-->>	ob 확인 -------------
		//		클래스 변수  a : 10000
		//		인스턴스 변수 b : 20
		//		원래 만들었던 값에서 a는 static의 특징인 공유때문에 10000으로, b는 원래 값그대로 출력
		// ※ 교재 246p

	}
}