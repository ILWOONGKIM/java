/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 정보은닉과 접근제어 지시자
======================================*/

import java.util.Scanner;


class CircleTest2
{
	// 정보 은닉(Information Hiding)
	// 멤버 변수이면서 인스턴스 변수(메모리할당을 위해서는 인스턴스가 생성되어야 ...)
	// 전역 변수(어떤 메소드가 있던지간에 해당 클래스 전역에서, 모든 메소드에서 보여진다)
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int 형 변수 0으로 초기화 지원

	private int r;
	//int r;

	// getter(가져다쓸때) / setter(값 세팅할때) 구성
/*
	int getR()
	{
		return r;
	}

	void setR(int r)		// 매개변수로 받아 초기화
	{
		this.r = r;
	}
*/		

	void input()		// r이 private화 되어있어, 메소드 input으로 r의 값을 채워넣음
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		
		System.out.println("반지름 : " + r);
		System.out.println("넓	이 : " + a);
	}


}


public class Test101
{
	public static void main(String[] args)
	{
		CircleTest2 ob = new CircleTest2();
			
		//ob.r = 10;
		//System.out.println("원의 반지름 : " + ob.r);		-> private 변수이므로 접근불가, 컴파일에러

		//ob.setR(1);
		//System.out.println("원의 반지름 : " + ob.getR());
		// 원의 반지름 : 100
		
		ob.input();
		// 반지름 입력 : 1000
		//→ ob.r = 1000;

		double result = ob.calArea();
		ob.write(result);
		// 반지름 입력 : 2000
		// 반지름 : 2000
		// 넓	이 

	}
}