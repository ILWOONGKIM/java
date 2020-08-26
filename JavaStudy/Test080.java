/*=======================================================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor) 와 초기화 블럭(Initialized Block)
========================================================*/

public class Test080
{
	int n;
	int m;

	// 생성자(Constructor)
	Test080()
	{
		n = 100;
		m = 200;
		System.out.println("생성자 실행...");

	}

	// 초기화 블럭(메소드아님) → 없으면 에러남(클래스 괄호에선 직접 연산수행 x)
	{					
		n = 20;
		m = 40;
		System.out.println("초기화 블럭 실행...");
	}
	
	// 생성자(Constructor)
	Test080(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");

	}

	// 출력 메소드 정의
	void write()
	{
		System.out.println("n:" + n + ", m:" + m);
	}


	public static void main(String[] args)
	{
		Test080 ob1 = new Test080();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...
		//		 n:100, m:200
		
		Test080 ob2 = new Test080();
		ob2.write();
				//--==>> 초기화 블럭 실행...
		//		 매개변수 있는 생성자 실행...
		//		 n:100, m:200

	}
}
/*
초기화 블럭 실행...
생성자 실행...
계속하려면 아무 키나 누르십시오 . . .
*/

/*
	// 생성자(Constructor)
	Test080()
	{
		n = 100;
		m = 200;
		System.out.println("생성자 실행...");

	}

	// 초기화 블럭(메소드아님) → 없으면 에러남(클래스 괄호에선 직접 연산수행 x)
	{					
		n = 20;
		m = 40;
		System.out.println("초기화 블럭 실행...");
	}
*/

// 순서 의미없음, 생성자가 더 중요함