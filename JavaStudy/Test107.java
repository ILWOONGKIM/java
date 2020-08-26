/*======================================================
	■■■ 메소드 중복정의(Method Overloading) ■■■
	- Method Overloading 이 가능한 형태와 불가능한 형태
=======================================================*/


public class Test107
{
	public static void main(String[] args)
	{	
		print('A');

		double result = print(10.0);	// Test107:java25		// 불가, 대입연산자 우변의 print(10.0)부터 보는데, 그때 14번의 호출과 구분되지않음
		print(10.0);					// Test107:java24
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}				//--(Ⅹ) 정수 형태의 매개변수를 넘겨준다는 의미에서 쓴 값이 의미없는 변수이므로
														//		 호출할 때 구분할 수 없음
	//public static void print(char c) {}				//--(○) 가능하지만, 자동형변환 규칙을 주의하자.
	public static void print(int i, int j) {}

	public static void print(double d) {}				//--(○) 가능하지만, 자동형변환 규칙을 주의하자.
	//public static double print(double d) {return 3.14;}
	//public static void print(double d) {return 3.14;}	// 정의불가(3.14로 리턴받는데 void형태)
	//public static void print(double e) {}		
 
 }