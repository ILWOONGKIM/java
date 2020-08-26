/*==================================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
  ==================================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// super class
class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}

}

// sub class → Aclass 를 상속받는 클래스
class Bclass extends Aclass 
{
	
		/*----------------
		protected int x,y;
		protected char op;	

		void write(double result)
		{
			System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
		}	
		----------------*/

	Bclass()
	{	
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");	// 20 15
		String temp = br.readLine();							// "20 15"
		String[] strArr = temp.split("\\s");	// 문자열 객체안 메소드, 구분자역할을 하면서 잘라내는 역할을함, \s를 넘김 -> \s는 공백의미, 문자열 배열 타입 반환
		//String[] strArr = {"20", "15"};	

		//	※	문자열.split("구분자");
		//"사과 딸기 바나나".split("\\s");	→	{"사과, "딸기", "바나나"}

		if(strArr.length !=2)
			return false;
		//-- false를 반환하며 input() 메소드 종료
		//	 이 조건을 수행할 경우
		//	 아래에 수행해야 하는 코드가 남아있어도
		//	 결과값을 반환하며 메소드는 종료된다.

		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		/*
		if (op != '+' &&  op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		
		return false;

	}//end input


	double calc()	// 연산이 끝나면 실수형태로 반환
	{
		double result = 0;		// default 부분 생략 가능(result 0 초기화)

		switch (op)
		{
		case '+' : result = x+y; break;
		case '-' : result = x-y; break;
		case '*' : result = x*y; break;		
		case '/' : result = (double)x/y; break;

		}

		return result;
	}//end clac

	// 출력하는 메소드는 상속받았으니, 굳이 만들필요없다.

}// end Bclass



/*
	double result = 0.0;

	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

	}

	public void calOp()
	{

		switch (super.op)
		{
		case '+': result = super.x + super.y; break;
		case '-': result = super.x - super.y; break;
		case '*': result = super.x * super.y; break;
		case '/': result = super.x / (double)super.y; break;
		default : return;
		}
		
		super.write(result);
*/


// main() 메소드를 포함하고 있는 외부의 다른 클래스(동일 패키지)
public class Test118
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())	//ob.input()메소드가 거짓이라면...
		{
			System.out.print("Error...\n");
			return;
		}
		
		double result = ob.calc();

		ob.write(result);	// ob.calc()메소드에 담긴 double result로 결과값 넘겨줘야 

		/*
		Bclass ob2 = new Bclass();

		ob2.input();
		ob2.calOp();
		*/
	}
}