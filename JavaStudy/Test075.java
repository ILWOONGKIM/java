/*===============================
 ■■■ 클래스와 인스턴스 ■■■
================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력( + - * / ) : +
// >> 10 + 5 = 15
// 계속하려면 아무키나 누르세요..

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 주요 속성 구성 → 변수 선언
	int su1, su2;			// 사용자로부터 입력받은 두 정수를 담아낼 변수
	char op;				// 사용자로부터 입력받은 연산자를 담아낼 변수
	

	/*
	//생성자 - 사용자정의 생성자
	Calculate();
	'디폴트 생성자'
	{
		'텅 비어 있음'
	}

	*/




	// 주요 기능 정의 → 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		System.out.print("임의의 연산자 입력( + - * / ) : ");
		op = (char)System.in.read();		// read는 IOException
	}

	// 주요 기능 정의 → 메소드 정의(기능 : 연산)
	int cal()			// 멤버변수에있는 것으로 연산을 수행하면되어서, 다음 매개변수에 필요한 값을 반환하지않는다.
	{
		int result = 0;

		switch (op)
		{
			case '+' : result = su1+su2; break;
			case '-' : result = su1-su2; break;
			case '*' : result = su1*su2; break;
			case '/' : result = su1/su2; break;
			// result=0으로 초기화되어있어서 default X
		}
		return result;
	}

	// 주요 기능 정의 → 메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
//												   		      | 
//							변수다씀, 따라서  print 메소드안에 int형 아무 변수 설정(출력하기위함)
	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate cal = new Calculate();

		// 생성된 인스턴스를 통해 입력 메소드 호출
		cal.input();

		// 생성된 인스턴스를 통해 연산 메소드 호출
		int result = cal.cal(); // 반환 값은 없으나 매개변수있음, 

		// 생성된 인스턴스를 통해 출력 메소드 호출
		cal.print(result);

	}
}
/*
임의의 두 정수 입력(공백 구분) : 10 12
임의의 연산자 입력( + - * / ) : -
>> 10 - 12 = -2
계속하려면 아무 키나 누르십시오 . . .
*/


/*
import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 멤버변수
	int a, b;			// 입력받을 두 정수
	char ch;			// 입력받을 연산자
	
	// 입력 받을 두 정수와 연산자 메소드
	void input() throws IOException
	{
		// 입력받을 두 정수 멤버변수 a, b에 담기
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// 입력받을 연산자 멤버변수 ch에 담기
		System.out.print("임의의 연산자 입력( + - * / ) : ");
		ch = (char)System.in.read();	
	}
	// 받은 입력값 연산
	int operate()
	{
		int calResult = 0;

		switch (ch)
		{
			case '+' : calResult = a+b; break;
			case '-' : calResult = a-b; break;
			case '*' : calResult = a*b; break;
			case '/' : calResult = a/b; break;
			
		}
		return calResult;
	}

	// 출력
	void print(int result)
	{
		System.out.printf(">> %d %c %d = %d\n", a, ch, b, result);

	}
}


public class Test075
{
	public static void main(String[] args) throws IOException
	{
		Calculate cal = new Calculate();

		cal.input();
		int op = cal.operate();
		cal.print(op);

	}
}

*/