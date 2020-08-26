/*==============================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- break
===============================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1~100 범위 안에서만
// 가능하도록 처리한다.

// 실행 예)
// 임의의 정수 입력 : -10

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2020

// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : N
// 계속하려면 아무키나 누르세요...


// 1. 임의의 정수 입력 시 2가지 경우 -> ① a가 1~100 범위인 경우 1~a까지의 합 + 계속하시겠습니까(Y/N) 문자 받기 -> a. Y 인경우 -> 다시 임의의 정수 값 받도록 반복설정
//																												-> b. N 인경우 -> 종료(break)?
//									 -> ② a가 1~100 범위가 아닌경우 -> 다시 임의의 정수 값 받도록 반복설정
// ①에서 1~a까지의 합
// n<=a 범위에서 n++마다 커질때 n씩 더해줌(a+=n) + 계속하시겠습니까(Y/N)문자 System.in.read로 문자 받기	-> a. Y 인경우 -> 다시 임의의 정수 값 받도록 반복설정
//				
//-> b. N 인경우 -> 종료(break)?


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s, i;
		//--n : 외부로부터 사용자의 입력값을 담아둘 변수
		//--s : 누적합 연산 결과를 담아둘 변수
		//--i : 1부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;
		//--프로세스를 계속 진행할지의 여부를 담아둘 변수
		//	(Y / y / N / n)
		
		while (true) //			...4
		{
			do		//-->> 최소 한번은 입력을 받아야하고, 반복되므로 do-while을 쓴다. ...1
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());		// \r\n 매개변수에 들어감 ...10
			}
			while (n<1 || n>100);		

			s = 0;	//-->> 누적합을 담아낼 변수 초기화 → 위치 check ...2
					//-->> 선언과 동시에 초기화를한다면, 한번반복하고 나서 나온 s값에 또 누적해서 더하기때문에 지금 초기화)	
	
			for (i=1; i<=n; i++)		//		...3
				s += i;
			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);
			
			System.out.print("계속하시겠습니까(Y/N)? : ");		//		...5
			ch = (char)System.in.read();		//	...6

			// y + enter	→	readLine은 y만 입력받음.. 다시 올라가서 ...9


			// 부정의 의사표현은 보통 긍정이 아닐때 나머지의 과정으로 처리하는 경우가 많다.
			//ch=='N'	ch=='n'
			if (ch!='Y' && ch!='y')	// or의 부정은 and, or면 n을 넣어도 참임		...7
			{
				// 반복문(while)을 빠져나갈 수 있는 코드 작성 필요
				//-- 위와 같은 의사표현을 했다면
				//	 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.(위에 for는 이 구문을 감싸지 않음)
				break;
				//-- 멈추고 빠져나간다.
			}

			// 엔터값(\r\n) 처리
			System.in.skip(2);		// ... 11


		}//while_end
		

		// 런타임에러(numberFormat~) → ...8

	}//main()_end

}//class()_end



/*(나의 풀이)

		int a;		//--사용자에게 받을 정수 값
		int	n=0;	//--사용자에게 받은 정수 값을 담을 값(루프 변수)
		int sum=0;
		char q;

		// 사용자 메세지 출력 및 변수 담기


		// 연산 및 처리

		while (true)
		{
			System.out.print("\n임의의 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			


			if (a<=100 && a>=1)
			{

				while (n<=a)
				{
					sum += n;
					n++;
				}

				System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", a, sum);

				System.out.print("계속하시겠습니까(Y/N)? : ");					
				q = (char)System.in.read();
				br.readLine();

				if(q=='Y')
				{

				}
				else if(q=='N' || q=='n')
				{
					break;
				}
			}		

		}
*/