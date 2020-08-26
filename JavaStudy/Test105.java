/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
======================================*/

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1:가위, 2:바위, 3:보 중 입력(1~3) : -2
// 1:가위, 2:바위, 3:보 중 입력(1~3) : 2

// - 유저	: 바위
// - 컴퓨터	: 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!
// 계속하려면 아무키나 누르세요...


// 1. 클래스 Rpsgame을 생성 1~3 사이의 난수 발생시키기(set 메소드, 1~3이 아니면 다시입력받는 do-while문 구성)
// 2. 메소드 set에서 발생된 1~3의 난수가 세팅이되면, 3개의 배열방(arr)을 구성
// 3. 3개의 배열방에 가위1 바위2 보3 적재
// 4. 적재된 가위바위보를 유저, 컴퓨터에 각각 2차원배열(arr[i].player)
// 5. 적재된 2차원배열내에서 유저는 사용자에게 입력받은 난수로, 컴퓨터는 자동으로 생성된 난수로 구성

import java.util.Scanner;
import java.util.Random;


class RpsGame
{
	// ○ 주요 속성 구성(변수 선언)
	private int user;
	private int com;
	//private String resultStr;

	// ○ 주요 기능 구성(메소드 정의)
	//	   - 사용자의 선택 내용을 입력받는 기능의 메소드
	public void input()
	{
		runCom();			// 컴퓨터가 먼저 내야함

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();

		}
		while (user<1 || user>3);
		


	}

	// ○ 주요 기능 구성(메소드 정의)
	//	   - 컴퓨터의 선택 내용을 입력받는 기능의 메소드

	private void runCom()							// 컴퓨터의 값을 바꾸지 않게하기위해
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;		//-- 『+1』 : 0 1 2 → 1 2 3

	}


	// ○ 주요 기능 구성(메소드 정의)
	//	   - 중간 결과 출력(서로의 선택 내역 확인)

	public void  middleCalc()						// 사용자에게 보여져야 하기위해
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println();
		System.out.println(" - 유저 : " + str[user-1]);		// str배열 인덱스는 0부터시작하므로
		System.out.println(" - 컴퓨터 : " + str[com-1]);
		//-- 『-1』 : str[1] str[2] str[3] → str[0] str[1] str[2]  

	}// 여기까지 메인메소드에서 "테스트1"


	// ○ 주요 기능 구성(메소드 정의)
	//	   - 승부에 대한 연산

	public String resultCalc()
	{
		String result = "무승부 상황입니다~!!!";
		
		// ( 유저=="가위" && 컴퓨터=="보") || ( 유저=="바위" && 컴퓨터=="가위") || ( 유저=="보" && 컴퓨터=="바위")
		if ( (user==1 && com==3) || ( user==2 && com==1) || ( user==3 && com==2) ) 	// 당신이 승리한 상황
		{
			result = "당신이 승리했습니다~!!!";
		}

		// ( 유저=="가위" && 컴퓨터=="바위") || ( 유저=="바위" && 컴퓨터=="보") || ( 유저=="보" && 컴퓨터=="가위")
		else if ((user==1 && com==2) || ( user==2 && com==3) || ( user==3 && com==1) )	// 컴퓨터가 승리한 상황
		{
			result = "컴퓨터가 승리했습니다~!!!";
		}
		
		// ※테스트2※

		return result;
	}

	public void print(String str)
	{
		System.out.println();
		System.out.printf("\n>> 승부 최종 결과 : %s\n", str);
	}


}


public class Test105
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();

		// ※테스트1※ 
		/*
		1:가위, 2:바위, 3:보 중 입력(1~3) : 1

		 - 유저 : 가위
		 - 컴퓨터 : 가위
		*/

		String result = ob.resultCalc();

//		System.out.println(
//		System.out.println(

		// ※테스트2※

		ob.print(result);

	}
}

// 실행결과
/*

1:가위, 2:바위, 3:보 중 입력(1~3) : 2

 - 유저 : 바위
 - 컴퓨터 : 가위


>> 승부 최종 결과 : 당신이 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .


*/


/*

import java.util.Scanner;
import java.util.Random;

class User
{
	String[] UserResult = {"가위", "바위", "보"};
	int UserNum;
	String user;
		

void input

{
	String[] UserResult = {"가위", "바위", "보"};
	int UserNum;
	String user;
		
	Scanner sc = new Scanner(System.in);

	do
	{	
		System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
		UserNum = sc.nextInt();
	}
	while (UserNum<1 || UserNum>3);

	

	if (UserNum==1)
	{
		user = UserResult[0];
	}
	else if (UserNum==2)
	{
		user = UserResult[1];
	}
	else if (UserNum==3)
	{
		user = UserResult[2];
	}
}

}

class Com
{
	String[] ComResult = {"가위", "바위", "보"};
	int ComNum;
	String com;

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	comNum = rd.nextInt(3)+1;


	if (comNum==1)
	{
		com = comResult[0];
	}
	else if (comNum==2)
	{
		com = comResult[1];
	}
	else if (comNum==3)
	{
		com = comResult[2];
	}	

}

class RpsGame
{
	if (UserResult[0] && )
	{
		
	}


}
*/

/*
class RpsGame
{

	int[] rps = new rps[3];		// 가위바위보를 1,2,3으로 넣을 배열
	int nansu;
	

	// ① set 메소드
	public void set()
	{
		
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 1~3사이의 난수만 생성받도록 반복문 구성

		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			nansu = sc.nextInt();
		}
		while (nansu<1 || nansu>3);


		// 1~3사이의 입력값이 난수생성 범위로 설정됐으므로,
		// 해당범위에서 난수를 생성시켜주면서 배열을 생성, 이때, 난수는 0부터시작하니 생성된 난수에+1

		for (int i=0; i<3; i++)	
		{
			
			rps[i] = rd.nextInt(3)+1;
			//-- 1(0+1)~3(2+1) 
		}





	}

}
*/
