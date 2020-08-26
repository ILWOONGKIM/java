/*===============================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor)
================================*/

public class Test078
{
	int x;

	//	※	생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야하며
	//		필요할 경우 인수를 받아들이는 것도 가능하고,
	//		같은 이름의 메소드를 정의하는 중복정의가 가능하지만
	//		리턴값(반환값)은 가질 수 없다.

	//	※	생성자는 다른 일반 메소드처럼 호출될 수 없고
	//		『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//		각 클래스의 인스턴스인 객체를 생성한 후에
	//		생성된 객체의 멤버를 초기화시키는 작업을 수행한다.


	Test078()
	{	
		//	※	생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//		단, 생성자 내부에서 가장 먼저 실행되어야 한다.(생성자가 뒤에 나온다면, 이전의 작업들이 무의미해짐)

		this(1000);

		System.out.println("인자가 없는 생성자");
		System.out.println("Test078이 갖고있는 x : " + x);

		//this(1000);		// 밑에 Test078(int x)를 지칭함. 하지만 에러(컴파일에러)

	}

	Test078(int x)
	{		
		this.x = x;		// Test078 이라는 클래스 안에 this가 포함되어있으므로 this를 Test078로 대입하여 해석

		System.out.println("인자가 하나인 생성자");
		System.out.println("Test078이 갖고있는 x " + this.x);
		// scope에 보여지는 int x;, this.x = x; 이므로 꼭 구분하여야한다.
	}

	
	public static void main (String[] args)
	{
		Test078 ob1 = new Test078();
		Test078 ob2 = new Test078(100);

		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob1.x : " + ob2.x);

	}
}
/*
인자가 하나인 생성자
Test078이 갖고있는 x 1000
인자가 없는 생성자
Test078이 갖고있는 x : 1000
인자가 하나인 생성자
Test078이 갖고있는 x 100

main 에서 ob1.x : 1000
main 에서 ob1.x : 100
계속하려면 아무 키나 누르십시오 . . .

*/