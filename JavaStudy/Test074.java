/*===============================
 ■■■ 클래스와 인스턴스 ■■■
================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader를 사용하여,
// 입력 데이터가 1보다 적거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1022
// 임의의 정수 입력(1~1000) : -23
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

//----------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// 주요 변수 선언(속성 구성)
	//-- 사용자의 입력값을 담아둘 변수
	int su;

	// 주요 메소드 정의(기능 정의)
	//-- 입력 기능을 수행할 메소드
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());

		}
		while (su<1 || su>1000);

	}

	// 주요 메소드 정의(기능 정의)
	//-- 연산 처리 기능을 수행할 메소드
	int calculate()
	{
		int result = 0;

		for (int i=1; i<=su; i++)
			result += i;

		return result;
	}

	// 주요 메소드 정의(기능 정의)
	//-- 결과 출력 기능을 수행할 메소드
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su, sum);

	}

}


public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap 클래스를 기반으로 한 인스턴스 생성
		Hap ob = new Hap();

		// 생성한 인스턴스를 통해서(활용해서) 입력 메소드 호출
		ob.input();

		// 생성한 인스턴스를 통해서 연산 메소드 호출
		int s = ob.calculate();

		// 생성한 인스턴스를 통해서 출력 메소드 호출
		ob.print(s);

	}
}


/*


//----------------------------------------------------------------------------
	// 클래스구성 및 전개
	// 1. 멤버 변수, 2. 입력받는 정수받는 메소드기능 + 입력받을때 1~1000범위와 아닌경우를 나눠서 반복문 구성
	// 3. 1~입력값 까지의 합, 4. 출력







import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	// 멤버 변수 구성
	int n;		// 입력받을 변수
	int a;		// 루프변수
	int sum=0;	// 누적합을 담을 변수
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받을 정수의 메소드
		void input() throws IOException
		{	
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());

		}

		// 입력 무한루프 메소드
		void infiniteLoop() throws IOException
		{
			while (true)
			{
				System.out.print("임의의 정수 입력(1~1000) : ");
				n = Integer.parseInt(br.readLine());
				
				//input()
				//if(범위함수) ->true  calSum(); print();
				//else		   ->
			}
		}

		// 
		boolean check()
		{
			return (n>=1 && n<=1000);
		}
		

		// 1부터 입력값 n까지의 누적합 메소드
		void calSum()
		{
			a=n;
		
			while(n>=a)
			{
				sum += a;
				a++;
			}
		
		}
		
		// 출력 함수
		void print()
		{
			System.out.printf(">> 1 ~ 100 까지의 합 : %d", sum);
		}

	
}


public class Test074
{
	public static void main(String[] args)
	{
		
	}
}

*/